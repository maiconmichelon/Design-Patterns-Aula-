package factoryMethod;


public class AplicacaoWord extends AplicacaoDocumentos{

	@Override
	protected Documento criarDocumentoVazio() {
		return new DocumentoWord();
	}

}
