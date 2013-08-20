package factoryMethod;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DocumentoWord extends Documento {

	public DocumentoWord() {
		this.nome = "Documento word";
	}
	
	@Override
	public java.io.File selecionarArquivo(){
		JFileChooser chooser = new JFileChooser();
		
		chooser.setDialogTitle("Abrir documento");
		chooser.setDialogType(JFileChooser.OPEN_DIALOG);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setFileFilter(new FileNameExtensionFilter("Arquivos do Word", ".doc"));
		chooser.showDialog(null, "Selecionar");
		
		return chooser.getSelectedFile();
	}
	
}
