class IceCreamRunner{

public static void main(String[] Taste){

IceCream cream;
cream=new IceCream(-10,"AMUL",Color.WHITE);
System.out.println(cream.color);
System.out.println(cream.brand);
System.out.println(cream.type);
System.out.println(cream.temp);

cream.type="OVAL";
cream.brand=new Brand();

System.out.println(cream.type);
System.out.println(cream.brand);
System.out.println(cream.temp);


String name1=cream.name;
System.out.println(name1);


float temp=cream.temp;
Brand brand=cream.brand;
String name=brand.name;

String location=brand.location;

System.out.println(temp);
System.out.println(brand);
System.out.println(name);
System.out.println(location);

brand.name="NATURALS";
brand.ownerName="VIGNESH";
System.out.println(name);
System.out.println(location);
System.out.println(temp);


cream.brand.name=null;

System.out.println(brand.name);
System.out.println(brand.location);

cream.brand=null;
System.out.println(cream.brand);










}

}