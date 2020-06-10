import java.net.*;
import java.io.*;
import java.util.*;

class TcpServer{
     public static void main(String[] args) {
        
         try {
            ServerSocket sersocket = new ServerSocket(2000);
            System.out.println("**Server is start on 2000**");
            Socket socket = sersocket.accept();
             
            DataInputStream in=new DataInputStream(socket.getInputStream());  
            String  string=(String)in.readUTF();
               
            String reverse = new StringBuffer(string).reverse().toString();
            String res=reverse.toUpperCase();
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF(res);  
            socket.close();
            sersocket.close();     
        } catch (Exception e) {
             System.out.println(e);
            }
    }
  
}