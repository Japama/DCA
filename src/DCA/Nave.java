package DCA;

public class Nave {

    String nombre;
    int vida;
    int defensa;
    int ataque;
    int capacidad;
    int municion;


    public static void writeln(String aux){System.out.println(aux);}
    public static void write(String aux){System.out.print(aux);}

    public String toString() {
        // todo: make a useful toString()
        String toString=("Nombre: " + this.getNombre());
        toString = toString + ", Vida: " + this.getVida();
        toString = toString + ", Ataque: " + this.getAtaque();
        toString = toString + ", Defensa: " + this.getDefensa();
        return toString;
    }

    public int recargar(){
        int carga=0;
        //prueba de fallo
        //for(int i=0; i<=this.capacidad+10; i++) carga = i;
        //forma correcta
        for(int i=0; i<=capacidad; i++) carga = i;
        return carga;
    }

    void atack(Nave naveDefensora){
        String superEnemigo = "Estrella de la muerte";
        naveDefensora.setVida(naveDefensora.getVida()-(this.getAtaque()-naveDefensora.getDefensa()));
        if(naveDefensora.getNombre() == superEnemigo){
            int num = (int) (Math.random() * 5555);
            if(num < 2){
                naveDefensora.setVida(0);
                writeln("¡El ingeniero que diseño la estrella de la muerte era peor que tu,");
                writeln("y la has destruido de un disparo critico!");
            }
        }
    }

    public Nave() {
    }




    public Nave(String name, int hp, int atk, int def) {
        this();
        nombre= name;
        vida = hp;
        ataque = atk;
        defensa = def;
    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
