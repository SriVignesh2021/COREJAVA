class NailCutterRunner
{
public static void main(String[] args)
{
NailCutter nailcutter=new NailCutter();
nailcutter.type="SMART";
nailcutter.price=50.0f;
nailcutter.size=NailCutterSize.BIG;
nailcutter.color="Silver";
nailcutter.weight=40;
nailcutter.cutting();


NailCutter nailcutter1=new NailCutter();
nailcutter1.type="SMARTCORE";
nailcutter1.price=55.0f;
nailcutter1.size=NailCutterSize.SMALL;
nailcutter1.color="REDr";
nailcutter1.weight=30;
nailcutter1.cutting();






}


}