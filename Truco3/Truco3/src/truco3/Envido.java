
package truco3;

import javax.swing.JOptionPane;
import static truco3.Opciones.opciones3;
import static truco3.Opciones.opciones4;
import static truco3.Opciones.opciones5;
import static truco3.Opciones.opciones6;
import static truco3.Opciones.opciones7;

public class Envido {
    public static int tipoEnvido=0;
    
    public static void envido(Jugadoor uno,Jugadoor dos){
        int puntos=0;
        puntos=cantarEnvido(uno,dos);
        if (dos.cEnv==true && uno.cEnv==false){
            dos.puntos+=puntos;
        }
        if (uno.cEnv==true && dos.cEnv==false){
            uno.puntos+=puntos;
        }
        if (dos.cEnv==true && uno.cEnv==true){
            //System.out.println("Envido de "+persona1.nombre+" "+persona1.puntosEnv);
            JOptionPane.showMessageDialog(null, "Envido de "+dos.nombre+": "+dos.puntosEnv+
                    "\nEnvido de "+uno.nombre+": "+uno.puntosEnv );
            //System.out.println("Envido de "+persona2.nombre+" "+persona2.puntosEnv);
            if (dos.puntosEnv>=uno.puntosEnv){
            JOptionPane.showMessageDialog(null, "Gano el envido "+dos.nombre);
                dos.puntos+=puntos;
            }else{
                uno.puntos+=puntos;
            JOptionPane.showMessageDialog(null, "Gano el envido "+uno.nombre);
            }
        }
        
    } 
    
    
    
    
    
    
    public static int sumarPuntos(Cartas []cartas){
        int valor=0;
        int valorM=0;
            if(cartas[0].pinta==cartas[1].pinta){
                valor=valorCartasEnv(cartas[0])+valorCartasEnv(cartas[1])+20;
                if(valorM<valor)valorM=valor;
            }
             if(cartas[0].pinta==cartas[2].pinta){
                valor=valorCartasEnv(cartas[0])+valorCartasEnv(cartas[2])+20;
                if(valorM<valor)valorM=valor;
            }
             if(cartas[1].pinta==cartas[2].pinta){
                valor=valorCartasEnv(cartas[1])+valorCartasEnv(cartas[2])+20;
                if(valorM<valor)valorM=valor;
            }
            
            if(valorM==0){
                for(int i=0;i<cartas.length;i++){
                valor=valorCartasEnv(cartas[i]);
                if (valorM<valor)valorM=valor;
                
                }
            }
    return valorM;
    }    
    public static int valorCartasEnv(Cartas carta){
        int valor=0;
        switch(carta.numero){
            case 1:valor=1;break;
            case 2:valor=2;break;
            case 3:valor=3;break;
            case 4:valor=4;break;
            case 5:valor=5;break;
            case 6:valor=6;break;
            case 7:valor=7;break;
            case 10:valor=0;break;
            case 11:valor=0;break;
            case 12:valor=0;break;
    
        }
    return valor;    
    }  
    public static int cantarEnvido(Jugadoor uno,Jugadoor dos){
        int puntos=0;
        
        if(tipoEnvido==0){
            if(uno.persona==false){
                tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, 0, 0, uno, Mano.mazo);
            }else{
                 tipoEnvido=opciones5("Salir","Envido","Real envido","Falta envido",uno.nombre);
            }
        
        if(tipoEnvido==1){
            tipoEnvido=0;
        }
        if(tipoEnvido != 0 && tipoEnvido !=1){
        uno.cEnv=true;
        //persona1.cEnv=false;//-------------verificar
        puntos=responderEnvido(dos,uno);
        }}
    return puntos;
    }
    
    
    
    
    
    public static int responderEnvido(Jugadoor persona1,Jugadoor compu){
        int env=1;
        int renv=1;
        int puntos=0;
        int puntosAnt=0;
        
    while(tipoEnvido!=1 || tipoEnvido!=5){
        switch (tipoEnvido){

            
        case 1:{
            
        break;}
        case 2:{
           // System.out.println("--------------");
            puntosAnt=puntosEnvido(tipoEnvido);
            env++;
        if (env<=3){
            if(persona1.cEnv==true){
                if(compu.persona==false)tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, env, renv, compu, Mano.mazo);
                else tipoEnvido=opciones6("No quiero","Envido","Real envido","Falta envido","Quiero","Jugador "+compu.nombre); }
            else {
                if(persona1.persona==false)tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, env, renv, persona1, Mano.mazo);
                else tipoEnvido=opciones6("No quiero","Envido","Real envido","Falta envido","Quiero","Jugador "+persona1.nombre);
            
            }
            if (persona1.cEnv==true){
                
                compu.cEnv=true;
                persona1.cEnv=false;
            }
            else {
                persona1.cEnv=true;
                compu.cEnv=false;
            }
        }
        else{
            if(persona1.cEnv==true){
                if(compu.persona==false)tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, env, renv, compu, Mano.mazo);
                else tipoEnvido=opciones5("No quiero","Real envido","Falta envido","Quiero","Jugador "+compu.nombre); }
            else {
                if(persona1.persona==false)tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, env, renv, persona1, Mano.mazo);
                else tipoEnvido=opciones5("No quiero","Real envido","Falta envido","Quiero","Jugador "+persona1.nombre);
            
            }   
            if(tipoEnvido==2)tipoEnvido=3;
                else if(tipoEnvido==3)tipoEnvido=4;
                else if(tipoEnvido==4)tipoEnvido=5;
            if (persona1.cEnv==true){
                compu.cEnv=true;
                persona1.cEnv=false;
            }
            else {
                persona1.cEnv=true;
                compu.cEnv=false;
            }
        }
        break;}
        //Fin caso 2--------------------------------
        case 3:{
            puntosAnt=tipoEnvido;
            renv++;
            if (renv<=3){
            if(persona1.cEnv==true){
                if(compu.persona==false)tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, env, renv, compu, Mano.mazo);
                else tipoEnvido=opciones5("No quiero","Real envido","Falta envido","Quiero","Jugador "+compu.nombre); }
            else {
                if(persona1.persona==false)tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, env, renv, persona1, Mano.mazo);
                else tipoEnvido=opciones5("No quiero","Real envido","Falta envido","Quiero","Jugador "+persona1.nombre);
            
            }
                
                if(tipoEnvido==2)tipoEnvido=3;
                else if(tipoEnvido==3)tipoEnvido=4;
                else if(tipoEnvido==4){
                    tipoEnvido=5;
                }
            if (persona1.cEnv==true){
                compu.cEnv=true;
                persona1.cEnv=false;
            }
            else {
                persona1.cEnv=true;
                compu.cEnv=false;
            }
            }  else{
            if(persona1.cEnv==true){
                if(compu.persona==false)tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, env, renv, compu, Mano.mazo);
                else tipoEnvido=opciones4("No quiero","Falta envido","Quiero","Jugador "+compu.nombre); }
            else {
                if(persona1.persona==false)tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, env, renv, persona1, Mano.mazo);
                else tipoEnvido=opciones4("No quiero","Falta envido","Quiero","Jugador "+persona1.nombre);
            
            }
                if(tipoEnvido==2)tipoEnvido=4;
                else if(tipoEnvido==3)tipoEnvido=5;
            if (persona1.cEnv==true){
                compu.cEnv=true;
                persona1.cEnv=false;
            }
            else {
                persona1.cEnv=true;
                compu.cEnv=false;
            }
        }     
            break;}
        case 4:{
            puntosAnt=30;
            if(persona1.cEnv==true){
                if(compu.persona==false)tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, env, renv, compu, Mano.mazo);
                else tipoEnvido=opciones3("No quiero","Quiero","Jugador "+compu.nombre); }
            else {
                if(persona1.persona==false)tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, env, renv, persona1, Mano.mazo);
                else tipoEnvido=opciones3("No quiero","Quiero","Jugador "+persona1.nombre);
            
            }
            if (tipoEnvido==2)tipoEnvido=5;
            if (persona1.cEnv==true){
                compu.cEnv=true;
                persona1.cEnv=false;
            }
            else {
                persona1.cEnv=true;
                compu.cEnv=false;
            }
        break;
    }

        case 5:{

        break;}
        
    }   if (puntos==0)puntos=1;
        if(tipoEnvido!=1 ){
            if(puntos==1){
                puntos=0;
            }
            puntos+=puntosAnt;
        }
        if(persona1.cEnv==true && tipoEnvido==1){
         persona1.cEnv=false;   
         compu.cEnv=true;   
        }
        if(compu.cEnv==true && tipoEnvido==1){
            persona1.cEnv=true;
            compu.cEnv=false;
        }
        if(tipoEnvido==5){
            compu.cEnv=true;
            persona1.cEnv=true;
        }  
        if(tipoEnvido==1 || tipoEnvido==5)break;
        
} 

    return puntos;
    }
    
    
    
    public static int puntosEnvido(int valor){
        int puntos=0;
        switch(valor){
            case 1:
            break;
            case 2:
                puntos=2;
            break;
            case 3:
                puntos=3;
            break;
            case 4:
                puntos=30;
            break;
            case 5:
                puntos=6;
            break;
        }
        return puntos;
        
    }
}