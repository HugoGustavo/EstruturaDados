import java.util.Comparator;

public class ComparadorPadrao<Elemento> implements Comparator<Elemento> {

	@Override
	public int compare(Elemento elemento1, Elemento elemento2) throws ClassCastException {
		return ((Comparable<Elemento>) elemento1).compareTo(elemento2);
	}

}
