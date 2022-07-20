object question4_a extends App{
	// salary per week from the working hours 
	def workingHours(workingH:Int)=workingH*250; //salary per working hour=250

	//salary per week from the OT hours
	def OTworks(OTH:Int)=OTH*85; // salary per working hour=85

	//total per week from working hours salary and the OT hours salary
	def total(workingH:Int,OTH:Int):Int=workingHours(workingH)+OTworks(OTH);

	//tax per week
	def tax(total:Int):Double=total*0.12;

	//home salary for week
	def homeSalary(workingH:Int,OTH:Int)=total(workingH,OTH)-tax(total(workingH,OTH));

	printf("Home salary of an employee=%.2f",homeSalary(40,30));
}