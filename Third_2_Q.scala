
object Third_2_Q extends App{
    var a=2;
    var b=3;
    var c=4;
    var d=5;
    var k:Float=4.30;
    var g:Float=4.0;

    /*scala doesn't support for -- dicrement operator and ++ increment operator,
    because of that this operators rewrite using binary ones*/

    // m=(--b)*(a+c)*(d--);//--b=b-1(before type the value decrement by 1)
    // m=(b-1)*a+c*d; 
  
    // n=a++ (after type the value of "a",increment a by 1)
    // n=a
    // after this new a=a+1=5

    //p=c=c++ (after type the value of "c",increment c by 1)
    //p=c
    //after this new c=c+1, but c=c++ therefore c value not change

    //q=(c=(++c)*(a++))
    //q=(c=(c+1)*a)
    //acording to new value of "c" and "a"
    //q=(c=(c+1)*(a+1))

    var m=(b-1)*a+c*d;
     // after display the value of m ,d new value is d-1=3-1=2
    var n=a;
     // after execute a++ a new value is a+1=2-1=3
    var o:Float=(-2*(g-k)+c);
    var p=c;
    // after execute previos variable c new value is c+1=4+1=5
    var q=(c+1)*(a+1);

    println(m);
    println(n);
    println(o);
    println(p);
    println(q);
  
 }
 
