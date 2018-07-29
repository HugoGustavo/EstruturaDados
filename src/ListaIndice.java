
public interface ListaIndice<Elemento> {
	public int tamanho();
	public boolean isVazia();
	public void adicionar(int posicao, Elemento elemento);
	public Elemento get(int posicao) throws IndexOutOfBoundsException;
	public Elemento remover(int posicao) throws IndexOutOfBoundsException;
	public Elemento set(int posicao, Elemento elemento) throws IndexOutOfBoundsException;
}
