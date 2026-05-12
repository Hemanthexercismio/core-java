package com.xworkz.interfaces.usage;

import com.xworkz.interfaces.Supermarket;

public class Producer {
    private final Supermarket supermarket;

    public Producer(Supermarket supermarket) {

        this.supermarket = supermarket;
    }
public void bill()
{
   if(this.supermarket!=null)
       System.out.println("selling executing by producer");
   {

       this.supermarket.discount();
       this.supermarket.purchase();

   }
}

}
