
public class PilhaVetor<Elemento> implements Pilha<Elemento> {
	public static final int CAPACIDADE_PADRAO = 100;
	private int capacidade;
	private Elemento pilha[];
	private int topo = -1;
	
	public PilhaVetor() {
		this(CAPACIDADE_PADRAO);
	}
	
	public PilhaVetor(int capacidade) {
		this.capacidade = capacidade;
		pilha = (Elemento[]) new Object[capacidade];
	}
	
	@Override
	public int tamanho() {
		return topo+1;
	}

	@Override
	public boolean isVazia() {
		return topo < 0;
	}

	@Override
	public Elemento topo() throws PilhaVaziaException {
		if (isVazia())
			throw new PilhaVaziaException("Pilha Vazia");
		return pilha[topo];
	}

	@Override
	public void empilhar(Elemento elemento) {
		if ( tamanho() == capacidade)
			throw new PilhaCheiaException("Pilha Cheia");
		topo = topo+1;
		pilha[topo] = elemento;
		
	}

	@Override
	public Elemento desempilhar() throws PilhaVaziaException {
		Elemento elemento;
		if ( isVazia() )
			throw new PilhaVaziaException("Pilha vazia");
		elemento = pilha[topo];
		pilha[topo] = null;
		topo = topo-1;
		return elemento;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("[");
		if ( tamanho() > 0 )
			stringBuilder.append(pilha[0]);
		if ( tamanho() > 1 )
			for (int i = 1; i < tamanho()-1; i++)
				stringBuilder.append(", " + pilha[i]);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

}
