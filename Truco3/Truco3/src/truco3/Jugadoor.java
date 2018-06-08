
package truco3;

public class Jugadoor {
    public  String nombre;
    public int puntos;
    public int turno;
    public  Cartas[] mazo=new Cartas[3];
    public int puntosEnv=0;
    public boolean cEnv=false;
    public boolean cTruco=false;
    public int salida=0;
    public int manos=0;
    public boolean persona;
    public Cartas[]jugadas={new Cartas(0,0),new Cartas(0,0),new Cartas(0,0)};
    public Cartas[]mazoCompleto=new Cartas[40];
    
}
