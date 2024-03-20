package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import classes.Reservation2;

public class exercicio015 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }
        else {
            Reservation2 reservation = new Reservation2(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in date (dd/MM/yyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyy): ");
            checkOut = sdf.parse(sc.next());

                String error = reservation.updateDates(checkIn, checkOut);
                if (error != null) {
                    System.out.println(error);
                } 
                else {
                System.out.println("Reservation: " + reservation);
            }
        }
        sc.close();
    }
}
