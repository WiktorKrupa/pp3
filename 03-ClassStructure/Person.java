class Person
{
    private String name;
    private int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return age;
    }
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    boolean isAdult(){
        if (getAge()<18) return false;
        else return true;
    }
    public String toString(){
        return (name+','+age);
    }
    public static void main(String[] args){
        Person p = new Person("Anna", 21);
        System.out.println(p.getAge());
        p.isAdult();
        p.setAge(17);
        p.isAdult();
        p.toString();
    }
}