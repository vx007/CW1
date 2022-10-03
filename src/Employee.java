import java.util.Objects;

public class Employee {
    private String fullName;
    private Integer department;
    private Double salary;
    public Integer id;

    public Employee(String fullName, Integer department, Double salary, Integer id) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Имя: '%s' (Отдел %d, Зарплата %.2f, ID %d)",
                fullName, department, salary, this.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(fullName, employee.fullName) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department);
    }
}