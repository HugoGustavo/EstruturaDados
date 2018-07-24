
public class No<Elemento> {
	private Elemento elemento;
	private No<Elemento> proximo;
	
	
	public No(Elemento elemento, No<Elemento> proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public Elemento getElemento() {
		return elemento;
	}
	
	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}
	
	public No<Elemento> getProximo() {
		return proximo;
	}
	
	public void setProximo(No<Elemento> proximo) {
		this.proximo = proximo;
	}
	
}
