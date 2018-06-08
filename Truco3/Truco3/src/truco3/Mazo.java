
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
public static void repartir(Cartas[] mazo, Jugadoor uno,Jugadoor dos){
    crearMazo(mazo);
    mezclarMazo(mazo);
    cortarMazo(mazo);
    if(uno.turno==1){

    uno.mazo[0]=mazo[0];
    uno.mazo[1]=mazo[2];
    uno.mazo[2]=mazo[4];
    dos.mazo[0]=mazo[1];
    dos.mazo[1]=mazo[3];
    dos.mazo[2]=mazo[5];

    }else {

    uno.mazo[0]=mazo[1];
    uno.mazo[1]=mazo[3];
    uno.mazo[2]=mazo[5];
    dos.mazo[0]=mazo[0];
    dos.mazo[1]=mazo[2];
    dos.mazo[2]=mazo[4];
    }
}

}
    
    
    

