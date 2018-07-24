
public class PilhaNo<Elemento> implements Pilha<Elemento> {
	private No<Elemento> topo;
	private int tamanho;
	
	
	public PilhaNo() {
		topo = null;
		tamanho = 0;
	}
	
	@Override
	public int tamanho() {
		return tamanho;
	}

	@Override
	public boolean isVazia() {
		if ( topo == null )
			return true;
		return false;
	}

	@Override
	public Elemento topo() throws PilhaVaziaException {
		if ( isVazia() )
			throw new PilhaVaziaException("Pilha Vazia");
		return topo.getElemento();
	}

	@Override
	public void empilhar(Elemento elemento) {
		No<Elemento> no = new No<>(elemento, topo);
		topo = no;
		tamanho++;
		
	}

	@Override
	public Elemento desempilhar() throws PilhaVaziaException {
		if ( isVazia() )
			throw new PilhaVaziaException("Pilha Vazia");
		Elemento elemento = topo.getElemento();
		topo = topo.getProximo();
		tamanho--;
		return elemento;
	}

}
