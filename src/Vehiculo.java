import java.util.Objects;

public abstract class  Vehiculo {

    
    protected int año;
    protected String marca;
    protected double km;
    protected boolean apto;

    public Vehiculo(){
        this(0,"",0.0,false);
    }
    public Vehiculo(int año, String marca, double km, boolean apto) {
        this.año = año;
        this.marca = marca;
        this.km = km;
        this.apto = apto;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public boolean isApto() {
        return apto;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehiculo vehiculo = (Vehiculo) o;

        if (año != vehiculo.año) return false;
        if (Double.compare(vehiculo.km, km) != 0) return false;
        if (apto != vehiculo.apto) return false;
        return Objects.equals(marca, vehiculo.marca);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = año;
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        temp = Double.doubleToLongBits(km);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (apto ? 1 : 0);
        return result;
    }
}
