public class AtaqueEspecial implements MetodoAtaque {
    public void executarAtaque(Personagem atacante, Personagem alvo) {
        int dano = atacante.pontosDeAtaque * 2; // Ataque especial com dano dobrado
        alvo.pontosDeVida -= dano;
    }
}
