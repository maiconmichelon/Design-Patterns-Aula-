package adapter2;

import java.util.Enumeration;
import java.util.Iterator;

public class Adapter implements Iterator<Object>{

	private final Enumeration<?> enumeration;

	public Adapter(Enumeration<?> enumeration) {
		this.enumeration = enumeration;
	}
	
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Não é possivel remover");
	}

}
