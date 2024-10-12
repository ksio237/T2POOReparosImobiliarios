package ufu;

import java.util.ArrayList;

public class PessoaJuridica extends Cliente {
	private String cnpj;
	private ArrayList<String> CNPJs = new ArrayList<String>(); // para usar no validador, seria melhor porem mais complexo usar o hashmap

	public PessoaJuridica(String nome, String endereco, String telefone, String cnpj) throws Exception { // Posso mudar para uma erro mais adequado ou criado
		super(nome, endereco, telefone);
		if (validar(cnpj)) {
			throw new Exception("CNPJ já registrado!"); // Joga exception para parar o processo
		}
		this.setCnpj(cnpj);
		CNPJs.add(cnpj);
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	// Aqui eu valido verificando se nao ha o mesmo cnpj (poderia colocar um validador de cnpj mas seria complicar o uso). *seria melhor na classe sistema
	@Override
	boolean validar(String cnpj) {
		return !CNPJs.contains(cnpj); // reduzir o codigo com ! se contem cnpj é "true" entao ele retorna inverso sendo false e vice-versa
	}
}