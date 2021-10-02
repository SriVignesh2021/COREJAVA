class NailCutter{
String type;
float price;
NailCutterSize size;
String color;
int weight;


void cutting()
{
	System.out.println("invoked safety");
	System.out.println(price);
	System.out.println(size);
	System.out.println(color);
	System.out.println(weight);
	
}

void sharpening()
{
	System.out.println("invoked driving");
	System.out.println(type);
	System.out.println(price);
	System.out.println(size);
	System.out.println(color);
	System.out.println(weight);
	

}

}