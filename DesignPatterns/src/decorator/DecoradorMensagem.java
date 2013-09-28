package decorator;

public abstract class DecoradorMensagem implements Mensagem{

	private final Mensagem msg;

	public DecoradorMensagem(Mensagem m) {
		this.msg = m;
	}
	
	protected Mensagem getMsg() {
		return msg;
	}
	
}
