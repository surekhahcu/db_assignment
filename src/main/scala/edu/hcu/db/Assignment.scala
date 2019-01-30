package edu.hcu.db

import java.sql._


case class Student(id: Int, email: String, name: String, address: String)

case class Subject(id: Int, name: String, code: String)


object Assignment {


  val connection: Connection = null
  // make the connection


  // create the statement, and run the select query


  def createStu(student: Student): Boolean =
    try {
      val connection: Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_assignment", "root", "root")
      val statement = connection.prepareStatement("insert into student (id, email, name, address) values (?, ?, ?, ?)")
      statement.setInt(1, student.id)
      statement.setString(2, student.email)
      statement.setString(3, student.name)
      statement.setString(4, student.address)
      statement.execute()
    } catch {
      case e: Exception =>
        e.printStackTrace()
        false
    } finally {
      connection
    }


  def updateStu(student: Student): Boolean = try {
    val connection: Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_assignment", "root", "root")
    val statement = connection.prepareStatement("update student set email=?, name=? ,address=? where id=?")
    statement.setString(1, student.email)
    statement.setString(2, student.name)
    statement.setString(3, student.address)
    statement.setInt(5, student.id)
    statement.execute()
  } catch {
    case e: Exception =>
      e.printStackTrace()
      false
  } finally {
    connection
  }

  def getStudent: List[Student] = {
    val list = collection.mutable.ListBuffer[Student]()

    try {
      val connection: Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_assignment", "root", "root")
      // val list = collection.mutable.ListBuffer[Student]()
      val statement = connection.createStatement
      val result = statement.executeQuery("select * from student")
      while (result.next) {
        val id = result.getInt(1)
        val email = result.getString(2)
        val name = result.getString(3)
        val address = result.getString(4)
        list.append(Student(id, email, name, address))
      }
      list.toList
    } catch {
      case e: Exception => e.printStackTrace()
        list.toList
    } finally {
      connection
    }
  }

  def deleteStu(id: Int): Boolean = try {
    val connection: Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_assignment", "root", "root")
    val statement = connection.prepareStatement("delete from student where id = ?")
    statement.setInt(1, id)
    statement.execute()
  } catch {
    case e: Exception =>
      e.printStackTrace()
      false
  } finally {
    connection
  }

  //subjects

  def createSub(subject: Subject): Boolean =
    try {
      val connection: Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_assignment", "root", "root")
      val statement = connection.prepareStatement("insert into subject (id, name,code) values (?, ?, ?)")
      statement.setInt(1, subject.id)
      statement.setString(2, subject.name)
      statement.setString(3, subject.code)
      statement.execute()
    } catch {
      case e: Exception =>
        e.printStackTrace()
        false
    } finally {
      connection
    }



  def createRoot(stuId:Int,subId:Int):Boolean= try {
    val connection:Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_assignment","root","root")
    val statement= connection.prepareStatement("insert into root(stuId,subId) values (?, ?)")
    statement.setInt(1,stuId )
    statement.setInt(2,subId )
    statement.execute()
  }catch {
    case e: Exception =>
      e.printStackTrace()
      false
  } finally {
    connection
  }

  def getStudentWithSubject():List[(String,String)]= {
    val list = collection.mutable.ListBuffer[(String,String)]()
    try{
      val connection:Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_assignment","root","root")
      val stmt: Statement =connection.createStatement();
      val  result:ResultSet=stmt.executeQuery("select student.name,subject.name from student,subject where (student.id,subject.id) in (select * from root);");

      while (result.next) {
        val student = result.getString(1)
        val subject= result.getString(2)
      // list:+(student,subject)
        list.append((student,subject))
      }
      list.toList
    }catch {
      case e: Exception => e.printStackTrace()
 list.toList
    } finally {
      connection
    }
  }

  def topSubject():List[String]={
    val list = collection.mutable.ListBuffer[String]()

    try {
    val connection: Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_assignment", "root", "root")
    // val list = collection.mutable.ListBuffer[Student]()
    val statement = connection.createStatement
    val result = statement.executeQuery("select name from subject where id in(select subId from root group by subId order by count(*) desc) limit 5;")
    while (result.next) {
    val subject = result.getString(1)
    list.append(subject)
  }
    list.toList
  } catch {
    case e: Exception => e.printStackTrace()
    list.toList
  } finally {
    connection
  }
  }
}
