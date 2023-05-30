
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mfgperez
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    
    @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
       
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response); // use / before WEB
      
       
   }
    
  
     @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
      
       /*PARAMITERS*/ 
       
        int first = Integer.parseInt(request.getParameter("first")); 
        int second= Integer.parseInt(request.getParameter("second")); 
        
        String first1 = request.getParameter("first"); 
        String second1 = request.getParameter("second"); 
        
       
      
        String add = request.getParameter("+"); 
        String minus = request.getParameter("-"); 
        String times = request.getParameter("*"); 
        String divide = request.getParameter("%"); 
        
       
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        String errorMessage; 
        int result;
       
   
       /* VALIDATION */ 
      
       if (first1 != null ||  !first1.equals("") || second1 != null ||  !second1.equals("") )  {
           
           /* LOGIC */ 
       
        // only the first if statment gets executed if we go add.equals("+");
        // since the rest of the submit buttons are null they dont get executed then we ger 500 error 
   
       if (add != null) {
           
           request.setAttribute("symbol", "+");
           result = first += second;
           request.setAttribute("result", result);
           
       } else if (minus != null) {
   
             request.setAttribute("symbol", "-");
             result = first -= second;
             request.setAttribute("result", result);
             
       } else if (times != null) {
           
             request.setAttribute("symbol", "*");
             result = first *= second;
             request.setAttribute("result", result);
             
       } else if (divide != null) {
    
             request.setAttribute("symbol", "%");
             result = first /= second;
             request.setAttribute("result", result);
       }

      
           
       } else {
                  
            errorMessage = "enter a number"; 
            request.setAttribute("result", errorMessage);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
           return; 
       }
     
       
       
       
        
      
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
     
     
     
   }
   
   
   
   
  
}
