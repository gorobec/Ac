package lesson20;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static void main (String [] args) {
	
	Socket socket = null;
	BufferedReader br = null;
	PrintWriter pw = null;
	BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
	try {
		socket = new Socket("localhost", 65321);
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw = new PrintWriter(socket.getOutputStream());
		
		while (true) {
			System.out.print("\nEnter your message: ");
			pw.println(console.readLine());
			pw.flush();
		
			String msg = br.readLine();
			System.out.print("Message from server " + msg);
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
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
}


	

