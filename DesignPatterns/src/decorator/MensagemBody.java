package decorator;

public class MensagemBody extends DecoradorMensagem{

	public MensagemBody(Mensagem m) {
		super(m);
	}

	@Override
	public String getMensagem() {
		return String.format("<body>%s</body>", getMsg().getMensagem());
	}

}
