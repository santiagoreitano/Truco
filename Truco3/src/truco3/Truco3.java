
package truco3;
import static truco3.Opciones.opciones2;
import javax.swing.JOptionPane;
import static truco3.Computadora.cartaDelMedio;
import static truco3.Computadora.cartaMasChica;
import static truco3.Computadora.cartaMasGrande;
import static truco3.Computadora.probabilidadGanarEnv;
import static truco3.Mano.manO;
import static truco3.Mazo.repartir;

public class Truco3 {

    public static void main(String[] args) {
 
        int ii=0;
        String arre[]={"Jugador vs Jugador","Jugador vs Computadora"};
        String cabecera="Tipo de Juego";
        //String si=(String)JOptionPane.showInputDialog(null,"Seleccione una: ",cabecera,JOptionPane.DEFAULT_OPTION,null,arre,arre[0]);
        //int ii=Opciones.opcionesInt(arre, si);
         ii=JOptionPane.showOptionDialog(null, "Seleccione una:", cabecera, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
        null, arre, arre[0]);
        if(ii==0)jvj();
        if(ii==1)jvc();
        
        
    } 

        public static void jvj(){
        Jugador persona1=new Jugador();
        Jugador persona2=new Jugador();
        persona1.nombre=JOptionPane.showInputDialog("Ingrese el nombre de la persona 1");
        persona2.nombre=JOptionPane.showInputDialog("Ingrese el nombre de la persona 2");
        int jugador=0;
        while(persona1.puntos<30 && persona2.puntos<30){
        System.out.println("Puntos de: "+persona1.nombre+" es de "+persona1.puntos);
        System.out.println("Puntos de: "+persona2.nombre+" es de "+persona2.puntos);
        System.out.println("---------Jugar--------------");
        if(jugador==0 || jugador==2){
        manO(persona1,persona2);
        jugador=1;
        }else {
            manO(persona2,persona1);
            jugador=2;
        }
        }
            System.out.println("");
        System.out.println("Final");
        }
        public static void jvc(){
                        
        Jugador persona=new Jugador();
        Computadora compu=new Computadora();
        persona.nombre=JOptionPane.showInputDialog("Ingrese el nombre de la persona");
        compu.nombre=JOptionPane.showInputDialog("Ingrese el nombre de la computadora");
       
            
            while(persona.puntos<30 && compu.puntos<30){
                
        System.out.println("Puntos de: "+persona.nombre+" es de "+persona.puntos);
        System.out.println("Puntos de: "+compu.nombre+" es de "+compu.puntos);
        System.out.println("---------Jugar--------------");
        manO(persona, compu);
                    System.out.println(""); 
            System.out.println(""); 
            System.out.println(""); 
            System.out.println(""); 
            System.out.println(""); 

            }
        System.out.println("Puntos de: "+persona.nombre+" es de "+persona.puntos);
        System.out.println("Puntos de: "+compu.nombre+" es de "+compu.puntos);
        System.out.println("Final");
 
        }
        public static boolean comprobar(Cartas a,Cartas b){
            boolean resul=false;
            if(a.pinta==b.pinta && a.numero==b.numero)resul=true;
            else resul=false;
            return resul;
            
        }
}