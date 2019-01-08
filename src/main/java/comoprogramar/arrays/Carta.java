
package comoprogramar.arrays;

public class Carta {

    private final String face;
    private final String naipe;


    public Carta ( String face, String naipe ) {
        this.face = face;
        this.naipe = naipe;

    }

    @Override
    public String toString() {
        return this.face + " de " + this.naipe;
    }
}
