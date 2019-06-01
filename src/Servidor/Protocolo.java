package Servidor;


public class Protocolo {

    String preguntaNueva;
    String respuestaNueva;

    //ESTADOS DEL MENSAJE
    private final int ESPERANDOOPERACION = 0;
    private final int OPERACIONRECIBIDA = 1;

    int ESTADO = ESPERANDOOPERACION;

    operacionesAritmeticas op = new operacionesAritmeticas();
    
    public String processInput(String theInput) {
        String theOutput = null;
        switch (ESTADO) {
            case ESPERANDOOPERACION:
                theOutput = "ESCRIBA LA OPERACION  (x+y) o (x-y) o (x*y) o (x/y)...";
                ESTADO = OPERACIONRECIBIDA;
                break;
            case OPERACIONRECIBIDA:
                if(theInput.equalsIgnoreCase("salir")){
                    theOutput="salir";
                }
                else{
                    theOutput= ""+op.destruir_operacion(theInput);
                    if("Infinity".equals(theOutput)||"-Infinity".equals(theOutput)){
                        theOutput="Syntax Error";
                    }
                }
                break;
        }
        return theOutput;
    }

}
