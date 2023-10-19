package AnimalPrincipal;

import Cachorro.Cachorro;
import Gato.Gato;
import Leao.Leao;
import Lobo.Lobo;
import Tigre.Tigre;

public class Main {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("thor", "M", "Qualquer");
		lobo.emitirSom();
		
		Leao leao = new Leao("thor", "M", "Qualquer");
		leao.emitirSom();
		
		Tigre tigre = new Tigre("thor", "M", "Qualquer");
		tigre.emitirSom();
		
		Cachorro cachorro = new Cachorro("thor", "M", "Qualquer");
		cachorro.emitirSom();
		
		Gato gato = new Gato("thor", "M", "Qualquer");
		gato.emitirSom();
	}

}
