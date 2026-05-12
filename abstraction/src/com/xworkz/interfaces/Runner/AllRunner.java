package com.xworkz.interfaces.Runner;

import com.xworkz.interfaces.DmartSupermarket;
import com.xworkz.interfaces.Supermarket;
import com.xworkz.interfaces.inner.BindenMenucard;
import com.xworkz.interfaces.inner.Menucard;
import com.xworkz.interfaces.inner.Remote;
import com.xworkz.interfaces.inner.SonyRemote;
import com.xworkz.interfaces.usage.Kitchen;
import com.xworkz.interfaces.usage.Producer;
import com.xworkz.interfaces.usage.User;

public class AllRunner {
    public static void main(String[] args) {
        Supermarket supermarket=new DmartSupermarket();
        Producer producer=new Producer(supermarket);
        producer.bill();

        Remote remote=new SonyRemote();
        User user=new User(remote);
        user.operatingTV();

        Menucard menucard=new BindenMenucard();

        Kitchen kitchen=new Kitchen(menucard);
        kitchen.Serving();




    }
}
