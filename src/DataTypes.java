public class DataTypes {
    public static void main(String[] args) {
        var hello = '@';

        var salary = 1000.0;
        // pensión 3%
        var pension = salary * 0.3;
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println("Pensión: " + pension);
        System.out.println(totalSalary);

    }
}
