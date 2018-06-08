
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
 
    public static void mano1(Jugadoor uno,Jugadoor dos){
        
        int seleccion=0;
        boolean salir1=false;
        boolean salir2=false;
        Cartas jug1=null;
        Cartas jug2=null;
        if(uno.turno==1)manoJug=1;
        else manoJug=2;
        
        for(int i=0;i<2;i++){
        if (uno.turno==1){
          
        while(salir1==false && uno.salida==0 && dos.salida==0){
            
        if(Envido.tipoEnvido==0 && uno.jugadas[0].numero==0){
            if(uno.persona==true){
            seleccion=opciones3("Envido","Jugar","Jugador "+uno.nombre);
            if(seleccion==1)envido(uno,dos);
            if(seleccion==2){
                jug1=jugarCarta3(uno,dos);
                salir1=true;
            }
            }else {
            envido(uno, dos);
            jug1=jugarCartaMano1(uno,dos);
            salir1=true;
            }
        } else if(Envido.tipoEnvido==0&& uno.jugadas[0].numero!=0 &&uno.cTruco==false){
            if(uno.persona==true){
            seleccion=opciones4("Envido", "Truco","Jugar", "Jugador "+uno.nombre);
            if(seleccion==1)envido(uno,dos);
            
            if(seleccion==2)trucOo(dos,uno,1);
            if(seleccion==3){
                jug1=jugarCarta3(uno,dos);
                salir1=true;
            }
            }else {
            envido(uno, dos);
            trucOo(uno, dos, 1);
            jug1=jugarCartaMano1(uno,dos);
            salir1=true;
            }
        }else if(Envido.tipoEnvido!=0 && uno.cTruco==false){
            if(uno.persona==true){
            seleccion=opciones3("Truco","Jugar","Jugador "+uno.nombre);
            if(seleccion==1)trucOo(dos, uno,1);
            if(seleccion==2){
                jug1=jugarCarta3(uno,dos);
                salir1=true;
            }
            }else {
            trucOo(uno, dos, 1);
            jug1=jugarCartaMano1(uno,dos);
            salir1=true;
            }
        }else if(Envido.tipoEnvido!=0 && uno.cTruco==true){
            if(uno.persona==true){
            seleccion=opciones2("Jugar","Jugador "+uno.nombre);
            jug1=jugarCarta3(uno,dos);
            salir1=true;
        }
        }else {
            jug1=jugarCartaMano1(uno,dos);
            salir1=true;
        }
        }   
        if(dos.salida==1)break;
        uno.turno=2;
        dos.turno=1;      
       
        }else {
            
        while(salir2==false && dos.salida==0 && uno.salida==0){
            //Cartas.mostrarCarta(dos.jugadas[0]);
        if(Envido.tipoEnvido==0 && dos.jugadas[0].numero==0){
            if(dos.persona==true){
            seleccion=opciones3("Envido","Jugar","Jugador "+dos.nombre);
            if(seleccion==1)envido(dos,uno);
            if(seleccion==2){
            jug2=jugarCarta3(dos,uno);
            salir2=true;
            }
            }else{
            envido(dos, uno);
            jug2=jugarCartaMano1(dos,uno);
            salir2=true;}
        } else if(Envido.tipoEnvido==0&& dos.jugadas[0].numero!=0 &&dos.cTruco==false){
            if(dos.persona==true){
            seleccion=opciones4("Envido","Truco","Jugar","Jugador "+dos.nombre);
            if(seleccion==1)envido(dos,uno);
            if(seleccion==2)trucOo(dos, uno, 2);
            if(seleccion==3){
            jug2=jugarCarta3(dos,uno);
            salir2=true;}
            }else{
            envido(dos, uno);
            trucOo(dos, uno, 2);
            jug2=jugarCartaMano1(dos,uno);
            salir2=true;}
        }else if(Envido.tipoEnvido!=0 && dos.cTruco==false){
            if(dos.persona==true){
            seleccion=opciones3("Truco","Jugar","Jugador "+dos.nombre);
            if(seleccion==1)trucOo(dos, uno, 2);
            if(seleccion==2){
            jug2=jugarCarta3(dos,uno);
            salir2=true;}
            }else{
            trucOo(dos, uno, 2);
            jug2=jugarCartaMano1(dos,uno);
            salir2=true;}
        }else if(Envido.tipoEnvido!=0 && dos.cTruco==true){
            if(dos.persona==true){
            seleccion=opciones2("Jugar","Jugador "+dos.nombre);
            if(seleccion==1){
            jug2=jugarCarta3(dos,uno);
            salir2=true;}
            }else{
            jug2=jugarCartaMano1(dos,uno);
            salir2=true;}
        }
        }   
        if(dos.salida==1)break;
        uno.turno=1;
        dos.turno=2;         
        }    
        }
        if(uno.salida!=1 && dos.salida!=1){
        if(jug1.Cartas()<jug2.Cartas()){
            dos.manos+=1;
            JOptionPane.showMessageDialog(null, "La mano la gano "+dos.nombre);
            Mano.mano1=2;
            dos.turno=1;
            uno.turno=2;
        }else if (jug1.Cartas()>jug2.Cartas()){
            uno.manos+=1;
            JOptionPane.showMessageDialog(null, "La mano la gano "+uno.nombre);
            Mano.mano1=1;
            uno.turno=1;
            dos.turno=2;
        }else {
            JOptionPane.showMessageDialog(null, "La mano la empataron ");
            if(manoJug==1){
                uno.turno=1;
                dos.turno=2;
            }
            else {
                uno.turno=2;
                dos.turno=1;
            }
            
        }
    }
        
        
    }   
    public static void mano2(Jugadoor persona,Jugadoor compu){
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
            if(persona.persona==true){
            seleccion=opciones3("Truco","Jugar","Jugador "+persona.nombre);
            if(seleccion==1)trucOo(compu, persona,1);
            if(seleccion==2){
                jug1=jugarCarta2(persona, compu);
                salir1=true;
            }
            }else { 
            trucOo(compu, persona, 1);
            jug1=jugarCartaMano2(persona,compu);
            salir1=true;
            }
        }else if(persona.cTruco==true){
            if(persona.persona==true){
            seleccion=opciones2("Jugar","Jugador "+persona.nombre);
            jug1=jugarCarta2(persona, compu);
            salir1=true;
        }else{
            jug1=jugarCartaMano2(persona,compu);
            salir1=true;
            }
        }
        }   
        if(compu.salida==1)break;
        persona.turno=2;
        compu.turno=1;      
       
        }else {
  
        while(salir2==false && compu.salida==0 && persona.salida==0){
        if( compu.cTruco==false){
            if(compu.persona==true){
            seleccion=opciones3("Truco","Jugar","Jugador "+compu.nombre);
            if(seleccion==1)trucOo(compu, persona,2);
            if(seleccion==2){
                jug2=jugarCarta2(compu, persona);
                salir2=true;
            }
            }else {
            trucOo(compu, persona, 2);
            jug2=jugarCartaMano2(compu,persona);
            salir2=true;}
        }else if(compu.cTruco==true){
            if(compu.persona==true){
            seleccion=opciones2("Jugar","Jugador "+persona.nombre);
            jug2=jugarCarta2(compu, persona);
            salir2=true;
            }else {
            jug2=jugarCartaMano2(compu,persona);
            salir2=true;}
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
    public static void mano3(Jugadoor persona,Jugadoor compu){
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
            if(persona.persona==true){
            seleccion=opciones3("Truco","Jugar","Jugador "+persona.nombre);
            if(seleccion==1)trucOo(compu, persona,1);
            if(seleccion==2){
                jug1=jugarCarta1(persona, compu);
                salir1=true;
            }
            }else { 
            trucOo(compu, persona, 1);
            jug1=jugarCartaMano3(persona,compu);
            salir1=true;
            }
        }else if(persona.cTruco==true){
            if(persona.persona==true){
            seleccion=opciones2("Jugar","Jugador "+persona.nombre);
            jug1=jugarCarta1(persona, compu);
            salir1=true;
        }else{
            jug1=jugarCartaMano3(persona,compu);
            salir1=true;
            }
        }
           
        }   
        if(compu.salida==1)break;
        persona.turno=2;
        compu.turno=1;      
       
        }else {
  
        while(salir2==false && compu.salida==0 && persona.salida==0){
            
            if( compu.cTruco==false){
            if(compu.persona==true){
            seleccion=opciones3("Truco","Jugar","Jugador "+compu.nombre);
            if(seleccion==1)trucOo(compu, persona,2);
            if(seleccion==2){
                jug2=jugarCarta1(compu, persona);
                salir2=true;
            }
            }else {
            trucOo(compu, persona, 2);
            jug2=jugarCartaMano3(compu,persona);
            salir2=true;}
        }else if(compu.cTruco==true){
            if(compu.persona==true){
            seleccion=opciones2("Jugar","Jugador "+persona.nombre);
            jug2=jugarCarta1(compu, persona);
            salir2=true;
            }else {
            jug2=jugarCartaMano3(compu,persona);
            salir2=true;}
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
