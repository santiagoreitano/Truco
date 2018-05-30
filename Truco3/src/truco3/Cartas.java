
package truco3;
    
import static truco3.Opciones.opciones2;
import static truco3.Opciones.opciones3;
import static truco3.Opciones.opciones4;

public class Cartas {
    
    int numero;
    int pinta;
    

    public Cartas(int Carta, int Pinta) {
        this.numero = Carta;
        this.pinta = Pinta;
    }
        
        public Cartas() {
    }
        public int Cartas(){
    int valor=0;   
        if (numero == 4) valor=1;
        if (numero == 5) valor=2;
        if (numero == 6) valor=3;
        if (numero == 7 && pinta==2) valor=4;
        if (numero == 7 && pinta==4) valor=4;
        if (numero == 10) valor=5;
        if (numero == 11) valor=6;
        if (numero == 12) valor=7;
        if (numero == 1 && pinta==3) valor=8;
        if (numero == 1 && pinta==4) valor=8;
        if (numero == 2) valor=9;
        if (numero == 3) valor=10;
        if (numero == 7 && pinta==3) valor=11;
        if (numero == 7 && pinta==1) valor=12;
        if (numero == 1 && pinta==2) valor=13;
        if (numero == 1 && pinta==1) valor=14;      
    return valor;  
    }
        public static void mostrarCarta(Cartas a){

            if(a==null)System.out.println("null");
            else if (a.pinta == 1 )System.out.println(a.numero+ " de espada");
            else if (a.pinta == 2 )System.out.println(a.numero+ " de basto");
            else if (a.pinta == 3 )System.out.println(a.numero+ " de oro");
            else if (a.pinta == 4 )System.out.println(a.numero+ " de copa");

            
        } 
        public static String mostrarCarta1(Cartas a){
            
            String resul="";
            if(a.pinta==1)resul=String.valueOf(a.numero)+" de espada";
            if(a.pinta==2)resul=String.valueOf(a.numero)+" de basto";
            if(a.pinta==3)resul=String.valueOf(a.numero)+" de oro";
            if(a.pinta==4)resul=String.valueOf(a.numero)+" de copa";
          return resul;  
        }
        public static void intercalarCartas(int a, int b,Cartas[] mazo){
            
            Cartas aux;
            aux=mazo[a];
            mazo[a]=mazo[b];
            mazo[b]=aux;
        }
        public static void rotarCartas(Cartas[]mazo){
            Cartas z = new Cartas(0,0);
            z=mazo[0];
                for(int i=0;i<mazo.length-1;i++){
                    mazo[i]=mazo[i+1];
                }int i=mazo.length-1;
                mazo[i]=z;
        
    }  
        public static void repartirCartas(Cartas[]mazo,Cartas[]a,Cartas[]b){

    for(int i=0;i<6;i++){
        if (i % 2 ==0 || i ==0){
        a[i/2]=mazo[i];
        }
        else{
        b[i/2]=mazo[i];
        }
    }   
}
        public static Cartas jugarCarta3(Jugador persona1,Cartas[]jugadas){
        Cartas resul;
        int carta;
        carta=opciones4(mostrarCarta1(persona1.mazo[0]),mostrarCarta1(persona1.mazo[1]),mostrarCarta1(persona1.mazo[2]),"Jugador "+persona1.nombre);
        resul=persona1.mazo[carta-1];
            System.out.print("Jugador "+persona1.nombre+": "); 
            mostrarCarta(resul);
            agregarCarta1(persona1.mazo[carta-1],jugadas);
            sacarCarta1(carta-1,persona1.mazo);
        return resul; 
    } 
        public static Cartas jugarCarta2(Jugador persona1,Cartas[]jugadas){
        Cartas resul;
        int carta;
        carta=opciones3(mostrarCarta1(persona1.mazo[0]),mostrarCarta1(persona1.mazo[1]),"Jugador "+persona1.nombre);
        resul=persona1.mazo[carta-1];
            System.out.print("Jugador "+persona1.nombre+": "); 
            mostrarCarta(resul);
            agregarCarta1(persona1.mazo[carta-1],jugadas);
            sacarCarta2(carta-1,persona1.mazo);
        return resul; 
    } 
        public static Cartas jugarCarta1(Jugador persona1,Cartas[]jugadas){
        Cartas resul;
        int carta;
        carta=opciones2(mostrarCarta1(persona1.mazo[0]),"Jugador "+persona1.nombre);
        resul=persona1.mazo[carta-1];
            System.out.print("Jugador "+persona1.nombre+": ");    
            mostrarCarta(resul);
            agregarCarta1(persona1.mazo[carta-1],jugadas);
            sacarCarta1(carta-1,persona1.mazo);
        return resul; 
    } 
        public static int[] ganadorCartas(int jugador,Cartas j1, Cartas j2,Cartas[] jug1,Cartas[] jug2){
            int resul=0;
            int []resuL=new int[3];
            if(j1.Cartas()>j2.Cartas()){ resul=1;}
            if(j1.Cartas()<j2.Cartas()){ resul=2;}
            if(j1.Cartas()==j2.Cartas()){resul=0;}
            resuL[0]=resul;
            resuL[1]=lugarCarta(j1,jug1);
            resuL[2]=lugarCarta(j2,jug2);
            return resuL;
            
        }
        public static int lugarCarta(Cartas carta,Cartas []cartas){
    int resul=0;
        for (int i=0;i<cartas.length;i++){
            if(carta.Cartas()==cartas[i].Cartas())resul=i;
        }
    
    return resul;
}
        public static void sacarCarta1(int lugar,Cartas []cartas){
    cartas[lugar]=cartas[2];
    cartas[2]=null;
}
        public static void sacarCarta2(int lugar,Cartas []cartas){
    cartas[lugar]=cartas[1];
    cartas[1]=null;
}
        public static void agregarCarta1(Cartas carta,Cartas[]jugadas ){
            
            for(int i=0;i<jugadas.length;i++){
                if(jugadas[i].numero==0 && jugadas[i].pinta==0){
                    jugadas[i]=carta;
                    break;
                }
            }
            
            
        }

}

    

