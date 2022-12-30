public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        System.out.println("Задача 1!");
       String lastName = "Ivanov";
       String firstName = "Ivan";
       String middleName= "Ivanovich";
       String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника: " + fullName);
    }
    public static void task2(){
        System.out.println("Задача 2!");
        String lastName = "Ivanov";
        String firstName = "Ivan";
        String middleName= "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        String upperName = fullName.toUpperCase();
        System.out.println(upperName);
    }
    public static void task3(){
        System.out.println("Задача 3!");
        String fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace("ё","е");
        System.out.println(fullNameTrue);
    }
}

