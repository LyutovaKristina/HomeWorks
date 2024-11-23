import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;


    public PhoneBook() {
        phoneBook = new HashMap<>();
    }


    public void add(String lastName, String phoneNumber) {

        List<String> numbers = phoneBook.getOrDefault(lastName, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(lastName, numbers);
    }


    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, Collections.emptyList());
    }


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();


        phoneBook.add("Lyutova", "123456789");
        phoneBook.add("Ivanov", "987654321");
        phoneBook.add("Petrova", "555666777");
        phoneBook.add("Smirnova", "123123123");


        List<String> lyutovaNumbers = phoneBook.get("Lyutova");
        List<String> ivanovNumbers = phoneBook.get("Ivanov");
        List<String> petrovaNumbers = phoneBook.get("Petrova");
        List<String> nonexistentNumbers = phoneBook.get("Unknown");

        // Выводим результаты
        System.out.println("Телефон Лютовой: " + lyutovaNumbers);
        System.out.println("Телефон Иванова: " + ivanovNumbers);
        System.out.println("Телефон Петровой: " + petrovaNumbers);
        System.out.println("Телефон для несуществующей фамилии: " + nonexistentNumbers);
    }
}
