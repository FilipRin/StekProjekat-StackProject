package masina;

public abstract class Operacija {

	protected int p;
	
	public Operacija(int x) {
		super();
		// TODO Auto-generated constructor stub
		this.p=x;
	}

	public Operacija() {}
	
	abstract public void izvrsi(Stek stek);
}
