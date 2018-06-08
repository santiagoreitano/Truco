package truco3;

import javax.swing.JOptionPane;
import static truco3.Envido.sumarPuntos;
import static truco3.Mano1.mano1;
import static truco3.Mano1.mano2;
import static truco3.Mano1.mano3;
import static truco3.Mazo.mostrarMazo;
import static truco3.Mazo.repartir;

public class Mano {
    //static boolean trucoCantado=false;

    static Cartas[] mazo = new Cartas[40];
    //static Cartas[]jugadas={new Cartas(0,0),new Cartas(0,0),new Cartas(0,0),new Cartas(0,0),new Cartas(0,0),new Cartas(0,0)};
    static int mano1 = 0;
    static int manoJug = 0;//Quien es mano, en cvj

    public static void manO(Jugadoor uno, Jugadoor dos) {

        if (manoJug == 0 || manoJug == 2) {
            manoJug = 1;
            uno.turno = 1;
            dos.turno = 2;
        } else {
            manoJug = 2;
            uno.turno = 2;
            dos.turno = 1;
        }

        repartir(mazo, uno, dos);
        uno.mazoCompleto = mazo;
        dos.mazoCompleto = mazo;

        if (uno.persona == true && dos.persona == false) {
            System.out.println(uno.nombre);
            mostrarMazo(uno.mazo);
        } else if (uno.persona == false && dos.persona == true) {
            System.out.println(dos.nombre);
            mostrarMazo(dos.mazo);
        } else {
            System.out.println(uno.nombre);
            mostrarMazo(uno.mazo);
            System.out.println(dos.nombre);
            mostrarMazo(dos.mazo);
        }

        uno.puntosEnv = sumarPuntos(uno.mazo);
        dos.puntosEnv = sumarPuntos(dos.mazo);
        //------------------------------Mano------------------------------------------
        System.out.println("--------------------mano1---------------");
        mano1(uno, dos);
        if (uno.salida != 1 && dos.salida != 1) {
            System.out.println("--------------------mano2---------------");
            mano2(uno, dos);
            if (uno.salida != 1 && dos.salida != 1) {
                if (uno.manos == 1 && dos.manos == 0 || uno.manos == 0 && dos.manos == 1 || uno.manos == 2 || dos.manos == 2) {
                } else {
                    System.out.println("--------------------mano3---------------");
                    mano3(uno, dos);
                }
            } else if (uno.salida == 1) {
               // System.out.println(uno.nombre+" no acepto");
                dos.manos = 4;
            } else {
                uno.manos = 4;
               //  System.out.println(dos.nombre+" no acepto");
            }
        } else if (uno.salida == 1) {
             //System.out.println(uno.nombre+" no acepto");
            dos.manos = 4;
        } else {
             //System.out.println(dos.nombre+" no acepto");
            uno.manos = 4;
        }
        System.out.println("--------------------mano3---------------");
        //------------------------------Ganador Mano------------------------------------------        
        if (Truco.tipTruco == 0) {
            Truco.tipTruco = 1;
        }
        if (uno.manos > dos.manos) {
            uno.puntos += Truco.tipTruco;
            JOptionPane.showMessageDialog(null, "La mano completa la gano " + uno.nombre);
        } else if (uno.manos < dos.manos) {
            dos.puntos += Truco.tipTruco;
            JOptionPane.showMessageDialog(null, "La mano completa la gano " + dos.nombre);
        } else if (uno.manos == 0 && dos.manos == 0) {
            if (manoJug == 1) {
                uno.puntos += Truco.tipTruco;
                JOptionPane.showMessageDialog(null, "La mano completa la gano " + uno.nombre);
            } else if (manoJug == 2) {
                dos.puntos += Truco.tipTruco;
                JOptionPane.showMessageDialog(null, "La mano completa la gano " + dos.nombre);
            }
        } else if (uno.manos == dos.manos) {
            if (mano1 == 1) {
                uno.puntos += Truco.tipTruco;
                JOptionPane.showMessageDialog(null, "La mano completa la gano " + uno.nombre);
            } else if (mano1 == 2) {
                dos.puntos += Truco.tipTruco;
                JOptionPane.showMessageDialog(null, "La mano completa la gano " + dos.nombre);

            }
        }

        //-------------------------------Variables que uso como bool--------------------
        Truco.tipTruco = 0;
        Envido.tipoEnvido = 0;
        uno.salida = 0;
        dos.salida = 0;

        for (int i = 0; i < uno.jugadas.length; i++) {
            uno.jugadas[i] = new Cartas(0, 0);
        }
        for (int i = 0; i < dos.jugadas.length; i++) {
            dos.jugadas[i] = new Cartas(0, 0);
        }
        uno.cEnv = false;
        uno.cTruco = false;
        uno.manos = 0;
        dos.cEnv = false;
        dos.cTruco = false;
        dos.manos = 0;
        mano1 = 0;
        //mostrarMazo(prueba);

    }

}
