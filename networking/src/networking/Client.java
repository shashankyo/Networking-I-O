package networking;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
public static void main(String[] args) {
	try {
		Socket cs = new Socket("localhost", 6000);
		OutputStream os = cs.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a message");
		String msg = scan.nextLine();
		dos.writeUTF(msg);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
