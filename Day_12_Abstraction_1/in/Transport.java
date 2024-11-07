package Day_12_Abstraction_1.in;

public interface Transport {
    void getSetGo();

    /**
     * Must be defined by the class which implements it.
     * If the implemented class is abstract then its child must define the function
     * by default the method is public and abstract for all properties defined in interface
     * Used to implement multiple interface that in return supports multiple inheritence
     * class Dog extends Animal implements Pet, Breed, ...
     *  Pet and Breed are interfaces and can have any in number
    */
}
