package uniandes.dpoo.taller2.contenedores.modelo;

public class contenedorExclusivo extends contenedor
{
    //*Atributos//
    private String tipoContenedor;

    //*Constructor//
    public contenedorExclusivo(Double pCapacidadVol, Double pCapacidadPeso, boolean pExclusividad, Double pPesoCarga, String pTipoContenedor) 
    {
        super(pCapacidadVol, pCapacidadPeso, pExclusividad);
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
