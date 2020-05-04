package Eager;

public class Main {
    public static void main(String[] args)
    {
EagerInit eagerInit1=EagerInit.getInstance();
EagerInit eagerInit2=EagerInit.getInstance();
System.out.println(eagerInit1.getName());
System.out.println(eagerInit2.hashCode());


    }
}
