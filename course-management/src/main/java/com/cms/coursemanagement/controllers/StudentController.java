package com.cms.coursemanagement.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cms.coursemanagement.dao.StudentRepository;
import com.cms.coursemanagement.models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
@Autowired
private StudentRepository sturepository;
@RequestMapping(value="/",method=RequestMethod.GET)
public String studentLogin()
{
return "student";
}

@RequestMapping(value="/studentregister",method=RequestMethod.GET)
public String studentRegister(Model model)
{
Student st=new Student();
model.addAttribute("student",st);
return "studentregister";
}
@RequestMapping(value="/Register",method=RequestMethod.POST)
public String addStudentRegister(@ModelAttribute("student")Student stu)
{
Student st=sturepository.save(stu);
if(st!=null)
{
return "student";
}
else
{
return  "index";
}
}

}