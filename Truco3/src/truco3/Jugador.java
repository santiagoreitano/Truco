
package truco3;

import static truco3.Envido.sumarPuntos;

public class Jugador {
    public  String nombre;
    public int puntos;
    public int turno;
    public  Cartas[] mazo=new Cartas[3];
    public int puntosEnv=0;
    public boolean cEnv=false;
    public boolean cTruco=false;
    public int salida=0;
    public int manos=0;
    
}
