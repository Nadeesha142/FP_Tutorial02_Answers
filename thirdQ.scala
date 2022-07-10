
object thirdQ {
  def main(args:Array[String])
  {
    var a=2;
    var b=3;
    var c=4;
    var d=5;
    var k:Double=4.3f;

    //scala doesn't support for unary operators,because of that this operators rewrite using binary ones

    // m=(--b)*(a+c)*(d--);
    // m=(b-1)*a+c*d;
  
    // n=a++
    // n=a

    //p=c=c++ 
    //p=c

    //q=(c=(c++)*(a++))
    //q=(c+1)*a

    var m=(b-1)*a+c*d;
    var n=a;
    var o:float=(-2*(g-k)+c);
    var p=c;
    var q=(c+1)*a;

    println(m);
    println(n);
    printl(o);
    println(p);
    println(q);
  
 }
} 
