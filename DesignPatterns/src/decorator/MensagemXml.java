package decorator;

public class MensagemXml extends DecoradorMensagem{

	public MensagemXml(Mensagem m) {
		super(m);
	}

	@Override
	public String getMensagem() {
		String mensagemOrig = getMsg().getMensagem();
		String novaMensagem = "<xml><msg>" + mensagemOrig + "<xml><msg>";
		return novaMensagem;
	}

}
