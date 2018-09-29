/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Back_End;

/**
 *
 * @author TR
 */
public class MotorAdapter extends Motor_Target {
    
    private MotorElectrico motorelectrico;
    
    public MotorAdapter(){
    super();
    motorelectrico = new MotorElectrico();
    }

     public void encender() {
        System.out.println("Encendiendo motor electricoadapter");  
    }

    @Override
    public void acelerar() {
        System.out.println("acelerando motor electricoadapter...."); 
     
    }

    @Override
    public void apagar() {
        System.out.println("apagando motor electricoadapter");
    }
}
