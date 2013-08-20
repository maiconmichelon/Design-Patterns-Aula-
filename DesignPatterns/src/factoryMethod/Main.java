package factoryMethod;

import java.io.File;

public class Main {
	
	public static void main(String[] args) {
		AplicacaoDocumentos app = AplicacaoDocumentos.getApp("word");
		
		Documento d = app.abrirDocumento();
		System.out.println("Documento " + d.nome);
		
		File selecionarArquivo = d.selecionarArquivo();
		System.out.println(selecionarArquivo.getAbsolutePath());
		
	}

}
