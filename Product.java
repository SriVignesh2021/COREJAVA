class Product{
String name;
String type;
float price;
int quantity;
String vendor;
static float totalProductsPrice;
// no of parameters
//order/sequence
//change in data type

 Product(String name,String type,float price,int quantity,String vendor)
 {
	
	this.name=name;
	this.type=type;
	this.price=price;
	this.quantity=quantity;
	this.vendor=vendor;
	System.out.println("CALLING 5 INSTANCE PARAMETERS");
 }
 void displayDetails()
 {
   	 System.out.println("INVOKING ALL FIVE INSTANCE PARAMETERS");
	 System.out.println(name);
	 System.out.println(type);
	 System.out.println(price);
	 System.out.println(quantity);
	 System.out.println(vendor);
 
	 
 }

 
 void printTotalCost()
 {
	 float total=this.price*this.quantity;
	 System.out.println("TOTAL COST"+ total);
	 totalProductsPrice=totalProductsPrice+total;
	 System.out.println(totalProductsPrice);
 }
 
 static void printProductsPrice()
 {
	 System.out.println("Total Products Price :" +totalProductsPrice);
 }

}
	 
	 

 



