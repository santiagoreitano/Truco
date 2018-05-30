
package truco3;

import static truco3.Computadora.cantarTrucoCompu;
import static truco3.Computadora.respTruco;
import static truco3.Mano.jugadas;
import static truco3.Opciones.opciones3;
public class Truco {
    public static int tipTruco=0;
    //public static int puntos;
    
    
    
    public static void trucOo(Jugador persona1, Jugador persona2){
        int salida=0;
        if(persona1.cTruco==false  ){
            if(jugadas[0]!=null ||Envido.tipoEnvido !=0){
        if (tipTruco==0){
            
            tipTruco=opciones3("Salir","Truco","Jugador :"+persona1.nombre);
            if(tipTruco==1)tipTruco=0;
            if(tipTruco==2){
                persona1.cTruco=true;
                persona2.cTruco=false;
                tipTruco=respTruco( persona2);
                    if(tipTruco==1){
                        persona2.salida=1;
                    }    
            }
        }else if(tipTruco==2){
            tipTruco=opciones3("Salir","ReTruco","Jugador :"+persona1.nombre);
            if(tipTruco==2){
                persona1.cTruco=true;
                persona2.cTruco=false;
                tipTruco=respTruco( persona2);
                if(tipTruco==1)persona2.salida=1;
                if(tipTruco==2)tipTruco=3;
            }
            if(tipTruco==1)tipTruco=2;
        }else if(tipTruco==3){
            tipTruco=opciones3("Salir","Vale cuatro","Jugador :"+persona1.nombre);
            if(tipTruco==1)tipTruco=3;
            if(tipTruco==2){
                persona1.cTruco=true;
                persona2.cTruco=false;
                tipTruco=respTruco( persona2);
                if(tipTruco==1)persona2.salida=1;
                if(tipTruco==2){
                    tipTruco=4;
                }
            }    
        }
        }}


    }
    public static void trucOo(Computadora compu, Jugador persona2,int turno){
        //int salida=0;
        
        if(jugadas[0]!=null ||Envido.tipoEnvido !=0){
        if (tipTruco==0){
            if(compu.cTruco==false && compu.turno==1){
            tipTruco=cantarTrucoCompu(tipTruco,compu);
            if(tipTruco==1)tipTruco=0;
            else{
            compu.cTruco=true;
            persona2.cTruco=false;
            tipTruco=respTruco(persona2);
            if(tipTruco==1)persona2.salida=1;
            }
            }else if(persona2.cTruco==false && persona2.turno==1){
            tipTruco=opciones3("Salir","Truco","Jugador :"+persona2.nombre);
            if(tipTruco==1)tipTruco=0;
            else{
            persona2.cTruco=true;
            compu.cTruco=false;
            tipTruco=Computadora.respTruco(compu, tipTruco);
            if(tipTruco==1)compu.salida=1;
            }
            }   
            //------------------------------
        }else if(tipTruco==2){
            if(compu.cTruco==false && compu.turno==1){
                tipTruco=cantarTrucoCompu(tipTruco, compu);
                if (tipTruco==1)tipTruco=2;
                else if(tipTruco==2){
                compu.cTruco=true;
                persona2.cTruco=false;
                tipTruco=respTruco( persona2);
                if(tipTruco==1){
                    tipTruco=2;
                    persona2.salida=1;
                }
                if(tipTruco==2)tipTruco=3;   
                }
            }if (persona2.cTruco==false && persona2.turno==1){
            tipTruco=opciones3("Salir","ReTruco","Jugador :"+persona2.nombre);
            if(tipTruco==1)tipTruco=2;
            else if(tipTruco==2){
            compu.cTruco=false;
            persona2.cTruco=true; 
            tipTruco=Computadora.respTruco(compu,tipTruco);
            if(tipTruco==1){
                tipTruco=2;
                persona2.salida=1;
            }
            if(tipTruco==2)tipTruco=3;   
            }
            }
        }
        
        else if(tipTruco==3){
            if(compu.cTruco==false && turno==2){
                tipTruco=cantarTrucoCompu(tipTruco, compu);
                if(tipTruco==1)tipTruco=3;
                else if(tipTruco==2){
                compu.cTruco=true;
                persona2.cTruco=false;
                tipTruco=respTruco( persona2);
                if(tipTruco==1){
                    tipTruco=3;
                    persona2.salida=1;
                }
                if(tipTruco==2){
                    tipTruco=4;
                }        
                }
            }else{
            tipTruco=opciones3("Salir","Vale cuatro","Jugador :"+persona2.nombre);
            if(tipTruco==1)tipTruco=3;
            else if(tipTruco==2){
                compu.cTruco=false;
                persona2.cTruco=true;
                tipTruco=Computadora.respTruco(compu, tipTruco);
                if(tipTruco==1){
                    tipTruco=3;
                    compu.salida=1;
                }
                if(tipTruco==2){
                    tipTruco=4;
                }    
            }
            }
    
        }
        }


    }
    public static int respTruco(Jugador persona1){
       int z=opciones3("No quiero","Quiero","Jugador: "+persona1.nombre);

        return z;

        }   
    public static Jugador jugador(Jugador persona1,Jugador persona2){
        Jugador resul;
        if(persona1.cTruco==false && persona2.cTruco==false)resul=persona1;
        else if(persona1.cTruco==true)resul=persona2;
        else resul=persona1;
        //if(persona1.cTruco==persona2.cTruco)System.out.println("-------------Error--------------(Truco-Jugador)");
    return resul;
}


}