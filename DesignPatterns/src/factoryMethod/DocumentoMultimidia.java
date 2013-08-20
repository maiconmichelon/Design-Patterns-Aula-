package factoryMethod;

public class DocumentoMultimidia extends Documento{

	public DocumentoMultimidia(){
		super.nome = "não definido";
	}
	
	public DocumentoMultimidia(String nome){
		super.nome = nome;
	}
	
}
