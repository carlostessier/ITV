public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(int año, String marca, double km, boolean apto, int numPuertas) {
        super(año, marca, km, apto);
        this.numPuertas = numPuertas;
    }

    public Coche(){
        this(0,"",0.0,false,0);
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "año" +año+" marca "+marca+" km "+km+" apto "+apto+" "+numPuertas+" puertas" +numPuertas;
    }
}
