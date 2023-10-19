package Funcionario;


public class Main {

	public static void main(String[] args) {
		
		Jornada funJor = new Jornada(1,"thor", "M", 2 , "jorge");
		
		Horista funHor = new Horista(1,"thor", "M", 2 , "jorge");
		
		PessoaJuridica funJur = new PessoaJuridica(1,"thor", "M", 2 , "jorge");
	
		System.out.println(funJor.getId());
		System.out.println(funJor.getNome());
		System.out.println(funJor.getTelefone());
		System.out.println(funJor.getMatricula());
		System.out.println(funJor.getEndereço());
		System.out.println(funJor.calculaSalario(2,2));
		
		System.out.println("++++++++++++++++++++++++++");
		
		System.out.println(funHor.getId());
		System.out.println(funHor.getNome());
		System.out.println(funHor.getTelefone());
		System.out.println(funHor.getMatricula());
		System.out.println(funHor.getEndereço());
		System.out.println(funHor.calculaSalario(2,2));
		
		System.out.println("++++++++++++++++++++++++++");
		
		System.out.println(funJur.getId());
		System.out.println(funJur.getNome());
		System.out.println(funJur.getTelefone());
		System.out.println(funJur.getMatricula());
		System.out.println(funJur.getEndereço());
		System.out.println(funJur.calculaSalario(2,2));

	}

}
