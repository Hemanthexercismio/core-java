class Switchcases
{
 public static void main (String [] args)
 
 {
	 int day = 4;

      switch (day)
      {
         case 1:
            System.out.println("Monday");
            break;
         case 2:
            System.out.println("Tuesday");
            break;
         case 3:
            System.out.println("Wednesday");
            break;
         case 4:
            System.out.println("Thursday");
            break;
         case 5:
            System.out.println("Friday");
            break;
         default:
            System.out.println("Weekend");
	  }	
	    int count = 1;
        boolean run = true;

      while (run)
      {
         System.out.println("while loop running " + count);
         count++;

         if (count > 3)
            run = false;
      }
	 

}
}