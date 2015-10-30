package lesson20;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args)  {


		ServerSocket ss = null;		
		Socket socket = null;		
		BufferedReader br = null;
		PrintWriter pw = null;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		try {
			ss = new ServerSocket(65321);
			System.out.println("Serwer waiting...");
			socket = ss.accept();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			while (true) {
				String msg = br.readLine();
				System.out.print("Message from " + socket.getInetAddress() + " client: " + msg);
				
				System.out.print("\nEnter your message: ");
				pw.println(console.readLine());
				pw.flush();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				
				if(pw != null)
					pw.close();
				if(br != null)
					br.close();
				if(socket != null)
					socket.close();
				if(ss != null)
					ss.close();
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
