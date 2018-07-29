
public class FilaEncadeada<Elemento> implements Fila<Elemento> {
	private No<Elemento> inicio, fim;
	private int tamanho;
	
	public FilaEncadeada() {
		this.inicio = this.fim = null;
		this.tamanho = 0;
	}
	
	@Override
	public int tamanho() {
		return tamanho;
	}

	@Override
	public boolean isVazia() {
		return inicio == null ? true : false;
	}

	@Override
	public Elemento frente() throws FilaVaziaException {
		if ( isVazia() )
			throw new FilaVaziaException("Fila Vazia");
		return (Elemento) inicio.getElemento();
	}

	@Override
	public void inserir(Elemento elemento) {
		No<Elemento> novo = new No<Elemento>(elemento, null);
		if ( isVazia() ) {
			this.inicio = this.fim = novo;
		} else {
			this.fim.setProximo(novo);
			this.fim = novo;
		}
		tamanho++;
	}

	@Override
	public Elemento remover() throws FilaVaziaException {
		if ( isVazia() )
			throw new FilaVaziaException("Fila Vazia");
		No<Elemento> no = this.inicio;
		this.inicio = this.inicio.getProximo();
		if ( this.inicio == null )
			this.inicio = this.fim = null;
		no.setProximo(null);
		tamanho--;
		return no.getElemento();
	}

}
