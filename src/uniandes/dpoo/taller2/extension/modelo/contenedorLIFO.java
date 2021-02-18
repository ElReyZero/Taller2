package uniandes.dpoo.taller2.extension.modelo;

public class contenedorLIFO extends contenedor
{
    private String ultimacarga;
    public contenedorLIFO(Double pCapacidadVol, Double pCapacidadPeso) 
    {
        super(pCapacidadVol, pCapacidadPeso);
        ultimacarga = null;
        
    }
    @Override
    public boolean addCargo(cargamento Cargo)
    {
    	ultimacarga=Cargo.darIdentificador();
        return super.addCargo(Cargo);
    }
    @Override
    public void retirarCargamento(String identificador)
    {
    	if (ultimacarga.equals(identificador) && ultimacarga != null)
    		super.retirarCargamento(ultimacarga);    
    }

}
