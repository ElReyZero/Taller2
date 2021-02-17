package uniandes.dpoo.taller2.contenedores.modelo;

public class contenedorExclusivo extends contenedor
{
    //*Atributos//
    private String tipoContenedor;

    //*Constructor//
    public contenedorExclusivo(String pPropietario, String pIdentificador, Integer pCantidadProd, Double pCapacidadVol, Double pCapacidadPeso, boolean pExclusividad, Double pPesoCarga, String pTipoContenedor) 
    {
        super(pPropietario, pIdentificador, pCantidadProd, pCapacidadVol, pCapacidadPeso, pExclusividad, pPesoCarga);
        super.exclusividad = true;
        tipoContenedor = pTipoContenedor;
    }
    
    //*Métodos//

    @Override
    public String darCaracteristicas()
    {
        String variable = super.darCaracteristicas();
        String tipo = tipoContenedor.toString();
        variable+= " "+tipo;
        return variable;
    }

    public String darTipoContenedor()
    {
        return tipoContenedor;
    }
}
