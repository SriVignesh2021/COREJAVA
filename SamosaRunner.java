class SamosaRunner{

public static void main(String[] chaklis)
{
   float cost=20.0f;
   boolean good=true;
   Samosa samosa=new Samosa(cost,good);
   System.out.println(samosa.cost);
   System.out.println(samosa.taste);
   System.out.println(samosa.size);
   System.out.println(samosa.ingredients);
   
   String[] inc={"potato","onion","chilli","coriander","salt","oil","Maida Flour"};
   
   Samosa samosa1=new Samosa(15.0f,false,SamosaSize.SMALL,inc);
   System.out.println(samosa1.cost);
   System.out.println(samosa1.taste);
   System.out.println(samosa1.size);
   System.out.println(samosa1.ingredients);
   

}
}