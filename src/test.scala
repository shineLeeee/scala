object test {
  def main(args: Array[String]){
//    println("hello scala") 
//    val num:Any="it"
//    var x=2
//    println(if (x==1) "true" else "false")
//    val m=Array("welcome","come","to","my space")
//    
//    for (i <- m)
//      print(i+" ")
//      
//    println()
//    println(1.to(10).map(_*10))
//    
//    val a1=Array(1,2,3)
//    println(a1.reverse(1))
//     
//    val v = for (i <- 1 to 10) yield i * 10
//    println(v)
//    
//    def multi(x:Int,y:Int):Int={
//      x*y*13
//      
//    }
    def m4(f:(Int,Int)=>Int)=f(2,6)+100000
    val f2=(x:Int,y:Int)=>2+6
    println("m4:"+m4(f2))
      
  
    
//    println(multi(3,4))
//    val func1 = (x:Int,y:Double) => (y,x)
//    def m1(x:Int,y:Int)=x+x*y
//    println("结果是："+m1(5,7))
//    val m2=(x:Int,y:Int)=>{x+y}
//    println("结果为："+m2(3,7))
    

      
  } 
}    