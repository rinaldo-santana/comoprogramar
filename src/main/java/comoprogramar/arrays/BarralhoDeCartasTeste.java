package comoprogramar.arrays;

/**
 * 7.6 Estudo de caso: simulação de embaralhamento e distribuição de cartas
 * Pagina 202-205
 * BarralhoDeCartasTeste
 */
public class BarralhoDeCartasTeste {

    public static void main(String[] args) {

        BaralhoDeCartas baralho = new BaralhoDeCartas();
        baralho.embaralhaCartas();

        for (int i = 1; i <= 52; i++) {
            Carta carta = baralho.distribuiCarta();
            System.out.printf("%-19s", carta);

            if ((i % 4) == 0) {
                System.out.println();
            }
        }
    }
}

// As de Copas        Dois de Copas      Tres de Copas      Quatro de Copas
// Cinco de Copas     Seis de Copas      Sete de Copas      Oito de Copas
// Nove de Copas      Dez de Copas       Valete de Copas    Dama de Copas
// Rei de Copas       As de Ouros        Dois de Ouros      Tres de Ouros
// Quatro de Ouros    Cinco de Ouros     Seis de Ouros      Sete de Ouros
// Oito de Ouros      Nove de Ouros      Dez de Ouros       Valete de Ouros
// Dama de Ouros      Rei de Ouros       As de Paus         Dois de Paus
// Tres de Paus       Quatro de Paus     Cinco de Paus      Seis de Paus
// Sete de Paus       Oito de Paus       Nove de Paus       Dez de Paus
// Valete de Paus     Dama de Paus       Rei de Paus        As de Espadas
// Dois de Espadas    Tres de Espadas    Quatro de Espadas  Cinco de Espadas
// Seis de Espadas    Sete de Espadas    Oito de Espadas    Nove de Espadas
// Dez de Espadas     Valete de Espadas  Dama de Espadas    Rei de Espadas
