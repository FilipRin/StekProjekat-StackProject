package masina;

public class Dodavanje extends Operacija {

	public Dodavanje(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void izvrsi(Stek stek) {
		// TODO Auto-generated method stub
		stek.dodaj(p);
	}
	
	
}
