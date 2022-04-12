package masina;

public class Uklanjanje extends Operacija {

	public Uklanjanje(int x) {
		super(x);
		if(p<0) {
			p=1;
		}
	}

	

	@Override
	public void izvrsi(Stek stek) {
		int i=0;
		while(i<p) {
			stek.ukloni();
			i++;
		}

	}

}
