import static org.junit.jupiter.api.Assertions.*;

class ITVTest {

    @org.junit.jupiter.api.Test
    void getVehiculoMasModerno() {
        ITV itv = new ITV("Calle de la ITV");
        Vehiculo coche = new Coche(2010, "Seat", 100000, false, 5);

        itv.addVehiculo(coche);
        itv.addVehiculo(new Moto(2016, "Yamaha", 300000, false, 1000));

        try {
            assertEquals( new Moto(2016, "Yamaha", 300000, false, 1000),itv.getVehiculoMasModerno());
        } catch (Exception e) {
            System.out.println("No hay vehiculos");
        }

        ITV it2 = new ITV("Calle de la ITV");

        assertThrowsExactly(Exception.class, () -> {
            it2.getVehiculoMasModerno();
        });

    }
}