
class MaquinaCafetera { 

    int cafe;
    int azucar;
    int vasos;
    int precioBaseCafe;
    int egresos;
    int ingresos;
    int gananciasBrutas;
    int impuestos;
    int gananciasNetas;
    
    MaquinaCafetera(){

    }

    MaquinaCafetera(int cantidadInicialCafe, int cantidadInicialAzucar, int cantidadInicialVasos){
        this.cafe = cantidadInicialCafe;
        this.azucar = cantidadInicialAzucar;
        this.vasos = cantidadInicialVasos;
    }

    public int getCafe(){
        return cafe;
    }

    public void setCafe(int cafe){
        this.cafe = cafe;
    }

    public int getAzucar(){
        return azucar;
    }

    public void setAzucar(int azucar){
        this.azucar = azucar;
    }

    public int getVasos(){
        return vasos;
    }

    public void setVasos(int vasos){
        this.vasos = vasos;
    }

    public int getPrecioBaseCafe(){
        return precioBaseCafe;
    }

    public void setPrecioBaseCafe(int precioBaseCafe){
        this.precioBaseCafe =precioBaseCafe;
    }

    public int getEgresos(){
        return egresos;
    }

    public void setEgresos(int egresos){
        this.egresos = egresos;
    }

    public int getIngresos(){
        return ingresos;
    }

    public void setIngresos(int ingresos){
        this.ingresos = ingresos;
    }

    public int getGananciasBrutas(){
        return gananciasBrutas;
    }

    public void setGananciasBrutas(int gananciasBrutas){
        this.gananciasBrutas = gananciasBrutas;
    }

    public int getImpuestos(){
        return impuestos;
    }

    public void setImpuestos(int impuestos){
        this.impuestos = impuestos;
    }

    public int getGananciasNetas(){
        return gananciasNetas;
    }

    public void setGananciasNetas(int gananciasNetas){
        this.gananciasNetas = gananciasNetas;
    }

    public int calcularPrecio(int tipoCafe, int cantidadAzucar)
    {
        int precio = (getPrecioBaseCafe() * getCantidadCafe(tipoCafe))/1000;
        precio = precio + (precio * getCantidadAzucar(cantidadAzucar))/100;     
        precio = (precio * 115)/100;
        return precio;     
    }
  
    public int getCantidadCafe(int tipoCafe)
    {
        return tipoCafe * 55;
    }
  
    public int getCantidadAzucar(int tipoAzucar)
    {
      return 5 * (tipoAzucar-1);
    }

  

    public boolean recargarCafe(int cantidadCafe, int costoCompraCafe)
    {
        boolean puedeRecargar = false;
        if(costoCompraCafe * cantidadCafe <= getGananciasNetas())
        {
            setCafe(getCafe() + cantidadCafe);
            setEgresos(getEgresos() + costoCompraCafe);
            puedeRecargar = true;
            registrarFactura(0);
        }
        return puedeRecargar;
    }

    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) 
    {
        boolean puedeRecargar = false;
        if(costoCompraAzucar * cantidadAzucar <= getGananciasNetas())
        {
            setAzucar(getAzucar() + cantidadAzucar);
            setEgresos(getEgresos() + cantidadAzucar );
            puedeRecargar = true;
            registrarFactura(0);
        }
        return puedeRecargar;
    }

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) 
    {
        boolean puedeRecargar = false;
        if(costoCompraVasos * cantidadVasos <= getGananciasNetas())
        {
            setVasos(getVasos() + cantidadVasos);
            setEgresos(getEgresos() + cantidadVasos );
            puedeRecargar = true;
            registrarFactura(0);
        }
        return puedeRecargar;

    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) 
    {
        boolean puedePreparar= false;
      
        if(getCantidadCafe(tipoCafe) <= getCafe() && getVasos() >= 1 &&
           getCantidadAzucar(cantidadAzucar) <= getAzucar())
        {
            cafe -= getCantidadCafe(tipoCafe);
            azucar -= getCantidadAzucar(cantidadAzucar);
            vasos --;
            puedePreparar = true;
        }
        return puedePreparar;
    }

    public void registrarFactura(int valorFactura) {
        setIngresos(getIngresos() + valorFactura);
        setGananciasBrutas(getIngresos() - getEgresos());
        setImpuestos((getIngresos() * 16)/100);
        setGananciasNetas(getGananciasBrutas() - getImpuestos());
    }

}
