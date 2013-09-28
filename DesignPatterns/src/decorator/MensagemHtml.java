package decorator;

public class MensagemHtml extends DecoradorMensagem{

	public MensagemHtml(Mensagem m) {
		super(m);
	}

	@Override
	public String getMensagem() {
		return String.format("<html>%s</html>", getMsg().getMensagem());
	}

}
