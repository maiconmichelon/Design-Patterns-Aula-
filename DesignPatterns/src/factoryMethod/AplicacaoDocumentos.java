package factoryMethod;

public abstract class AplicacaoDocumentos {

	public static AplicacaoDocumentos getApp(String app){
		if(app.equals("multimidia"))
			return new AplicacaoMultimidia();
		else if(app.equals("word"))
			return new AplicacaoWord();
		else
			throw new UnsupportedOperationException("Aplicação não encontrada.");
	}
	
	public Documento abrirDocumento(){
		Documento d = criarDocumentoVazio();
		
		d.inicializar();
		d.abrir();
		
		return d;
	}

	protected abstract Documento criarDocumentoVazio();
	
}
