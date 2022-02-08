package questao2;

import java.time.LocalDate;

public class Main2 {

	public static void main(String[] args) {
		
		JogadorFutebol j1 = new JogadorFutebol();
		j1.setNome("Roberto Calos");
		j1.setPosicao(Posicao.DEFESA);
		j1.setDataNascimento(LocalDate.of(1990, 3, 15));
		j1.imprimirDadosJogador();
		System.out.println("Jogador tem " + j1.calcularIdade() + " anos");
		System.out.println("Anos até a aposentadoria: " + j1.getTempoParaAposentadoria());
		
		System.out.println("");
		
		JogadorFutebol j2 = new JogadorFutebol();
		j2.setNome("Enzo Marques");
		j2.setPosicao(Posicao.ATACANTE);
		j2.setDataNascimento(LocalDate.of(1990, 3, 15));
		j2.imprimirDadosJogador();
		System.out.println("Jogador tem " + j2.calcularIdade() + " anos");
		System.out.println("Anos até a aposentadoria: " + j2.getTempoParaAposentadoria());
		
		System.out.println("");
		
		JogadorFutebol j3 = new JogadorFutebol();
		j3.setNome("Robson Oliveira");
		j3.setPosicao(Posicao.MEIA);
		j3.setDataNascimento(LocalDate.of(1990, 3, 15));
		j3.imprimirDadosJogador();
		System.out.println("Jogador tem " + j3.calcularIdade() + " anos");
		System.out.println("Anos até a aposentadoria: " + j3.getTempoParaAposentadoria());
	}
}
