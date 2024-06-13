class ParentClass {
    void parentMethod() {
        System.out.println("This is parent class");
    }
}

class ChildClass extends ParentClass {
    void childMethod() {
        System.out.println("This is child class");
    }
}

public class ParentClass {
    public static void main(String[] args) {

        ParentClass parentObj = new ParentClass();


        ChildClass childObj = new ChildClass();


        parentObj.parentMethod();

        childObj.childMethod();

        childObj.parentMethod();
    }
}
