class InventoryRunner{
    public static void main(String[] args)
{
        InventoryManager product1 = new InventoryManager(101,"Rice",50,8,40,5,false);

        System.out.println("Product: " + product1.productName);
        System.out.println("Reorder Point: " + product1.calculateReorderPoint());
        System.out.println("Stock Status: " + product1.checkStockStatus());
        System.out.println("Weekly Revenue: " + product1.calculateWeeklyRevenue());

        System.out.println("\nRestocking 30 units...");
        product1.restock(30);

        System.out.println("New Stock:" + product1.currentStock);
        System.out.println("Average Inventory Value: " +
                InventoryManager.getAverageInventoryValue());
    }
}