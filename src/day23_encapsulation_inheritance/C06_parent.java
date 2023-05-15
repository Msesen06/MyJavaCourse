package day23_encapsulation_inheritance;

public class C06_parent {

    private String privateStr;
    String defaultStr="parent class default";
    protected String protectedStr;
    public String publicStr;
    public static void main(String[] args) {

    }

    private void privateMethod(){
        System.out.println("parent class private method");
    }
    void defaultMethod(){
        System.out.println("parent class default method");
    }
    protected void protectedMethod(){
        System.out.println("parent class protected method");
    }
    public void publicMethod(){
        System.out.println("parent class public method");
    }


}
