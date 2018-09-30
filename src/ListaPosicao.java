import java.util.Iterator;

public interface ListaPosicao<Elemento> extends Iterable<Elemento>{
	public int tamanho();
	public boolean isVazia();
	public Posicao<Elemento> primeiro();
	public Posicao<Elemento> ultimo();
	public Posicao<Elemento> proximo(Posicao<Elemento> posicao) throws PosicaoInvalidaException, ViolacaoLimiteException;
	public Posicao<Elemento> anterior(Posicao<Elemento> posicao) throws PosicaoInvalidaException, ViolacaoLimiteException;
	public void adicionarInicio(Elemento elemento);
	public void adicionarFim(Elemento elemento);
	public void adicionarDepois(Posicao<Elemento> posicao, Elemento elemento) throws PosicaoInvalidaException;
	public void adicionarAntes(Posicao<Elemento> posicao, Elemento elemento) throws PosicaoInvalidaException;
	public Elemento remover(Posicao<Elemento> posicao) throws PosicaoInvalidaException;
	public Elemento set(Posicao<Elemento> posicao, Elemento elemento) throws PosicaoInvalidaException;
	public Iterable<Posicao<Elemento>> posicoes();
	public Iterator<Elemento> iterator();
}
