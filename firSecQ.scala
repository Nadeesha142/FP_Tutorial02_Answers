
object firSecQ{

  def main(args:array[String])
  {
    var j=2;
    var i=2;
    var k=2;
    var m=5;
    var n=5;
    var f= 12.0f;
    var g=4.0f;
    var c='X';

    var x=k+12*m;
    var y:float=m/j;
    var z=n%j;
    var s=m/j*j;
    var q=f+10*5+g;
    var r=(i+1)*5; // (++i*5)there will be an error,scala had not support for  ++operator,because of that(++i=1+i)take like that

    println("%i\n",x);
    println("%.1f\n",y);
    println("%i\n",z);
    println("%i\n",s);
    println("%i\n",q);
    println("%i\n",r);

  }
} 
 
 
 


