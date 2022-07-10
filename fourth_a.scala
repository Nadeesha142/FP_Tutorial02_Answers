
object forth_a{

  def main(args:Array[String])
  {
    var pay_normal=250;
    var pay_ot=85;
    var normal_h=40;
    var ot_h=30;

    var salary=(pay_normal*normal_h)+(pay_ot*ot_h);
    var takeHome_salary=salary*0.88;

    println("Take Home Salary=Rs.");
    println(takeHome_salary);
  }
}
