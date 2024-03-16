package ensinofundamentalII;

import interfaces.FactoryAula;

public class AulaFund2 implements FactoryAula {

	@Override
	public void assistirAula() {
		// TODO Auto-generated method stub
		System.out.println("Assistindo a aula do fundamental 2!");
	}

	@Override
	public void fazerPergunta(String pergunta) {
		// TODO Auto-generated method stub
		System.out.println(pergunta);
	}

}
