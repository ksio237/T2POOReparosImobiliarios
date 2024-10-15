package ufu;

import java.util.ArrayList;

public class Orcamento {
	private static int contador = 500;
	private int id;
	private Imovel imovel;
	private ArrayList<Servico> servicos = new ArrayList<Servico>();
	private Cliente cliente;
	private Double valorOrcamento;
	
	public Orcamento(Imovel imovel, Cliente cliente) {
		this.imovel = imovel;
		this.cliente = cliente;
		this.id = contador++;
	}
	
	public void criarServico(Prestador prestador, Double valor, String tipo) {
		servicos.add(new Servico(prestador, valor, tipo));
	}
	
	public Servico pegaServico(String tipo) {
		for(Servico servico : servicos) {
			if(servico.getTipo().equals(tipo)) {
				return servico;
			}
		}
		return null;
	}
	
	public void addMateriaisServico(String tipo, String nome, Integer quantidade, Double valor) {
		Servico servico = pegaServico(tipo);
		servico.temMateriais();
		servico.addMateriais(nome, quantidade, valor);
	}
	
	public Double calcularOrcamento() {
		for(Servico servico : servicos) {
			if(servico.isTemMateriais()) {
				valorOrcamento = valorOrcamento + servico.valorMateriais();
			}
			valorOrcamento = valorOrcamento + servico.getValorServico();
		}
		return valorOrcamento;
	}
	
	public void listaServico() {
		for(Servico servico : servicos) {
			System.out.printf("ID: %d Seviço: %s - Prestador: %s - Valor: R$ %.2f\n",servico.getId(), servico.getTipo(), servico.getPrestador().getNome(),
					servico.getValorServico());
			if(servico.isTemMateriais()) {
				System.out.println("******Lista de Materiais para esse Serviço*****");
				servico.listaMateriais();
			}
			calcularOrcamento();
			System.out.printf("Valor total do Orçamento: %.2f\n", valorOrcamento);
		}
		
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

}
