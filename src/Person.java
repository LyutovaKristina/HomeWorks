public class Person {
    private String name;
    private String job;
    private String mail;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String job, String mail, String phone, int salary, int age) {
        this.name = name;
        this.job = job;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\n" + "Job:" + job + "\n" + "Email:" + mail + "\n" + "Phone:" + phone + "\n" + "Salary:" + salary + "\n" + "Age:" + age + "";
    }


    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivan Ivanov", "Engeneer", "ivan@example.com", "892020202131",25000, 30);
        persArray[1] = new Person("Vasileva Elena", "Trainee", "elena@example.com", "89996541235", 10000, 25);
        persArray[2] = new Person("Kristina Lyutova", "Trainee", "kristina@example.com", "899945613232", 10500, 28);
        persArray[3] = new Person("Maxim Smirnov", "Engeneer", "maxim@example.com", "899956451254", 55000, 32);
        persArray[4] = new Person("Ekaterina Petrova", "Engeneer", "ekaterina@example.com", "899978985541", 48000, 25);
        for (Person person : persArray) {
            System.out.println(person);
        }
    }
}