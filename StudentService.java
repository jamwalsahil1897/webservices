package com;







import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;







/*
* It is just a helper class which should be replaced by database implementation.
* It is not very well written class, it is just used for demonstration.
*/
public class StudentService {







static HashMap<Integer, Student> studentRollnoMap = getStudentRollnoMap(); //map list







public StudentService() {
super();







if (studentRollnoMap == null) {
studentRollnoMap = new HashMap<Integer, Student>();
// Creating some objects of Person while initializing
Student indiaStudent = new Student(1, "ram1", "ram1@gmail.com", "CSE");
Student chinaStudent = new Student(2, "ram2", "ram2@gmail.com", "IT");
Student nepalStudent = new Student(3, "ram3", "ram3@gmail.com", "ME");
Student bhutanStudent = new Student(4, "ram4", "ram4@gmail.com", "ECE");







//adding map list of collections in java
studentRollnoMap.put(1, indiaStudent);
studentRollnoMap.put(4, chinaStudent);
studentRollnoMap.put(3, nepalStudent);
studentRollnoMap.put(2, bhutanStudent);
}
}







public List<Student> getAllStudentlist() {
List<Student> studentlist = new ArrayList<Student>(studentRollnoMap.values());
return studentlist;
}







public Student getStudent(int rollno) {
Student Student = studentRollnoMap.get(rollno);
return Student;
}
// add person
public Student addStudent(Student student) {
student.setRollno(getMaxRollno()+ 1);





// key , value
studentRollnoMap.put(student.getRollno(), student); ///logic class
return student;
}
//update
public Student updateStudent(Student student) {
if (student.getRollno() <= 0)
return null;
studentRollnoMap.put(student.getRollno(), student);
return student;







}
//delete







public Student deleteStudent(int rollno) {
return studentRollnoMap.remove(rollno);
}







public static HashMap<Integer, Student> getStudentRollnoMap() {
return studentRollnoMap;
}







// Utility method to get max id
public static int getMaxRollno() {
int max = 0;
for (int id : studentRollnoMap.keySet()) {
if (max <= id)
max = id;







}
return max;
}
}