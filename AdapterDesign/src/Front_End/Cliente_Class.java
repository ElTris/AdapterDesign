package Front_End;


/*
IMPORTAMOS TODAS LAS CLASES DENTRO DEL PAQUETE DEL BACK-END
PARA PODER UTILIZARLAS
*/
import Back_End.*;

public class Cliente_Class {
    /*
    CLASE CLIENTE: ESTA CLASE SE ENCARGARA DE SOLICITAR TODAS LAS OPERACIONES CONTENIDAS DENTRO DE LAS CLASES DEL BACK-END
    */
          
    public static void main(String[] args){
        operacionesMotorElectrico_ADP();
    }
    
    
    //INSTANCIA DE TODAS LAS CLASES A UTILIZAR
   
    
    
    // ----------------------------------METODOS DE OPERACION DE MOTOR COMÚN------------------
    static void operacionesMotorComun(){
        MotorComun motor_comun = new MotorComun();
        motor_comun.encender();
        motor_comun.acelerar();
        motor_comun.apagar();
    }   
    // ----------------------------------FIN DE METODOS DE OPERACION DE MOTOR COMÚN------------------
    
    
    // ----------------------------------METODOS DE OPERACION DE MOTOR ECONÓMICO------------------
    static void operacionesMotorEconomico(){
    MotorEconomico motor_economico = new MotorEconomico();
    motor_economico.encender();
    motor_economico.acelerar();
    motor_economico.apagar();
    }
    // ----------------------------------FIN DE METODOS DE OPERACION DE MOTOR ECONÓMICO------------------
    
    static void operacionesMotorElectrico_ADP(){
    MotorAdapter motor_adapter = new MotorAdapter();

    }
    
}
