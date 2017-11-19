object SquarePartial {
     val root: PartialFunction[(Int,Int),Int] = {
  case (a,b) if (a >= 0) || (b >=0) => 5+a+b
}
def square(x:Int) = 
{
    println("The square is "+ x * x)
}

      def main(args: Array[String]) {
          val a=5
          val b=5
       square(root(a,b))
      }
   }