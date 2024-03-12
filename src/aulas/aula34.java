package aulas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.Employee2;
import classes.OutsourcedEmployee2;

public class aula34 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee2> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();


        for (int i=1; i<=n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.println("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            //ainda dentro do for:
            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee2 emp = new OutsourcedEmployee2(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            } else {
                Employee2 emp = new Employee2(name, hours, valuePerHour);
                list.add(emp);
            }

        }

        System.out.println();
        System.err.println("PAYMENTS:");
        for (Employee2 emp : list) {
            System.err.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()) );
        }

        sc.close();

    }
}
