public class Main {
    public static void main(String[] args) {

        // task1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //task2

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());

        //task3

        String fullNameAnother = "Иванов Семён Семёнович";
        fullNameAnother = fullNameAnother.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullNameAnother);
    }
}