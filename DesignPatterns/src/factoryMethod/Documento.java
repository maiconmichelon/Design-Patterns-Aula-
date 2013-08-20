package factoryMethod;

import javax.swing.JFileChooser;

public abstract class Documento {

	protected String nome;
	
	public void inicializar() {
		System.out.println("Inicializando documento " + this.getClass().getName());
	}
	
	public void abrir(){
		System.out.println("Abrindo documento " + this.getClass().getName());
	}
	
	public void salvando() {
		System.out.println("Salvando documento " + this.getClass().getName());
	}
	
	public java.io.File selecionarArquivo(){
		JFileChooser chooser = new JFileChooser();
		
		chooser.setDialogTitle("Abrir documento");
		chooser.setDialogType(JFileChooser.OPEN_DIALOG);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.showDialog(null, "Selecionar");
		
		return chooser.getSelectedFile();
	}
	
}
