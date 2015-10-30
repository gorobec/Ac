package asynchro_chat;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Server {
    private final int PORT = 5555;
    private ServerSocket server;

    private BlockingDeque<String> messages = new LinkedBlockingDeque<String>(1);
    private ArrayList<Connection> clients = new ArrayList<Connection>();
    public Server() {
    }
    public void start () throws IOException {
        try {
            server = new ServerSocket(PORT);
        } catch (IOException e) {
            System.err.println("Can't connect to the port");
            e.printStackTrace();
            System.exit(-1);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Server waiting...");

            Thread newClient = new Thread(new Runnable() {
                @Override
                public void run() {
                    //Socket client = null;
                    try {
                       Socket client = server.accept();
                        Connection connection = new Connection(client);
                        connection.start();
                        clients.add(connection);
                    } catch (IOException ignore) {/*NOP*/}
                    System.out.println("Client connect");


                }
            });
            newClient.start();
        }


        while (true) {
            try {
                String send = messages.take();
                for (Connection client : clients) {
                    client.out.println(send);
                    client.out.flush();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }




    private class Connection extends Thread{
        private Socket client;
        private BufferedReader in;
        private PrintWriter out;
        private boolean state = true;

        public PrintWriter getOut() {
            return out;
        }

        public Connection (Socket socket) {
            this.client = socket;
            try {
                in = new BufferedReader
                        (new InputStreamReader(client.getInputStream()));
                out = new PrintWriter(client.getOutputStream());
               // clients.add(this);
            } catch (IOException ignore) {/*NOP*/}

        }

        public void run () {
            out.println("Welcome to the \"Hell yeah\" chat!\nWrite your message...");
            out.flush();

            while (state) {
                String message = null;
                try {
                    message = in.readLine();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                if (message.equalsIgnoreCase("quit")) {
                    System.out.println((char) 27 + "[34mClient " + client.getInetAddress() + " leave chatroom");
                    state = false;
                    //break;
                }
                try {
                    messages.put(message);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                IOUtils.closeIn(client.getInputStream());
                IOUtils.closeOut(client.getOutputStream());
            } catch (IOException e) {
                System.out.println("Socket closed");
            } finally {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
