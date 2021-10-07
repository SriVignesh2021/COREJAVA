class ProductRunner{
	
	public static void main(String[] args)
	
	{
		Product product1=new Product("TRIMMER","ELECTRONIC",1500,1,"PHILIPS");
        product1.displayDetails();
        product1.printTotalCost();
		
		Product product2=new Product("TRIMMER","ELECTRONIC",1500,1,"PHILIPS");
        product2.displayDetails();
        product2.printTotalCost();
		
		Product.printProductsPrice();
		
	}
}