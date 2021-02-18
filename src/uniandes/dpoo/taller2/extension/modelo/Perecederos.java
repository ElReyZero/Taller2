package uniandes.dpoo.taller2.extension.modelo;

public class Perecederos extends producto
{
    //*Atributos//
    private boolean refrigeracion;
    private boolean resistencia;
    private String tipo;
    private String fechaVencimiento;
    
    //*Constructor//
    public Perecederos(String pNombre, Double pPeso, Double pVolumen, boolean pPerecedero, Double pMaxTemp,  boolean pRefrigeracion, boolean pResistencia, String pTipo, String pFecha)
     {
        super(pNombre, pPeso, pVolumen, pPerecedero, pMaxTemp, pResistencia);
        refrigeracion = pRefrigeracion;
        resistencia = pResistencia;
        tipo = pTipo;
        fechaVencimiento = pFecha;
    }

    //*Métodos//

    @Override
    public String darCaracteristicas()
    {
        String variable =super.darCaracteristicas();
        variable+= " "+refrigeracion+" "+resistencia+" "+fechaVencimiento;
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
    public String darTipo()
    {
        return tipo;
    }
    public String darFechaVencimiento()
    {
        return fechaVencimiento;
    }
}
