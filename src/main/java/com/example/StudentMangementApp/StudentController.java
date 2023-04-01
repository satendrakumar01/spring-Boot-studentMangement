package com.example.StudentMangementApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


//get information
    @GetMapping("/get_student")
   public  Student getStudent(@RequestParam("q") int admnNo){
        return studentService.getStudent(admnNo);

   }

    //    adding information
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);

    }
//    deleteApI
        @DeleteMapping("/delete_student/{id}")
        public String deleteStudent(@PathVariable("id") int id){

         return studentService.deleteStudent(id);
        }

//putAPI
    @PutMapping("/update_student")
    public String updateStudet(@RequestParam("id") int id,@RequestParam("age") int age){
        return studentService.updateStudent(id,age);

    }



}
