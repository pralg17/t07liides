package summeerimine;
public class Hariliksummeerija implements Summeerija{
  //Loo uus muutuja summa hoidmise tarbeks
  int summa=0;
  public void lisa(int kogus){
    //suurenda muutujat uue koguse jagu
    summa = summa +kogus;
  }
  public int kysi(){
    //tagasta meelespeatud summa
    return summa;
  }
}
