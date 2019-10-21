package com.cms.coursemanagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

private Integer studentId;
@Column
private String StudentName;
@Column
private String email;
@Column
private String mobile;
@Column
private String username;
@Column
private String password;
public Integer getStudentId() {
return studentId;
}
public void setStudentId(Integer studentId) {
this.studentId = studentId;
}
public String getStudentName() {
return StudentName;
}
public void setStudentName(String studentName) {
StudentName = studentName;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public String getMobile() {
return mobile;
}
public void setMobile(String mobile) {
this.mobile = mobile;
}
public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
public Student() {
super();
}
@Override
public String toString() {
return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", email=" + email + ", mobile="
+ mobile + ", username=" + username + ", password=" + password + "]";
}
}

