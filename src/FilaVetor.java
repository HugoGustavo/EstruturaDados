
public class FilaVetor<Elemento> implements Fila<Elemento> {
	public static final int CAPACIDADE_PADRAO = 128;
	public Elemento[] fila;
	private int capacidade;
	private int inicio, fim;
	
	public FilaVetor() {
		this(CAPACIDADE_PADRAO);
	}
	
	public FilaVetor(int capacidade) {
		this.capacidade = capacidade;
		fila = (Elemento[]) new Object[capacidade];
		inicio = fim = 0;
	}
	
	@Override
	public int tamanho() {
		return ( capacidade - inicio + fim) % capacidade;
	}

	@Override
	public boolean isVazia() {
		if ( inicio == fim  )
			return true;
		return false;
	}

	@Override
	public Elemento frente() throws FilaVaziaException {
		if ( isVazia() )
			throw new FilaVaziaException("Fila Vazia");
		return fila[inicio];
	}

	@Override
	public void inserir(Elemento elemento) {
		if ( tamanho() == capacidade-1 )
			throw new FilaCheiaException("Fila Cheia");
		fila[fim] = elemento;
		fim = (fim + 1) % this.capacidade;	
	}

	@Override
	public Elemento remover() throws FilaVaziaException {
		if ( isVazia() )
			throw new FilaVaziaException("Fila Vazia");
		Elemento elemento = fila[inicio];
		fila[inicio] = null;
		inicio = (inicio + 1) % this.capacidade;
		return elemento;
	}

}
