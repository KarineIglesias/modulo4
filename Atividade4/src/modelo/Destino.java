package modelo;

public class Destino {
	
	// atributos
		private int id;
		private String nome;
		private String email;
		private int telefone;
		private String destino;
		private int preco;
		private String passagem;
		

		
		public Destino() {
			
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
		public int getTelefone() {
			return telefone;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		public String getDestino() {
			return destino;
		}
		public void setDestino(String destino) {
			this.destino = destino;
		}
		public int getPreco() {
			return preco;
		}
		public void setPreco(int preco) {
			this.preco = preco;
		}
		public String getAerea() {
			return passagem;
		}
		public void setAerea(String passagem) {
			this.passagem = passagem;
		}
		public Destino(int id, String nome, String email, int telefone, String destino, int preco, String passagem) {
			
			this.id = id;
			this.nome = nome;
			this.email = email;
			this.telefone = telefone;
			this.destino = destino;
			this.preco = preco;
			this.passagem = passagem;
		}

		
	}

}
