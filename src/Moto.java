public class Moto extends Vehiculo {

    private int cilindrada;

   public Moto(int año, String marca, double km, boolean apto, int cilindrada) {
            super(año, marca, km, apto);
            this.cilindrada = cilindrada;
        }

    public Moto(){
        this(0,"",0.0,false,0);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "año" +año+" marca "+marca+" km "+km+" apto "+apto+" cilindrada" +cilindrada;
    }
}
