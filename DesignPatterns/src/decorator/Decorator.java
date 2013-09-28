package decorator;

public class Decorator {

	public static void main(String[] args) {
		Mensagem m = new MensagemConcreta();
		
		m = new MensagemXml(m);
		
		System.out.println(m.getMensagem());
		
		m = new MensagemHtml(new MensagemBody(new MensagemH1(new MensagemConcreta())));
		
		System.out.println(m.getMensagem());
		
	}
	
}
