
package com.cloud.controller;

import com.cloud.dao.signuUpDao;
import com.cloud.services.SignupDetails;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
@RequestMapping(value = "/login")
public class Controller {
    
   private signuUpDao SignupDao = new signuUpDao();
    
    @RequestMapping(value = "/run", method = RequestMethod.GET )
    public String run(HttpServletRequest request,SignupDetails signupDetails , HttpServletResponse response){
        
        return  "view";
    };
    
     @RequestMapping(value="/Add",method = RequestMethod.POST)
    public void AddDetail(HttpServletRequest request,SignupDetails signupDetails , HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException
    {
       String firstName = request.getParameter("UserFirstName");
		String lastName = request.getParameter("UserLastName");
		String password = request.getParameter("Password");
                Integer phonenumber = Integer.parseInt(request.getParameter("PhoneNumber"));
                
                SignupDetails thedetail = new SignupDetails(firstName, lastName, phonenumber, password);
                SignupDao.AddDetail(thedetail);
                
                
		      PrintWriter out =    response.getWriter();
                      out.println("Registration completed");
     
    }
}
    
    

