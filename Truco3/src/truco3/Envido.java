
package truco3;

import javax.swing.JOptionPane;
import static truco3.Opciones.opciones3;
import static truco3.Opciones.opciones4;
import static truco3.Opciones.opciones5;
import static truco3.Opciones.opciones6;
import static truco3.Opciones.opciones7;

public class Envido {
    public static int tipoEnvido=0;
    
    public static void envido(Jugador persona1,Jugador persona2){
        int puntos=0;
        puntos=cantarEnvido(persona1,persona2);
        if (persona1.cEnv==true && persona2.cEnv==false){
            persona1.puntos+=puntos;
        }
        if (persona2.cEnv==true && persona1.cEnv==false){
            persona2.puntos+=puntos;
        }
        if (persona1.cEnv==true && persona2.cEnv==true){
            //System.out.println("Envido de "+persona1.nombre+" "+persona1.puntosEnv);
            JOptionPane.showMessageDialog(null, "Envido de "+persona1.nombre+": "+persona1.puntosEnv+
                    "\nEnvido de "+persona2.nombre+": "+persona2.puntosEnv );
            //System.out.println("Envido de "+persona2.nombre+" "+persona2.puntosEnv);
            if (persona1.puntosEnv>=persona2.puntosEnv){
            JOptionPane.showMessageDialog(null, "Gano el envido "+persona1.nombre);
                persona1.puntos+=puntos;
            }else{
                persona2.puntos+=puntos;
            JOptionPane.showMessageDialog(null, "Gano el envido "+persona2.nombre);
            }
        }
        
    }    
    public static void envido(Jugador persona1,Computadora compu){
        int puntos=0;
        puntos=cantarEnvido(persona1,compu);
        if (persona1.cEnv==true && compu.cEnv==false){
            persona1.puntos+=puntos;
        }
        if (compu.cEnv==true && persona1.cEnv==false){
            compu.puntos+=puntos;
        }
        if (persona1.cEnv==true && compu.cEnv==true){
            //System.out.println("Envido de "+persona1.nombre+" "+persona1.puntosEnv);
            JOptionPane.showMessageDialog(null, "Envido de "+persona1.nombre+": "+persona1.puntosEnv+
                    "\nEnvido de "+compu.nombre+": "+compu.puntosEnv );
            //System.out.println("Envido de "+persona2.nombre+" "+persona2.puntosEnv);
            if (persona1.puntosEnv>=compu.puntosEnv){
            JOptionPane.showMessageDialog(null, "Gano el envido "+persona1.nombre);
                persona1.puntos+=puntos;
            }else{
                compu.puntos+=puntos;
            JOptionPane.showMessageDialog(null, "Gano el envido "+compu.nombre);
            }
        }
        
    }    
    public static void envido(Computadora compu,Jugador persona1){
        int puntos=0;
        puntos=cantarEnvido(compu,persona1);
        if (persona1.cEnv==true && compu.cEnv==false){
            persona1.puntos+=puntos;
        }
        if (compu.cEnv==true && persona1.cEnv==false){
            compu.puntos+=puntos;
        }
        if (persona1.cEnv==true && compu.cEnv==true){
            //System.out.println("Envido de "+persona1.nombre+" "+persona1.puntosEnv);
            JOptionPane.showMessageDialog(null, "Envido de "+persona1.nombre+": "+persona1.puntosEnv+
                    "\nEnvido de "+compu.nombre+": "+compu.puntosEnv );
            //System.out.println("Envido de "+persona2.nombre+" "+persona2.puntosEnv);
            if (persona1.puntosEnv>=compu.puntosEnv){
            JOptionPane.showMessageDialog(null, "Gano el envido "+persona1.nombre);
                persona1.puntos+=puntos;
            }else{
                compu.puntos+=puntos;
            JOptionPane.showMessageDialog(null, "Gano el envido "+compu.nombre);
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
    public static int cantarEnvido(Jugador persona1,Jugador persona2){
        int puntos=0;
        
        if(tipoEnvido==0){
        tipoEnvido=opciones5("Salir","Envido","Real envido","Falta envido",persona1.nombre);
        if(tipoEnvido==1){
            tipoEnvido=0;
        }
        if(tipoEnvido != 0 && tipoEnvido !=1){
        persona1.cEnv=true;
        puntos=responderEnvido(persona1,persona2);
        }}
    return puntos;
    }
    public static int cantarEnvido(Jugador persona1,Computadora compu){
        int puntos=0;
        if(tipoEnvido==0){
        tipoEnvido=opciones5("Salir","Envido","Real envido","Falta envido",persona1.nombre);
        if(tipoEnvido==1){
            tipoEnvido=0;
        }
        if(tipoEnvido != 0 && tipoEnvido !=1){
        persona1.cEnv=true;
        //compu.cEnv=false;//----------------------------verificar
        puntos=responderEnvido(persona1,compu);
        }}
    return puntos;
    }
    public static int cantarEnvido(Computadora compu,Jugador persona1){
        int puntos=0;
        
        if(tipoEnvido==0){
        tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, 0, 0, compu, Mano.mazo, Mano.jugadas);
        if(tipoEnvido==1){
            tipoEnvido=0;
        }
        if(tipoEnvido != 0 && tipoEnvido !=1){
        compu.cEnv=true;
        //persona1.cEnv=false;//-------------verificar
        puntos=responderEnvido(persona1,compu);
        }}
    return puntos;
    }
    public static int responderEnvido(Jugador persona1,Jugador persona2){
        int env=1;
        int renv=1;
        int puntos=0;
        int puntosAnt=0;
    while(tipoEnvido!=1 || tipoEnvido!=5){
        switch (tipoEnvido){
        case 1:{
        break;}
        case 2:{
            puntosAnt=puntosEnvido(tipoEnvido);
            env++;
        if (env<=3){
            tipoEnvido=opciones6("No quiero","Envido","Real envido","Falta envido","Quiero","Jugador "+jugador(persona1,persona2));
            if (persona1.cEnv==true){
                persona2.cEnv=true;
                persona1.cEnv=false;
            }
            else {
                persona1.cEnv=true;
                persona2.cEnv=false;
            }
        }
        else{
            tipoEnvido=opciones5("No quiero","Real envido","Falta envido","Quiero","Jugador "+jugador(persona1,persona2));
                if(tipoEnvido==2)tipoEnvido=3;
                else if(tipoEnvido==3)tipoEnvido=4;
                else if(tipoEnvido==4)tipoEnvido=5;
            if (persona1.cEnv==true){
                persona2.cEnv=true;
                persona1.cEnv=false;
            }
            else {
                persona1.cEnv=true;
                persona2.cEnv=false;
            }
        }
        break;}
        //Fin caso 2--------------------------------
        case 3:{
            puntosAnt=tipoEnvido;
            renv++;
            if (renv<=3){
                
            tipoEnvido=opciones5("No quiero","Real envido","Falta envido","Quiero","Jugador "+jugador(persona1,persona2));
                if(tipoEnvido==2)tipoEnvido=3;
                else if(tipoEnvido==3)tipoEnvido=4;
                else if(tipoEnvido==4)tipoEnvido=5;
            if (persona1.cEnv==true){
                persona2.cEnv=true;
                persona1.cEnv=false;
            }
            else {
                persona1.cEnv=true;
                persona2.cEnv=false;
            }
            }else{
                tipoEnvido=opciones4("No quiero","Falta envido","Quiero","Jugador "+jugador(persona1,persona2));
                if(tipoEnvido==2)tipoEnvido=4;
                else if(tipoEnvido==3)tipoEnvido=5;
            if (persona1.cEnv==true){
                persona2.cEnv=true;
                persona1.cEnv=false;
            }
            else {
                persona1.cEnv=true;
                persona2.cEnv=false;
            }
                }   
            break;}
        case 4:{
            puntosAnt=30;
            tipoEnvido=opciones3("No quiero","Quiero","Jugador "+jugador(persona1,persona2));
            if (tipoEnvido==2)tipoEnvido=5;
            if (persona1.cEnv==true){
                persona2.cEnv=true;
                persona1.cEnv=false;
            }
            else {
                persona1.cEnv=true;
                persona2.cEnv=false;
            }
        break;}
        

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
         persona2.cEnv=true;   
        }
        if(persona2.cEnv==true && tipoEnvido==1){
            persona1.cEnv=true;
            persona2.cEnv=false;
        }
        if(tipoEnvido==5){
            persona2.cEnv=true;
            persona1.cEnv=true;
        }  
        if(tipoEnvido==1 || tipoEnvido==5)break;
        
} 

    return puntos;
    }
    public static int responderEnvido(Jugador persona1,Computadora compu){
        int env=1;
        int renv=1;
        int puntos=0;
        int puntosAnt=0;
        
    while(tipoEnvido!=1 || tipoEnvido!=5){
        switch (tipoEnvido){

            
        case 1:{
            
        break;}
        case 2:{
            puntosAnt=puntosEnvido(tipoEnvido);
            env++;
        if (env<=3){
            if(persona1.cEnv==true){
                //System.out.println(compu.cEnv);
            tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, env, renv, compu, Mano.mazo, Mano.jugadas);}
            else {
            tipoEnvido=opciones6("No quiero","Envido","Real envido","Falta envido","Quiero","Jugador "+persona1.nombre);
            
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
            tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, env, renv, compu, Mano.mazo, Mano.jugadas);

            }else{
            tipoEnvido=opciones5("No quiero","Real envido","Falta envido","Quiero","Jugador "+jugador(persona1,compu));
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
            tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, env, renv, compu, Mano.mazo, Mano.jugadas);
                System.out.println(tipoEnvido);
            }else if(compu.cEnv==true){
            tipoEnvido=opciones5("No quiero","Real envido","Falta envido","Quiero","Jugador "+jugador(persona1,compu));
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
                tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, env, renv, compu, Mano.mazo, Mano.jugadas);

            }   else if(compu.cEnv==true){
                tipoEnvido=opciones4("No quiero","Falta envido","Quiero","Jugador "+jugador(persona1,compu));
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
            tipoEnvido=Computadora.responderEnvidoCompu(tipoEnvido, env, renv, compu, Mano.mazo, Mano.jugadas);
   
            }else{
            tipoEnvido=opciones3("No quiero","Quiero","Jugador "+jugador(persona1,compu));
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
    public static String jugador(Jugador persona1,Jugador persona2){
        Jugador resul;
        if(persona1.cEnv==true)resul=persona2;
        else resul=persona1;
        if(persona1.cEnv==persona2.cEnv)System.out.println("-------------Error--------------(Envido-Jugador)");
    return resul.nombre;
}
        public static String jugador(Jugador persona1,Computadora compu){
        String resul;
        if(persona1.cEnv==true)resul=compu.nombre;
        else resul=persona1.nombre;
        if(persona1.cEnv==compu.cEnv)System.out.println("-------------Error--------------(Envido-Jugador)");
    return resul;
}
}