package stream;

public class Person implements Comparable<Person> {
//imprementacja interfejsu Comparable w celu sortowani
// klasa jest porównywalna
// na dole sortowanie przez compareTo


//id,first_name,last_name,age
//ta klasa to klasa typu POJO


    private int id;
    private String name;
    private String lastName;
    private int age;

    public Person(int id, String name, String surName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = surName;
        this.age = age;
    }

    public Person() {
    }

    //zeby uchronic sie przed nullem w geterze mozna dodac aby jeśli jest null to dał jakąs wersje domyślną
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {

        // sortowanie Z->A
/*        int i = o.getLastName().compareTo(this.lastName);
        if (i==0){
            i = o.getName().compareTo(this.name);
        }
        return i;*/

// Sortowanie A->Z
        int i = this.getLastName().compareTo(o.lastName);
        if (i == 0) {
            i = this.getName().compareTo(o.name);
        }
        return i;
    }
}
