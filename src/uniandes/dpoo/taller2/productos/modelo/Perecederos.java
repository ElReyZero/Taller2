package uniandes.dpoo.taller2.productos.modelo;

public class Perecederos extends producto
{
    //*Atributos//
    private boolean refrigeracion;
    private boolean resistencia;
    
    //*Constructor//
    public Perecederos(String pNombre, Double pPeso, Double pVolumen, Double pMaxTemp, boolean pPerecedero)
     {
        super(pNombre, pPeso, pVolumen, pPerecedero, pMaxTemp);
        refrigeracion = false;
        resistencia = false;
    }

    //*Métodos//

    public boolean darRefrigeracion()
    {
        return refrigeracion;
    }
    
    public boolean darResistencia()
    {
        return resistencia;
    }
}
