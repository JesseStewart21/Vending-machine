package com.techelevator;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.io.PrintWriter;
public class TransactionLogger {

    public static void logTransactions (double amount, double newBalance, String transactionType) {


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy  hh:mm:ss a");
        LocalDateTime date = LocalDateTime.now();
        String timeStampDetails = date.format(formatter)   + " "  + transactionType + ":  $"  + amount + "  $"  +   newBalance;





        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy | hh:mm:ss a");
        //LocalDateTime date = LocalDateTime.now();
        //String timeStampDetails = date + " " + transactionType + ":  $"  + amount + "  $"  +   newBalance;



        try (PrintWriter writer = new PrintWriter(new FileWriter("Log.txt",true))) {
            writer.println(timeStampDetails);

        } catch (IOException ex) {

        }







    }
    }











