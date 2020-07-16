public class Attendence
{
	public void EmpPresent()
   {
      int Attendence=1;
      double empFind=Math.floor(Math.random() * 10)%2;
      if(empFind == Attendence)
      {
         System.out.println("Employee is present");
      }
      else
      {
         System.out.println("Employee is absent");
      }

   }
	   public static void main (String[] args)
		{
			Attendence a=new Attendence();
			a.EmpPresent();
		}

}

