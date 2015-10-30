package company;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class Employee implements Serializable {

    private String name;
    private int experience;
    private Date hireDay;
    private Date birthday;
    private double salary;
    private double riseSalary;

    public Employee(String name, int experience, int yearH, int monthH, int dayH, int yearB, int monthB, int dayB) {
        this.name = name;
        this.experience = experience;
        GregorianCalendar calendar = new GregorianCalendar(yearH, monthH -1, dayH);
        hireDay = calendar.getTime();
        GregorianCalendar calendar2 = new GregorianCalendar(yearB, monthB -1, dayB);
        birthday = calendar2.getTime();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public Date getBirthday() {
        return birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary + riseSalary;
    }

    public double getRiseSalary() {
        return riseSalary;
    }

    public void setRiseSalary(double riseSalary) {
        this.riseSalary += riseSalary;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        return "\n***EMPLOYEE***\n" + "Employee name: " + getName() + "\nExperience: " + getExperience() + "\nBirthday: " + sdf.format(getBirthday()) + "\nHire day: " + sdf.format(getHireDay()) + "\nSalary: " + getSalary() + " $" + "\nExtra money: " + getRiseSalary() + " $";
    }
}
