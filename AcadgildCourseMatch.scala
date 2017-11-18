object AcadgildCourseMatch {
     

      def main(args: Array[String]) {
course("Android")
course("Big Data Development")
course("Devops Development")
course("spark")
course("ios development")


      }
      def course(x:String)= x match {
  case "Android" => println("The Price of Android is 12999")
  case "Big Data Development" => println("The Price of Big Data Developmentis 17999")
  case "Devops Development" => println("The Price of Devops Developmentis 20000")
  case "spark" => println("The Price of spark is 19999")
  case _ => println(x+" course is not offered")
}
   }
