package uniandes.dpoo.taller2.productos.modelo;
public interface IProducto 
{
    public Boolean compararProd(producto pProducto2);
    public String darCaracteristicas();
    public String darNombre();
    public Double darPeso();
    public Double darVolumen();
    public boolean darTipoPerecedero();
    public Double darTempMax();
    public boolean darInflamable();

}
