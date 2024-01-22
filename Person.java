public class Person {
    private String name;
    private double age;
    public Person(String name,double age) {this.name = name;
    this.age = age;
    }
    public String toString() {
    return "== Person Details ==\n" +
    "Name: "+ name +"\nAge: " + age;
    }
   }