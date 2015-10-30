package company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

public class Manager extends Employee {

    private double managerSalary;
    private double  EMPLOYEE_SALARY = 30000;
    private List<Employee> employees;

    public Manager(String name, int experience, int yearH, int monthH, int dayH, int yearB, int monthB, int dayB, double managerSalary,  List<Employee> employees) {
        super(name, experience, yearH, monthH, dayH, yearB, monthB, dayB);
        this.managerSalary = managerSalary;
        this.employees = employees;
        setEmployeesSalary();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setEmployeesSalary() {

        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).setSalary(EMPLOYEE_SALARY / employees.size());
        }
    }

   public double getManagerSalary() {
        return managerSalary;
   }

   public void sortName () {

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
   }

    public void sortExperience() {

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getExperience() - o2.getExperience();
            }
        });
    }

    public void sortHireDate () {

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getHireDay().compareTo(o2.getHireDay());
            }
        });
    }
    @Deprecated
    public void hire() throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("Enter employee's name to add it or \"Enter\" to exit: ");
            String name = br.readLine();
            if (name.isEmpty()) break;

            int experience = -1;
            while (experience < 0) {
                System.out.print("Enter employee's experience: ");
                try {
                    experience = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Enter number, please");

                }
                if (experience < 0)
                    System.out.println("Enter number bigger than 0, please");

            }

           /* int yearH = 2009;
            while (yearH < 2010) {
                System.out.print("Enter year of employing (starting from 2010): ");
                try {
                    yearH = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Enter number digit, please");
                    yearH = 2009;
                }
                if (yearH < 2010)
                    System.out.println("Enter number bigger than 2010, please");

            }

            int monthH = 0;
            while (monthH < 1 || monthH > 12) {
                System.out.print("Enter month of employing: ");
                try {
                    monthH = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Enter number digit, please");
                    monthH = 0;
                }
                if (monthH < 1 || monthH > 12)
                    System.out.println("Enter number bigger than 0 and less then 13, please");

            }

            int dayH = 0;
            while (dayH < 1 || dayH > 31) {
                System.out.print("Enter day of employing: ");
                try {
                    dayH = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Enter number digit, please");
                    dayH = 0;
                }
                if (dayH < 1 || dayH > 31)
                    System.out.println("Enter number bigger than 0 and less then 32, please");

            }*/
            int yearB = 1949;
            while (yearB < 1950) {
                System.out.print("Enter year of employee birth (starting from 1950): ");
                try {
                    yearB = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Enter number, please");
                    yearB = 1949;
                }
                if (yearB < 1950)
                    System.out.println("Enter number bigger than 1950, please");

            }

            int monthB = 0;
            while (monthB < 1 || monthB > 12) {
                System.out.print("Enter month of employee birth: ");
                try {
                    monthB = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Enter number, please");
                    monthB = 0;
                }
                if (monthB < 1 || monthB > 12)
                    System.out.println("Enter number bigger than 0 and less then 13, please");

            }

            int dayB = 0;
            while (dayB < 1 || dayB > 31) {
                System.out.print("Enter day of employee birth: ");
                try {
                    dayB = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Enter number, please");
                    dayB = 0;
                }
                if (dayB < 1 || dayB > 31)
                    System.out.println("Enter number bigger than 0 and less then 32, please");

            }
            Date today = new Date();
            int dayH = today.getDate();
            int  monthH = today.getMonth() + 1;
            int yearH = today.getYear() + 1900;



            Employee employee = new Employee(name, experience, yearH, monthH, dayH, yearB, monthB, dayB);

            getEmployees().add(employee);
            setEmployeesSalary();

        }
    }

   public String toString() {
       SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
       String s = "";
       for (int i = 0; i < employees.size(); i++)
           s += employees.get(i);
       return "\n***MANAGER***\n" + "Manager name: " + getName() + "\nExperience: " + getExperience() + "\nBirthday: " + sdf.format(getBirthday()) + "\nHire day: " + sdf.format(getHireDay()) + "\nSalary: " + getManagerSalary() + " $" + "\n*********" + s;
   }

}

