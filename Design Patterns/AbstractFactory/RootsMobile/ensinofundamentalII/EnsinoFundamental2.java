package ensinofundamentalII;

import interfaces.FactoryAula;
import interfaces.FactoryAvaliacao;
import interfaces.FactoryExercicios;
import interfaces.FactorySerie;

public class EnsinoFundamental2 implements FactorySerie {

	public void apresentarAula() {
		// TODO Auto-generated method stub
		System.out.println("Assistindo a aula do fundamental 2!");
	}

	public void realizarExercicios() {
		// TODO Auto-generated method stub
		FactoryExercicios exe = new ExercicioFund2();
		exe.fazerPergunta("3 é par ou ímpar?");
		exe.responderPergunta("A resposta é ímpar!");
	}

	public void realizarAvaliacao() {
		// TODO Auto-generated method stub
		FactoryAvaliacao avaliacao = new AvaliacaoFund2();
		avaliacao.fazerPergunta("Quanto é 1 + 1");
		avaliacao.responderPergunta("A resposta é 2!");
	}

	@Override
	public FactoryAula createAula() {
		// TODO Auto-generated method stub
		return new AulaFund2();
	}

	@Override
	public FactoryExercicios createExercicios() {
		// TODO Auto-generated method stub
		return new ExercicioFund2();
	}

	@Override
	public FactoryAvaliacao createAvaliacao() {
		// TODO Auto-generated method stub
		return new AvaliacaoFund2();
	}

}
