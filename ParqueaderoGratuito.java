public class ParqueaderoGratuito implements Parqueadero{

    @Override
    public void aparcarCoche() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public double calcularTarifa(Parqueadero.Coche coche) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void devolverCapacidadCoche() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void hacerPago(Parqueadero.Coche coche) {
        try {
            throw new Exception("El parqueadero es gratuito");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @Override
    public void sacarCoche() {
        // TODO Auto-generated method stub
        
    }
    
}
