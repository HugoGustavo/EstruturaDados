import java.util.Iterator;

public class ListaEncadeadaPosicao<Elemento> implements ListaPosicao<Elemento> {
	private int tamanho;
	private NoDuplo<Elemento> inicio, fim;
	
	
	public ListaEncadeadaPosicao() {
		this.tamanho = 0;
		this.inicio = null;
		this.fim = null;
	}
	
	private NoDuplo<Elemento> validarPosicao(Posicao<Elemento> posicao) throws PosicaoInvalidaException {
		if ( posicao == null )
			throw new PosicaoInvalidaException("Posicao nula passada como parametro");
		if ( !( posicao instanceof NoDuplo ) )
			throw new PosicaoInvalidaException("Tipo de posicao invalida");
		
		NoDuplo<Elemento> noDuplo = (NoDuplo<Elemento>) posicao;
		if ( noDuplo.getAnterior() == null && noDuplo.getProximo() == null )
			throw new PosicaoInvalidaException("Posicao nao pertence a lista");
		
		return noDuplo;
		
	}
	@Override
	public int tamanho() {
		return tamanho;
	}

	@Override
	public boolean isVazia() {
		return tamanho() == 0 ? true : false;
	}

	@Override
	public Posicao<Elemento> primeiro() {
		if ( isVazia() )
			throw new ListaVaziaException("Lista Vazia");
		return inicio;
	}

	@Override
	public Posicao<Elemento> ultimo() {
		if ( isVazia())
			throw new ListaVaziaException("Lista Vazia");
		return fim;
	}

	@Override
	public Posicao<Elemento> proximo(Posicao<Elemento> posicao)
			throws PosicaoInvalidaException, ViolacaoLimiteException {
		NoDuplo<Elemento> noDuplo = validarPosicao(posicao);
		NoDuplo<Elemento> proximo = noDuplo.getProximo();
		if ( proximo == null )
			throw new ViolacaoLimiteException("Nao ha elemento proximo");
		return proximo;
	}

	@Override
	public Posicao<Elemento> anterior(Posicao<Elemento> posicao)
			throws PosicaoInvalidaException, ViolacaoLimiteException {
		NoDuplo<Elemento> noDuplo = validarPosicao(posicao);
		NoDuplo<Elemento> anterior = noDuplo.getAnterior();
		if ( anterior == null )
			throw new ViolacaoLimiteException("Nao ha elemento anterior");
		return anterior;
	}

	@Override
	public void adicionarInicio(Elemento elemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarFim(Elemento elemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarDepois(Posicao<Elemento> posicao, Elemento elemento) throws PosicaoInvalidaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarAntes(Posicao<Elemento> posicao, Elemento elemento) throws PosicaoInvalidaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Elemento remover(Posicao<Elemento> posicao) throws PosicaoInvalidaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Elemento set(Posicao<Elemento> posicao, Elemento elemento) throws PosicaoInvalidaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Posicao<Elemento>> posicoes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Elemento> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
