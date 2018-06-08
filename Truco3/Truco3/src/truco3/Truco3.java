
package truco3;
import static truco3.Opciones.opciones2;
import javax.swing.JOptionPane;
import static truco3.Computadora.cartaDelMedio;
import static truco3.Computadora.cartaMasChica;
import static truco3.Computadora.cartaMasGrande;
import static truco3.Computadora.probabilidadGanarEnv;
import static truco3.Mano.manO;
import static truco3.Mazo.repartir;
import static truco3.Opciones.opciones3;

public class Truco3 {

    
    public static void main(String[] args) {
 
        
        jvC();

        
    } 

        public static void jvC(){
                        
        Jugadoor persona=new Jugadoor();
        Jugadoor compu=new Jugadoor();
        int opcion1=opciones3("Perosna","Computadora","¿Que desea que sea Jugador 1?");
        persona.nombre=JOptionPane.showInputDialog("Ingrese el nombre del Jugador 1");
        if(opcion1== 1)persona.persona=true;
        if(opcion1== 2)persona.persona=false;
        
        int opcion2=opciones3("Perosna","Computadora","¿Que desea que sea Jugador 2?");
        compu.nombre=JOptionPane.showInputDialog("Ingrese el nombre de Jugador 2");
        if(opcion2== 1)compu.persona=true;
        if(opcion2== 2)compu.persona=false;
            
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