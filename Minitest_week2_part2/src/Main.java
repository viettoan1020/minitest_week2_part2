import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
       FulltimeEmployee[] fulltimeEmployees ={
               new FulltimeEmployee("NV1", "Đạt", 22, "0905131232", "vandat@gmail.com", 500.0, 0.0, 5000000.0),
               new FulltimeEmployee("NV2", "Nhật", 20, "0932131313", "hainhat@gmail.com", 300.0, 75.0, 3500000.0),
               new FulltimeEmployee("NV3", "Nhơn", 25, "0989745324", "thanhnhon@gmail.com", 130.0, 90.0, 2800000.0),
               new FulltimeEmployee("NV4", "Huy", 25, "0123456789", "huybeo@gmail.com", 1000.0, 40.0, 7000000.0),
               new FulltimeEmployee("NV5", "Bảo", 30, "0236534873", "thaibao@gmail.com", 0.0, 400.0, 4000000.0  ),
       };
        ParttimeEmployee[] parttimeEmployees ={
                new ParttimeEmployee("TV1", "Nhật Bảo", 22, "0987543210", "nhatbao@gmail.com", 15.0),
                new ParttimeEmployee("TV2", "Độ Béo", 22, "0651245266", "dobeone@gmail.com", 20.0),
                new ParttimeEmployee("TV3", "Hải", 26, "0932550495", "quanghai@gmail.com", 17.0),
                new ParttimeEmployee("TV4", "Vi", 18, "0784532348", "trucvi@gmail.com", 22.0),
                new ParttimeEmployee("TV5", "Phương", 24, "0702898989", "phuongtran@gmail.com", 13.0 ),
        };
    Employee[] employees = {fulltimeEmployees[0],fulltimeEmployees[1],fulltimeEmployees[2],fulltimeEmployees[3],fulltimeEmployees[4],parttimeEmployees[0], parttimeEmployees[1], parttimeEmployees[2], parttimeEmployees[3], parttimeEmployees[4]};
    // Câu 1:
      double totalSalary = 0.0;
        for (Employee employee: employees
             ) {
            totalSalary += employee.calculateSalary();
        }
        double averageSalary = totalSalary/ employees.length;
        System.out.println("Trung bình lương của tất cả nhân viên trong công ty là : " + averageSalary);

        // Câu 2:
        double totalFulltimeSalary = 0.0;
        int fulltimeEmployeeCount = 0;
        for (Employee employee: employees
             ) {
            if (employee instanceof FulltimeEmployee) {
                totalFulltimeSalary += ((FulltimeEmployee) employee).calculateSalary();
                fulltimeEmployeeCount++;
            }
        }
        if (fulltimeEmployeeCount > 0) {
            double averageFulltimeSalary = totalFulltimeSalary/ fulltimeEmployeeCount;
            System.out.println("Lương trung bình của tất cả nhân viên fulltime là: " + averageFulltimeSalary);
        }else {
            System.out.println("Không có nhân viên Fulltime để tính lương");
        }
        //Câu 3:
        double totalParttimeSalary =0.0;
        int parttimeEmployeeCount = 0;
        for (Employee employee: employees
             ) {
            if (employee instanceof ParttimeEmployee) {
                totalParttimeSalary += ((ParttimeEmployee) employee).calculateSalary();
                parttimeEmployeeCount++;
            }
        }
        if (parttimeEmployeeCount >0) {
            double averageParttimeSalary = totalParttimeSalary/ parttimeEmployeeCount;
            System.out.println("Lương trung bình của tất cả nhân viên parttime là: " + averageParttimeSalary);
        } else {
            System.out.println("Không có nhân viên parttime để tính lương");
        }
        //Câu 4:
        System.out.println("Tổng lương phải trả cho nhân viên parttime là : " + totalParttimeSalary);

        //Câu 5:
        int highSalaryCount = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].calculateSalary() > averageSalary) {
                highSalaryCount++;
            }
        }
        System.out.println("Số nhân viên có mức lương cao hơn mức lương trung bình là : " + highSalaryCount);
    }
}