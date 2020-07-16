public class Method
{
   public static final int fullTime=1;
   public static final int partTime=2;
   public static final int totalWorkingDays=20;

   public void EmpWage()
   {
      int wagePerHour=20;
      int empWage=0;
      int empHrs=0;
      int totalWorkingHours=100;
      int totalwage=0;
      int workingHours=0,workingDays=0;

      while(totalWorkingDays > workingDays && totalWorkingHours > workingHours)
      {
         workingDays++;

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
         totalWorkingHours+=empHrs;
         empWage = empHrs * wagePerHour;
         totalwage+=empWage;
         System.out.println("Employee wage per day is" +empWage);
      }
      System.out.println("Total wage of employee" +totalwage);
   }
   public static void main (String[] args)
   {
      Method me=new Method();
      me.EmpWage();
   }

}

