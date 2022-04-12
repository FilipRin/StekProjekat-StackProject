package masina;

public class Maksimum extends Operacija {

	public Maksimum() {
		super();
	}

	@Override
	public void izvrsi(Stek stek) {
		
		int pom1=0,pom2=0;
		pom1=stek.ukloni();
		pom2=stek.ukloni();
		
		if(pom1>pom2 || pom2==-1000) {
			stek.dodaj(pom1);
		}
		else if (pom2>pom1 || pom1==-1000) {
			stek.dodaj(pom2);
		}
		else if(pom2!=-1000 && pom1!=-1000) {
		}
		

	}

}
