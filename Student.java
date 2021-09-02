package com;





public class Student {
private Integer rollno;
private String name;
private String email;
private String branch;
//constructor
public Student() {
super();
}
//paramaterize constructor
public Student(Integer rollno, String name,String email,String branch) {
super();
this.rollno = rollno;
this.name =name;
this.email=email;
this.branch = branch;
}






//id
public int getRollno() {
return rollno;
}
public void setRollno(int rollno) {
this.rollno = rollno;
}
//name
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
//email
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}





//addres
public String getBranch() {
return branch;
}
public void setBranch(String branch) {
this.branch = branch;
}





}