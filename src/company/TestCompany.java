package company;


import java.io.*;

/**
 * Created by Vorobiei on 28.04.2015.
 */
public class TestCompany {

    public static void  main (String[] args) throws IOException {

          /* //create three departments
            //in each department put array consist of two managers
            //each manager consist of manager information fields and array of employees
            Department sportD = new Department("Sport department",   new ArrayList<Manager>());

            new ArrayList<Manager>().add(new Manager("Yevhen Vorobiei", 5, 2015, 5, 27, 1989, 3, 13, 7500, new ArrayList<Employee>()));
            new ArrayList<Manager>().add(new Manager("Artur Pirozhkov", 5, 2015, 5, 27, 1989, 3, 13, 7500, new ArrayList<Employee>()));

            Department foodD = new Department("Food department", new ArrayList<Manager>());

            new ArrayList<Manager>().add(new Manager("Yevhen Vorobiei", 5, 2015, 5, 27, 1989, 3, 13, 7500, new ArrayList<Employee>()));
            new ArrayList<Manager>().add(new Manager("Artur Pirozhkov", 5, 2015, 5, 27, 1989, 3, 13, 7500, new ArrayList<Employee>()));

            Department furnitureD = new Department("Furniture department", new ArrayList<Manager>());

            new ArrayList<Manager>().add(new Manager("Yevhen Vorobiei", 5, 2015, 5, 27, 1989, 3, 13, 7500, new ArrayList<Employee>()));
            new ArrayList<Manager>().add(new Manager("Artur Pirozhkov", 5, 2015, 5, 27, 1989, 3, 13, 7500, new ArrayList<Employee>()));

            //create company which consist of an array from three departments, mentioned above
            Company apple = new Company ("Apple",new ArrayList<Department>());
            new ArrayList<Department>().add(sportD);
            new ArrayList<Department>().add(foodD);
            new ArrayList<Department>().add(furnitureD);*/


            //create open vacancies for employees in each branch of the company
            /*List<Employee> employees1 = new ArrayList<Employee>();
            employees1.add(new Employee("Yevhen Vorobiei", 5, 2013, 5, 27, 1989, 3, 13));
            employees1.add(new Employee("Arni", 8, 2011, 5, 27, 1989, 3, 13));
            employees1.add(new Employee("Hotabych", 3, 2015, 5, 27, 1989, 3, 13));

            List<Employee> employees2 = new ArrayList<Employee>();
            employees2.add(new Employee("Anfisa Chehova", 1, 2010, 5, 27, 1989, 3, 8));
            employees2.add(new Employee("Platon",0, 2017, 5, 27, 1989, 1, 1));
            employees2.add(new Employee("Adolf", 11, 2018, 5, 27, 1989, 3, 13));

            List<Employee> employees3 = new ArrayList<Employee>();
            List<Employee> employees4 = new ArrayList<Employee>();
            List<Employee> employees5 = new ArrayList<Employee>();
            List<Employee> employees6 = new ArrayList<Employee>();


            Manager manager1 = new Manager("Yevhen Vorobiei", 5, 2015, 5, 27, 1989, 3, 13, 7500, employees1);
            Manager manager2 = new Manager("Artur Pirozhkov", 5, 2015, 5, 27, 1989, 3, 13, 7500, employees2);
            Manager manager3 = new Manager("Juli Cesar'", 5, 2015, 5, 27, 1989, 3, 13, 7500, employees3);
            Manager manager4 = new Manager("Mr. Smith", 5, 2015, 5, 27, 1989, 3, 13, 7500, employees4);
            Manager manager5 = new Manager("Dart Vader", 5, 2015, 5, 27, 1989, 3, 13, 7500, employees5);
            Manager manager6 = new Manager("Sid Wishes", 5, 2015, 5, 27, 1989, 3, 13, 7500, employees6);

            List<Manager> sport = new ArrayList<Manager>();
            sport.add(manager1);
            sport.add(manager2);
            List<Manager> food = new ArrayList<Manager>();
            food.add(manager3);
            food.add(manager4);
            List<Manager> furniture = new ArrayList<Manager>();
            furniture.add(manager5);
            furniture.add(manager6);

            Department sportD = new Department("Sport department", sport);
            Department foodD = new Department("Food department", food);
            Department furnitureD = new Department("Furniture department", furniture);

            List <Department> departments = new ArrayList<Department>();
            departments.add(sportD);
            departments.add(foodD);
            departments.add(furnitureD);

            Company apple = new Company ("Apple", departments);

            menu(apple);*/
           restoreObject();


    }
    private static void menu(Company apple) throws IOException {

        while (true) {
            System.out.print("\n\n\t\t\t*** WELCOME TO THE PROGRAMME \"COMPANY\"\n\n\n");



            System.out.println("1. View company structure.");
            System.out.println("2. Hire employee.");
            System.out.println("3. Fire employee.");
            System.out.println("4. Rise employee's salary.");
            System.out.println("5. Reduce employee's salary.");
            System.out.println("6. Give prize for matching of holidays dates and employee's BDay.");
            System.out.println("7. Sort employees by name.");
            System.out.println("8. Sort employees by experience.");
            System.out.println("9. Sort employees by hire date.");
            System.out.println("10. Show employees sorted by name.");
            System.out.println("11. Show employees sorted by experience.");
            System.out.println("12. Show employees sorted by hire date.");

            System.out.print("\nSelect menu operation (\"Enter\" to exit): ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String choose = br.readLine();
            if (choose.isEmpty()) break;
            int item = 0;
            try {
                item = Integer.parseInt(choose);
            } catch (NumberFormatException e) {
                System.out.println("Enter number, please");

            }

            switch (item) {
                case 1:
                    System.out.println(apple);
                    break;
                case 2:
                    apple.hireEmployee();
                    break;
                case 3:
                    apple.removeEmployee();
                    break;
                case 4:
                    apple.riseSalary();
                    break;
                case 5:
                    apple.reduceSalary();
                    break;
                case 6:
                    apple.givePrize();
                    break;
                case 7:
                    apple.sortName();;
                    break;
                case 8:
                    apple.sortExperience();
                    break;
                case 9:
                    apple.sortHireDate();
                    break;
                case 10:
                    apple.sortAllByName();
                    break;
                case 11:
                    apple.sortAllByExperience();
                    break;
                case 12:
                    apple.sortAllByHireDate();
                    break;
                default:
                    System.out.println("Enter number bigger than 0 and less than 14, please");
                    break;

            }

            saveObject(apple);


        }

    }

    private static void saveObject(Company apple) {
        OutputStream os = null;
        ObjectOutputStream oos = null;
        try {
            os = new FileOutputStream("../Vorobiei/src/company/comp.txt");
            oos = new ObjectOutputStream(os);
            oos.writeObject(apple);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("IO error");
        } finally {
            try {
                if(oos != null)
                    oos.close();
                if(os != null)
                    os.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private static void restoreObject() {
        InputStream is = null;
        ObjectInputStream ois = null;

        try {
            is = new FileInputStream("../Vorobiei/src/company/comp.txt");
            ois = new ObjectInputStream(is);
            Company rec_apple = (Company)ois.readObject();
            System.out.println("File open");
            menu(rec_apple);
           //System.out.println(rec_apple);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(ois != null)
                    ois.close();
                if(is != null)
                    is.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("File close");
        }
    }

}
