
public class DequeEncadeado<Elemento> implements Deque<Elemento> {
	private NoDuplo<Elemento> inicio, fim;
	private int tamanho;
	
	public DequeEncadeado() {
		this.inicio = this.fim = null;
		this.tamanho = 0;
	}
	
	@Override
	public int tamanho() {
		return 0;
	}

	@Override
	public boolean isVazio() {
		return inicio == null ? true : false;
	}

	@Override
	public Elemento getInicio() throws DequeVazioException {
		if ( isVazio() )
			throw new DequeVazioException("Deque vazio");
		return inicio.getElemento();
	}

	@Override
	public Elemento getFim() throws DequeVazioException {
		if ( isVazio() )
			throw new DequeVazioException("Deque vazio");
		return fim.getElemento();
			
	}

	@Override
	public void adicionarInicio(Elemento elemento) {
		NoDuplo<Elemento> novo = new NoDuplo(null, elemento, inicio);
		if ( isVazio() )
			this.inicio = this.fim = novo;
		else {
			inicio.setAnterior(novo);
			inicio = novo;
		}
		tamanho++;
	}

	@Override
	public void adicionarFim(Elemento elemento) {
		NoDuplo<Elemento> novo = new NoDuplo(fim, elemento, null);
		if ( isVazio() )
			this.inicio = this.fim = novo;
		else {
			fim.setProximo(novo);
			fim = novo;
		}
		tamanho++;
	}

	@Override
	public Elemento removerInicio() throws DequeVazioException {
		if ( isVazio() )
			throw new DequeVazioException("Deque Vazio");
		
		NoDuplo<Elemento> no = inicio;
		this.inicio = inicio.getProximo();
		this.inicio.setAnterior(null);
		no.setProximo(null);
		
		if ( inicio == null )
			this.inicio = this.fim = null;
		
		tamanho--;
		return no.getElemento();
	}

	@Override
	public Elemento removerFim() throws DequeVazioException {
		if ( isVazio() )
			throw new DequeVazioException("Deque Vazio");
		
		NoDuplo<Elemento> no = fim;
		this.fim = fim.getAnterior();
		this.fim.setProximo(null);
		no.setAnterior(null);
		
		if ( fim == null )
			this.inicio = this.fim = null;
		
		tamanho--;
		return no.getElemento();
	}

}
