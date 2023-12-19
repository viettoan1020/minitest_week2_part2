public class ParttimeEmployee extends Employee{
    private double workingHours;
    public ParttimeEmployee(String employeeCode, String name, int age, String phoneNumber,String email, double workingHours) {
        super(employeeCode, name, age, phoneNumber,email);
        this.workingHours = workingHours;
    }
    public ParttimeEmployee(){
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
    public double calculateSalary() {
        return workingHours * 100000;
    }
}
