

object AcadgildCourse extends App {
  //map initialization 
  val course=Map(1->"Android",
  2->"Bigdata development",
  3->"Bigdata Administrator",
  4->"spark")
  for(i<-course.keys)//for loop for key values
  {
    print(i+" ")
    //match statement for keys 
    i match
    {
      //case statements for values 1,2,3,4 and default cases
      case 1 =>println(course(i)+" price 12999")
      case 2 =>println(course(i)+" price 17999")
      case 3=>println(course(i)+" price 17999")
      case 4=>println(course(i)+" price 19999")
      case _=>println("unknown course")
    }
  }
  
}