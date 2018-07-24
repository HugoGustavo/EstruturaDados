
public class NoDuplo<Elemento> {
	private Elemento elemento;
	private NoDuplo<Elemento> anterior, proximo;
	
	public NoDuplo(NoDuplo<Elemento> anterior, Elemento elemento, NoDuplo<Elemento> proximo) {
		this.anterior = anterior;
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public Elemento getElemento() {
		return elemento;
	}
	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}
	public NoDuplo<Elemento> getAnterior() {
		return anterior;
	}
	public void setAnterior(NoDuplo<Elemento> anterior) {
		this.anterior = anterior;
	}
	public NoDuplo<Elemento> getProximo() {
		return proximo;
	}
	public void setProximo(NoDuplo<Elemento> proximo) {
		this.proximo = proximo;
	}

}
