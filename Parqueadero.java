public interface Parqueadero {
    void aparcarCoche();//Por entrada de vehículo reduce los espacios disponibles
    void sacarCoche(); //Aumenta los espacios disponibles
    void devolverCapacidadCoche();//devolver la capacidad del coche
    double calcularTarifa(Coche coche);//devolverme el precio en función de las horas
    void hacerPago(Coche coche);
    
    class Coche{
        
    }


    
}