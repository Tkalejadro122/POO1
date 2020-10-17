/**
 * Un ejemplo que modela una Casa de Cambio de Bolívares usando POO
 * 
 * @author (Milton Jesús Vera Contreras)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 * History: Abril 2008 / Marzo 2018
 */
public class CasaDeCambio {

    float precioDeCompra;
    float precioDeVenta;
    int bolivaresComprados;
    int bolivaresVendidos;
    float bolivaresEnCaja;
    float pesosEnCaja;
    
    public CasaDeCambio() {
    }
    
    public float getPrecioDeCompra()
    {
        return precioDeCompra;
    }
    
    public float getPrecioDeVenta()
    {
        return precioDeVenta;
    }
    
    public int getBolivaresComprados()
    {
        return bolivaresComprados;
    }
    
    public int getBolivaresVendidos()
    {
        return bolivaresVendidos;
    }
    
    public float getBolivaresEnCaja()
    {
        return bolivaresEnCaja;
    }
    
    public float getPesosEnCaja()
    {
        return pesosEnCaja;
    }
    
    public float getGananciaEnUnBolivar() 
    {
        return getPrecioDeVenta() - getPrecioDeCompra();
    }
    
    public boolean cambiarPrecioDelBolivar(float precioDeCompra, float precioDeVenta) 
    {
        boolean precioValido = false;
        if(precioDeCompra > 0 && precioDeVenta > 0 && precioDeVenta > precioDeCompra)
        {
            this.precioDeCompra= precioDeCompra;
            this.precioDeVenta= precioDeVenta;
            precioValido=true; 
        }
        return precioValido;
    }//fin cambiarPrecioDelBolivar
    
    public boolean comprarBolivares(int cantidad) 
    {
        boolean puedeComprar = false;
        if(cantidad > 0 && pesosEnCaja >= precioDeCompra * cantidad) 
        {
            bolivaresComprados += cantidad;
            bolivaresEnCaja += cantidad;
            pesosEnCaja -= precioDeCompra * cantidad;
            puedeComprar = true;
        }
        return puedeComprar;
    }//fin comprarBolivares
    
    public boolean venderBolivares(int cantidad){
        boolean puedeVender = false;
        if(cantidad > 0 && bolivaresEnCaja >= cantidad) 
        {
             bolivaresVendidos += cantidad;
             bolivaresEnCaja -= cantidad;
             pesosEnCaja += precioDeVenta * cantidad;
             puedeVender = true;
        }
        return puedeVender;
    }//fin venderBolivares
    
    public float getImpuestos(){
        return getBolivaresVendidos() * precioDeVenta * 0.16f;
    }//fin getImpuestos
    
    public float getGanancias() {
        return  getPesosEnCaja() - getImpuestos();
    }//fin getGanancias
    
    public void inyectarPesos(int cantidad) {
        if(cantidad > 0) pesosEnCaja += cantidad;
    }//fin inyectarPesos
    
    public void inyectarBolivares(int cantidad) {
        if(cantidad > 0) bolivaresEnCaja += cantidad;
    }

}//End class

