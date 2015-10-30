package company;


import java.io.Serializable;

import java.util.List;


public class Department implements Serializable {
    private String departmentName;
    private List<Manager> departmentManagers;


    public Department(String departmentName, List<Manager> departmentManagers) {
        this.departmentName = departmentName;
        this.departmentManagers = departmentManagers;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Manager> getDepartmentManagers() {
        return departmentManagers;
    }

    public void setDepartmentManagers(List<Manager> departmentManagers) {
        this.departmentManagers = departmentManagers;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < getDepartmentManagers().size(); i++) {
            getDepartmentManagers().get(i);
            s +=  getDepartmentManagers().get(i);

        }
        return "\n***DEPARTMENT***\n" + "Department name: " + getDepartmentName() + s;
    }
}
