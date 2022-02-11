/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author araju55
 */
public class Talking extends AnimalDecorator {
    
    public Talking(Animal animal) {
        super(animal);
    }
    
    @Override
    public String getDescription() {
        return "talking " + getBaseAnimal().getDescription();
    }
    
    @Override
    public double getWeight() {
        return 5 * getBaseAnimal().getWeight();
    }
}
