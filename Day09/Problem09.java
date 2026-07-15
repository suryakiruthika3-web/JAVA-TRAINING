public class Problem09 {
    public static void main(String[] args) {
        GrandParent gp = new GrandParent();
        Parent p = new Child();
        Child c = (Child) p; 
        gp.name();
        p.name();
        c.name();
    }
}
class GrandParent {
    void name(){
        System.out.println("I am GrandParent");
    }
}
class Parent extends GrandParent {
    void name() {
        System.out.println("I am Parent");
    }
}
class Child extends Parent {
    void name(){
        System.out.println("I am Child");
    }
}