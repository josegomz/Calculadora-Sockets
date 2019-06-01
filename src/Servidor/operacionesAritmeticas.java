
package Servidor;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class operacionesAritmeticas {
    
    
    public double destruir_operacion(String operacion) {
        double x,y;
        double resultado=0;
        int salir=0;
        int distancia=operacion.length(); //distancia de la cadena 
        if(distancia==0){
            return Infinity;
        }
        for(int i=distancia-1;i>=0 && salir==0;i--){
            switch(operacion.charAt(i)){
                case '+':
                    if(operacion.substring(i+1,distancia).length()!=0){
                        y=Double.parseDouble(operacion.substring(i+1,distancia));
                    }
                    else{
                        y=Infinity;
                    }
                    x=destruir_operacion(operacion.substring(0,i));
                    resultado=x+y;
                    salir=1;
                    break;
                case '*':
                    if(operacion.substring(i+1,distancia).length()!=0){
                        y=Double.parseDouble(operacion.substring(i+1,distancia));
                    }
                    else{
                        y=Infinity;
                    }
                    x=destruir_operacion(operacion.substring(0,i));
                    resultado=x*y;
                    salir=1;
                    break;
                case '-':                    
                    if(operacion.substring(i+1,distancia).length()!=0){
                        y=Double.parseDouble(operacion.substring(i+1,distancia));
                    }
                    else{
                        y=Infinity;
                    }
                    x=destruir_operacion(operacion.substring(0,i));
                    resultado=x-y;
                    salir=1;
                    break;
                case '/':
                    if(operacion.substring(i+1,distancia).length()!=0){
                        y=Double.parseDouble(operacion.substring(i+1,distancia));
                    }
                    else{
                        y=Infinity;
                    }
                    x=destruir_operacion(operacion.substring(0,i));
                    resultado=x/y;
                    salir=1;
                    break;
            }
        }
        if(salir==0){
            return Double.parseDouble(operacion);
        }
        return resultado;
    }
}
