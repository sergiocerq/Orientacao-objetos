package ensinomedio;
import interfaces.FactoryAula;
import interfaces.FactoryAvaliacao;
import interfaces.FactoryExercicios;
import interfaces.FactorySerie;
import interfaces.FactorySerie;

public class EnsinoMedio implements FactorySerie {
	
	private FactoryAula aula;
	private FactoryExercicios exercicio;
	private FactoryAvaliacao avaliacao;

	public void apresentarAula() {
		// TODO Auto-generated method stub
		this.aula.assistirAula();
	}

	public void realizarExercicios() {
		// TODO Auto-generated method stub
		this.exercicio.fazerPergunta("A física quântica foi estudada por quem?");
		this.exercicio.responderPergunta("A física quântica foi estudada por Albert Einstein!");
	}

	public void realizarAvaliacao() {
		// TODO Auto-generated method stub
		this.avaliacao.fazerPergunta("Qual é a raiz quadrada de 215?");
		this.avaliacao.responderPergunta("É 15!");
	}

	@Override
	public FactoryAula createAula() {
		// TODO Auto-generated method stub
		return new AulaEM();
	}

	@Override
	public FactoryExercicios createExercicios() {
		// TODO Auto-generated method stub
		return new ExercicioEM();
	}

	@Override
	public FactoryAvaliacao createAvaliacao() {
		// TODO Auto-generated method stub
		return new AvaliacaoEM();
	}

}
