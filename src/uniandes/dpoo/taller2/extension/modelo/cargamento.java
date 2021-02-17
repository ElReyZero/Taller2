package uniandes.dpoo.taller2.contenedores.modelo;
import uniandes.dpoo.taller2.productos.modelo.Perecederos;
import uniandes.dpoo.taller2.productos.modelo.noPerecederos;
import uniandes.dpoo.taller2.productos.modelo.producto;

public class cargamento 
{
    //*Atributos//
    private String propietario;
    private String identificador;
    private Integer cantidadProd;
    private String tipoProducto;
    private producto product;
    private Double pesoCarga;
    private Double volumenCarga;
    private boolean toxicidadCarga;
    private boolean refrigeracionCarga;
    private boolean cargaInflamable;
    private String fechaVencimientoCarga;

    //*Constructor//
    public cargamento(String pPropietario, String pIdentificador, Integer pCantidadProd, producto pProduct)
    {
        propietario = pPropietario;
        identificador = pIdentificador;
        cantidadProd = pCantidadProd;
        product = pProduct;
        tipoProducto = product.darNombre();
        pesoCarga = (product.darPeso()*cantidadProd)/(10^6);
        volumenCarga = (product.darVolumen()*cantidadProd)/(10^6);
        toxicidadCarga = false;
        refrigeracionCarga = false;
        cargaInflamable = false;
        fechaVencimientoCarga = null;


        try 
        {
           boolean var = ((noPerecederos) product).darToxicidad();          ///El programa revisa que tenga o no toxicidad//
           if (var)
           toxicidadCarga = true;
        } 
        catch (Exception e) 
        {
            ;
        }
        
        try 
        {
           boolean var2 = ((Perecederos)product).darRefrigeracion();        ///El programa revisa que el producto necesite o no refrigeración//
           if (var2)
           refrigeracionCarga = false;
        } 
        catch (Exception e) {
            ;
        }

        try 
        {
            String var3 = ((Perecederos) product).darFechaVencimiento();
            fechaVencimientoCarga = var3;
        } catch (Exception e) {
            ;
        }
    }

    //*Métodos//

    public String darCaracteristicas()
    {
        String owner = propietario.toString();
		String id = identificador.toString();
		String prod = cantidadProd.toString();
        String peso = pesoCarga.toString();
        String volumen = volumenCarga.toString();
        String resultado = " "+owner+" "+id+" "+cantidadProd+" "+prod+" "+peso+" "+volumen+" "+toxicidadCarga+" "+cargaInflamable;
        return resultado;
    }

    public String darPropietario()
    {
        return propietario;
    }

    public String darIdentificador() 
    {
        return identificador;
    }

    
    public Integer darCantidadProd() 
    {
        return cantidadProd;
    }

    public String darTipoProd()
    {
        return tipoProducto;
    }

    public Double darPesoCarga()
    {
        return pesoCarga;
    }

    public Double darVolumenCarga()
    {
        return volumenCarga;
    }

    public boolean darToxicidadCarga()
    {
        return toxicidadCarga;
    }

    public boolean darRefrigeracionCarga()
    {
        return refrigeracionCarga;
    }

    public boolean darCargaInflamable()
    {
        return cargaInflamable;
    }

    public producto darProducto()
    {
        return product;
    }

    public String darFechaVencimiento()
    {
        return fechaVencimientoCarga;
    }
}
