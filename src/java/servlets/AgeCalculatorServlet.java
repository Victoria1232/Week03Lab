
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mfgperez
 */
public class AgeCalculatorServlet extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) 
           throws ServletException, IOException {
       
       
       /* When browser first makes request ill use doGet */ 
       
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response); // use / before WEB
       // getServletContext is a method inherited by HttpServlet
       // getRequestDispasher lets you put in the file path for your jsp 
       // forward - forwards the request and response objects to your jsp 
       
       // your the one sending the http requests and response for the jsp page 
       
       // lets you display the jsp page 
       
   }
   
    @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       
       
       // post request to recive the data from the jsp form 
       // if this is blank nothing will show up 
       
       // retrieve form paramiters from jsp 
       
       String age = request.getParameter("age");
       
       age = toString(age); 
  
       // display age variable to another jsp 
      request.setAttribute("age", age); // store the variables of age into request object 
       
       // forward to jsp 
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response); 
      
       
   }
   
  
   public String toString(String userAge) {
       
       int addYear = Integer.parseInt(userAge); 
       addYear +=1; 
       
       return "Your age will be " + addYear + "!"; 
       
      
   }

   

}
