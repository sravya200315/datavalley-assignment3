abstract class Animal { 

    private String Animalname; 
    public Animal(String Animalname) { this.Animalname = Animalname; } 
    public abstract void makeSound(); 
    
    public String setName() { return Animalname; } 
    
    } 
    
    // Abstracted class 
    
    class Dog extends Animal { 
    
    public Dog(String Animalname) { super(Animalname); } 
    public void makeSound() 
    
    { 
        System.out.println(setName() + " barks"); 
    
    }
 }
    // Abstracted class 
    
    class Cat extends Animal { 
    
    public Cat(String Animalname) { super(Animalname); } 
    
public void makeSound() 
    
    { 
      System.out.println(setName() + " meoms"); 
    } 
    
    } 
    
    
    // Driver Class 
    
    public class Abstraction { 

    
    public static void main(String[] args) 
    
    { 
        Animal dog = new Dog("Dog"); 
       Animal cat = new Cat("Cat"); 

    
    dog.makeSound(); 
    
    cat.makeSound(); 
    
    } 
    
    }