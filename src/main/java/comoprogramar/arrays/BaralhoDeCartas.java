package comoprogramar.arrays;

import java.security.SecureRandom;

/**
 * BaralhoDeCartas
 */
public class BaralhoDeCartas {

    private Carta[] baralho;
    private int cartaAtual;
    private static final int NUMERO_DE_CARTAS = 52;
    private static final SecureRandom numeroAleatorio = new SecureRandom();

    public BaralhoDeCartas() {
        String naipes[] = {"Copas", "Ouros", "Paus", "Espadas"};
        String faces[] = {"As", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete", "Oito",
            "Nove", "Dez", "Valete", "Dama", "Rei"};
        this.baralho = new Carta[NUMERO_DE_CARTAS];

        this.cartaAtual = 0;

        for (int contador = 0; contador < baralho.length; contador++) {
            baralho[contador] = new Carta( faces[contador % 13], naipes[contador / 13] );

        }

    }

    public void embaralhaCartas() {
        this.cartaAtual = 0;

        for (int primeira = 0; primeira < baralho.length; primeira++) {
            int segunda = numeroAleatorio.nextInt(NUMERO_DE_CARTAS);
            Carta temp = baralho[primeira];
            baralho[primeira] = baralho[segunda];
            baralho[primeira++] = temp;
        }
    }

    public Carta distribuiCarta() {
        if (this.cartaAtual < baralho.length) {
            return baralho[this.cartaAtual++];
        } else {
            return null;
        }
    }

}
