class RideFareCalculatorRunner{
    public static void main(String[] args){
        RideFareCalculator ridefareCalculator = new RideFareCalculator(2, "11 PM", true, 2);
        ridefareCalculator.calculateFinalFare();
		
		System.out.println("===============");
		
		RideFareCalculator ridefareCalculator1= new RideFareCalculator(4,"5 AM",true,4);
		ridefareCalculator1.calculateFinalFare();
    }
}