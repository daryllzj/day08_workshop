package sdf;

public class Employee implements Comparable<Employee>{
    private String staffNo;
    private String fullname;
    private String department;
    private String role;
    private String emailAddress;
    private Integer salary;

    

    public Employee(String staffNo, String fullname, String department, String role, String emailAddress,
            Integer salary) {
        this.staffNo = staffNo;
        this.fullname = fullname;
        this.department = department;
        this.role = role;
        this.emailAddress = emailAddress;
        this.salary = salary;
    }

    public String getStaffNo() {
        return staffNo;
    }
    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n[staffNo=" + staffNo + ", fullname=" + fullname + ", department=" + department + ", role="
                + role + ", emailAddress=" + emailAddress + ", salary=" + salary + "]\n";
    }

    @Override
    public int compareTo(Employee o) {
        return this.getFullname().compareTo(o.getFullname());
    }

    
}
