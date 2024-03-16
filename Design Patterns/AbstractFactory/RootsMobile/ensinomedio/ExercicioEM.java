package ensinomedio;

import interfaces.FactoryExercicios;

public class ExercicioEM implements FactoryExercicios{

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
