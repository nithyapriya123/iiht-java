package com.cms.coursemanagement.controllers;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class AdminController {
@RequestMapping(value = "/admin",method = RequestMethod.GET)
public String home()
{
return "admin";
}
@RequestMapping(value = "/adminlogin",method = RequestMethod.GET)
public String adminlogoin(HttpServletRequest req)
{
String username = req.getParameter("unmae");
String password= req.getParameter("pass");
if(username.equals("root") && password.equals("root"))
{
return "welcome";
}
else
{
return "admin";
}
}
}