public class Person
{
    String name;
    int age;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public boolean isAdult(){
        if (getAge()<18) return false;
        else return true;
    }
    public String toString(){
        return (name+','+age);
    }
    public static void main(String[] args){
        Person p = new Person("Anna", 21);
        p.getAge();
        p.isAdult();
        p.setAge(17);
        p.isAdult();
        p.toString();
    }
}