
public interface Pilha<Elemento> {
	public int tamanho();
	public boolean isVazia();
	public Elemento topo() throws PilhaVaziaException;
	public void empilhar(Elemento elemento);
	public Elemento desempilhar() throws PilhaVaziaException;
}
