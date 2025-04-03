package com.example.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.student;
import com.example.repositry.studentRepository;
//import com.mysql.cj.xdevapi.Schema.CreateCollectionOptions;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class studentControl {

	
	@Autowired
	studentRepository rep;
	
	
	@GetMapping("/students")
	public List<student> getAllStudent(){
		
		List<student>Stu = rep.findAll();
		
		return Stu;
		
	}
	
	public student getStudents(@PathVariable int id){
		
		student st = rep.findById(id).get();
		
		return st;
		
	}
	
	@PostMapping("student/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createstudent(@RequestBody student stu) {
		
//		rep.save(student);
	}
	@PutMapping("student/update{id}")
	public student upstudent(@PathVariable int id) {
		
		student stud = 	rep.findById(id).get();
		
		stud.setName("Ram Deva");
		stud.setBranch("MPCS");
		stud.setId(2345);
		stud.setStudentGroup("Back");
		
//	(@PathVariable String id, @RequestBody String entity) {
		//TODO: process PUT request
		
		return stud;
	}
	@DeleteMapping("student/delet/{id}")
	public student removestude(@PathVariable int id) {
		student stud=rep.findById(id).get();
	rep.delete(stud);
		return null;
		
	}
}
