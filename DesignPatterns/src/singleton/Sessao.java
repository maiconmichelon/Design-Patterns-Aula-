package singleton;

import java.util.HashMap;

public class Sessao {

	private HashMap<String, Object> dados = new HashMap<String,Object>();
	private static Sessao sessao;
	
	private Sessao(){
	}
	
	public static Sessao getInstance(){
		if(sessao == null)
			sessao = new Sessao();
		return sessao;
	}
	
	public void set(String var, Object dado){
		dados.put(var, dado);
	}

	public Object get(String var){
		return dados.get(var);
	}
	
}
