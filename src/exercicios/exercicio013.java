package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import classes.Department;
import classes.HourContract;
import classes.Worker;
import enums.WorkerLevel;

public class exercicio013 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departments name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.err.println("Name: ");
        String workerName = sc.nextLine();
        System.err.println("Level: ");
        String workerLevel = sc.nextLine();
        System.err.println("Base Salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Enter contract #" + i + "data: ");
            System.out.print("Date (DD/MM/YYYT): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.err.println("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Deoartment: " + worker.getDepartment().getName());
        System.out.println("Icome for: " + monthAndYear + ": " + String.format("%.2f",worker.income(year, month)));
        

        sc.close();

    }
}
