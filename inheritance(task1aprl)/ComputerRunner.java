class ComputerRunner{
    public static void main(String[] args){

        Browser browser=new Browser();
		browser.type="edge browser";
		System.out.println("Name of browser:"+browser.type);
		browser.open();
	

		
        ChromeBrowser chromeBrowser=new ChromeBrowser();

        chromeBrowser.open();       
        chromeBrowser.fastOpen();   



        MobileChromeBrowser mobile=new MobileChromeBrowser();

        mobile.type="opera browser";
        System.out.println(" name of browser="+mobile.type);

        mobile.open();       
        mobile.fastOpen();  
        mobile.offline();    
		
		Computer computer = new Computer();
		computer.install(browser);
        computer.install(chromeBrowser);  
        computer.install(mobile);         
    }
}