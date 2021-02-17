package uniandes.dpoo.taller2.extension.modelo;

public class noPerecederos extends producto 
{
    //*Atributos//
    private boolean toxicidad;
    private int nivelToxicidad;
 
    
    /*Constructor */
    public noPerecederos(String pNombre, Double pPeso, Double pVolumen, boolean pPerecedero, Double pMaxTemp, boolean pToxicidad, int pNivelToxicidad) 
    {
        super(pNombre, pPeso, pVolumen, pPerecedero, pMaxTemp, pToxicidad);
        super.perecedero = false;
        toxicidad = pToxicidad;
        nivelToxicidad = pNivelToxicidad;
    }
    
    //*Métodos//

    @Override
    public String darCaracteristicas()
    {
        String variable =super.darCaracteristicas();
        variable+= " "+toxicidad+" "+nivelToxicidad;
        return variable;
    }


    public boolean darToxicidad()
    {
        return toxicidad;
    }

    public int darNivelToxicidad()
    {
        return nivelToxicidad;
    }

}
