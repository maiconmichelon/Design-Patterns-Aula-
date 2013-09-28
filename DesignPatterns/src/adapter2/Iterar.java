package adapter2;

import java.util.Hashtable;
import java.util.Iterator;

public class Iterar {

	public static void main(String[] args) {
		Hashtable<String, String> dados = new Hashtable<String, String>();
		
		dados.put("chave1", "valor1");
		dados.put("chave2", "valor2");
		dados.put("chave3", "valor3");
		dados.put("chave4", "valor4");
		dados.put("chave5", "valor5");
		
		iterar(new Adapter(dados.elements()));
		
	}
	
	public static void iterar(Iterator<Object> it){
		while(it.hasNext())
			System.out.println(it.next());
	}
	
}
