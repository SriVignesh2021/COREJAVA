class FoodItemStarter{

public static void main(String[] args)
{
   FoodItem fooditem1=new FoodItem("BIRYANI",200,"BIRYANIHOUSE",2,Type.GOOD,4,OrderType.ONLINE);
   fooditem1.displayDetails();
   fooditem1.printTotalPrice();  

   FoodItem fooditem2=new FoodItem("ICECREAM",100,"A2B",1,Type.EXCELLENT,3,OrderType.OFFLINE);
   fooditem2.displayDetails();
   fooditem2.printTotalPrice();
   
   FoodItem.printTotalFoodItemsPrice();
   
   
   
   
   
}



}