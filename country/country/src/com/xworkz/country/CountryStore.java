package com.xworkz.country;

public class CountryStore {
    Country[] countries;
    int presentindex = 0;

    public CountryStore(Country[] countries) {
        this.countries = countries;
    }

    public void save(Country country) {
        if (presentindex < countries.length) {
            countries[presentindex] = country;
            presentindex++;
            System.out.println("countries saved succsefuly");
        } else {
            System.out.println("no space store is full");
        }
    }

    public Country findByName(String countryName) {
        for (Country cntry : countries) {
            if (countryName != null) {
                if (cntry != null && cntry.name.equals(countryName)) {
                    return cntry;
                }
            } else {
                System.out.println("country name should not be null");
            }
        }

        return null;
    }

    public State findByStateName(String stateName) {
        if (stateName != null) {
            for (Country cntry : countries) {
                if (cntry != null && cntry.states != null) {
                    for (State state : cntry.states) {
                        if (state.name.equals(stateName)) {
                            return state;
                        }
                    }
                }
            }
        } else {
            System.out.println("name of state is null");
        }
        return null;


    }
    public City[] findAllCityByStateName(String statename)
    {
        if(statename!=null)
        {
            for(Country cntry:countries)
            {
                if(cntry!=null&&cntry.states!=null)
                {
                    for(State state:cntry.states)
                    {
                        if(state!=null && state.name.equals(statename) && state.cities!=null)
                        {
                           return state.cities;
                        }
                    }
                }
            }
        }
        else{
            System.out.println("state name is nulllllll");
        }
        return null;
    }
}