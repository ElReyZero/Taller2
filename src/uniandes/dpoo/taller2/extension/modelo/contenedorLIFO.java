package uniandes.dpoo.taller2.extension.modelo;

public class contenedorLIFO extends contenedor
{
    private String ultimaCarga;
    public contenedorLIFO(Double pCapacidadVol, Double pCapacidadPeso) 
    {
        super(pCapacidadVol, pCapacidadPeso);
        ultimaCarga = null;
        
    }
    @Override
    public boolean addCargo(cargamento Cargo)
    {
    	ultimaCarga=Cargo.darIdentificador();
        return super.addCargo(Cargo);
    }
    @Override
    public void retirarCargamento(String identificador)
    {
    	if (ultimaCarga != null)
    		super.retirarCargamento(ultimaCarga);    
    }

}
