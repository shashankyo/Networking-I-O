package networking;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
public static void main(String[] args) {
	try {
		ServerSocket ssoc = new ServerSocket(6000);
		System.out.println("Server is ready to accept the request");
		Socket ss = ssoc.accept();
		System.out.println("Accept the request");
		InputStream is = ss.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		String msg = dis.readUTF();
		System.out.println(msg);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
