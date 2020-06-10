import java.net.*;
import java.io.*;
import java.util.*;

class TcpClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 2000);
            
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            System.out.print("enter string: ");
            String te = sc.nextLine();
            out.writeUTF(te);
            System.out.println("before: "+te);

            DataInputStream in=new DataInputStream(socket.getInputStream());  
            String  string=(String)in.readUTF();  
            System.out.println("after: "+string);
            socket.close();
        } catch (Exception e) {
           System.out.println(e);
        }
       
    }
}