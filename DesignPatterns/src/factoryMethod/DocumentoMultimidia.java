package factoryMethod;

public class DocumentoMultimidia extends Documento{

	public DocumentoMultimidia(){
		super.nome = "n�o definido";
	}
	
	public DocumentoMultimidia(String nome){
		super.nome = nome;
	}
	
}
