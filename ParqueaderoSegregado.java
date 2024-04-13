public interface ParqueaderoSegregado {
    void aparcarCoche();//Por entrada de vehículo reduce los espacios disponibles
    void sacarCoche(); //Aumenta los espacios disponibles
    void devolverCapacidadCoche();//devolver la capacidad del coche
}
