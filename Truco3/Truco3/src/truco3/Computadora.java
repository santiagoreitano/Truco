package truco3;

import javax.swing.JOptionPane;
import static truco3.Cartas.agregarCarta1;
import static truco3.Opciones.alAzarEntre;
import static truco3.Truco3.comprobar;

public class Computadora {

    public String nombre;
    public int puntos;
    public int turno;
    public Cartas[] mazo = new Cartas[3];
    public int puntosEnv = 0;
    public boolean cEnv = false;
    public boolean cTruco = false;
    public int salida = 0;
    public int manos = 0;

    public static int probabilidadRanEnv(int porcentaje, int tipEnvido,Jugadoor compu) {
        int resul = 0;
        int ran = alAzarEntre(1, 20);
        if (tipEnvido == 0) {
            if (compu.jugadas[0].numero == 0) {
                if (porcentaje < 65) {
                    if (ran <= 15) {
                        resul = 1;
                    } else if (ran <= 18) {
                        resul = 2;
                    } else if (ran <= 19) {
                        resul = 3;
                    } else {
                        resul = 4;
                    }
                } else if (porcentaje < 85) {
                    if (ran <= 2) {
                        resul = 1;
                    } else if (ran <= 16) {
                        resul = 2;
                    } else if (ran <= 19) {
                        resul = 3;
                    } else {
                        resul = 4;
                    }
                } else if (porcentaje < 95) {
                    if (ran <= 3) {
                        resul = 1;
                    } else if (ran <= 7) {
                        resul = 2;
                    } else if (ran <= 17) {
                        resul = 3;
                    } else {
                        resul = 4;
                    }
                } else {
                    if (ran <= 3) {
                        resul = 1;
                    } else if (ran <= 6) {
                        resul = 2;
                    } else if (ran <= 12) {
                        resul = 3;
                    } else {
                        resul = 4;
                    }
                }
            } else {
                if (porcentaje < 65) {
                    if (ran <= 15) {
                        resul = 1;
                    } else if (ran <= 17) {
                        resul = 2;
                    } else if (ran <= 19) {
                        resul = 3;
                    } else {
                        resul = 4;
                    }
                } else if (porcentaje < 85) {
                    if (ran <= 14) {
                        resul = 2;
                    } else if (ran <= 19) {
                        resul = 3;
                    } else {
                        resul = 4;
                    }
                } else if (porcentaje < 95) {
                    if (ran <= 5) {
                        resul = 2;
                    } else if (ran <= 18) {
                        resul = 3;
                    } else {
                        resul = 4;
                    }
                } else {
                    if (ran <= 3) {
                        resul = 2;
                    } else if (ran <= 11) {
                        resul = 3;
                    } else {
                        resul = 4;
                    }
                }

            }
        } else if (tipEnvido == 2) {
            if (porcentaje < 45) {
                if (ran <= 15) {
                    resul = 1;
                } else if (ran <= 18) {
                    resul = 2;
                } else if (ran <= 19) {
                    resul = 3;
                } else {
                    resul = 4;
                }
            } else if (porcentaje < 65) {
                if (ran <= 15) {
                    resul = 1;
                } else if (ran <= 17) {
                    resul = 5;
                } else if (ran <= 18) {
                    resul = 2;
                } else if (ran <= 19) {
                    resul = 3;
                } else {
                    resul = 4;
                }
            } else if (porcentaje < 85) {
                if (ran <= 14) {
                    resul = 5;
                } else if (ran <= 16) {
                    resul = 2;
                } else if (ran <= 18) {
                    resul = 3;
                } else {
                    resul = 4;
                }
            } else if (porcentaje < 95) {
                if (ran <= 4) {
                    resul = 5;
                } else if (ran <= 11) {
                    resul = 2;
                } else if (ran <= 18) {
                    resul = 3;
                } else {
                    resul = 4;
                }
            } else {
                if (ran <= 4) {
                    resul = 5;
                } else if (ran <= 8) {
                    resul = 2;
                } else if (ran <= 14) {
                    resul = 3;
                } else {
                    resul = 4;
                }
            }
        } else if (tipEnvido == 3) {
            if (porcentaje < 45) {
                if (ran <= 17) {
                    resul = 1;
                } else if (ran <= 19) {
                    resul = 2;
                } else {
                    resul = 3;
                }
            } else if (porcentaje < 65) {
                if (ran <= 15) {
                    resul = 1;
                } else if (ran <= 18) {
                    resul = 4;
                } else if (ran <= 19) {
                    resul = 2;
                } else {
                    resul = 3;
                }
            } else if (porcentaje < 85) {
                if (ran <= 4) {
                    resul = 1;
                } else if (ran <= 16) {
                    resul = 4;
                } else if (ran <= 18) {
                    resul = 2;
                } else {
                    resul = 3;
                }
            } else if (porcentaje < 95) {
                if (ran <= 9) {
                    resul = 4;
                } else if (ran <= 18) {
                    resul = 2;
                } else {
                    resul = 3;
                }
            } else {
                if (ran <= 8) {
                    resul = 4;
                } else if (ran <= 14) {
                    resul = 2;
                } else {
                    resul = 3;
                }
            }
        } else if (tipEnvido == -3) {
            if (porcentaje < 45) {
                if (ran <= 18) {
                    resul = 1;
                } else {
                    resul = 2;
                }
            } else if (porcentaje < 65) {
                if (ran <= 17) {
                    resul = 1;
                } else if (ran <= 18) {
                    resul = 3;
                } else {
                    resul = 2;
                }
            } else if (porcentaje < 85) {
                if (ran <= 5) {
                    resul = 1;
                } else if (ran <= 18) {
                    resul = 3;
                } else {
                    resul = 2;
                }
            } else if (porcentaje < 95) {
                if (ran <= 16) {
                    resul = 3;
                } else {
                    resul = 2;
                }
            } else {
                if (ran <= 8) {
                    resul = 3;
                } else {
                    resul = 1;
                }
            }
        } else if (tipEnvido == 4) {
            if (porcentaje < 45) {
                if (ran <= 19) {
                    resul = 1;
                } else {
                    resul = 2;
                }
            } else if (porcentaje < 65) {
                if (ran <= 18) {
                    resul = 1;
                } else {
                    resul = 2;
                }
            } else if (porcentaje < 85) {
                if (ran <= 13) {
                    resul = 1;
                } else {
                    resul = 2;
                }
            } else if (porcentaje < 95) {
                if (ran <= 10) {
                    resul = 1;
                } else {
                    resul = 2;
                }
            } else {
                if (ran <= 0) {
                    resul = 1;
                } else {
                    resul = 2;
                }
            }
        }

        return resul;
    }
    public static int probabilidadCartaMay(Cartas carta,Jugadoor compu) {
        int resul = 0;
        int contG = 0;
        int cont = 0;
        sacarCartasJugadas(compu);
        for (int i = 0; i < compu.mazoCompleto.length; i++) {
            if (compu.mazoCompleto[i] != null && carta != null) {
                cont++;
                if (carta.Cartas() > compu.mazoCompleto[i].Cartas()) {
                    contG++;
                }
            }

        }

        resul = (int) (((float) (contG) / (float) (cont) * 100));
        return resul;
    }
    public static boolean cartaMayor(Cartas a, Cartas b) {
        boolean resul = false;
        if (a.Cartas() > b.Cartas()) {
            resul = true;
        } else {
            resul = false;
        }

        return resul;

    }

    
    
    
    public static int responderEnvidoCompu(int tipoEnvido, int env, int renv, Jugadoor compu, Cartas[] m) {
        int entra = 0;
        int resul = 0;
        int porcentaje = probabilidadGanarEnv(m, compu);

        switch (tipoEnvido) {
            case 0: {
                entra = probabilidadRanEnv(porcentaje, 0,compu);
                if (entra == 1) {
                    resul = 1;
                    //JOptionPane.showMessageDialog(null,"No cantoooo"); 
                }//salir
                else if (entra == 2) {
                    JOptionPane.showMessageDialog(null, compu.nombre+" canto Envido");
                    resul = 2;
                }// envido
                else if (entra == 3) {
                    JOptionPane.showMessageDialog(null, compu.nombre+" canto Real Envido");
                    resul = 3;
                }//real envido
                else {
                    JOptionPane.showMessageDialog(null, compu.nombre+" canto Falta Envido");
                    resul = 4;
                }
                break;

            }
            case 2: {
                //"No quiero","Envido","Real envido","Falta envido","Quiero"
                if (env < 3) {
                    entra = probabilidadRanEnv(porcentaje, 2,compu);
                    if (entra == 1) {
                        JOptionPane.showMessageDialog(null, compu.nombre+" respondio no quiero");
                        resul = 1;
                    } else if (entra == 5) {
                        JOptionPane.showMessageDialog(null, compu.nombre+" respondio quiero");
                        resul = 5;
                    } else if (entra == 2) {
                        JOptionPane.showMessageDialog(null, compu.nombre+" respondio Envido");
                        resul = 2;
                    } else if (entra == 3) {
                        JOptionPane.showMessageDialog(null, compu.nombre+" respondio Real Envido");
                        resul = 3;
                    } else {
                        JOptionPane.showMessageDialog(null, compu.nombre+" respondio Falta Envido");
                        resul = 4;
                    }//falta envido
                } else {
                    //"No quiero","Real envido","Falta envido","Quiero"
                    entra = probabilidadRanEnv(porcentaje, 3,compu);
                    if (entra == 1) {
                        JOptionPane.showMessageDialog(null, compu.nombre+" respondio no quiero");
                        resul = 1;
                    }//no quiero
                    else if (entra == 4) {
                        JOptionPane.showMessageDialog(null, compu.nombre+" respondio quiero");
                        resul = 4;
                    }//quiero
                    else if (entra == 2) {
                        JOptionPane.showMessageDialog(null,compu.nombre+" respondio Real Envido");
                        resul = 2;
                    }//real envido
                    else {
                        resul = 3;
                        JOptionPane.showMessageDialog(null, compu.nombre+" respondio Falta Envido");
                    }//falta envido
                }
                break;
            }
            case 3: {//-------------------------------aca
                entra = probabilidadRanEnv(porcentaje, 3,compu);
                if (renv <= 3) {
                    //"No quiero","Real envido","Falta envido","Quiero"
                    if (entra == 1) {
                        JOptionPane.showMessageDialog(null,compu.nombre+" respondio no quiero");
                        resul = 1;
                    }//no quiero
                    else if (entra == 4) {
                        JOptionPane.showMessageDialog(null, compu.nombre+" respondio quiero");
                        resul = 4;
                    }//quiero
                    else if (entra == 2) {
                        JOptionPane.showMessageDialog(null, compu.nombre+" respondio Real Envido");
                        resul = 2;
                    }//real envido
                    else {
                        JOptionPane.showMessageDialog(null, compu.nombre+" respondio Falta Envido");
                        resul = 3;
                    }//falta envido
                } else {
                    //"No quiero","Falta envido","Quiero"
                    entra = probabilidadRanEnv(porcentaje, -3,compu);
                    if (entra == 1) {
                        JOptionPane.showMessageDialog(null,compu.nombre+" respondio no quiero");
                        resul = 1;
                    }//no quiero
                    else if (entra == 3) {
                        JOptionPane.showMessageDialog(null, compu.nombre+" respondio quiero");
                        resul = 3;
                    }//quiero
                    else {
                        JOptionPane.showMessageDialog(null, compu.nombre+" respondio Falta Envido");
                        resul = 2;
                    }//falta envido
                }
                break;
            }
            case 4: {
                entra = probabilidadRanEnv(porcentaje, 4,compu);
                //No quiero","Quiero","Jugador "
                porcentaje = probabilidadGanarEnv(m, compu);
                if (entra == 1) {
                    JOptionPane.showMessageDialog(null, compu.nombre+" respondio no quiero");
                    resul = 1;
                } else {
                    JOptionPane.showMessageDialog(null, compu.nombre+" respondio quiero");
                    resul = 2;
                }
                break;
            }
        }

        return resul;
    }
    public static int probabilidadGanarEnv(Cartas[] m, Jugadoor compu) {
        Cartas[] puntos = new Cartas[3];
        int resul = 0;
        int cont = -1;
        int contG = 0;
        //int contP = 0;
        int[] arregloPuntos = new int[67200];
        sacarCartasJugadas(compu);
        for (int i = 0; i < m.length - 2; i++) {
            for (int z = i + 1; z < m.length - 1; z++) {
                for (int j = z + 1; j < m.length; j++) {
                    if (m[i] != null && m[z] != null && m[j] != null) {
                        puntos[0] = m[i];
                        puntos[1] = m[z];
                        puntos[2] = m[j];

                        if (compu.jugadas[0].numero != 0) {
                            if (comprobar(compu.jugadas[0], puntos[0]) || comprobar(compu.jugadas[0], puntos[1]) || comprobar(compu.jugadas[0], puntos[2])) {
                                cont++;
                                arregloPuntos[cont] = Envido.sumarPuntos(puntos);
                            }
                        } else {
                            cont++;
                            arregloPuntos[cont] = Envido.sumarPuntos(puntos);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < cont; i++) {
            if (arregloPuntos[i] < compu.puntosEnv) {
                contG++;
            } else {
               // contP++;
            }
        }
        resul = (int) (((float) (contG) / (float) (cont)) * 100);
        //System.out.println("Probabilidad "+resul);

        return resul;
    }
    public static int probabilidadTruco(Jugadoor compu) {

        int cont = 0;
        int resul = 0;
        int carta1 = 0;
        int carta2 = 0;
        int carta3 = 0;
        //int carta=0;
        sacarCartasJugadas(compu);
        for (int i = 0; i < compu.mazo.length; i++) {
            if (compu.mazo[i] == null) {
                cont++;
            }
        }
        if (cont == 0) {
            carta1 = probabilidadCartaMay(compu.mazo[0],compu);
            carta2 = probabilidadCartaMay(compu.mazo[1],compu);
            carta3 = probabilidadCartaMay(compu.mazo[2],compu);
            if (carta1 >= carta2 && carta2 <= carta3) {
                resul = (carta1 + carta3) / 2;
            } else if (carta1 >= carta3 && carta2 >= carta3) {
                resul = (carta1 + carta2) / 2;
            } else if (carta1 <= carta2 && carta1 <= carta3) {
                resul = (carta2 + carta3) / 2;
            }
        } else if (cont == 1) {
            if (compu.manos != 0) {
                for (int i = 0; i < compu.mazo.length; i++) {
                    if (compu.mazo[i] != null && resul < probabilidadCartaMay(compu.mazo[i],compu)) {
                        resul = probabilidadCartaMay(compu.mazo[i],compu);
                    }
                }
            } else {
                for (int i = 0; i < compu.mazo.length; i++) {
                    if (compu.mazo[i] != null) {
                        resul += (probabilidadCartaMay(compu.mazo[i],compu)) / 2;
                    }
                }
            }
        } else if (cont == 2) {
            if (compu.jugadas[2].pinta != 0) {
                if (cartaMasGrande(compu).Cartas() > compu.jugadas[2].Cartas()) {
                    resul = 100;
                } else {
                    int rand = alAzarEntre(1, 4);
                    if (rand < 4 || probabilidadCartaMay(compu.jugadas[2],compu) == 100) {
                        resul = 0;
                    } else {
                        resul = 100;
                    }
                }
            } else {
                for (int i = 0; i < compu.mazo.length; i++) {
                    if (compu.mazo[i] != null) {
                        //Cartas.mostrarCarta(compu.mazo[i]);
                        resul = (probabilidadCartaMay(compu.mazo[i],compu));
                    }
                }
            }
        }
        return resul;
    }   
    public static int cantarTrucoCompu(int tipTruco, Jugadoor compu) {
        int resul = 0;
        int ran = alAzarEntre(0, 15);
        int mentira = 0;
        if (tipTruco == 0) {
            mentira = alAzarEntre(1, 4);
            if (probabilidadTruco(compu) < 70 - ran) {
                if (mentira < 4) {
                    resul = 1;
                } else {
                    JOptionPane.showMessageDialog(null, compu.nombre+" canto Truco");
                    resul = 2;
                }
            } else {
                JOptionPane.showMessageDialog(null, compu.nombre+" canto Truco");
                resul = 2;
            }
        }
        if (tipTruco == 2) {
            mentira = alAzarEntre(1, 6);
            if (probabilidadTruco(compu) < 75 - (ran / 2)) {
                if (mentira < 6) {
                    resul = 1;
                } else {
                    JOptionPane.showMessageDialog(null, compu.nombre+" canto Retruco");
                    resul = 2;
                }
            } else {
                JOptionPane.showMessageDialog(null, compu.nombre+" canto Retruco");
                resul = 2;
            }
        }
        if (tipTruco == 3) {
            mentira = alAzarEntre(1, 8);
            if (probabilidadTruco(compu) < 75 - (ran / 3)) {
                if (mentira < 8) {
                    resul = 1;
                } else {
                    JOptionPane.showMessageDialog(null, compu.nombre+" canto ValeCuatro");
                    resul = 2;
                }
            } else {
                JOptionPane.showMessageDialog(null, compu.nombre+" canto ValeCuatro");
                resul = 2;
            }

        }

        return resul;
    }
    public static int respTruco(Jugadoor compu, int tipTruco) {
        int z = 0;
        int mentira = 0;
        int ran = alAzarEntre(0, 15);
        if (tipTruco == 2) {
            mentira = alAzarEntre(1, 4);
            if (probabilidadTruco(compu) < 70 - ran) {
                if (mentira < 4) {
                    z = 1;
                    JOptionPane.showMessageDialog(null, compu.nombre+" dijo No Quiero");
                } else {
                    z = 2;
                    JOptionPane.showMessageDialog(null, compu.nombre+" dijo Quiero");
                }
            } else {
                z = 2;
                JOptionPane.showMessageDialog(null, compu.nombre+" dijo Quiero");
            }
        }
        if (tipTruco == 3) {
            mentira = alAzarEntre(1, 6);
            if (probabilidadTruco(compu) < 75 - (ran / 2)) {
                if (mentira < 6) {
                    z = 1;
                    JOptionPane.showMessageDialog(null, compu.nombre+" dijo No Quiero");
                } else {
                    z = 2;
                    JOptionPane.showMessageDialog(null, compu.nombre+" dijo Quiero");
                }
            } else {
                z = 2;
                JOptionPane.showMessageDialog(null, compu.nombre+" dijo Quiero");
            }
        }
        if (tipTruco == 4) {
            mentira = alAzarEntre(1, 8);
            if (probabilidadTruco(compu) < 75 - (ran / 4)) {
                if (mentira < 8) {
                    z = 1;
                    JOptionPane.showMessageDialog(null, compu.nombre+" dijo No Quiero");
                } else {
                    z = 2;
                    JOptionPane.showMessageDialog(null, compu.nombre+" dijo Quiero");
                }
            } else {
                z = 2;
                JOptionPane.showMessageDialog(null, compu.nombre+" dijo Quiero");
            }
        }
        return z;

    }    
    public static void sacarCartasJugadas(Jugadoor compu) {
        for (int i = 0; i < compu.mazoCompleto.length; i++) {//Saca cartas usadas o de computadora
            for (int z = 0; z < compu.mazo.length; z++) {
                if (compu.mazoCompleto[i] == null || compu.mazo[z] == null); else if (comprobar(compu.mazoCompleto[i], compu.mazo[z])) {
                    compu.mazoCompleto[i] = null;
                }
            }
            for (int z = 0; z < compu.jugadas.length; z++) {
                if (compu.mazoCompleto[i] != null && compu.jugadas[z].pinta != 0) {
                    if (comprobar(compu.mazoCompleto[i], compu.jugadas[z])) {
                        compu.mazoCompleto[i] = null;
                    }
                }
            }
        }
    }       
    public static Cartas cartaMasGrande(Jugadoor compu) {
        Cartas resul = new Cartas(0, 0);
        for (int i = 0; i < compu.mazo.length; i++) {
            if (compu.mazo[i] != null) {
                if (compu.mazo[i].Cartas() > resul.Cartas() || resul.pinta == 0) {
                    resul = compu.mazo[i];
                }
            }
        }
        return resul;
    }    
    public static Cartas cartaMasChica(Jugadoor compu) {
        Cartas resul = new Cartas(0, 0);
        for (int i = 0; i < compu.mazo.length; i++) {
            if (compu.mazo[i] != null) {
                if (compu.mazo[i].Cartas() < resul.Cartas() || resul.pinta == 0) {
                    resul = compu.mazo[i];
                }
            }
        }
        return resul;
    }    
    public static Cartas cartaDelMedio(Jugadoor compu) {
        Cartas resul = new Cartas(0, 0);
        for (int i = 0; i < compu.mazo.length; i++) {
            if (compu.mazo[i] != null) {
                if (compu.mazo[i].Cartas() <= cartaMasGrande(compu).Cartas() && compu.mazo[i].Cartas() >= cartaMasChica(compu).Cartas()) {
                    resul = compu.mazo[i];
                }
            }
        }
        return resul;
    }
    public static Cartas jugarCartaMano1(Jugadoor compu,Jugadoor jugador) {
        Cartas cartaM = new Cartas(0, 0);
        int ran = alAzarEntre(1, 4);
        if (compu.jugadas[0].numero == 0) {
            if (ran < 3) {
                cartaM = cartaMasGrande(compu);
            } else if (ran < 4) {
                cartaM = cartaMasChica(compu);
            } else {
                cartaM = cartaDelMedio(compu);
            }
        } else {

            for (int i = 0; i < compu.mazo.length; i++) {
                if (compu.mazo[i] != null) {
                    if (ran < 4) {
                        if (compu.jugadas[0].Cartas() < compu.mazo[i].Cartas()) {
                            if (cartaM.Cartas() > compu.mazo[i].Cartas() || cartaM.numero == 0) {
                                cartaM = compu.mazo[i];
                            }
                        }
                    } else {
                        cartaM = cartaMasChica(compu);
                    }

                }
            }
        }
        if (cartaM.numero == 0) {
            cartaM = cartaMasChica(compu);
        }
        for (int i = 0; i < compu.mazo.length; i++) {
            if (comprobar(cartaM, compu.mazo[i]) == true) {
                compu.mazo[i] = null; //Elimina carta jugada
            }
        }
        
        System.out.print("Jugador " + compu.nombre + ": ");
        agregarCarta1(cartaM,jugador);
        Cartas.mostrarCarta(cartaM);
        return cartaM;
    }
    public static Cartas jugarCartaMano2(Jugadoor compu,Jugadoor jugador) {
        int ran;
        Cartas cartaM = new Cartas(0, 0);
        if (compu.manos == 1) {
            ran = alAzarEntre(1, 4);
            if (ran < 4) {
                cartaM = cartaMasChica(compu);
            } else {
                cartaM = cartaMasGrande(compu);
            }
        } else {

            for (int i = 0; i < compu.mazo.length; i++) {
                if (compu.mazo[i] != null) {
                    if (compu.jugadas[1].Cartas() < compu.mazo[i].Cartas()) {
                        if (cartaM.Cartas() > compu.mazo[i].Cartas() || cartaM.numero == 0) {
                            cartaM = compu.mazo[i];
                        }
                    }
                }
            }
        }

        for (int i = 0; i < compu.mazo.length; i++) {
            if (compu.mazo[i] != null) {
                if (comprobar(cartaM, compu.mazo[i]) == true) {
                    compu.mazo[i] = null; //Elimina carta jugada
                }
            }
        }
        if (cartaM.pinta != 0) {
            System.out.print("Jugador " + compu.nombre + ": ");
            Cartas.mostrarCarta(cartaM);
        }
        agregarCarta1(cartaM,jugador);
        return cartaM;
    }
    public static Cartas jugarCartaMano3(Jugadoor compu,Jugadoor jugador) {
        Cartas cartaM = new Cartas(0, 0);

        for (int i = 0; i < compu.mazo.length; i++) {
            if (compu.mazo[i] != null) {
                cartaM = compu.mazo[i];

            }
        }

        for (int i = 0; i < compu.mazo.length; i++) {
            if (compu.mazo[i] != null) {
                if (comprobar(cartaM, compu.mazo[i]) == true) {
                    compu.mazo[i] = null; //Elimina carta jugada
                }
            }
        }
        System.out.print("Jugador " + compu.nombre + ": ");
        Cartas.mostrarCarta(cartaM);
        agregarCarta1(cartaM,jugador);
        return cartaM;
    }

}
