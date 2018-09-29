package Back_End;
   /*
        CLASE MotorEconomico (HIJA): HEREDA TODOS LOS MÉTODOS DE LA CLASE PADRE (Motor_Target)
    */
public class MotorEconomico extends Motor_Target{

    //CONSTRUCTOR DE LA CLASE MotorEconomico
    public MotorEconomico(){
    super();
        System.out.println("CONSTRUCTOR DE LA CLASE MotorEconomico");
    }
    
    
    //CREACIÓN DE LOS MÉTODOS ABSTRACTOS QUE HEREDA LA CLASE Motor_Target
    public void encender() {
        System.out.println("Encendiendo Motor Económico");
    }

    public void acelerar() {
        System.out.println("Acelerando Motor Económico");
    }

    public void apagar() {
       System.out.println("Apagando Motor Económico");
    }
    
}
