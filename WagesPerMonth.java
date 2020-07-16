public class WagesPerMonth
{
   public static final int fullTime=1;
   public static final int partTime=2;

   public void EmpMonthWage()
   {
      int wagePerHour=20;
      int workingDays=20;
      int empWage=0;
      int empHrs=0;
      int totalwage=0;

      for(int i=0;i< workingDays;i++)
      {
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
         totalwage+=empWage;
         System.out.println("Employee wage per day is" +empWage);
      }
      System.out.println("Total wage of employee" +totalwage);
   }
   public static void main (String[] args)
   {
      WagesPerMonth wpm=new WagesPerMonth();
      wpm.EmpMonthWage();
   }
}

