public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Иван";
        String miiddleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + miiddleName;
        System.out.println(fullName);
        System.out.println("Задание 2");
        String fullNameForReport = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameForReport);
        System.out.println("Задание 3");
        fullName = fullName.replace("ё", "e");
        System.out.println(fullName);

    }
}