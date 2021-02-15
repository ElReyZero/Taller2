package uniandes.dpoo.taller2.productos.modelo;

public class noPerecederos extends producto 
{
    //*Atributos//
    private boolean toxicidad;
    private int nivelToxicidad;
 
    
    /*Constructor */
    public noPerecederos(String pNombre, Double pPeso, Double pVolumen, boolean pPerecedero, Double pMaxTemp, boolean pToxicidad, int pNivelToxicidad) 
    {
        super(pNombre, pPeso, pVolumen, pPerecedero, pMaxTemp);
        super.perecedero = false;
        toxicidad = false;
        nivelToxicidad = 0;
    }
    
    //*Métodos//

    public boolean darToxicidad()
    {
        return toxicidad;
    }

    public int darNivelToxicidad()
    {
        return nivelToxicidad;
    }

}
