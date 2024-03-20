package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import classes.Reservation3;
import exceptions.DomainException;

public class exercicio016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Room number: ");
            int number = sc.nextInt();
            System.out.println("Check-in date (dd/MM/yyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyy): ");
            Date checkOut = sdf.parse(sc.next());
        
            Reservation3 reservation = new Reservation3(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in date (dd/MM/yyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e) {
            System.out.println("Invalid date format.");
        }
        catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }

        sc.close();
    }   
}

