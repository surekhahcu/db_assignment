package edu.hcu.db

object AssignmentApp extends App {

  Class.forName("com.mysql.jdbc.Driver")


  /*val obj1 = Student(1, "radha@gmail.com","Radha", "Hyderabad")
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
  //println(result)
  val result2 = Assignment.createStu(obj2)
//  println(result1)
  val result3 = Assignment.createStu(obj3)
  //println(result2)
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

  //val students = Assignment.getStudent
 // println(students)

 // val deleteResult= Assignment.deleteStu(2)
 // println(deleteResult)


 // val updateResult=Assignment.updateStu(obj1)
 //println(updateResult)
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
 // println(res1)
 // println(res2)
 // println(res3)
  //println(res4)


 val root1=Assignment.createRoot(1,21)
  val root2=Assignment.createRoot(1,22)
  val root3=Assignment.createRoot(1,23)
  val root4=Assignment.createRoot(2,21)
  val root5=Assignment.createRoot(2,22)
  val root6=Assignment.createRoot(2,23)
  val root7=Assignment.createRoot(3,24)
  val root8=Assignment.createRoot(3,23)
  val root9=Assignment.createRoot(3,28)
  val root10=Assignment.createRoot(4,28)
  val root11=Assignment.createRoot(4,24)
  val root12=Assignment.createRoot(4,27)
  val root13=Assignment.createRoot(5,25)
  val root14=Assignment.createRoot(5,28)
  val root15=Assignment.createRoot(5,27)
  val root16=Assignment.createRoot(6,21)
  val root17=Assignment.createRoot(7,22)
  val root18=Assignment.createRoot(8,25)
  val root19=Assignment.createRoot(9,25)
  val root20=Assignment.createRoot(10,21)*/


  val topSub=Assignment.topSubject
  val getStu=Assignment.getStudentWithSubject
  println(topSub)
  println(getStu)

}
