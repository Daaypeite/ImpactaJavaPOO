package cap5lab1;

public class cap5_Lab1 {

	public static void main(String[] args) {
		Fucionario fun = new Fucionario();
		
		fun.nome = "Joao";
		fun.sobrenome = "pedro";
		fun.cargo = "Programador";
		fun.salario = 4000;
		
		System.out.println("nome: " + fun.nome);
		System.out.println("sobrenome: " + fun.sobrenome);
		System.out.println("cargo: " + fun.cargo);
		System.out.println("salario: " + fun.salario);
	}

}
