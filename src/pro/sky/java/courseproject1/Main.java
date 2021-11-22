package pro.sky.java.courseproject1;

import pro.sky.java.courseproject1.Employee;

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
        System.out.println("Сумма зарплат: " + salarySumm());
        System.out.println("Среднее значение зарплат: " + getAverageSalary());
        getAllEmployeesFullName();
        int indexPercentage = 10;
        setIndexSalary(indexPercentage);
        getAllEmployeesInfo();
        int department = 2;
        System.out.println("getMinDepEmployee(department) = " + getMinDepEmployee(department));
        System.out.println("getMaxDepEmployee(department) = " + getMaxDepEmployee(department));
        System.out.println("getCalculateDepSalary(department) = " + getCalculateDepSalary(department));
        System.out.println("Средняя ЗП по отделу №" + department + " = " + getCalculateDepSalary(department)/getCalculateDepEmpNumber(department));
        printEmployeeDepInfo(department);
        double xIndex = 200_000;
        System.out.println("Сотрудник с ЗП меньше: " + xIndex + ": ");
        printEmployeeSalLessX(xIndex);
        System.out.println("Сотрудник с ЗП больше либо равной: " + xIndex + ": ");
        printEmployeeSalMoreX(xIndex);
    }

    private static void getAllEmployeesInfo() {
        for (Employee employee : employees) {
            System.out.println(employee.getId() + ". " + employee);
        }
    }

    private static void getAllEmployeesFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullname());
        }
    }

    private static Double salarySumm() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee minsalary() {
        int minSalId = 0;
        double minSal = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSal) {
                minSalId = i;
            }
        }
        return employees[minSalId];
    }

    private static Employee maxSalary() {
        int maxSalId = 0;
        double maxSal = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSal) {
                maxSalId = i;
            }
        }
        return employees[maxSalId];
    }

    private static double getAverageSalary() {
        return salarySumm() / employees.length;
    }

    private static void setIndexSalary(int indexPercent) {

        for (Employee employee : employees) {
            double index = 1 + indexPercent / 100f;
            employee.setSalary(employee.getSalary() * index);
        }
    }

    private static Employee getMinDepEmployee(int department) {
//        double sum = 0;
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i].getDepartment() == department) {
//                for (int j = 0; j < employees.length; j++) {
//                    sum += employees[i].getSalary();
//                }
//            }
//        }
//        return sum;
        double minSalary = Double.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;

    }

    private static Employee getMaxDepEmployee(int department) {
        double maxSalary = 0;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (maxSalary < employee.getSalary()) {
                    maxSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    private static double getCalculateDepSalary(int department) {
        double sumDepSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sumDepSalary += employee.getSalary();
            }
        }
        return sumDepSalary;
    }

    private static int getCalculateDepEmpNumber(int department) {
        int CalculateDepEmpNumber = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                CalculateDepEmpNumber++;
            }
        }
        return CalculateDepEmpNumber;
    }

    private static void printEmployeeDepInfo(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("Отдел №" + department + "; Id:" + employee.getId() + "; ФИО:" + employee.getFullname() + "; ЗП: " + employee.getSalary());
            }
        }
    }

    private static void printEmployeeSalMoreX(double x) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= x) {
                System.out.println(employee.getId() + ". ФИО:" + employee.getFullname() + "; ЗП: " + employee.getSalary());
            }
        }
    }

    private static void printEmployeeSalLessX(double x) {
        for (Employee employee : employees) {
            if (employee.getSalary() < x) {
                System.out.println(employee.getId() + ". ФИО:" + employee.getFullname() + "; ЗП: " + employee.getSalary());
            }
        }
    }
}
