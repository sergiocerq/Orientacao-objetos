package ensinomedio;

import interfaces.FactoryAula;

public class AulaEM implements FactoryAula {

	@Override
	public void assistirAula () {
		// TODO Auto-generated method stub
		System.out.println("Apresentando/ Assistindo a aula!");
	}

	@Override
	public void fazerPergunta (String pergunta) {
		// TODO Auto-generated method stub
		System.out.println(pergunta);
	}

}
