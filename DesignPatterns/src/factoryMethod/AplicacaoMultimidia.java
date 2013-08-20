package factoryMethod;

public class AplicacaoMultimidia extends AplicacaoDocumentos{

	@Override
	protected Documento criarDocumentoVazio() {
		return new DocumentoMultimidia();
	}

}
