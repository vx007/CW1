public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(Integer size) {
        employees = new Employee[size];
    }

    public void print() {
        for (Employee person : employees) {
            if (person != null) {
                System.out.println(person);
            }
        }
    }

    public void print(Integer department) {
        for (Employee person : employees) {
            if (person != null && person.getDepartment().equals(department)) {
                System.out.println(person);
            }
        }
    }

    public void add(Employee employee) {
        for (int i = 0; i < employees.length; i++)
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
    }

    public void delete(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(name)) {
                employees[i] = null;
                break;
            }
        }
    }

    public void delete(Integer id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId().equals(id)) {
                employees[i] = null;
                break;
            }
        }
    }

    public void editSalary(String name, Double salary) {
        for (Employee person : employees) {
            if (person != null && person.getFullName().equals(name)) {
                person.setSalary(salary);
            }
        }
    }

    public void editDepartment(String name, Integer department) {
        for (Employee person : employees) {
            if (person != null && person.getFullName().equals(name)) {
                person.setDepartment(department);
            }
        }
    }

    public Employee find(String name) {
        for (Employee person : employees) {
            if (person != null && person.getFullName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public Employee find(Double salary) {
        for (Employee person : employees) {
            if (person != null && person.getSalary().equals(salary)) {
                return person;
            }
        }
        return null;
    }

    public Integer findCount() {
        Integer count = 0;
        for (Employee person : employees) {
            if (person != null) {
                count++;
            }
        }
        return count;
    }

    public Integer findCount(Integer department) {
        Integer count = 0;
        for (Employee person : employees) {
            if (person != null && person.getDepartment().equals(department)) {
                count++;
            }
        }
        return count;
    }

    public Employee findMinSalary() {
        Double min = Double.MAX_VALUE;
        for (Employee person : employees) {
            if (person != null && person.getSalary() < min) {
                min = person.getSalary();
            }
        }
        return find(min);
    }

    public Employee findMinSalary(Integer department) {
        Double min = Double.MAX_VALUE;
        for (Employee person : employees) {
            if (person != null && person.getDepartment().equals(department) && person.getSalary() < min) {
                min = person.getSalary();
            }
        }
        return find(min);
    }

    public Employee findMaxSalary() {
        Double max = 0.0;
        for (Employee person : employees) {
            if (person != null && person.getSalary() > max) {
                max = person.getSalary();
            }
        }
        return find(max);
    }

    public Employee findMaxSalary(Integer department) {
        Double max = 0.0;
        for (Employee person : employees) {
            if (person != null && person.getDepartment().equals(department) && person.getSalary() > max) {
                max = person.getSalary();
            }
        }
        return find(max);
    }

    public Double calcSumSalary() {
        Double sum = 0.0;
        for (Employee person : employees) {
            if (person != null) {
                sum += person.getSalary();
            }
        }
        return sum;
    }

    public Double calcSumSalary(Integer department) {
        Double sum = 0.0;
        for (Employee person : employees) {
            if (person != null && person.getDepartment().equals(department)) {
                sum += person.getSalary();
            }
        }
        return sum;
    }

    public Double calcMeanSalary() {
        return calcSumSalary() / findCount();
    }

    public Double calcMeanSalary(Integer department) {
        return calcSumSalary(department) / findCount(department);
    }

    public void indexSalary(Double percent) {
        for (Employee person : employees) {
            if (person != null) {
                person.setSalary(person.getSalary() * (1 + percent / 100));
            }
        }
    }

    public void indexSalary(Integer department, Double percent) {
        for (Employee person : employees) {
            if (person != null && person.getDepartment().equals(department)) {
                person.setSalary(person.getSalary() * (1 + percent / 100));
            }
        }
    }

    public void printMoreThanSalary(Double salary) {
        for (Employee person : employees) {
            if (person != null && person.getSalary() >= salary) {
                System.out.println(person);
            }
        }
    }

    public void printLessThanSalary(Double salary) {
        for (Employee person : employees) {
            if (person != null && person.getSalary() < salary) {
                System.out.println(person);
            }
        }
    }
}
