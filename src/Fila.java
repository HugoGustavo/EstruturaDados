
public interface Fila<Elemento> {
	public int tamanho();
	public boolean isVazia();
	public Elemento frente() throws FilaVaziaException;
	public void inserir(Elemento elemento);
	public Elemento remover() throws FilaVaziaException;
}
