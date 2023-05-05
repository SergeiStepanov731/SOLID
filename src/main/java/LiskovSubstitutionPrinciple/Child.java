package LiskovSubstitutionPrinciple;

public class Child extends Parent {
    @Override
    public void doSmth(){
        throw new RuntimeException();
    }
}
