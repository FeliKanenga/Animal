public class Dog extends Animal {
    private String name;
     Dog(){

    }
    Dog (String name){
        super(name);
    }

    @Override
    public void sounds() {

        System.out.println("Dog barks");

    }

}
