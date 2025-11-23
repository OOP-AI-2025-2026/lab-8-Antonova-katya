package ua.opnu;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--- Завдання 1 ---");
        // 1. Порожній
        MyOptional<String> middleName = new MyOptional<>();
        System.out.println("\n1-Порожнє значення: ");
        System.out.println(middleName);
        System.out.println("isPresent: " + middleName.isPresent());
        System.out.println("isEmpty: " + middleName.isEmpty());
        System.out.println("orElse: " + middleName.orElse("немає"));

        // 2. Є значення
        MyOptional<String> username = new MyOptional<>("admin");
        System.out.println("\n2-Заповнене значення: ");
        System.out.println(username);
        System.out.println("isPresent: " + username.isPresent());
        System.out.println("isEmpty: " + username.isEmpty());
        System.out.println("get(): " + username.get());
        System.out.println("orElse: " + username.orElse("guest"));

        // 3. Перевіримо, що get() на порожньому об'єкті кидає помилку
        System.out.println("\n3-Перевірка get() на пустому: ");
        try {
            String test = middleName.get();
            System.out.println("unexpected: " + test);
        } catch (IllegalStateException ex) {
            System.out.println("Очікуваний виняток: " + ex.getMessage());
        }

        // 4. Перевіримо, що конструктор не приймає null
        System.out.println("\n4-null у конструкторі: ");
        try {
            MyOptional<String> broken = new MyOptional<>(null);
            System.out.println("unexpected: " + broken);
        } catch (IllegalArgumentException ex) {
            System.out.println("Правильно не дозволив null: " + ex.getMessage());
        }

        System.out.println("\n--- Завдання 6 ---");

        GenericTwoTuple<String, Integer> userInfo =
                new GenericTwoTuple<>("Катерина", 18);
        System.out.println(userInfo);
        System.out.println("Ім'я: " + userInfo.first);
        System.out.println("Вік: " + userInfo.second);

        GenericThreeTuple<String, Integer, Boolean> advanced =
                new GenericThreeTuple<>("Антонова", 243, true);
        System.out.println(advanced);
        System.out.println("First: " + advanced.getFirst());
        System.out.println("Second: " + advanced.getSecond());
        System.out.println("Third: " + advanced.third);
    }
}
