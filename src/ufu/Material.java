package ufu;

public interface Material {

	public Double valorMateriais(); // Metodo que obriga o valor ser calculado
	
	public boolean temMateriais(); // Verifica se ha necessidade de materiais, regra de negocio
	
	public boolean comproMateriais(); // Metodo pra explicitar se materiais foram comprados

}
