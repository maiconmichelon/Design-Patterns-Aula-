package trabalho3bim;

public class Main {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		usuario.setLogin("Login3");
		usuario.setSenha("Senha");
		usuario.setNome("Nome");
		
		new UsuarioServicoJPA().salvar(usuario);
		
		Cliente cliente = new Cliente();
		
		cliente.setCpf("CPF");
		cliente.setNome("Nome");
		
		new ClienteServicoJPA().salvar(cliente);
		
	}
	
}
