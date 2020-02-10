public class Dog extends Animal {

    private String name = "Rax";

    @Override
    public void sounds() {

        System.out.println("Dog barks");
    }
    @Override
    public void eat (){
        System.out.println( name + " eats");
    }
}
