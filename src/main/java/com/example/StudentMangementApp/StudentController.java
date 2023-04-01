package com.example.StudentMangementApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


//get information
    @GetMapping("/get_student")
   public  ResponseEntity getStudent(@RequestParam("q") int admnNo){
        Student student= studentService.getStudent(admnNo);
        return new ResponseEntity<>(student, HttpStatus.FOUND);

   }

    //    adding information
    @PostMapping("/add_student")
    public ResponseEntity addStudent(@RequestBody Student student){
        String response= studentService.addStudent(student);
        return new ResponseEntity<>(response,HttpStatus.CREATED);

    }
//    deleteApI
        @DeleteMapping("/delete_student/{id}")
        public ResponseEntity deleteStudent(@PathVariable("id") int id){
        String response= studentService.deleteStudent(id);

        if(response.equals("Invalid id")){
            return new ResponseEntity(response,HttpStatus.NOT_FOUND);

        }
        return  new ResponseEntity(response,HttpStatus.FOUND);

        }

//putAPI
    @PutMapping("/update_student")
    public ResponseEntity updateStudent(@RequestParam("id") int id,@RequestParam("age") int age){
        String response=studentService.updateStudent(id,age);
        if(response==null){
            return new ResponseEntity("Invalid Request",HttpStatus.BAD_REQUEST);
        }
        return  new ResponseEntity("Succssefully Updated",HttpStatus.ACCEPTED);
    }



}
