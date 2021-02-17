package uniandes.dpoo.taller2.contenedores.modelo;

public class contenedorLIFO extends contenedor
{
    private String ultimacarga;
    public contenedorLIFO(Double pCapacidadVol, Double pCapacidadPeso, boolean pExclusividad) 
    {
        super(pCapacidadVol, pCapacidadPeso, pExclusividad);
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
