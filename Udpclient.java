import java.net.*;
import java.io.*;
import java.util.*;

class UdpClient { 
	public static void main(String args[]) throws IOException 
	{ 
		DatagramSocket ds = new DatagramSocket(); 
		InetAddress ip = InetAddress.getLocalHost(); 
		byte buf[] = null;
		Scanner sc = new Scanner(System.in);  
		String str = sc.nextLine();  
		buf = str.getBytes(); 
		DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 1000); 
		ds.send(DpSend);
		DatagramSocket ds1 = new DatagramSocket(3000); 
		byte[] receive = new byte[2000]; 
		DatagramPacket DpR = new DatagramPacket(receive, receive.length); 
		ds1.receive(DpR); 
		System.out.println("Server :-" + data(receive)); 
	} 

	public static StringBuilder data(byte[] a) 
    	{ 
        	if (a == null) 
          		return null; 
        	StringBuilder ret = new StringBuilder(); 
        	int i = 0; 
        	while (a[i] != 0) 
        	{ 
           		ret.append((char) a[i]); 
            		i++; 
        	} 
        	return ret; 
    	}
} 