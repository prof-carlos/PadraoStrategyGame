import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Personagem jogador = new Personagem();
        jogador.nome = "Herói";
        jogador.pontosDeVida = 100;
        jogador.pontosDeAtaque = 25;
        jogador.ataqueComum = new AtaqueComum();
        jogador.ataqueEspecial = new AtaqueEspecial();

        Personagem inimigo = new Personagem();
        inimigo.nome = "Monstro";
        inimigo.pontosDeVida = 100;
        inimigo.pontosDeAtaque = 8;
        inimigo.ataqueComum = new AtaqueComum();
        inimigo.ataqueEspecial = new AtaqueEspecial();

        int AtaqueCarregado = 3;
        int AtaqueCarregadoInimigo = 3;
            
        while (inimigo.pontosDeVida > 0) {
            System.out.println("Pontos de vida do jogador: " + jogador.pontosDeVida + "\nPontos de vida inimigo: " + inimigo.pontosDeVida);
            System.out.println(("Digite sua ação:\nAtaque normal - 1\nAtaque especial - 2 (faltam "
            +(AtaqueCarregado - 1) + " turnos para usar)"));
            
            Scanner scanner = new Scanner(System.in);
            int action = scanner.nextInt();
            
            switch (action) {
                case 1:
                    jogador.atacar(inimigo);
                    AtaqueCarregado -= 1;
                    System.out.println("Atacando!");
                    break;

                case 2:
                    switch (AtaqueCarregado) {
                        case 1:
                            jogador.especial(inimigo);
                            System.out.println("ATAQUE ESPECIAL!!! \nSeu inimigo tomou o dobro do dano");
                            break;

                        default:
                            System.out.println("Seu ataque especial não está pronto\nVocê perdeu seu turno!");
                            AtaqueCarregado -= 1;
                    }
                    break;

                default:
                    System.out.println("Ação incorreta! \nVocê Perdeu seu turno!");
                    AtaqueCarregado -= 1;
            }

            switch (AtaqueCarregadoInimigo) {
                case 1:
                    inimigo.especial(jogador);
                    System.out.println("ATAQUE ESPECIAL INIMIGO!!!");
                    break;

                default:
                    inimigo.atacar(jogador);
                    AtaqueCarregadoInimigo -= 1;
                    System.out.println("Ataque inimigo");

            }
            
            switch (AtaqueCarregado) {
                case 0:
                    AtaqueCarregado = 3;
                    break;
            
                default:
                    break;
            }
            /*if (AtaqueCarregado == 1) {
                AtaqueCarregado = 3;
            } */   
        }    
        System.out.println("Inimigo Derrotado");
        
            

    }

}
