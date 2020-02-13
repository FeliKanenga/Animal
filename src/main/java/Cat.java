public class Cat extends Animal  {
    Cat (){

    }
    Cat (String name){ super(name); }
    @Override
    public void sounds() {
        System.out.println("Cat meows");
    }

}
