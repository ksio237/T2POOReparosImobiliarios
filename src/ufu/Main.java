package ufu;

public class Main {
	static Sistema sistema = new Sistema();

	public static void main(String[] args) {
		System.out.println("teste");
		autoCliente();
		sistema.listarClientes();
		autoPrestador();
		sistema.listarPrestador();
		autoImovel();
		sistema.listarImovel();
		sistema.criarImovel("Joao Naves 3000", "Jo");
		sistema.listarImovel();
		
	}
	
	public static void autoCliente() {
		sistema.criarClienteFisica("Jose Maria", "Joao Naves 3000" , "45784693677", "14785324489");
		sistema.criarClienteFisica("Tiao Sebas", "Rua dois 1", "48579641267", "117854662146");
		sistema.criarClienteJuridica("Imobiliaria do Zé", "Shopping Center Lj 40", "478448945000157", "34998571254");
		sistema.criarClienteJuridica("Pensionato Cabaré", "Rua Dr. Marcolino 874", "478512654000197", "3438130258");
		sistema.criarClienteFisica("Jose Maria", "Joao Naves 3000" , "45784693677", "14785324489");
		sistema.criarClienteJuridica("Pensionato Cabaré", "Rua Dr. Marcolino 874", "478512654000197", "3438130258");
	}
	
	public static void autoPrestador() {
		sistema.criarPrestador("Flavin Pintor", "Encanador");
		sistema.criarPrestador("Mario Brás", "Pintor");
	}
	
	public static void autoImovel() {
		sistema.criarImovel("Joao Naves 3000", "Jose Maria");
		sistema.criarImovel("Rua Floriano Peixoto 80", "Imobiliaria do Zé");
	}

}
