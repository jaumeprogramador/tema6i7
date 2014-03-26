package contenidors;

public class Element<I> {
	private I info;
	private Element referencia;

	public Element(I info, Element referencia) {
		super();
		this.info = info;
		this.referencia = referencia;
	}

	public I getInfo() {
		return info;
	}

	public void setInfo(I info) {
		this.info = info;
	}

	public Element getReferencia() {
		return referencia;
	}

	public void setReferencia(Element referencia) {
		this.referencia = referencia;
	}

	@Override
	public String toString() {
		return "Element [info=" + info + ", referencia=" + referencia + "]";
	}

}