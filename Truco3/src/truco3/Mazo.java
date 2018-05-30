
package truco3;

import static truco3.Cartas.intercalarCartas;
import static truco3.Cartas.mostrarCarta;
import static truco3.Cartas.rotarCartas;
import static truco3.Opciones.alAzarEntre;

public class Mazo {
public static void crearMazo(Cartas[]mazo){
    int creada=0;
        for (int i1=0; i1<12;i1++){
            for (int i2=0; i2<4; i2++){
                if (i1==7 || i1==8){}
                else{
                mazo[creada]= new Cartas(i1+1,i2+1);
                creada++;
                }
            }
        }        
    }  
public static void mostrarMazo(Cartas[] a){
            
            for (int i=0; i<a.length; i++){
                //System.out.println(a[i]);
                mostrarCarta(a[i]);
                
            }
            
        }
public static void mezclarMazo(Cartas[]mazo){
    
    for(int i=0; i<10000000;i++){
        
        intercalarCartas(alAzarEntre(0,39),alAzarEntre(0,39),mazo);
        
        
    }
    
    
}
public static void cortarMazo(Cartas[]mazo){   
    for(int z=0;z<20;z++){
        rotarCartas(mazo);
    }
}
public static void repartir(Cartas[] mazo, Cartas[]jugadas, Jugador persona1,Jugador persona2){
    crearMazo(mazo);
    mezclarMazo(mazo);
    cortarMazo(mazo);
    if(persona1.turno==1){

    persona1.mazo[0]=mazo[0];
    persona1.mazo[1]=mazo[2];
    persona1.mazo[2]=mazo[4];
    persona2.mazo[0]=mazo[1];
    persona2.mazo[1]=mazo[3];
    persona2.mazo[2]=mazo[5];

    }else {

    persona1.mazo[0]=mazo[1];
    persona1.mazo[1]=mazo[3];
    persona1.mazo[2]=mazo[5];
    persona2.mazo[0]=mazo[0];
    persona2.mazo[1]=mazo[2];
    persona2.mazo[2]=mazo[4];
    }
}
public static void repartir(Cartas[] mazo, Cartas[]jugadas, Jugador persona1,Computadora compu){
    crearMazo(mazo);
    mezclarMazo(mazo);
    cortarMazo(mazo);
    if(persona1.turno==1){

    persona1.mazo[0]=mazo[0];
    persona1.mazo[1]=mazo[2];
    persona1.mazo[2]=mazo[4];
    compu.mazo[0]=mazo[1];
    compu.mazo[1]=mazo[3];
    compu.mazo[2]=mazo[5];

    }else {

    persona1.mazo[0]=mazo[1];
    persona1.mazo[1]=mazo[3];
    persona1.mazo[2]=mazo[5];
    compu.mazo[0]=mazo[0];
    compu.mazo[1]=mazo[2];
    compu.mazo[2]=mazo[4];
    }
}
public static void sacar(Cartas[]mazo,Jugador jugador){   
    for(int i=0;i<jugador.mazo.length;i++){
        for(int z=0;z<mazo.length;z++){
            if(mazo[z]!=null){
            if(jugador.mazo[i]==mazo[z]){
                mazo[z]=null;
                    }
        }
        }
    }
}
}
    
    
    

