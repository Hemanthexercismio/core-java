class InventoryManager{

    
    static int totalProductsTracked = 0;
    static double totalInventoryValue = 0.0;
    
    int productId;
    String productName;
    int currentStock;
    double dailySalesRate;
    double unitPrice;
    int leadTimeDays;
    boolean isSeasonal;

    InventoryManager(int productId, String productName, int currentStock,
                     double dailySalesRate, double unitPrice,
                     int leadTimeDays, boolean isSeasonal) {

        this.productId = productId;
        this.productName = productName;
        this.currentStock = currentStock;
        this.dailySalesRate = dailySalesRate;
        this.unitPrice = unitPrice;
        this.leadTimeDays = leadTimeDays;
        this.isSeasonal = isSeasonal;

        totalProductsTracked++;
        totalInventoryValue += (currentStock * unitPrice);
    }

    
    static double getAverageInventoryValue() {
        if (totalProductsTracked == 0){
            return 0;
		}
        return totalInventoryValue / totalProductsTracked;
    }

    
    int calculateReorderPoint() {
        double base = dailySalesRate * leadTimeDays * 1.5;

        if (isSeasonal){
            base *= 1.3;
		}

	if (currentStock < 20){
            base += 10;
	}

        return (int) base;
	
    }

    
    String checkStockStatus() {

        if (currentStock == 0){
            return "OUT OF STOCK - URGENT";
		}

        int reorderPoint = calculateReorderPoint();

        if (currentStock <= reorderPoint) {
            int orderQty = (reorderPoint * 2) - currentStock;
            return "REORDER NEEDED - Order " + orderQty + " units";
        }

        if (currentStock <= reorderPoint * 1.5){
            return "LOW STOCK - Monitor closely";
		}

        return "HEALTHY STOCK";
    }

    
    double calculateWeeklyRevenue() {

        int workingDays = 7;
        int day = 1;
        double unitsSold = 0;
        int tempStock = currentStock; 

        while (day <= workingDays && tempStock > 0) {

            if (tempStock >= dailySalesRate) {
                unitsSold += dailySalesRate;
                tempStock -= dailySalesRate;
            } else {
                unitsSold += tempStock;
                tempStock = 0;
            }

            day++;
        }

        return unitsSold * unitPrice;
    }

    void restock(int unitsReceived) {
        currentStock += unitsReceived;
        totalInventoryValue += (unitsReceived * unitPrice);
    }
}