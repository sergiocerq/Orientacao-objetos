package entities;

import ensinofundamentalII.EnsinoFundamental2;
import ensinomedio.EnsinoMedio;
import interfaces.*;

public class Escola {
	
	public void runFundamental2() {
		FactorySerie fund2 = new EnsinoFundamental2();
		FactoryAula aula = fund2.createAula();
		FactoryExercicios exe = fund2.createExercicios();
		FactoryAvaliacao ava = fund2.createAvaliacao();

		((EnsinoFundamental2) fund2).apresentarAula();
	}
	
	public void runMedio() {
		
	}
	
	public static void main(String args[] ) {
		//(new Escola()).runFundamental();
		(new Escola()).runFundamental2();
	}

}
