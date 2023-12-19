public abstract class Employee {
    private String employeeCode;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;
    public Employee(String employeeCode, String name, int age, String phoneNumber, String email) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public Employee() {
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String  phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public abstract double calculateSalary();
}
