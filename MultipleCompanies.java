public class MultipleCompanies
{
	public static final int IS_FULL_TIME =1;
   public static final int IS_PART_TIME =2;

    private final String Company;
    private final int empRatePerHour ;
    private final int numOfWorkingDays ;
    private final int maxHoursPerMonth ;

   MultipleCompanies(String Company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
		{

			this.Company = Company;
			this.empRatePerHour = empRatePerHour;
			this.numOfWorkingDays = numOfWorkingDays;
			this.maxHoursPerMonth = maxHoursPerMonth;
		}
		private int computeEmpWage()
		{
			int empHrs =0;
			int empWage=0;
			int TotalEmpWage=0;
			int TotalWorkingHours=0;
			int day =0;
			while( day < numOfWorkingDays || TotalWorkingHours <= maxHoursPerMonth)
			{
				double empCheck = Math.floor(Math.random() * 10 % 3 );
				day++;
				switch ((int)empCheck)
				{
					case IS_FULL_TIME:
						empHrs=8;
						break;
					case IS_PART_TIME:
						empHrs=4;
						break;
					default:
						empHrs =0;
				}
				TotalWorkingHours+=empHrs;
				empWage = empHrs * empRatePerHour;
				TotalEmpWage+=empWage;
			}
			return TotalEmpWage;
		}

		public static void main(String[] args)
		{
			MultipleCompanies mc1 = new MultipleCompanies("Trends",20,20,80);
			MultipleCompanies mc2 = new MultipleCompanies("Max",30,20,100);
			System.out.println("Total Emp wage :"+ mc1.computeEmpWage());
			System.out.println("Total Emp wage :"+ mc2.computeEmpWage());
		}
}
