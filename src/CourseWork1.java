public class CourseWork1 {


    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook(10);
        book.add(new Employee("Иванов Иван Иванович", 3, 10_000.0));
        book.add(new Employee("Сидоров Пётр Петрович", 1, 5_000.0));
        book.add(new Employee("Петров Алексей Петрович", 2, 90_000.0));
        book.add(new Employee("Иванов Иван Алексеевич", 3, 70_000.0));
        book.add(new Employee("Васильев Алексей Иванович", 4, 30_000.0));
        book.add(new Employee("Иванов Тимофей Денисович", 5, 80_000.0));

        System.out.println("Печатаем всех...");
        book.print();
        printSeparator();

        System.out.println("Удаляем сотрудника...");
        book.delete(3);
        book.print();
        printSeparator();

        System.out.println("Меняем зарплату...");
        book.editSalary("Васильев Алексей Иванович", 40_000.0);
        book.print();
        printSeparator();

        System.out.println("Меняем отдел...");
        book.editDepartment("Васильев Алексей Иванович", 5);
        book.editDepartment("Сидоров Пётр Петрович", 5);
        book.print();
        printSeparator();

        System.out.println("Измеряем зарплаты...");
        System.out.println("Сумма зарплат = " + book.calcSumSalary());
        System.out.println("Средняя зарплата = " + book.calcMeanSalary());
        System.out.println("Сотрудник с минимальной зарплатой:\n" + book.findMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой:\n" + book.findMaxSalary());
        printSeparator();

        System.out.println("Индексируем зарплаты...");
        book.indexSalary(3.0);
        book.print();
        printSeparator();

        System.out.println("Проверяем зарплаты...");
        book.printLessThanSalary(50_000.0);
        book.printMoreThanSalary(50_000.0);
        printSeparator();

        System.out.println("ОТДЕЛ=5");
        printSeparator();
        book.print(5);
        printSeparator();

        System.out.println("Измеряем зарплаты...");
        System.out.println("Сумма зарплат по отделу= " + book.calcSumSalary(5));
        System.out.println("Средняя зарплата по отделу= " + book.calcMeanSalary(5));
        System.out.println("Сотрудник с минимальной зарплатой в отделе 5:\n" + book.findMinSalary(5));
        System.out.println("Сотрудник с максимальной зарплатой в отделе 5:\n" + book.findMaxSalary(5));
        printSeparator();

        System.out.println("Индексируем зарплаты...");
        book.indexSalary(5, 5.0);
        book.print(5);
        printSeparator();
    }

    public static void printSeparator() {
        System.out.println("==================================================");
    }
}
