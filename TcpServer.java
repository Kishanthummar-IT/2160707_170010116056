import java.net.*;
import java.io.*;
import java.util.*;

class TcpServer{
     public static void main(String[] args) {
        
         try {
            ServerSocket socket = new ServerSocket(2000);
            System.out.println("**Server is start on 2000**");
            Socket socket = serversocket.accept();
             
            DataInputStream in=new DataInputStream(socket.getInputStream());  
            String  string=(String)in.readUTF();
            String res = convert(strring);  
               
            String reverse = new StringBuffer(strring).reverse().toString();
            res=reverse.toUpperCase();
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF(res);       
        } catch (Exception e) {
             System.out.println(e);
            }
    }
    public static String convert(String str) 
    { 
        char ch[] = str.toCharArray(); 
        for (int i = 0; i < str.length(); i++) { 
            if (i == 0 && ch[i] != ' ' ||  ch[i] != ' ' && ch[i - 1] == ' ') { 
                if (ch[i] >= 'a' && ch[i] <= 'z') { 
                    ch[i] = (char)(ch[i] - 'a' + 'A'); 
                } 
            } 
            else if (ch[i] >= 'A' && ch[i] <= 'Z')  
                ch[i] = (char)(ch[i] + 'a' - 'A');             
        } 
        String st = new String(ch); 
        return st; 
    }
}
