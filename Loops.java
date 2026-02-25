class Loops
{
   public static void main(String[] args)
   {
      int value = 20;

      if (value <= 30)
      {
         System.out.println("number is less than 31");
      }

      if (value <= 100)
      {
         System.out.println("number is between 31 and 100");
      }
      else
      {
         System.out.println("number is greater than 100");
      }

      int i = 1;

      while (i <= 3)
      {
         System.out.println("while loop " + i);
         i++;
      }

      int j = 1;

      do
      {
         System.out.println("do while loop " + j);
         j++;
      }
      while (j <= 3);
   }
}