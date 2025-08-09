/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence_system_project;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args){
        Controller controller = new Controller();
        
        MainController mainController = new MainController(controller);
        mainController.setVisible(true);
        
        Helicopter helicopter = new Helicopter(controller);
        helicopter.setVisible(true);
        
//        Tank tank = new Tank();
//        tank.setVisible(true);

        Tank tank = new Tank(controller);
        tank.setVisible(true);
        
        Submarine submarine = new Submarine(controller);
        submarine.setVisible(true);
        
        controller.addObserver(helicopter);
        controller.addObserver(tank);
        controller.addObserver(submarine);
        controller.addObserver(mainController);
        
    }
}
