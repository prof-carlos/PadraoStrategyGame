public class Personagem {
    public String nome;
    public int pontosDeVida;
    public int pontosDeAtaque;
    public AtaqueComum ataqueComum;
    public AtaqueEspecial ataqueEspecial;

    public void atacar(Personagem alvo) {
        ataqueComum.executarAtaque(this, alvo);
    }

    public void especial(Personagem alvo) {
        ataqueEspecial.executarAtaque(this, alvo);
    }
}
