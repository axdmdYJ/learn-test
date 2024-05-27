package cn.tjut.design_patten.strategy;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class ReceiptBuilder {



    public static List<String> getReceiptBuilder() {
        List<String> receiptBuilder = new ArrayList<>();
        receiptBuilder.add("H1");
        receiptBuilder.add("H2");
        return receiptBuilder;
    }
}
