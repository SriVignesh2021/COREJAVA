class Sword{

static  String cuttingsize;
String sword;

void cutting()
{
   System.out.println("invoking instance variable string cutting");
   this.start();
}

static void start()
{
   System.out.println("invoking static variables");
   System.out.println(" cutting ");
}

static void stop()
{
   System.out.println("invoked stop");
  

}

}