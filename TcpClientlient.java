import java.net.*;
import java.io.*;
import java.util.*;

class TcpClient {

    public static void main(String[] args) {
        try {
            Socket clientsocket = new Socket("localhost", 2000);
            
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            System.out.print("enter string: ");
            String te = sc.nextLine();
            out.writeUTF(te);
            System.out.println("before: "+te);

            DataInputStream in=new DataInputStream(clientSocket.getInputStream());  
            String  string=(String)in.readUTF();  
            System.out.println("after: "+string);
        } catch (Exception e) {
           System.out.println(e);
        }
       
    }
}