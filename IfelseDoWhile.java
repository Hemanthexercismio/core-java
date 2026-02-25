class IfelseDoWhile
{
   public static void main(String[] args)
   {
      int marks = 75;

      if (marks >= 90)
      {
         System.out.println("grade A");
      }

      if (marks >= 50)
      {
         System.out.println("pass");
      }
      else
      {
         System.out.println("fail");
      }

      int x = 2;

      while (x <= 20)
      {
         System.out.println("even number " + x);
         x += 2;
      }

      int y = 5;

      do
      {
         System.out.println("count down " + y);
         y--;
      }
      while (y > 0);
   }
}