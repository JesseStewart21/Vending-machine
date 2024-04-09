package com.techelevator;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.io.PrintWriter;
public class TransactionLogger {

    public void logTransactions (double amount, double newBalance, String transactionType) {





        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
        LocalDateTime date = LocalDateTime.now();
        String timeStampDetails = date.format(formatter) + " " + transactionType + ": $" + String.format("%.2f, amount") + " $" + String.format("%.2f", newBalance);



        try (PrintWriter writer = new PrintWriter(new FileWriter("Log.txt"))) {
            writer.println(timeStampDetails);

        } catch (IOException ex) {

        }







    }
    }











