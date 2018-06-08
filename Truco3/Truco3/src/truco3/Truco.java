package truco3;

import static truco3.Computadora.cantarTrucoCompu;
import static truco3.Computadora.respTruco;
import static truco3.Opciones.opciones3;

public class Truco {

    public static int tipTruco = 0;
    //public static int puntos;

    public static void trucOo(Jugadoor compu, Jugadoor persona2, int turno) {
        //int salida=0;

        //if(jugadas[0]!=null ||Envido.tipoEnvido !=0){
        if (tipTruco == 0) {
            if (compu.cTruco == false && compu.turno == 1) {
                if (compu.persona == false) {
                    tipTruco = cantarTrucoCompu(tipTruco, compu);
                } else {
                    tipTruco = opciones3("Salir", "Truco", "Jugador :" + compu.nombre);
                }
                if (tipTruco == 1) {
                    tipTruco = 0;
                } else {
                    compu.cTruco = true;
                    persona2.cTruco = false;
                    if (persona2.persona == false) {
                        tipTruco = Computadora.respTruco(persona2, tipTruco);
                    } else {
                        tipTruco = respTruco(persona2);
                    }
                    //tipTruco=Computadora.respTruco(compu, tipTruco);
                    if (tipTruco == 1) {
                        persona2.salida = 1;
                    }
                }
            } else if (persona2.cTruco == false && persona2.turno == 1) {
                //tipTruco=opciones3("Salir","Truco","Jugador :"+persona2.nombre);
                if (persona2.persona == false) {
                    tipTruco = cantarTrucoCompu(tipTruco, persona2);
                } else {
                    tipTruco = opciones3("Salir", "Truco", "Jugador :" + persona2.nombre);
                }
                if (tipTruco == 1) {
                    tipTruco = 0;
                } else {
                    persona2.cTruco = true;
                    compu.cTruco = false;
                    if (compu.persona == false) {
                        tipTruco = Computadora.respTruco(compu, tipTruco);
                    } else {
                        tipTruco = respTruco(compu);
                    }
                    //tipTruco=Computadora.respTruco(compu, tipTruco);
                    if (tipTruco == 1) {
                        compu.salida = 1;
                    }
                }
            }
            //------------------------------
        } else if (tipTruco == 2) {
            if (compu.cTruco == false && compu.turno == 1) {
                if (compu.persona == false) {
                    tipTruco = cantarTrucoCompu(tipTruco, compu);
                } else {
                    tipTruco = opciones3("Salir", "ReTruco", "Jugador :" + compu.nombre);
                }
                if (tipTruco == 1) {
                    tipTruco = 2;
                } else if (tipTruco == 2) {
                    compu.cTruco = true;
                    persona2.cTruco = false;
                    if (persona2.persona == false) {
                        tipTruco = Computadora.respTruco(persona2, tipTruco);
                    } else {
                        tipTruco = respTruco(persona2);
                    }
                    //tipTruco=respTruco( persona2);
                    if (tipTruco == 1) {
                        tipTruco = 2;
                        persona2.salida = 1;
                    }
                    if (tipTruco == 2) {
                        tipTruco = 3;
                    }
                }
            }
            else if (persona2.cTruco == false && persona2.turno == 1) {
              //  System.out.println("arregle aca");
                if (persona2.persona == false) {
                    tipTruco = cantarTrucoCompu(tipTruco, persona2);
                } else {
                    tipTruco = opciones3("Salir", "ReTruco", "Jugador :" + persona2.nombre);
                }
                if (tipTruco == 1) {
                    tipTruco = 2;
                } else if (tipTruco == 2) {
                    compu.cTruco = false;
                    persona2.cTruco = true;
                    if (compu.persona == false) {
                        tipTruco = Computadora.respTruco(compu, tipTruco);
                    } else {
                        tipTruco = respTruco(compu);
                    }
                    //tipTruco=Computadora.respTruco(compu,tipTruco);
                    if (tipTruco == 1) {
                        tipTruco = 2;
                        persona2.salida = 1;
                    }
                    if (tipTruco == 2) {
                        tipTruco = 3;
                    }
                }
            }
        } else if (tipTruco == 3) {
            if (compu.cTruco == false && turno == 2) {
                if (compu.persona == false) {
                    tipTruco = cantarTrucoCompu(tipTruco, compu);
                } else {
                    tipTruco = opciones3("Salir", "Vale Cuatro", "Jugador :" + compu.nombre);
                }
                if (tipTruco == 1) {
                    tipTruco = 3;
                } else if (tipTruco == 2) {
                    compu.cTruco = true;
                    persona2.cTruco = false;
                    if (persona2.persona == false) {
                        tipTruco = Computadora.respTruco(persona2, tipTruco);
                    } else {
                        tipTruco = respTruco(persona2);
                    }
                    //tipTruco=respTruco( persona2);
                    if (tipTruco == 1) {
                        tipTruco = 3;
                        persona2.salida = 1;
                    }
                    if (tipTruco == 2) {
                        tipTruco = 4;
                    }
                }
            } else 
                if (persona2.persona == false) {
                   // System.out.println("else if arriba");
                    tipTruco = cantarTrucoCompu(tipTruco, persona2);
                } else {
                    tipTruco = opciones3("Salir", "Vale Cuatro", "Jugador :" + persona2.nombre);
                }
                if (tipTruco == 1) {
                    tipTruco = 3;
                } else if (tipTruco == 2) {
                    compu.cTruco = false;
                    persona2.cTruco = true;
                    if (compu.persona == false) {
                        tipTruco = Computadora.respTruco(compu, tipTruco);
                    } else {
                        tipTruco = respTruco(compu);
                    }
                    //tipTruco=Computadora.respTruco(compu, tipTruco);
                    if (tipTruco == 1) {
                        tipTruco = 3;
                        compu.salida = 1;
                    }
                    if (tipTruco == 2) {
                        tipTruco = 4;
                    }
                }
            

        }
        //}

    }

    public static int respTruco(Jugadoor persona1) {
        int z = opciones3("No quiero", "Quiero", "Jugador: " + persona1.nombre);

        return z;

    }

}
