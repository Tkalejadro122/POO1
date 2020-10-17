/**
 * Un ejemplo que modela un Triangulo usando POO
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Triangulo {

    //COMPLETE las tres propiedades
    protected float lado1;
    protected float lado2;
    protected float lado3;

    public Triangulo() {
    }

    public Triangulo(float lado1, float lado2, float lado3) {
        //COMPLETE
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /*complete GET/SET*/
    public float getLado1()
    {
        return lado1;
    }
    public void setLado1(float lado1)
    {
        this.lado1=lado1;
    }
    
        public float getLado2()
    {
        return lado2;
    }
    public void setLado2(float lado2)
    {
        this.lado2=lado2;
    }
    
        public float getLado3()
    {
        return lado3;
    }
    public void setLado3(float lado3)
    {
        this.lado3=lado3;
    }
    
    public String getTipo() {
     String tipo = "Desconocido";

     if(lado1==lado2 && lado2==lado3 && lado1==lado3)
      tipo = "Equilatero";
     else {
      if(lado1!=lado2 && lado2!=lado3 && lado1!=lado3)
        tipo = "Escaleno";
      else
        tipo = "Isosceles";
      if(esRectangulo())
       tipo = tipo + " Rectángulo";
     }//fin else
     
     return tipo;
    }//fin método getTipo
    
    public float mayor()
    {
        float m=0;
        if(getLado1()>m) m=getLado1();
        if(getLado2()>m) m=getLado2();
        if(getLado3()>m) m=getLado3();
        return m;
    }
    
    public boolean esRectangulo()
    {
        boolean es = false;
        float m= mayor();
        float c1= 0;
        float c2= 0;
        
        if(getLado1() == m)
        {
            c1 = getLado2();
            c2 = getLado3();
        }
        else if(getLado2() == m)
        {
            c1 = getLado1();
            c2 = getLado3();
        }
        else
        {
            c1= getLado1();
            c2 = getLado2();
        }
        
        if(c1*c1+c2*c2 == m*m) es = true;
        
        return es;
    }//fin método esRectangulo
    
}//fin clase Triangulo

