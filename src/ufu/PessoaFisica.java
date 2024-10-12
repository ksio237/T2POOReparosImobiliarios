package ufu;

import java.util.ArrayList;

public class PessoaFisica extends Cliente {
	private String cpf;
	private ArrayList<String> CPFs = new ArrayList<String>(); // para usar no validador, seria melhor porem mais complexo usar o hashmap

	public PessoaFisica(String nome, String endereco, String telefone, String cpf) throws Exception { //Posso mudar para uma erro mais adequado ou criado
		super(nome, endereco, telefone);
		if (validar(cpf)) {
			throw new Exception("CPF já registrado!"); // Joga exception para parar o processo
		}
		this.cpf = cpf;
		CPFs.add(cpf);
	}

	public String getCpf() {
		return cpf;
	}

	// Aqui eu valido verificando se nao ha o mesmo cpf (poderia colocar o famoso validador de cpf mas seria complicar o uso). *seria melhor na classe sistema
	@Override
	boolean validar(String cpf) {
		return !CPFs.contains(cpf); //reduzir o codigo com ! se contem CPF é "true" entao ele retorna inverso sendo false e vice-versa
	}
}
