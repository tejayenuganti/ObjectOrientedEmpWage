public class DailyEmpWage
{
	public void DailyWage()
   {
      int fullTime=1;
      int wagePerHour=20;
      int empWage=0;
      int empHrs=0;

      double empFind=Math.floor(Math.random() * 10)%2;
      if(empFind == fullTime)
      {
         empHrs=8;
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
		DailyEmpWage dew= new DailyEmpWage();
		dew.DailyWage();
	}

}







