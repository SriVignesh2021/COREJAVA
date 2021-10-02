class SaloonRunner{

  public static void main(String[] energyking)
  {
  
  Saloon saloon=new Saloon();
  saloon.name  ="ENERGY KING";
  saloon.location="MARATHALLI";
  saloon.openingtime=6.0f;
  saloon.closingtime=7.0f;
  saloon.branch=SaloonBranch.MARATHALLI;
  
  
  Saloon saloon1=new Saloon();
  saloon1.name="LOVEALL";
  saloon1.location="BTM";
  saloon1.openingtime=6.30f;
  saloon1.closingtime=10.30f;
  saloon1.branch=SaloonBranch.BTM;
  
  saloon.haircut();
  saloon1.haircut();
  }

}