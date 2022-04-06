package masina;

public class Sabiranje extends Operacija {

	public Sabiranje() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void izvrsi(Stek stek) {
		// TODO Auto-generated method stub
		int pom=0,pom2=0;
		pom=stek.ukloni();
		pom2=stek.ukloni();
		stek.dodaj(pom+pom2);
	}

}
