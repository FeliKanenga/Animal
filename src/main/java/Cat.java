public class Cat extends Animal  {

    private String name = "Storm";

    @Override
    public void sounds() {
        System.out.println("Cat meows");
    }

    @Override
    public void eat (){
        System.out.println(name +" eats");
    }
}
