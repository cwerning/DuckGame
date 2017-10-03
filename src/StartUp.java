/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author L115student
 */
public class StartUp {
    
    public static void main(String[] args) {
        /*Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.performQuack();
        redHeadDuck.performFly();
        
        Duck rubberDuck = new RubberDuck();
        rubberDuck.performQuack();
        rubberDuck.performFly();*/
        
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
    
}
