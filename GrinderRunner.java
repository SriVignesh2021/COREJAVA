class GrinderRunner{

public static void main(String [] Machine){
 
 Grinder grinder=new Grinder(100,"vignesh");
 System.out.println(grinder.capacity);
 System.out.println(grinder.company);
 
 Motar motar=grinder.motar;
 
 
 System.out.println(motar.model);
 System.out.println(motar.rpm);
 
 

}
}


