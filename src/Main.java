public class Main {
    public static void main(String[] args) {

        Student student = new Student("Edward", 105);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Grade: " + student.getGrade()); // Should print 0


        Math math = new Math();
        System.out.println("Multiplication (2 numbers): " + math.multiply(3, 4));
        System.out.println("Multiplication (3 numbers): " + math.multiply(2, 3, 4));

        // Demonstrating method overriding & polymorphism
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();


        Appliance fan = new Fan();
        Appliance tv = new TV();
        fan.turnOn();
        tv.turnOn();

        DivisionProgram div = new DivisionProgram();
        div.divideNumbers();
    }
}