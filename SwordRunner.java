class SwordRunner{

public static void main(String[] cutting){

   Sword cut=new Sword();
   Sword.start();
   cut.start();
   cut.stop();
   Sword.stop();
}

}