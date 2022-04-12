package masina;

import java.util.ArrayList;
import java.util.List;

public class Program {
	private Stek stekk;
	private List<Operacija> op= new ArrayList<>();
	//private int brojOp=0;
	
	public Program(Stek stek) {
		
		this.stekk=stek;
		//op=new Operacija[10];
	}
	
	public void dodaj(Operacija oper) {
		//op[brojOp++]=oper;
		op.add(oper);
	}

	public void izvrsi() {
		/*for(int i=0;i<op.size();i++) {
			op.get(i).izvrsi(stekk);
		}*/
		for(Operacija opp:op) {
			opp.izvrsi(stekk);
		}
	}	
}
