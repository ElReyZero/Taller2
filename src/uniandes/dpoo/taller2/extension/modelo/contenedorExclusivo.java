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

    @Override
    public boolean addCargo(cargamento Cargo) 
    {
        Double pesoTotal = this.pesoCarga + Cargo.darPesoCarga();
        Double volumenTotal = this.volumenOcupado + Cargo.darVolumenCarga();
        if(this.maxTemp == null)
        maxTemp = Cargo.darProducto().darTempMax();

        if (Cargo.darTipoProd()!= this.tipoContenedor)
        {
            return false;
        }
        else if (pesoTotal > this.capacidadPeso)
        {
            return false;
        }
        else if (volumenTotal > this.capacidadVol)
        {
            return false;
        }
        else if (this.tienePerecedero == true && Cargo.darToxicidadCarga()  == true)
        {
            return false;
        }
        else if (this.tienePerecedero == false && Cargo.darProducto().darTempMax() < 0.0)
        {
            return false;
        }
        else if (this.maxTemp<Cargo.darProducto().darTempMax())
        {
            return false;
        }
        else
        {            
            if (Cargo.darProducto().darTipoPerecedero())
            {
                tienePerecedero = true;
            }
            if (Cargo.darToxicidadCarga())
            {
                tieneToxico = true;
            }
            if (Cargo.darRefrigeracionCarga())
            {
                necesitaRefrigeracion = true;
            }
            maxTemp = Cargo.darProducto().darTempMax();
            DictCarga.put(Cargo.darIdentificador(), Cargo);
            return true;
        }
        
    }

    public String darTipoContenedor()
    {
        return tipoContenedor;
    }
}
