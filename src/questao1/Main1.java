package questao1;

public class Main1 {

	public static void main(String[] args) {
		
		Veiculo v = new Veiculo("Ferrari", "Spider", "PHN8867", "Cinza", 1000000);
		
		// Teste #01: Tentando acelerar veículo sem estar ligado
		v.acelerar();
		
		// Teste #02: Ligando, acelerando e tentando desligar
		v.ligar();
		v.acelerar();
		System.out.println("Velocidade atual do carro: " + v.getVelocidade() + "Km/h");
		v.desligar();
		
		// Teste #03: Abastecendo até o limite do tanque
		v.abastecer(70);
		System.out.println("Litros no tanque: " + v.getLitrosCombustivel());
		
		// Teste #04: Freando até o limite
		v.frear();
		v.frear();
		System.out.println("Velocidade atual do carro: " + v.getVelocidade() + "Km/h");
		
		// Teste #05: Pintando o veículo e desligando
		v.pintar("branco");
		System.out.println("Cor atual do carro: " + v.getCor());
		v.desligar();
		System.out.println("Carro ligado: " + v.isLigado());
	}
}
