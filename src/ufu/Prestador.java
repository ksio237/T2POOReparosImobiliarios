package ufu;

public class Prestador {
	private int id;
	private static int contador = 300;
	private String nome, servico; //Penso em relacionar o prestador a um serviço mas nao implementarei isso, complicado e regra de negocio
	
	public Prestador(int id, String nome, String servico) {
		this.id = contador++;
		this.nome = nome;
		this.servico = servico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public int getId() {
		return id;
	}

}
