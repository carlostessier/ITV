import java.util.ArrayList;
import java.util.List;

public class ITV {

    private String direccion;

    private List<Vehiculo> vehiculos;

    public ITV(){
        this("");
    }
    public ITV(String direccion){
        this.direccion = direccion;
        this.vehiculos = new ArrayList<>();
    }

    public void addVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public void mostrarVehiculos(){
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }

    public Vehiculo getVehiculoMasModerno() throws Exception{
        if(vehiculos.isEmpty()){
            throw new Exception("No hay vehiculos");
        }
        Vehiculo vehiculo = vehiculos.get(0);
        for (int i = 1; i < vehiculos.size(); i++) {
            
            if(vehiculos.get(i).getAño() > vehiculo.getAño()){
                vehiculo = vehiculos.get(i);
            }
        }
        
        return vehiculo;

    }

}
