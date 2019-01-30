package edu.hcu.db

import org.scalatest.FunSuite

class AssignmentTest extends FunSuite {

  val obj1 = Student(1, "radha@gmail.com","Radha", "Hyderabad")
  val obj2 = Student(2, "rakesh@gmail.com","Rakesh", "Hyderabad")
  val obj3 = Student(3, "Rekha@gmail.com", "Rekha","Hyderabad")
  val obj4 = Student(4,  "Rani@gmail.com", "Rani","Hyderabad")
  val obj5 = Student(5, "Raman@gmail.com","Raman", "Hyderabad")
  val obj6 = Student(6,  "Sudha@gmail.com","Sudha", "Hyderabad")
  val obj7 = Student(7,  "Sneha@gmail.com","Sneha", "Hyderabad")
  val obj8 = Student(8,  "Sonu@gmail.com", "Sonu","Hyderabad")
  val obj9 = Student(9,  "Sanno@gmail.com","Sanno", "Hyderabad")
  val obj10 = Student(10,  "Sam@gmail.com","Sam", "Hyderabad")
  val obj11= Student(11,  "Sameer@gmail.com","Sameer", "Hyderabad")
  val obj12= Student(12, "Mariya@gmail.com","Mariya", "Hyderabad")
  val obj13 = Student(13, "Radhika@gmail.com","Radhika", "Hyderabad")
  val obj14= Student(14,  "Bindhu@gmail.com", "Bindhu","Hyderabad")
  val obj15= Student(15,  "Sindhu@gmail.com", "Sindhu","Hyderabad")
  val obj16= Student(16,  "Indu@gmail.com","Indhu", "Hyderabad")

  val result1 = Assignment.createStu(obj1)
  val result2 = Assignment.createStu(obj2)
  val result3 = Assignment.createStu(obj3)
  val result4 = Assignment.createStu(obj4)
  val result5 = Assignment.createStu(obj5)
  val result6 = Assignment.createStu(obj6)
  val result7 = Assignment.createStu(obj7)
  val result8 = Assignment.createStu(obj8)
  val result9 = Assignment.createStu(obj9)
  val result10 = Assignment.createStu(obj10)
  val result11= Assignment.createStu(obj11)
  val result12 = Assignment.createStu(obj12)
  val result13 = Assignment.createStu(obj13)
  val result14= Assignment.createStu(obj14)
  val result15 = Assignment.createStu(obj15)
  val result16 = Assignment.createStu(obj16)
  //subject

  val sub1=Subject(21,"C language","C01")
  val sub2=Subject(22,"Data Structures","D01")
  val sub3=Subject(23,"Algorithms","A01")
  val sub4=Subject(24,"Operating System","OS01")
  val sub5=Subject(25,"Software Enginnering","SE01")
  val sub6=Subject(26,"Data Mining","DM01")
  val sub7=Subject(27,"Programming Methodology","PM01")
  val sub8=Subject(28,"Parallel Computing","PC01")
  val res1= Assignment.createSub(sub1)
  val res2= Assignment.createSub(sub2)
  val res3= Assignment.createSub(sub3)
  val res4= Assignment.createSub(sub4)
  val res5= Assignment.createSub(sub5)
  val res6= Assignment.createSub(sub6)
  val res7= Assignment.createSub(sub7)
  val res8= Assignment.createSub(sub8)



  val objk = Student(17, "renu@gmail.com", "Rakesh", "Hyderabad")

  test("Create Student") {
    val result = Assignment.createStu(objk)
    val expectResult = true
    assert(result === expectResult)
  }
  val obj = Student(2, "radhe@gmail.com", "Rakesh", "Hyderabad")

  test("Update Student") {
    val result = Assignment.createStu(obj)
    val expectResult = false
    assert(result === expectResult)
  }

  test("delete student"){
    val result = Assignment.deleteStu(17)
    val expectResult = true
    assert(result === expectResult)
  }

  test("Get students ") {
    val result = Assignment.getStudent
    val expectResult = List(Student(1, "radha@gmail.com", "Radha", "Hyderabad"),
      Student(2, "rakesh@gmail.com", "Rakesh", "Hyderabad"),
      Student(3, "Rekha@gmail.com", "Rekha", "Hyderabad"),
      Student(4, "Rani@gmail.com", "Rani", "Hyderabad"),
      Student(5, "Raman@gmail.com", "Raman", "Hyderabad"),
      Student(6, "Sudha@gmail.com", "Sudha", "Hyderabad"),
      Student(7, "Sneha@gmail.com", "Sneha", "Hyderabad"),
      Student(8, "Sonu@gmail.com", "Sonu", "Hyderabad"),
      Student(9, "Sanno@gmail.com", "Sanno", "Hyderabad"),
      Student(10, "Sam@gmail.com", "Sam", "Hyderabad"),
      Student(11, "Sameer@gmail.com", "Sameer", "Hyderabad"),
      Student(12, "Mariya@gmail.com", "Mariya", "Hyderabad"),
      Student(13, "Radhika@gmail.com", "Radhika", "Hyderabad"),
      Student(14, "Bindhu@gmail.com", "Bindhu", "Hyderabad"),
      Student(15, "Sindhu@gmail.com", "Sindhu", "Hyderabad"),
      Student(16, "Indu@gmail.com", "Indhu", "Hyderabad"))
    assert(result === expectResult)
  }


  test("Get Students from Subjects"){
    val result = Assignment.getStudentWithSubject
    val expectResult =List(("Radha","C language"),
      ("Radha","Data Structures"),
      ("Radha","Algorithms"),
      ("Rakesh","C language"),
      ("Rakesh","Data Structures"),
      ("Rakesh","Algorithms"),
      ("Rekha","Algorithms"),
      ("Rekha","Operating System"),
      ("Rekha","Parallel Computing"),
      ("Rani","Operating System"),
      ("Rani","Programming Methodology"),
      ("Rani","Parallel Computing"),
      ("Raman","Software Enginnering"),
      ("Raman","Programming Methodology"),
      ("Raman","Parallel Computing"),
      ("Sudha","C language"),
      ("Sneha","Data Structures"),
      ("Sonu","Software Enginnering"),
      ("Sanno","Software Enginnering"),
      ("Sam","C language"))
    assert(result === expectResult)
  }

  test("Top 5 subjects"){
    val result=Assignment.topSubject
    val expectResult=List("C language", "Data Structures", "Algorithms", "Operating System", "Software Enginnering")
    assert(result === expectResult)
  }
}
