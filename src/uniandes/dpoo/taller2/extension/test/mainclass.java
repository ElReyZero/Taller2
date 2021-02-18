package uniandes.dpoo.taller2.extension.test;

import uniandes.dpoo.taller2.extension.modelo.Perecederos;
import uniandes.dpoo.taller2.extension.modelo.cargamento;
import uniandes.dpoo.taller2.extension.modelo.contenedor;
import uniandes.dpoo.taller2.extension.modelo.contenedorLIFO;
import uniandes.dpoo.taller2.extension.modelo.contenedorTS;
import uniandes.dpoo.taller2.extension.modelo.producto;

class mainclass
{
    public static void main(String[] args)
    {
        producto chocolate = new Perecederos("chocolate", 100.0, 10.0, true, -10.0, true, true, "comida", "10/10/2021");
        producto nose = new Perecederos("chocolate", 100.0, 10.0, true, -10.0, true, true, "comida", "25/10/2021");
        contenedor cont1 = new contenedorTS(1000.0, 10000.0);
        cargamento exitoChoc = new cargamento("exito", "5S7ASD45ASD487542AGFH", 1000, chocolate);
        cargamento nose2 = new cargamento("exito", "BIYUAS6DASDHOSD86", 1000, nose);
        boolean added = cont1.addCargo(exitoChoc);
        boolean added2 = cont1.addCargo(nose2);
        System.out.println(cont1.generarManifiesto());
        if (added == true)
        {
            System.out.println("El cargamento ha sido añadido.");  
        }
        else
        {
            System.out.println("Hubo un error al añadir el cargamento.");
        }
        if (added2 == true)
        {
            System.out.println("El cargamento ha sido añadido.");  
        }
        else
        {
            System.out.println("Hubo un error al añadir el cargamento.");
        }
    }
}
    