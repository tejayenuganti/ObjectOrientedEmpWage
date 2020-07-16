public class PartTimeEmp
{
	public void EmpWage()
   {
      int fullTime=1;
      int partTime=2;
      int wagePerHour=20;
      int empWage=0;
      int empHrs=0;

      double empFind=Math.floor(Math.random() * 10)%3;
      if(empFind == fullTime)
      {
         empHrs=8;
      }
      else if(empFind == partTime)
      {
         empHrs=4;
      }
      else
      {
         empHrs=0;
      }
      empWage = empHrs * wagePerHour;
      System.out.println("Employee wage per day is" +empWage);
   }
   public static void main (String[] args)
	{
		PartTimeEmp pte=new PartTimeEmp();
		pte.EmpWage();
	}
}



