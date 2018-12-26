package DCA;

import static DCA.Nave.write;
import static DCA.Nave.writeln;

public class Main {

    public static void main(String[] args) {


        Nave naveBuena = new Nave("Halcon Milenario", 100, 100, 20);
        Nave naveMala = new Nave("Estrella de la muerte", 10000, 10, 90);
        writeln(naveBuena.toString());
        writeln(naveMala.toString());
        writeln("¡¡  EMPIEZA LA GUERRA  !!");
        int contador=1;
        while(naveMala.getVida() > 0){
            write("Ataque numero: ");
            writeln("" + contador);
            naveBuena.setMunicion(naveBuena.recargar());
            naveBuena.atack(naveMala);
            naveBuena.setMunicion(9);
            write("Salud enemiga restante: ");
            writeln("" + naveMala.getVida());
            contador++;
        }
        writeln("¡¡  FINAL DE LA GUERRA !!");
    }
}
