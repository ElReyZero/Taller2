package uniandes.dpoo.taller2.productos.test;

import uniandes.dpoo.taller2.productos.modelo.producto;
import uniandes.dpoo.taller2.productos.modelo.noPerecederos;

class mainclass
{
    public static void main(String[] args)
    {
        producto botellaAgua = new noPerecederos("agua", 500.0, 1000.0, false, 20.0, false, 0);
        producto botellaGaseosa = new noPerecederos("agua", 500.0, 1000.0, false, 20.0, false, 0);
        System.out.println(botellaAgua.compararProd(botellaGaseosa));
    }
}
