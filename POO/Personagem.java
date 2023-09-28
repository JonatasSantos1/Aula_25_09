public class Personagem {
    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    void cacar() {
        if (energia >= 2) {
            System.out.println(nome + " cacando...");
            energia = energia - 1;
            if (fome < 10) {
                fome = fome + 2;
            }
            sono = Math.min(sono + 1, 10);
        } else {
            System.out.println(nome + " Sem energia para cacar... ");
        }
    }

    void comer() {
        if (fome >= 1) {
            System.out.println(nome + " comendo...");
            fome--;
            energia = Math.min(energia + 1, 10);
        } else {
            System.out.println(nome + " sem fome... ");
        }
    }

    void dormir() {
        if (sono >= 1) {
            System.out.println(nome + " dormindo...");
            sono--;
            energia = energia < 10 ? energia + 1 : 10;
        } else {
            System.out.println(" sem sono... ");
        }

    }

}
