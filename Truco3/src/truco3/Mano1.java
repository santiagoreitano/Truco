
package truco3;

import javax.swing.JOptionPane;
import static truco3.Cartas.jugarCarta1;
import static truco3.Cartas.jugarCarta2;
import static truco3.Cartas.jugarCarta3;
import static truco3.Computadora.jugarCartaMano1;
import static truco3.Computadora.jugarCartaMano2;
import static truco3.Computadora.jugarCartaMano3;
import static truco3.Computadora.probabilidadTruco;
import static truco3.Envido.envido;
import static truco3.Opciones.opciones2;
import static truco3.Opciones.opciones3;
import static truco3.Opciones.opciones4;
import static truco3.Truco.trucOo;

public class Mano1 {
    static int manoJug=0;
    public static void mano1(Jugador persona1,Jugador persona2,Cartas[]jugadas){
        int seleccion=0;
        boolean salir1=false;
        boolean salir2=false;
        Cartas jug1=null;
        Cartas jug2=null;
        
        for(int i=0;i<2;i++){
        if (persona1.turno==1){
         
        while(salir1==false && persona1.salida==0 && persona2.salida==0){
            
        if(Envido.tipoEnvido==0 && jugadas[0]==null){
            seleccion=opciones3("Envido","Jugar","Jugador "+persona1.nombre);
            if(seleccion==1)envido(persona1,persona2);
            if(seleccion==2){
                jug1=jugarCarta3(persona1, jugadas);
                salir1=true;
            }
        
        } else if(Envido.tipoEnvido==0&& jugadas[0]!=null &&persona1.cTruco==false){
            seleccion=opciones4("Envido", "Truco","Jugar", "Jugador "+persona1.nombre);
            if(seleccion==1)envido(persona1,persona2);
            if(seleccion==2)trucOo(persona1,persona2);
            if(seleccion==3){
                jug1=jugarCarta3(persona1, jugadas);
                salir1=true;
            }
        }else if(Envido.tipoEnvido!=0 && persona1.cTruco==false){
            seleccion=opciones3("Truco","Jugar","Jugador "+persona1.nombre);
            if(seleccion==1)trucOo(persona1, persona2);
            if(seleccion==2){
                jug1=jugarCarta3(persona1, jugadas);
                salir1=true;
            }
        }else if(Envido.tipoEnvido!=0 && persona1.cTruco==true){
            seleccion=opciones2("Jugar","Jugador "+persona1.nombre);
            jug1=jugarCarta3(persona1, jugadas);
            salir1=true;
        }
        }   
        if(persona2.salida==1)break;
        persona1.turno=2;
        persona2.turno=1;      
        }
        else{

                while(salir2==false && persona1.salida==0 && persona2.salida==0){
        if(Envido.tipoEnvido==0 && jugadas[0]==null){
            seleccion=opciones3("Envido","Jugar","Jugador "+persona2.nombre);
            if(seleccion==1)envido(persona2,persona1);
            if(seleccion==2){
                salir2=true;
                jug2=jugarCarta3(persona2, jugadas);
            }
        
        } else if(Envido.tipoEnvido==0&& jugadas[0]!=null &&persona2.cTruco==false){
            seleccion=opciones4("Envido", "Truco","Jugar", "Jugador "+persona2.nombre);
            if(seleccion==1)envido(persona2,persona1);
            if(seleccion==2)trucOo(persona2,persona1);
            if(seleccion==3){
                jug2=jugarCarta3(persona2, jugadas);
                salir2=true;
            }
        }else if(Envido.tipoEnvido!=0 && persona2.cTruco==false){
            seleccion=opciones3("Truco","Jugar","Jugador "+persona2.nombre);
            if(seleccion==1)trucOo(persona2, persona1);
            if(seleccion==2){
                jug2=jugarCarta3(persona2, jugadas);
                salir2=true;
            }
        }else if( persona2.cTruco==true){
            seleccion=opciones2("Jugar","Jugador "+persona2.nombre);
            jug2=jugarCarta3(persona2, jugadas);
             salir2=true;
        }    
        }  
        if(persona2.salida==1)break;
        persona1.turno=1;
        persona2.turno=2;    
        } 
        }
        if(persona1.salida!=1 && persona2.salida!=1){
        if(jug1.Cartas()<jug2.Cartas()){
            persona2.manos+=1;
            JOptionPane.showMessageDialog(null, "La mano la gano "+persona2.nombre);
            Mano.mano1=2;
            persona2.turno=1;
            persona1.turno=2;
        }else if (jug1.Cartas()>jug2.Cartas()){
            persona1.manos+=1;
            JOptionPane.showMessageDialog(null, "La mano la gano "+persona1.nombre);
            Mano.mano1=1;
            persona1.turno=1;
            persona2.turno=2;
        }else {
            persona1.turno=1;
            JOptionPane.showMessageDialog(null, "La mano la empataron ");
        }
    }
        
    }
    
    
    public static void mano1(Jugador persona,Computadora compu, Cartas[]jugadas){
        
        int seleccion=0;
        boolean salir1=false;
        boolean salir2=false;
        Cartas jug1=null;
        Cartas jug2=null;
        if(persona.turno==1)manoJug=1;
        else manoJug=2;
        
        for(int i=0;i<2;i++){
        if (persona.turno==1){
         
        while(salir1==false && persona.salida==0 && compu.salida==0){
            
        if(Envido.tipoEnvido==0 && jugadas[0].numero==0){
            
            seleccion=opciones3("Envido","Jugar","Jugador "+persona.nombre);
            if(seleccion==1)envido(persona,compu);
            if(seleccion==2){
                jug1=jugarCarta3(persona, jugadas);
                salir1=true;
            }
        
        } else if(Envido.tipoEnvido==0&& jugadas[0].numero!=0 &&persona.cTruco==false){
            seleccion=opciones4("Envido", "Truco","Jugar", "Jugador "+persona.nombre);
            if(seleccion==1)envido(persona,compu);
            
            if(seleccion==2)trucOo(compu,persona,1);
            if(seleccion==3){
                jug1=jugarCarta3(persona, jugadas);
                salir1=true;
            }
        }else if(Envido.tipoEnvido!=0 && persona.cTruco==false){
            seleccion=opciones3("Truco","Jugar","Jugador "+persona.nombre);
            if(seleccion==1)trucOo(compu, persona,1);
            if(seleccion==2){
                jug1=jugarCarta3(persona, jugadas);
                salir1=true;
            }
        }else if(Envido.tipoEnvido!=0 && persona.cTruco==true){
            seleccion=opciones2("Jugar","Jugador "+persona.nombre);
            jug1=jugarCarta3(persona, jugadas);
            salir1=true;
        }
        }   
        if(compu.salida==1)break;
        persona.turno=2;
        compu.turno=1;      
       
        }else {
  
        while(salir2==false && compu.salida==0 && persona.salida==0){

        if(Envido.tipoEnvido==0 && jugadas[0].numero==0){
            envido(compu, persona);
            jug2=jugarCartaMano1(compu);
            salir2=true;
        } else if(Envido.tipoEnvido==0&& jugadas[0].numero!=0 &&compu.cTruco==false){
            envido(compu, persona);
            trucOo(compu, persona, 2);
            jug2=jugarCartaMano1(compu);
            salir2=true;
        }else if(Envido.tipoEnvido!=0 && compu.cTruco==false){

            trucOo(compu, persona, 2);
            jug2=jugarCartaMano1(compu);
            salir2=true;
        }else if(Envido.tipoEnvido!=0 && compu.cTruco==true){

            jug2=jugarCartaMano1(compu);
            salir2=true;
        }
        }   
        if(compu.salida==1)break;
        persona.turno=1;
        compu.turno=2;         
        }    
        }
        if(persona.salida!=1 && compu.salida!=1){
        if(jug1.Cartas()<jug2.Cartas()){
            compu.manos+=1;
            JOptionPane.showMessageDialog(null, "La mano la gano "+compu.nombre);
            Mano.mano1=2;
            compu.turno=1;
            persona.turno=2;
        }else if (jug1.Cartas()>jug2.Cartas()){
            persona.manos+=1;
            JOptionPane.showMessageDialog(null, "La mano la gano "+persona.nombre);
            Mano.mano1=1;
            persona.turno=1;
            compu.turno=2;
        }else {
            JOptionPane.showMessageDialog(null, "La mano la empataron ");
            if(manoJug==1){
                persona.turno=1;
                compu.turno=2;
            }
            else {
                persona.turno=2;
                compu.turno=1;
            }
            
        }
    }
        
        
    }
    
    
    public static void mano2(Jugador persona1,Jugador persona2,Cartas[]jugadas){
        Cartas jug1=null;
        Cartas jug2=null;
        int seleccion=0;
        boolean salir1=false;
        boolean salir2=false;
        for(int i=0;i<2;i++){
        if (persona1.turno==1){ 
        while(salir1==false && persona1.salida==0 && persona2.salida==0){
         if(persona1.cTruco==false){
            seleccion=opciones3("Truco","Jugar","Jugador "+persona1.nombre);
            if(seleccion==1){trucOo(persona1, persona2);}
            if(seleccion==2){
                jug1=jugarCarta2(persona1, jugadas);
                salir1=true;
            }
        }else if(persona1.cTruco==true){
            seleccion=opciones2("Jugar","Jugador "+persona1.nombre);
            jug1=jugarCarta2(persona1, jugadas);
            salir1=true;
        }
        }   
        if(persona2.salida==1)break;
        persona1.turno=2;
        persona2.turno=1;          
      }else {
        while(salir2==false && persona1.salida==0 && persona2.salida==0){
        
         if(persona2.cTruco==false){
            seleccion=opciones3("Truco","Jugar","Jugador "+persona2.nombre);
            if(seleccion==1)trucOo(persona2, persona1);
            if(seleccion==2){
                jug2=jugarCarta2(persona2, jugadas);
                salir2=true;
            }
        }else if(persona2.cTruco==true){
            seleccion=opciones2("Jugar","Jugador "+persona2.nombre);
            jug2=jugarCarta2(persona2, jugadas);
            salir2=true;
        }
        }   
        if(persona2.salida==1)break;
        persona1.turno=1;
        persona2.turno=2;          
      } 
        }
        if(persona1.salida!=1 && persona2.salida!=1){
        if(jug1.Cartas()<jug2.Cartas()){
            persona2.manos+=1;
            JOptionPane.showMessageDialog(null, "La mano la gano "+persona2.nombre);
            persona2.turno=1;
            persona1.turno=2;
        }else if (jug1.Cartas()>jug2.Cartas()){
            persona1.manos+=1;
            JOptionPane.showMessageDialog(null, "La mano la gano "+persona1.nombre);
            persona1.turno=1;
            persona2.turno=2;
        }else {
            JOptionPane.showMessageDialog(null, "La mano la empataron");
            persona1.turno=1;
        }
    }
    }
    
    public static void mano2(Jugador persona,Computadora compu, Cartas[]jugadas){
        //int manoJug=0;
        int seleccion=0;
        boolean salir1=false;
        boolean salir2=false;
        Cartas jug1=null;
        Cartas jug2=null;
        
        for(int i=0;i<2;i++){

        if (persona.turno==1){
         
        while(salir1==false && persona.salida==0 && compu.salida==0){

        if(persona.cTruco==false){
            seleccion=opciones3("Truco","Jugar","Jugador "+persona.nombre);
            if(seleccion==1)trucOo(compu, persona,1);
            if(seleccion==2){
                jug1=jugarCarta2(persona, jugadas);
                salir1=true;
            }
        }else if(persona.cTruco==true){
            seleccion=opciones2("Jugar","Jugador "+persona.nombre);
            jug1=jugarCarta2(persona, jugadas);
            salir1=true;
        }
        }   
        if(compu.salida==1)break;
        persona.turno=2;
        compu.turno=1;      
       
        }else {
  
        while(salir2==false && compu.salida==0 && persona.salida==0){
        if( compu.cTruco==false){
            trucOo(compu, persona, 2);
            jug2=jugarCartaMano2(compu);
            salir2=true;
        }else if(compu.cTruco==true){
            jug2=jugarCartaMano2(compu);
            salir2=true;
        }
        }   
        if(compu.salida==1)break;
        persona.turno=1;
        compu.turno=2;         
        }    
        }
        if(persona.salida!=1 && compu.salida!=1){
        if(jug1.Cartas()<jug2.Cartas()){
            compu.manos+=1;
            JOptionPane.showMessageDialog(null, "La mano la gano "+compu.nombre);
            //Mano.mano1=2;
            compu.turno=1;
            persona.turno=2;
        }else if (jug1.Cartas()>jug2.Cartas()){
            persona.manos+=1;
            JOptionPane.showMessageDialog(null, "La mano la gano "+persona.nombre);
            //Mano.mano1=1;
            persona.turno=1;
            compu.turno=2;
        }else {
            JOptionPane.showMessageDialog(null, "La mano la empataron ");
            if(manoJug==1)persona.turno=1;
            else compu.turno=2;
                
            
        }
    }
        
        
    }
    
    
    
    
    public static void mano3(Jugador persona1,Jugador persona2,Cartas[]jugadas){
        Cartas jug1=null;
        Cartas jug2=null;
        int seleccion=0;
        boolean salir1=false;
        boolean salir2=false;
        for(int i=0;i<2;i++){
        if (persona1.turno==1){ 
        while(salir1==false && persona1.salida==0 && persona2.salida==0){
         if(persona1.cTruco==false){
            seleccion=opciones3("Truco","Jugar","Jugador "+persona1.nombre);
            if(seleccion==1)trucOo(persona1, persona2);
            if(seleccion==2){
                jug1=jugarCarta1(persona1, jugadas);
                salir1=true;
            }
        }else if(persona1.cTruco==true){
            seleccion=opciones2("Jugar","Jugador "+persona1.nombre);
            jug1=jugarCarta1(persona1, jugadas);
            salir1=true;
        }
        }   
        if(persona2.salida==1)break;
        persona1.turno=2;
        persona2.turno=1;          
      }else {
        while(salir2==false && persona1.salida==0 && persona2.salida==0){
        
         if(persona2.cTruco==false){
            seleccion=opciones3("Truco","Jugar","Jugador "+persona2.nombre);
            if(seleccion==1)trucOo(persona2, persona1);
            if(seleccion==2){
                jug2=jugarCarta1(persona2, jugadas);
                salir2=true;
            }
        }else if(persona2.cTruco==true){
            seleccion=opciones2("Jugar","Jugador "+persona2.nombre);
            jug2=jugarCarta1(persona2, jugadas);
            salir2=true;
        }
        }   
        if(persona2.salida==1)break;
        persona1.turno=1;
        persona2.turno=2;          
      } 
        }
        if(persona1.salida!=1 && persona2.salida!=1){
        if(jug1.Cartas()<jug2.Cartas()){
            JOptionPane.showMessageDialog(null, "La mano la gano "+persona2.nombre);
            persona2.manos+=1;
            persona2.turno=1;
            persona1.turno=2;
        }else if(jug1.Cartas()>jug2.Cartas()){
            JOptionPane.showMessageDialog(null, "La mano la gano "+persona1.nombre);
            persona1.manos+=1;
            persona1.turno=1;
            persona2.turno=2;
        }else JOptionPane.showMessageDialog(null, "La mano la empataron");
    }
    }

    public static void mano3(Jugador persona,Computadora compu, Cartas[]jugadas){
        //int manoJug=0;
        int seleccion=0;
        boolean salir1=false;
        boolean salir2=false;
        Cartas jug1=null;
        Cartas jug2=null;
        
        for(int i=0;i<2;i++){

        if (persona.turno==1){
         
        while(salir1==false && persona.salida==0 && compu.salida==0){

        if(persona.cTruco==false){
            seleccion=opciones3("Truco","Jugar","Jugador "+persona.nombre);
            if(seleccion==1)trucOo(compu, persona,1);
            if(seleccion==2){
                jug1=jugarCarta1(persona, jugadas);
                salir1=true;
            }
        }else if(persona.cTruco==true){
            seleccion=opciones2("Jugar","Jugador "+persona.nombre);
            jug1=jugarCarta1(persona, jugadas);
            salir1=true;
        }
        }   
        if(compu.salida==1)break;
        persona.turno=2;
        compu.turno=1;      
       
        }else {
  
        while(salir2==false && compu.salida==0 && persona.salida==0){
        if( compu.cTruco==false){
            trucOo(compu, persona, 2);
            jug2=jugarCartaMano3(compu);
            salir2=true;
        }else if(compu.cTruco==true){
            jug2=jugarCartaMano3(compu);
            salir2=true;
        }
        }   
        if(compu.salida==1)break;
        persona.turno=1;
        compu.turno=2;         
        }    
        }

        if(persona.salida!=1 && compu.salida!=1){
        if(jug1.Cartas()<jug2.Cartas()){
            compu.manos+=1;
            JOptionPane.showMessageDialog(null, "La mano la gano "+compu.nombre);

        }else if (jug1.Cartas()>jug2.Cartas()){
            persona.manos+=1;
            JOptionPane.showMessageDialog(null, "La mano la gano "+persona.nombre);

        }else {
            JOptionPane.showMessageDialog(null, "La mano la empataron ");         
        }
    }
        
        
    }
    
    


}
