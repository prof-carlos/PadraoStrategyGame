public class AtaqueComum implements MetodoAtaque {
    public void executarAtaque(Personagem atacante, Personagem alvo) {
        int dano = atacante.pontosDeAtaque;
        alvo.pontosDeVida -= dano;
    }
}
