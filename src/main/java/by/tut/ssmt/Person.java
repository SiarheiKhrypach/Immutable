package by.tut.ssmt;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Person clone() {
        Person person = new Person();
        person.name = this.name;
        return person;
    }
}
