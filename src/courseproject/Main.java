package courseproject;

class Courseproject {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Смирнов Дмитрий Дмитриевич", 1, 230_000);
        employees[1] = new Employee("Красовский Дмитрий Александрович", 1, 130_000);
        employees[2] = new Employee("Петров Алексей Федорович", 2, 280_000);
        employees[3] = new Employee("Ганина Ольга Васильевна", 2, 30_000);
        employees[4] = new Employee("Малиновский Артем Артемович", 3, 150_000);
        employees[5] = new Employee("Чернышов Роман Петрович", 3, 540_000);
        employees[6] = new Employee("Карпов Иван Дмитриевич", 4, 50_000);
        employees[7] = new Employee("Черепанов Александр Никитьевич", 4, 140_000);
        employees[8] = new Employee("Берликов Евгений Анатольевич", 5, 950_000);
        employees[9] = new Employee("Морозов Станислав Сергеевич", 5, 230_000);

        getAllEmployeesInfo();
        System.out.println("Сумма затрат на зарплату сотрудникам: " + salarySumm());
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + minsalary());
        System.out.println("Среднее значение зарплат: " + salarySumm());
        getAllEmployeesFullName();
    }

    private static void getAllEmployeesFullName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullname());
        }
    }


    private static int minsalary() {
        int minSalId = 0;
        double minSal = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSal) {
                minSalId = i;
            }
        }
        return minSalId;
    }

    private static int maxSalary() {
        int maxSalId = 0;
        double maxSal = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSal) {
                maxSalId = i;
            }
        }
        return maxSalId;
    }

    private static Double salarySumm() {
        double summ = 0;
        for (int i = 0; i < employees.length; i++) {
            summ += employees[i].getSalary();
        }
        return summ;
    }

    private static void getAllEmployeesInfo() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println((i + 1) + ". " + employees[i].toSting());
        }
    }

}
