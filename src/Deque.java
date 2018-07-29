
public interface Deque<Elemento> {
	public int tamanho();
	public boolean isVazio();
	public Elemento getInicio() throws DequeVazioException;
	public Elemento getFim() throws DequeVazioException;
	public void adicionarInicio(Elemento elemento);
	public void adicionarFim(Elemento elemento);
	public Elemento removerInicio() throws DequeVazioException;
	public Elemento removerFim() throws DequeVazioException;
}
