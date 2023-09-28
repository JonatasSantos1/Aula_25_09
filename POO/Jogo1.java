public class Jogo1 {
    public static void main(String[] args) throws InterruptedException {
        Personagem cacador = new Personagem();
        cacador.nome = "Sergio";
        cacador.cacar();
        Personagem lenhador = new Personagem();
        lenhador.nome = "Bruno";
        lenhador.cacar();
        cacador.comer();
        lenhador.dormir();
    }

}
