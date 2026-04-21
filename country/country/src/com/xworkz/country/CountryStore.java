package com.xworkz.country;

public class CountryStore {
    Country [] countries ;
    int presentindex = 0;
    public void save(Country country)
    {
        if(presentindex < countries.length)
        {
            countries[presentindex]=country;
            presentindex++;
            System.out.println("countries saved succsefuly");
        }
        else {
            System.out.println("no space store is full");
        }
    }
  /* public Country findByName(String countryName)
    {
        for(Country cntry:countries){
            if(countryName!=null)
            {
              if(country!=null &&  )
            }
        }
    }*/
}
