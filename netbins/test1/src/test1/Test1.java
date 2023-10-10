package test1;
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        person1.sayHello();
    }
    
}

//package test1;
//class fac{
//    public long facc(int n){
//        long x=1;
//        for (int i = 1; i <= n; i++) {
//            x *= i;
//        }
//        return x;
//    }
//}
//public class Test1 {
//    public static void main(String[] args) {
//        int number = 5;
//        fac f = new fac();
//        long a=f.facc(number);
//        System.out.println("Factorial of " + number + " is " + a);
//    }
//}