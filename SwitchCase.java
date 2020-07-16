public class SwitchCase
{
   public static final int fullTime=1;
   public static final int partTime=2;

	public void EmpWage()
   {
      int wagePerHour=20;
      int empWage=0;
      int empHrs=0;

      int empFind=(int)Math.floor(Math.random() * 10)%3;
      switch ( empFind )
      {
         case fullTime:
            empHrs=8;
            break;

         case partTime:
            empHrs=4;
            break;

         default:
            empHrs=0;
            break;
      }
      empWage = empHrs * wagePerHour;
      System.out.println("Employee wage per day is" +empWage);
   }
	   public static void main (String[] args)
		{
			SwitchCase se=new SwitchCase();
			se.EmpWage();
		}
}



