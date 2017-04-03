package summeerimine;
public class TekstiHarilikSummeerija implements TekstiSummeerija{
	String tekstiSumma=" ";
	int lisatud = 0;

	public void lisa(String lisatekst){
		tekstiSumma+=lisatekst;
		lisatud=lisatud+1;
	}
	public String kysi(){
		return tekstiSumma;
	}

	public int pikkus(){
		return tekstiSumma.length();
	}

	public int lisatud(){
		return lisatud;
	}


}
