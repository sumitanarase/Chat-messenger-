import java.lang.*;
import java.net.*;

import java.net.Socket;

import java.io.*;

class Client {
    public static void main(String arg[]) throws Exception
    {
        System.out.println(" Client application is running");
        String s1,s2;
        try{
         Socket s = new Socket("localhost",1100);

         BufferedReader brk = new BufferedReader(new InputStreamReader(System.in));
         BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
         PrintStream ps = new PrintStream(s.getOutputStream());
         while(!(s1 = brk.readLine()).equals("gn"))
         {
            ps.println(s1);
            s2 = br.readLine();
            System.out.println("sever says:"+s2);
            System.out.println("Enter message for server :");

         }
        }
      
            
         catch (Exception obj) {
            TODO: handle exception
        }
         s.close();
         br.close();
         brk.close();
        ps.close();
    }
}
