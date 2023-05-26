
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
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
       
       /* When browser first makes request ill use doGet */ 
       
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response); // use / before WEB
       // getServletContext is a method inherited by HttpServlet
       // getRequestDispasher lets you put in the file path for your jsp 
       // forward - forwards the request and response objects to your jsp 
       
       // your the one sending the http requests and response for the jsp page 
       
       // lets you display the jsp page 
       
       
   }
   
    @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
       // post request to recive the data from the jsp form 
       // if this is blank nothing will show up 
       
       /*PARAMITERS*/
       // retrieve form paramiters from jsp 
       String age = request.getParameter("age"); // gets user input for age and stores it in age var 
       
      
       int userAgeToInt = Integer.parseInt(age); 
       String errorMessage;
      
       /* VALIDATION */ 
       // if user leaves blank - error message = You must give current age 
       // if user enters a name not num - error message = you must enter a number 
       
       if (age == null || age.equals("")) { // null must come first or may risk null pointer 
           
           errorMessage = "You must give current age "; 
           request.setAttribute("age", errorMessage);
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response); 
           return;
       }
       else if ( userAgeToInt < 1 ) {
           
            errorMessage = "You must give a valid current age "; 
           request.setAttribute("age", errorMessage);
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response); 
           return; 
       }
       
       
       
       
       age = addOneYear(age); 
      
       // forward to jsp 
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response); // forwards go at the end after all datas been added
      
       
   }
   
  
   /**
    * 
    * @param userAge String containing age of user 
    * @return String statment and the users age plus one year 
    * Description takes user age parses it to an integer then displays 
    * Your age will be plus user age plus 1 
    */
   public String addOneYear(String userAge) {
       
       int addYear = Integer.parseInt(userAge); 
       addYear +=1; 
       
       return "Your age will be " + addYear + "!"; 
       
      
   }

  
   

}
