package decorator;

public class MensagemH1 extends DecoradorMensagem{

	public MensagemH1(Mensagem m) {
		super(m);
	}

	@Override
	public String getMensagem() {
		return String.format("<h1>%s</h1>", getMsg().getMensagem());
	}

}
