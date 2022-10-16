package modelo;

public class cadastro {
	// atributos
		private int id_cadastro;
		private String nome;
		private String email;
		private String senha;
		private String endereco;
		private Permissao permissao;

		// Contrutor
		public Cadastro (String nome, String email, String senha, String endereco, Permissao permissao) {
			this.nome = nome;
			this.email = email;
			this.senha = senha;
			this.endereco = endereco;
			this.permissao = permissao;
		}

		public Cadastro() {
		}

		//Gets e Sets
		public int getId_cadastro() {
			return id_cadastro;
		}

		public void setId_cadastro(int id_cadastro) {
			this.id_cadastro = id_cadastro;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public Permissao getPermissao() {
			return permissao;
		}

		public void setPermissao(Permissao permissao) {
			this.permissao = permissao;
		}

		//Metodo 
		public String mostrarUsuario() {
			return "Id: "+ this.id_cadastro +" Nome: " +this.nome 
					+ " Email: " + this.email 
					+ " Senha: " + this.senha
					+ " Tipo permissão: " + this.permissao.getTipo_permissao(); 
		}
	}
}
