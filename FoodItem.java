class FoodItem{

String name;
float price;
String hotelname;
int quantity;
Type type;
float rating;
OrderType ordertype;
static float printTotalFoodItemsPrice;


FoodItem(String name,float price,String hotelname,int quantity,Type type,float rating,OrderType ordertype)
{
	this.name=name;
	this.price=price;
	this.hotelname=hotelname;
	this.quantity=quantity;
	this.type=type;
	this.rating=rating;
	this.ordertype=ordertype;
	//System.out.println(" calling all parameters");
}

void displayDetails()
{
  System.out.println(name);	
  System.out.println(price);	
  System.out.println(hotelname);	
  System.out.println(type);	
  System.out.println(rating);	
  System.out.println(quantity);
  System.out.println(ordertype);
  //System.out.println("calling all instance variables into non-static method");	
  
}




void printTotalPrice()
{
	
	float total=this.price*this.quantity;
	System.out.println("TOTAL COST OF THE FOOD ITEM ="+total);
	printTotalFoodItemsPrice=printTotalFoodItemsPrice+total;
}

static void printTotalFoodItemsPrice()
{
	System.out.println("total food items price="+printTotalFoodItemsPrice);
}


void printHotelName()
{
	String name1=this.name;
	System.out.println("print hotel name"+name1);
	float price1=this.price;
	System.out.println("print price"+price1);
	
}
 
 
 
 
}

