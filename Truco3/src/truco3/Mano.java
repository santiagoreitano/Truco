
package truco3;

import javax.swing.JOptionPane;
import static truco3.Envido.sumarPuntos;
import static truco3.Mano1.mano1;
import static truco3.Mano1.mano2;
import static truco3.Mano1.mano3;
import static truco3.Mazo.mostrarMazo;
import static truco3.Mazo.repartir;


public class Mano {
        //static boolean trucoCantado=false;
        static Cartas[]mazo=new Cartas[40];
        static Cartas[]jugadas={new Cartas(0,0),new Cartas(0,0),new Cartas(0,0),new Cartas(0,0),new Cartas(0,0),new Cartas(0,0)};
        static int mano1=0;
    public static void manO(Jugador persona1,Jugador persona2){
        int manoJugJ=0;
//Selecciona quien es mano
       if(persona1.turno==0 || persona1.turno==2){
           persona1.turno=1;
           persona2.turno=2;
           manoJugJ=1;
       }else{
           manoJugJ=2;
           persona1.turno=2;
           persona2.turno=1;
       } 
           
        repartir(mazo,jugadas,persona1,persona2);
        System.out.println(persona1.nombre);
        mostrarMazo(persona1.mazo);
        System.out.println(persona2.nombre);
        mostrarMazo(persona2.mazo);
        persona1.puntosEnv=sumarPuntos(persona1.mazo);
        persona2.puntosEnv=sumarPuntos(persona2.mazo);
//------------------------------Mano------------------------------------------
        System.out.println("--------------------mano1---------------");
        mano1(persona1,persona2,jugadas);
        System.out.println(persona1.nombre+" "+persona1.manos);
        System.out.println(persona2.nombre+" "+persona2.manos);
        if(persona1.salida!=1 &&persona2.salida!=1){
        System.out.println("--------------------mano2---------------");
        mano2(persona1,persona2,jugadas);
        System.out.println(persona1.nombre+" "+persona1.manos);
        System.out.println(persona2.nombre+" "+persona2.manos);
        if(persona1.salida!=1 &&persona2.salida!=1){
        if(persona1.manos==1 && persona2.manos==0 || persona1.manos==0 && persona2.manos==1 || persona1.manos==2 || persona2.manos==2 ){}
        else{
        System.out.println("--------------------mano3---------------");
        mano3(persona1,persona2,jugadas);
        }}else if(persona1.salida==1){
            persona2.manos=4;
        }else persona1.manos=4;
        }else if(persona1.salida==1){
            persona2.manos=4;
        }else persona1.manos=4;
        System.out.println("--------------------mano3---------------");
       // System.out.println(Truco.tipTruco);
        
//------------------------------Ganador Mano------------------------------------------
        if(Truco.tipTruco==0)Truco.tipTruco=1;
        if(persona1.manos>persona2.manos){
            persona1.puntos+=Truco.tipTruco;
            JOptionPane.showMessageDialog(null, "La mano completa la gano "+persona1.nombre);
        }else if(persona1.manos<persona2.manos) {
            persona2.puntos+=Truco.tipTruco;
            JOptionPane.showMessageDialog(null, "La mano completa la gano "+persona2.nombre);
        }else if(persona1.manos==0 && persona2.manos==0){
            if(manoJug==1){
                persona1.puntos+=Truco.tipTruco;
            JOptionPane.showMessageDialog(null, "La mano completa la gano "+persona1.nombre);
            }else if(manoJug==2){
                persona2.puntos+=Truco.tipTruco;
            JOptionPane.showMessageDialog(null, "La mano completa la gano "+persona2.nombre);
            }
        }else if(persona1.manos==persona2.manos){
            if(mano1==1){
                persona1.puntos+=Truco.tipTruco;
            JOptionPane.showMessageDialog(null, "La mano completa la gano "+persona1.nombre);
            }else if(mano1==2){
                persona2.puntos+=Truco.tipTruco;
            JOptionPane.showMessageDialog(null, "La mano completa la gano "+persona2.nombre);
                
            }
        }
//-------------------------------Variables que uso como bool--------------------
        Truco.tipTruco=0;
        Envido.tipoEnvido=0;
        persona1.salida=0;
        persona2.salida=0;
        for(int i=0;i<jugadas.length;i++){
            jugadas[i]=null;
        }
        persona1.cEnv=false;
        persona1.cTruco=false;
        persona1.manos=0;
        persona2.cEnv=false;
        persona2.cTruco=false;
        persona2.manos=0;
        mano1=0;
        
    }
    static int manoJug=0;//Quien es mano, en cvj
    public static void manO(Jugador persona,Computadora compu){

        if(manoJug==0 || manoJug==2){
            manoJug=1;
            persona.turno=1;
            compu.turno=2;
        }
        else {
            manoJug=2;
            persona.turno=2;
            compu.turno=1;
        }
        
        repartir(mazo, jugadas, persona, compu);
        System.out.println(persona.nombre);
        mostrarMazo(persona.mazo);
        //System.out.println(compu.nombre);
        //mostrarMazo(compu.mazo);
        persona.puntosEnv=sumarPuntos(persona.mazo);
        compu.puntosEnv=sumarPuntos(compu.mazo);
        //------------------------------Mano------------------------------------------
        System.out.println("--------------------mano1---------------");
        mano1(persona,compu,jugadas);
        if(persona.salida!=1 && compu.salida!=1){
        System.out.println("--------------------mano2---------------");
        mano2(persona, compu, jugadas);   
        if(persona.salida!=1 &&compu.salida!=1){
        if(persona.manos==1 && compu.manos==0 || persona.manos==0 && compu.manos==1 || persona.manos==2 || compu.manos==2 ){}
        else{
        System.out.println("--------------------mano3---------------");
        mano3(persona,compu,jugadas);
        }}else if(persona.salida==1){
            compu.manos=4;
        }else persona.manos=4;
        }else if(persona.salida==1){
            compu.manos=4;
        }else persona.manos=4;
                System.out.println("--------------------mano3---------------");
        //------------------------------Ganador Mano------------------------------------------        
        if(Truco.tipTruco==0)Truco.tipTruco=1;
        if(persona.manos>compu.manos){
        persona.puntos+=Truco.tipTruco;
        JOptionPane.showMessageDialog(null, "La mano completa la gano "+persona.nombre);
        }else if(persona.manos<compu.manos) {
            compu.puntos+=Truco.tipTruco;
            JOptionPane.showMessageDialog(null, "La mano completa la gano "+compu.nombre);
        }else if(persona.manos==0 && compu.manos==0){
            if(manoJug==1){
                persona.puntos+=Truco.tipTruco;
            JOptionPane.showMessageDialog(null, "La mano completa la gano "+persona.nombre);
            }else if(manoJug==2){
                compu.puntos+=Truco.tipTruco;
            JOptionPane.showMessageDialog(null, "La mano completa la gano "+compu.nombre);
            }}else if(persona.manos==compu.manos){
            if(mano1==1){
                persona.puntos+=Truco.tipTruco;
            JOptionPane.showMessageDialog(null, "La mano completa la gano "+persona.nombre);
            }else if(mano1==2){
                compu.puntos+=Truco.tipTruco;
            JOptionPane.showMessageDialog(null, "La mano completa la gano "+compu.nombre);
                
            }
            }

        //-------------------------------Variables que uso como bool--------------------
        Truco.tipTruco=0;
        Envido.tipoEnvido=0;
        persona.salida=0;
        compu.salida=0;
        for(int i=0;i<jugadas.length;i++){
            jugadas[i]=new Cartas(0,0);
        }
        persona.cEnv=false;
        persona.cTruco=false;
        persona.manos=0;
        compu.cEnv=false;
        compu.cTruco=false;
        compu.manos=0;
        mano1=0;
        //mostrarMazo(prueba);
    
    
    }
 
}
