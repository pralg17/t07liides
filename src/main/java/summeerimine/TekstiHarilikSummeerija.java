package summeerimine;
public class TekstiHarilikSummeerija implements TekstiSummeerija{
	String tekstiSumma=" ";

	public void lisa(String lisatekst){
		tekstiSumma+=lisatekst;
	}
	public String kysi(){
		return tekstiSumma;
	}

	public int pikkus(){
		return tekstiSumma.length();
	}

}
