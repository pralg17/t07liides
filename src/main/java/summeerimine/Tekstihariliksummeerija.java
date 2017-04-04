package summeerimine;
public class Tekstihariliksummeerija implements Tekstisummeerija{
  //Loo uus muutuja summa hoidmise tarbeks
  String kogulause="";
  public void lisa(String lause){
    //suurenda muutujat uue koguse jagu
    kogulause = kogulause+ " " +lause;
  }
  public String kysi(){
    //tagasta meelespeatud summa
    return kogulause;
  }

  public int pikkus(){
    return kogulause.length();
  }

}
