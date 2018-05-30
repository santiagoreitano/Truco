
package truco3;

import javax.swing.JOptionPane;

public class Opciones {
    
    
public static int alAzarEntre(int a, int b){
        int z=-1;
        while (z< a || z>b){
            z=(int)(Math.random()*100);
        }
    return z;    
    }
public static int opciones2(String a,String cabecera){
    String []arre={a};
    String valor;
    int valor1=-1;
    while (valor1!=1){
        try{
        //valor=(String)JOptionPane.showInputDialog(null,"Seleccione una: ",cabecera,JOptionPane.DEFAULT_OPTION,null,arre,arre[0]);
        //valor1=opcionesInt(arre, valor);
        valor1=JOptionPane.showOptionDialog(null, "Seleccione una:", cabecera, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
            null, arre, arre[0]);
        valor1+=1;
//valor1=Integer.parseInt(valor);
        }catch(NumberFormatException e){}
    }
    return valor1;    
}

public static int opciones3(String a,String b,String cabecera){
    String []arre={a,b};
    String valor;
    int valor1=0;
    while (valor1 !=1 && valor1 !=2){
        try{
        //valor=(String)JOptionPane.showInputDialog(null,"Seleccione una: ",cabecera,JOptionPane.DEFAULT_OPTION,null,arre,arre[0]);
        //valor1=opcionesInt(arre, valor);
        valor1=JOptionPane.showOptionDialog(null, "Seleccione una:", cabecera, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
        null, arre, arre[0]);
        valor1+=1;
        }catch(NumberFormatException e){}
    }
    return valor1;    
}
public static int opciones4(String a,String b,String c,String cabecera){
    String []arre={a,b,c};
    String valor;
    int valor1=-1;
    while (valor1 <1 || valor1>3){
        try{
        //valor=(String)JOptionPane.showInputDialog(null,"Seleccione una: ",cabecera,JOptionPane.DEFAULT_OPTION,null,arre,arre[0]);
        //valor1=opcionesInt(arre, valor);
        valor1=JOptionPane.showOptionDialog(null, "Seleccione una:", cabecera, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
        null, arre, arre[0]); 
        valor1+=1;
//valor1=Integer.parseInt(valor);
        }catch(NumberFormatException e){}
    }
    return valor1;    
}
public static int opciones5(String a,String b,String c,String d,String cabecera){
    String []arre={a,b,c,d};
    String valor;
    int valor1=-1;
    while (valor1<1 || valor1>4){
        try{
        //valor=(String)JOptionPane.showInputDialog(null,"Seleccione una: ",cabecera,JOptionPane.DEFAULT_OPTION,null,arre,arre[0]);
        //valor1=opcionesInt(arre, valor);
        valor1=JOptionPane.showOptionDialog(null, "Seleccione una:", cabecera, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
        null, arre, arre[0]);
        valor1+=1;
        }catch(NumberFormatException e){}
    }
    return valor1;    
}
public static int opciones6(String a,String b,String c,String d,String e,String cabecera){
    String []arre={a,b,c,d,e};
    String valor;
    int valor1=-1;
    while (valor1<1 || valor1>5){
        try{
        //valor=(String)JOptionPane.showInputDialog(null,"Seleccione una: ",cabecera,JOptionPane.DEFAULT_OPTION,null,arre,arre[0]);
        //valor1=opcionesInt(arre, valor);
        valor1=JOptionPane.showOptionDialog(null, "Seleccione una:", cabecera, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
        null, arre, arre[0]);
        valor1+=1;
        }catch(NumberFormatException x){}
    }
    return valor1;    
}
public static int opciones7(String a,String b,String c,String d,String e,String f,String cabecera){
    String []arre={a,b,c,d,e,f};
    String valor;
    int valor1=-1;
    while (valor1<1 || valor1>6){
        try{
        //valor=(String)JOptionPane.showInputDialog(null,"Seleccione una: ",cabecera,JOptionPane.DEFAULT_OPTION,null,arre,arre[0]);
        //valor1=opcionesInt(arre, valor);
        valor1=JOptionPane.showOptionDialog(null, "Seleccione una:", cabecera, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
        null, arre, arre[0]);
        valor1+=1;
        }catch(NumberFormatException x){}
    }
    return valor1;
}

public static int opcionesInt(String arre [],String valor){
    int resul=0;
    for(int i=0;i<arre.length;i++){
        if(valor.equals(arre[i])){
        resul=i+1;
        
    }
    }
    return resul;
    
}




}
