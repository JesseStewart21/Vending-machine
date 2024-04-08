package com.techelevator;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.io.PrintWriter;
public class TransactionLogger {

    public void logTransactions (double amount, double newBalance) throws IOException {


        String date = new String ("MM/dd/yyyy");
        String time = new String("hh:mm:ss");
        String timeStampDetails = (date + time + feed Money : currentMoneyProvided + newBalance);

        try (PrintWriter writer = new PrintWriter(new FileWriter("Log.txt")) {
            writer.printIn (timeStampDetails);

        } catch (IOException ex) {

        }





    }
    }











