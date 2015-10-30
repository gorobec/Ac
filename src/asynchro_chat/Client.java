package asynchro_chat;


import asynchro_chat.IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    private final int PORT = 5555;
    private final String IP = "127.0.0.1";
    private BufferedReader in;
    private PrintWriter out;
    private BufferedReader console;
    private Socket client;

    public Client() {
    }
    public void start() throws IOException {
        try {
            client = new Socket(IP, PORT);
        } catch (IOException e) {
            System.err.println("Can't connect to the port");
            System.exit(-1);
        }
        System.out.println("Connected to the server!");
        Thread receiveMessage = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    in = new BufferedReader
                            (new InputStreamReader(client.getInputStream()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                while (true) {
                    try {
                        String serverMessage = in.readLine();
                        if (serverMessage.equalsIgnoreCase("quit")) break;
                        System.out.println((char) 27 + "[34m" + serverMessage);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        });
        receiveMessage.start();
        try {

            out = new PrintWriter(client.getOutputStream());
            console = new BufferedReader
                    (new InputStreamReader(System.in));
        } catch (IOException e) {
            System.err.println("Socket in/out putStream problems");
            System.exit(-1);
        }
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print((char) 27 + "[35mYour message > ");
            String writeMessage = console.readLine();
            out.println(writeMessage);
            out.flush();
            if (writeMessage.equalsIgnoreCase("quit")) {
                break;
            }
        }
        try {
            IOUtils.closeIn(client.getInputStream());
            IOUtils.closeOut(client.getOutputStream());
        } catch (IOException e) {
            System.err.println("Socket closed");
        } finally {
            client.close();
        }
    }
}
