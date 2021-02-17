package uniandes.dpoo.taller2.productos.modelo;

public class Perecederos extends producto
{
    //*Atributos//
    private boolean refrigeracion;
    private boolean resistencia;
    
    //*Constructor//
    public Perecederos(String pNombre, Double pPeso, Double pVolumen, Double pMaxTemp, boolean pPerecedero, boolean pRefrigeracion, boolean pResistencia)
     {
        super(pNombre, pPeso, pVolumen, pPerecedero, pMaxTemp);
        refrigeracion = pRefrigeracion;
        resistencia = pResistencia;
    }

    //*Métodos//

    @Override
    public String darCaracteristicas()
    {
        String variable =super.darCaracteristicas();
        variable+= " "+refrigeracion+" "+resistencia;
        return variable;
    }

    public boolean darRefrigeracion()
    {
        return refrigeracion;
    }
    
    public boolean darResistencia()
    {
        return resistencia;
    }
}
