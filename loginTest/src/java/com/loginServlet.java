/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class loginServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String username = req.getParameter("uname");
        String password = req.getParameter("pass");
        
        if(username.equals("imesh") && password.equals("123")){
            
            HttpSession session = req.getSession();
            session.setAttribute("username", username);
            
           resp.sendRedirect("index.jsp");
        }
        else{
            resp.sendRedirect("login.jsp");
        }
        
    }
    
    
    
}
