package company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;


public class Company implements Serializable {
    private String companyName;
    private List<Department> departments;


  public Company(String companyName, List<Department> departments) {
        this.companyName = companyName;
        this.departments = departments;

    }

  public String getCompanyName() {
        return companyName;
    }

  public List<Department> getDepartments() {
        return departments;
    }

  public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

  public void removeEmployee() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int employee;
        while (true) {
            employee = 0;
            System.out.print("Enter employee's name to remove it or \"Enter\" to exit: ");
            String fio = br.readLine();
            if (fio.isEmpty()) break;

            for (int i = 0; i < getDepartments().size(); i++) {
                //getDepartments().get(i);
                for (int j = 0; j < getDepartments().get(i).getDepartmentManagers().size(); j++) {
                    //getDepartments().get(i).getDepartmentManagers().get(j);
                    for (int k = 0; k < getDepartments().get(i).getDepartmentManagers().get(j).getEmployees().size(); k++) {
                        if (getDepartments().get(i).getDepartmentManagers().get(j).getEmployees().get(k).getName().equals(fio)) {
                            getDepartments().get(i).getDepartmentManagers().get(j).getEmployees().remove(k);
                            System.out.println("Employee fired");
                            employee++;
                            getDepartments().get(i).getDepartmentManagers().get(j).setEmployeesSalary();
                        }
                    }

                }

            }
            if (employee == 0)
                System.out.println("There're not such employee in the firm");
        }
    }

  public void hireEmployee () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            for (int i = 0; i < getDepartments().size(); i++) {

                System.out.println(i + ". " + getDepartments().get(i).getDepartmentName());
            }

            System.out.print("Select department(enter department name or \"Enter\" to exit): ");
            String departmentName = br.readLine();

            if (departmentName.isEmpty()) break;
            int n = 0;
            for (int i = 0; i < getDepartments().size(); i++) {


                if (getDepartments().get(i).getDepartmentName().equals(departmentName)) ;
                {
                    n++;
                    while (true) {
                        for (int j = 0; j < getDepartments().get(i).getDepartmentManagers().size(); j++) {
                            System.out.println(j + ". " + getDepartments().get(i).getDepartmentManagers().get(j).getName());
                        }
                        System.out.print("Select manager(enter manager name or \"Enter\" to exit): ");
                        String managerName = br.readLine();
                        if (managerName.isEmpty()) break;
                        int m = 0;
                        for (int j = 0; j < getDepartments().get(i).getDepartmentManagers().size(); j++) {

                            if (getDepartments().get(i).getDepartmentManagers().get(j).getName().equals(managerName)) ;{
                                m++;
                                getDepartments().get(i).getDepartmentManagers().get(j).hire();
                            }
                        }
                        if(m == 0) {
                            System.out.println("There're not such manager in the company");

                        }
                    }
                }
            }
            if(n == 0) {
                 System.out.println("There're not such department in the company");

            }



        }
    }

  public void sortName() {

        for (int i = 0; i < getDepartments().size(); i++) {
            for (int j = 0; j < getDepartments().get(i).getDepartmentManagers().size(); j++) {
                getDepartments().get(i).getDepartmentManagers().get(j).sortName();
            }
        }
       System.out.println("Employees sorted");
    }

  public void sortExperience() {

        for (int i = 0; i < getDepartments().size(); i++) {
            for (int j = 0; j < getDepartments().get(i).getDepartmentManagers().size(); j++) {
                getDepartments().get(i).getDepartmentManagers().get(j).sortExperience();
            }
        }
       System.out.println("Employees sorted");
    }

  public void sortHireDate() {

        for (int i = 0; i < getDepartments().size(); i++) {
            for (int j = 0; j < getDepartments().get(i).getDepartmentManagers().size(); j++) {
                getDepartments().get(i).getDepartmentManagers().get(j).sortHireDate();
            }
        }
       System.out.println("Employees sorted");
    }

  public void sortAllByName() {
        List <Employee> everybody = new ArrayList<Employee>();

        for (int i = 0; i < getDepartments().size(); i++) {
            for (int j = 0; j < getDepartments().get(i).getDepartmentManagers().size(); j++) {
                everybody.addAll(getDepartments().get(i).getDepartmentManagers().get(j).getEmployees());
            }
        }

        Collections.sort(everybody, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (int i = 0; i < everybody.size(); i++) {
            System.out.println(everybody.get(i));

        }
    }

  public void sortAllByExperience() {
        List <Employee> everybody = new ArrayList<Employee>();

        for (int i = 0; i < getDepartments().size(); i++) {
            for (int j = 0; j < getDepartments().get(i).getDepartmentManagers().size(); j++) {
                everybody.addAll(getDepartments().get(i).getDepartmentManagers().get(j).getEmployees());
            }
        }

        Collections.sort(everybody, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getExperience() - o2.getExperience();
            }
        });
        for (int i = 0; i < everybody.size(); i++) {
            System.out.println(everybody.get(i));

        }
    }

  public void sortAllByHireDate() {
        List <Employee> everybody = new ArrayList<Employee>();

        for (int i = 0; i < getDepartments().size(); i++) {
            for (int j = 0; j < getDepartments().get(i).getDepartmentManagers().size(); j++) {
                everybody.addAll(getDepartments().get(i).getDepartmentManagers().get(j).getEmployees());
            }
        }

        Collections.sort(everybody, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getHireDay().compareTo(o2.getHireDay());
            }
        });
        for (int i = 0; i < everybody.size(); i++) {
            System.out.println(everybody.get(i));

        }
    }

  public void riseSalary() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int employee;
        while (true) {
            employee = 0;
            System.out.print("Enter employee's name to rise his salary or \"Enter\" to exit: ");
            String fio = br.readLine();
            if (fio.isEmpty()) break;
            int difference = 0;

            for (int i = 0; i < getDepartments().size(); i++) {
                //getDepartments().get(i);
                for (int j = 0; j < getDepartments().get(i).getDepartmentManagers().size(); j++) {
                    //getDepartments().get(i).getDepartmentManagers().get(j);
                    for (int k = 0; k < getDepartments().get(i).getDepartmentManagers().get(j).getEmployees().size(); k++) {
                        if (getDepartments().get(i).getDepartmentManagers().get(j).getEmployees().get(k).getName().equals(fio)) {
                            while (difference <= 0) {
                                System.out.print("Enter number (more than \"0\"): ");
                                try {
                                    difference = Integer.parseInt(br.readLine());
                                } catch (NumberFormatException e) {
                                    System.out.println("Enter  digit, please");
                                    difference = 0;
                                }
                            }
                            getDepartments().get(i).getDepartmentManagers().get(j).getEmployees().get(k).setRiseSalary(difference);
                            System.out.println("Employee's salary raised");
                            employee++;
                            getDepartments().get(i).getDepartmentManagers().get(j).setEmployeesSalary();
                        }
                    }

                }

            }
            if (employee == 0)
                System.out.println("There're not such employee in the firm");
        }
    }

  public void reduceSalary() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int employee;
        while (true) {
            employee = 0;
            System.out.print("Enter employee's name to reduce his salary or \"Enter\" to exit: ");
            String fio = br.readLine();
            if (fio.isEmpty()) break;
            int difference = 0;

            for (int i = 0; i < getDepartments().size(); i++) {
                //getDepartments().get(i);
                for (int j = 0; j < getDepartments().get(i).getDepartmentManagers().size(); j++) {
                    //getDepartments().get(i).getDepartmentManagers().get(j);
                    for (int k = 0; k < getDepartments().get(i).getDepartmentManagers().get(j).getEmployees().size(); k++) {
                        if (getDepartments().get(i).getDepartmentManagers().get(j).getEmployees().get(k).getName().equals(fio)) {
                            while (difference <= 0) {
                                System.out.print("Enter number (more than \"0\"): ");
                                try {
                                    difference = Integer.parseInt(br.readLine());
                                } catch (NumberFormatException e) {
                                    System.out.println("Enter  digit, please");
                                    difference = 0;
                                }
                            }
                            getDepartments().get(i).getDepartmentManagers().get(j).getEmployees().get(k).setRiseSalary(-difference);
                            System.out.println("Employee's salary reduced");
                            employee++;
                            getDepartments().get(i).getDepartmentManagers().get(j).setEmployeesSalary();
                        }
                    }

                }

            }
            if (employee == 0)
                System.out.println("There're not such employee in the firm");
        }
    }

  public void givePrize() throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM");

            int employee = 0;
            for (int i = 0; i < getDepartments().size(); i++) {
                for (int j = 0; j < getDepartments().get(i).getDepartmentManagers().size(); j++) {
                    for (int k = 0; k < getDepartments().get(i).getDepartmentManagers().get(j).getEmployees().size(); k++) {
                        if (sdf.format(getDepartments().get(i).getDepartmentManagers().get(j).getEmployees().get(k).getBirthday()).equals(sdf.format(new GregorianCalendar( 0000, 2, 8).getTime())) ||
                                sdf.format(getDepartments().get(i).getDepartmentManagers().get(j).getEmployees().get(k).getBirthday()).equals(sdf.format(new GregorianCalendar( 0000, 10, 14).getTime())) ||
                                sdf.format(getDepartments().get(i).getDepartmentManagers().get(j).getEmployees().get(k).getBirthday()).equals(sdf.format(new GregorianCalendar( 0000, 0, 1).getTime()))) {
                            getDepartments().get(i).getDepartmentManagers().get(j).getEmployees().get(k).setRiseSalary(500);
                            System.out.println("Employee's " + getDepartments().get(i).getDepartmentManagers().get(j).getEmployees().get(k).getName() + " salary raised");
                            employee++;
                            getDepartments().get(i).getDepartmentManagers().get(j).setEmployeesSalary();
                        }
                    }

                }

            }
            if (employee == 0)
                System.out.println("There're no lucky employees in the firm");

    }

  public String toString() {
        String s = "";
        for (int i = 0; i < getDepartments().size(); i++)
            s += getDepartments().get(i);
        return "\n\n***" + getCompanyName().toUpperCase() + " Co***\n\n" + s;
    }
}
