package AnimalInter;

public class Lobo implements Animal{
	
	@Override
	public void dormir() {
		System.out.println("O lobo está a mimir");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O lobo está a caminhar");
	}
	
	@Override
	public void correr() {
		System.out.println("O lobo está correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O lobo está a uivar");
	}
}
