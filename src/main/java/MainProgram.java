public class MainProgram {
    public static void main(String[] args) {
        
        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();

        Dog dog3 = new Dog("Rex");
        Cat cat2 = new Cat("Stormy");

        home.makeAllSounds();

        home.adoptPet(dog1) ;
        home.makeAllSounds();

        home.adoptPet(cat1);
        home.makeAllSounds();

        home.adoptPet(dog2);
        home.makeAllSounds();

        dog3.eat();
        cat2.eat();
    }
}
