package uniandes.dpoo.taller2.extension.modelo;

import java.util.Map;

public class contenedorTS extends contenedor{

	public contenedorTS(Double pCapacidadVol, Double pCapacidadPeso) 
	{
		super(pCapacidadVol, pCapacidadPeso);
	}
	@Override 
	public String generarManifiesto() 
    {
        String manifiesto = "Manifiesto del contenedor:\nEste contenedor tiene los siguientes cargamentos:";
        for (Map.Entry<String,cargamento> carga : DictCarga.entrySet()) 
        {
            manifiesto += "\nCargamento ID: "+carga.getKey().toString()+"\nFecha de Vencimiento: "+carga.getValue().darFechaVencimiento()+"*************************************************************************";
        }
        manifiesto += "Peso Total de la Carga: "+this.pesoCarga.toString()+"toneladas.\n"+"Volumen Total de la Carga: "+this.volumenOcupado.toString()+"m^3.\nCondiciones: \nRefrigeración Requerida: "+this.necesitaRefrigeracion+"\nTemperatura Máxima: "+this.maxTemp.toString()+"\nContiene Productos Tóxicos: "+this.tieneToxico;
        return manifiesto;
	}
}
