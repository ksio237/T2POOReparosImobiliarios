package ufu;

import java.util.ArrayList;

public class Sistema {
	ArrayList<Cliente> clientes = new ArrayList<>();
	ArrayList<Prestador> prestadores = new ArrayList<>();
	ArrayList<Imovel> imoveis = new ArrayList<>();

	public void criarClienteFisica(String nome, String endereco, String telefone, String cpf) {
		try {
			clientes.add(new PessoaFisica(nome, endereco, telefone, cpf));
			System.out.println("Adicionado!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void criarClienteJuridica(String nome, String endereco, String telefone, String cnpj) {
		try {
			clientes.add(new PessoaJuridica(nome, endereco, telefone, cnpj));
			System.out.println("Adicionado!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void listarClientes() {
		try {
			for (Cliente cliente : clientes) {
				System.out.println("ID: " + cliente.getId() + "Nome: " + cliente.getNome() + " " + cliente.getDado()
						+ " Endereco: " + cliente.getEndereco() + " Telefone: " + cliente.getTelefone());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void criarPrestador(String nome, String funcao) {
		try {
			prestadores.add(new Prestador(nome, funcao));
			System.out.println("Adicionado!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void listarPrestador() {
		try {
			for(Prestador prestador : prestadores) {
				System.out.println("ID: " + prestador.getId() + " Nome: " + prestador.getNome() + " Função principal: " + prestador.getFuncao());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public Cliente pegaCliente(String nome) {
		for(Cliente cliente : clientes) {
			if (cliente.getNome().equalsIgnoreCase(nome)) {
				return cliente;
			}
		}
		return null;
	}
	
	public void criarImovel(String endereco, String nome) {
		try {
			Cliente cliente = pegaCliente(nome);
			if(cliente == null) {
				System.out.println("Cliente nao encontrado!");
				return;
			}
			imoveis.add(new Imovel(endereco, cliente));
			System.out.println("Adicionado!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void listarImovel() {
		try {
			for(Imovel imovel : imoveis) {
				System.out.println("ID: " + imovel.getId() + " Endereço: " + imovel.getEndereco() + " Proprietário ID: " 
						+ imovel.getCliente().getId() + " Nome: " + imovel.getCliente().getNome());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
