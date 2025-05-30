package com.pluralsight.service;

import com.pluralsight.items.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptService {
    public static void saveOrderToFile(Order order, double total, double discounted) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));

        String fileName = "receipts/" + timestamp + ".txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(order.toString());
            writer.write(String.format("\nFull Order Price: $%.2f\n", total));
            if (total != discounted) {
                writer.write(String.format("Discounted Price (10%% off): $%.2f\n", discounted));
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
