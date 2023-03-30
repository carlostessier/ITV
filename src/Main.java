public class Main {
    public static void main(String[] args) {
        ITV itv = new ITV("Calle de la ITV");
        Vehiculo coche = new Coche(2010, "Seat", 100000, false, 5);

        itv.addVehiculo(coche);
        itv.addVehiculo(new Moto(2016, "Yamaha", 300000, false, 1000));

        itv.mostrarVehiculos();
    }
}