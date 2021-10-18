package Models;

public class Person {
    private String name;
    private String age;
    private String role;
    private long salary;

    public Person() {
    }


    public Person(String name, String age, String role, long salary) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (getRole().equalsIgnoreCase("principal")) {
            this.name = name;
        }
        else{
            System.out.println("You are not a principal so you can't change my name");
        }
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
