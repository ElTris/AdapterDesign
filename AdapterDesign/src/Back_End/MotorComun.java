package Back_End;

    /*
        CLASE MotorComun (HIJA): HEREDA TODOS LOS MÉTODOS DE LA CLASE PADRE (Motor_Target)
    */
public class MotorComun extends Motor_Target{
    
    //CONSTRUCTOR DE LA CLASE MotorComun
    public MotorComun(){
        super();
        System.out.println("CONSTRUCTOR DE LA CLASE MotorComun");
    }
    
    
    //CREACIÓN DE LOS MÉTODOS ABSTRACTOS QUE HEREDA LA CLASE Motor_Target
    public void encender() {
        System.out.println("Motor Común Encendido...");
    }

    
    public void acelerar() {
        System.out.println("Motor Común Acelerando...");
    }
    
    
    public void apagar() {
       System.out.println("Apagando Motor Común..");
    }
    
}
