package networkingserveronfiniteloop;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
public static void main(String[] args) {
	try
	{
	ServerSocket ssoc = new ServerSocket(6000);
	System.out.println("Server is ready to accept the requests");
	Socket ss = ssoc.accept();
	System.out.println("Accept the request");
	InputStream is = ss.getInputStream();
	DataInputStream  dis = new DataInputStream(is);
	OutputStream os = ss.getOutputStream();
	DataOutputStream dos = new DataOutputStream(os);
	Scanner scan  = new Scanner(System.in);
	while(true)
	{
		String msg = dis.readUTF();
		System.out.println(msg);
		System.out.println("Enter a reply");
		String reply = scan.nextLine();
		dos.writeUTF(reply);
		
	}	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
