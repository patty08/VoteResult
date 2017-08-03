package com.vote.resultat.vote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Controller
@RequestMapping("/")
class voteControler {

    final static DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    @PersistenceUnit(unitName="Votes")
    private EntityManagerFactory factory;

    @Autowired
    ResultatService resultatService;


    @RequestMapping(name = "resultat")
    public String getVote(ModelMap modelMap){
        EntityManager a = factory.createEntityManager();

        Query query = a.createQuery("SELECT * From Votes");
        System.out.println(query);
        return "result";
    }



    @RequestMapping(method = RequestMethod.GET)
    ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("resultat");
        modelAndView.addObject("resultat", resultatService.findAll());
        return modelAndView;
    }



/*
        @RequestMapping(value = "student", method = RequestMethod.POST, consumes = MediaType.ALL_VALUE)
        @ResponseStatus(value = HttpStatus.OK)
        ModelAndView addStudent(@RequestParam Integer rollNo,
                                @RequestParam String name,
                                @RequestParam String dateOfBirth ) throws Exception {

            ModelAndView modelAndView = new ModelAndView("student");
            try {
                Student student = new Student();
                student.setRollNo(rollNo);
                student.setName(name);
                student.setDateOfBirth(df.parse(dateOfBirth));
                student = studentService.addStudent(student);
                modelAndView.addObject("message", "Student added with name: " + student.getName());
            }
            catch (Exception ex){
                modelAndView.addObject("message", "Failed to add student: " + ex.getMessage());
            }
            modelAndView.addObject("students", studentService.getStudents());
            return modelAndView;
        }
*/
}

