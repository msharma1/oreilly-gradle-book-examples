package org.gradle.examples.web;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
package junit;
 
public class JUnitHelloWorld {
 
    public boolean isGreater(int num1, int num2){
        return num1 > num2;
    }
}

public class Servlet extends HttpServlet
{
   public void doGet(HttpServletRequest request,
                     HttpServletResponse response)
      throws IOException
   {
      PrintWriter pw = response.getWriter();
      pw.println("hello, world");
      pw.close();
   }
}
