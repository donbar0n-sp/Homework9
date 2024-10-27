public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("task1");
        int[] expensesWeekly = {400000, 55000, 800000, 610000, 30002};
        int sum = 0;
        for (int i : expensesWeekly) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //task2
        System.out.println("task2");
        int minExpenses = 1000000000;
        for (int j : expensesWeekly) {
            if (j < minExpenses) {
                minExpenses = j;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей");
        int maxExpenses = -1;
        for (int j : expensesWeekly) {
            if (maxExpenses < j) {
                maxExpenses = j;
            }
        }
        System.out.println("Максимальная  сумма трат за неделю составила " + maxExpenses + " рублей");

        //task3
        System.out.println("task3");
        float sumFloat = sum;
        System.out.println("Средняя сумма трат за месяц составила " + sumFloat / expensesWeekly.length + " рублей");

        //task4
        System.out.println("task4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}