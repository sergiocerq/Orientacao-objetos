package ensinomedio;

import interfaces.FactoryAvaliacao;

public class AvaliacaoEM implements FactoryAvaliacao {

	@Override
	public void responderPergunta(String pergunta) {
		// TODO Auto-generated method stub
		System.out.println(pergunta);
	}

	@Override
	public void fazerPergunta(String pergunta) {
		// TODO Auto-generated method stub
		System.out.println(pergunta);
	}

}
