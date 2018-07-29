
public class ListaIndiceVetor<Elemento> implements ListaIndice<Elemento> {
	private Elemento[] vetor;
	private int capacidade = 16;
	private int tamanho = 0;
	
	public ListaIndiceVetor() {
		this.vetor = (Elemento[]) new Object[capacidade];
	}
	
	@Override
	public int tamanho() {
		return tamanho;
	}

	@Override
	public boolean isVazia() {
		return tamanho() == 0 ? true : false;
	}

	protected void verificarPosicao(int posicao, int tamanhoMaximo) {
		if ( posicao < 0 || posicao >= tamanhoMaximo)
			throw new IndexOutOfBoundsException("Posicao Invalida: " + posicao);
	}
	
	@Override
	public void adicionar(int posicao, Elemento elemento) {
		verificarPosicao(posicao, tamanho()+1);
		if ( tamanho() == capacidade ) {
			capacidade *= 2;
			Elemento[] novoVetor = (Elemento[]) new Object[capacidade];
			for (int i = 0; i < this.vetor.length; i++)
				novoVetor[i] = this.vetor[i];
			this.vetor = novoVetor;			
		}
		for (int i=tamanho-1; i>=posicao; i--)
			this.vetor[i+1] = this.vetor[i];
		this.vetor[posicao] = elemento;
		tamanho++;
	}

	@Override
	public Elemento get(int posicao) throws IndexOutOfBoundsException {
		verificarPosicao(posicao, tamanho());
		return this.vetor[posicao];
	}

	@Override
	public Elemento remover(int posicao) throws IndexOutOfBoundsException {
		verificarPosicao(posicao, tamanho());
		Elemento elemento = this.vetor[posicao];
		for (int i=posicao; i < tamanho-1; i++)
			this.vetor[i] = this.vetor[i+1];
		tamanho--;
		return elemento;
	}

	@Override
	public Elemento set(int posicao, Elemento elemento) throws IndexOutOfBoundsException {
		verificarPosicao(posicao, tamanho());
		Elemento valorAntigo = this.vetor[posicao];
		this.vetor[posicao] = elemento;
		return valorAntigo;
		
	}

}
