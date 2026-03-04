class DolphinRunner {
    public static void main(String[] args) {
        Dolphin d1 = new Dolphin();
        Dolphin d2 = new Dolphin();

        d1.activity(); 
		d1.doing2();
		d1.diving3();
		d1.method4();
		d1.method5();
        d1.method6(); 
		d1.method7(); 
		d1.method8(); 
		d1.method9();
		d1.method10();
        d1.method11(); 
		d1.method12(); 
		d1.method13();
		d1.method14();
		d1.method15();

        System.out.println("////////////////////");

        d2.activity(); 
		d2.doing2(); 
		d2.diving3(); 
		d2.method4(); 
		d2.method5();
        d2.method6();
		d2.method7(); 
		d2.method8(); 
		d2.method9(); 
		d2.method10();
        d2.method11(); 
		d2.method12(); 
		d2.method13(); 
		d2.method14(); 
		d2.method15();

        System.out.println("********************");

        Dolphin.staticMethod1();
        Dolphin.staticMethod2();
        Dolphin.staticMethod3();
        Dolphin.staticMethod4();
	Dolphin.staticMethod5();
	}
	}