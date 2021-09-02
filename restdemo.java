package com;





import java.util.List;





import javax.websocket.server.PathParam;





import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class restdemo {





StudentService studentService = new StudentService();





// Get callusing spring based web service





@GetMapping("/studenterp")
public String sayHello() {





return "hi how are you SJ!";
}





// retrive person info USing @GET MEthod
@GetMapping("/personal")
public Student getDummyStudent() {





Student s = new Student();// creating java object
s.setRollno(105);
s.setName("SJ");
s.setEmail("sj@gmail.com");
s.setBranch("CSE");
return s;
}
// retrive the person information by id
@GetMapping("/studentrollno/{rollno}")
public Student getDummyStudentById(@PathVariable("rollno") Integer rollno) {





Student s = new Student();// creating java object





s.setRollno(rollno);
s.setName("SJ");
s.setEmail("sj@gmail.com");
s.setBranch("CSE");
return s;
}






// add the person information POst





@PostMapping(value = "/insertStudentdetails")
public Student insertDummyStudent(@RequestBody Student student) {
return studentService.addStudent(student); //calling the service
}





//update person info
@PutMapping("/studentupdate")
public Student updatestudentInfo(@RequestBody Student student) {
return studentService.updateStudent(student);

}
//get list
@GetMapping("/getstudentlist")
public List<Student> getDummyStudentList() {
List<Student> listOfPerson = studentService.getAllStudentlist();
return listOfPerson;
}

//delete

@DeleteMapping("/delete/{rollno}")
public List<Student> deleteStudentByRollno(@PathVariable Integer rollno) {
new StudentService().deleteStudent(rollno);
return new StudentService().getAllStudentlist();
}
}