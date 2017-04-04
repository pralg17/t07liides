package summeerimine;
public class HarilikS6nadeSummeerija implements S6nadeSummeerija{
	String lasuse="";
	public void lisa(String sona){
		if(sona==null){return ;}
		lasuse = lasuse + " " + sona + ".";
	}
	public String kysi(){
		return lasuse;
	}
	public int pikkus(){
		return lasuse.length();
	}
	int paljuA = 0;
	public int mitutükkiA(){
		for(int i=0;i<lasuse.length();i++) {
			if(lasuse.charAt(i) == 'a') {
				paljuA++;
			} 
		}
		return paljuA;
	}
	int paljuM = 0;
	public int mitutükkiM(){
		for(int i=0;i<lasuse.length();i++) {
			if(lasuse.charAt(i) == 'm') {
				paljuM++;
			} 
		}
		return paljuM;
	}
	int paljusõnu= 0; 
	public int paljusõnuon(){
		//char array(massiiv) kus sees on stringi "lause" pikkus
		char sõna[] = new char[lasuse.length()];
		for (int i=0; i<lasuse.length(); i++) { 
		//charAt(i) - mis kohal on mingi sümbol
			sõna[i] = lasuse.charAt(i);
			//kontrollib, et on järgmine sümol ja et ei oleks tüha kohta/sümbolit ja kas selle ees on tühik või kas on esimene sümbol on tühi  
			if (((i > 0) && (sõna[i] != ' ') && (sõna[i - 1] == ' ')) || ((sõna[0] != ' ') && (i == 0))) { 
				paljusõnu++;
			} 
		} 
	return paljusõnu;
	}	
}