package uniandes.dpoo.taller2.contenedores.test;

import uniandes.dpoo.taller2.contenedores.modelo.cargamento;
import uniandes.dpoo.taller2.contenedores.modelo.contenedor;
import uniandes.dpoo.taller2.contenedores.modelo.contenedorExclusivo;
import uniandes.dpoo.taller2.productos.modelo.Perecederos;
import uniandes.dpoo.taller2.productos.modelo.producto;

class mainclass
{
    public static void main(String[] args)
    {
        producto chocolate = new Perecederos("chocolate", 100.0, 10.0, true, -10.0, true, true);
        producto nose = new Perecederos("chocolate", 100.0, 10.0, true, -10.0, true, true);
        contenedor cont1 = new contenedorExclusivo(1000.0, 10000.0, "chocolate");
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
        System.out.println(added);
    }
}
    
    
    