public class FulltimeEmployee extends Employee{
    private double bonusMoney;
    private double fine;
    private double fixedSalary;
    public FulltimeEmployee(String employeeCode, String name, int age, String phoneNumber, String email,double bonusMoney, double fine, double fixedSalary) {
        super(employeeCode, name, age, phoneNumber, email);
        this.bonusMoney = bonusMoney;
        this.fine = fine;
        this.fixedSalary = fixedSalary;
    }
    public FulltimeEmployee(){
    }

    public double getBonusMoney() {
        return bonusMoney;
    }

    public void setBonusMoney(double bonusMoney) {
        this.bonusMoney = bonusMoney;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
    public double calculateSalary() {
        return fixedSalary + (bonusMoney - fine);
    }
}
