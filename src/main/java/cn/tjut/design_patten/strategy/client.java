package cn.tjut.design_patten.strategy;

import java.util.List;

public class client {
    public static void main(String[] args) {
        List<String> receipts = ReceiptBuilder.getReceiptBuilder();
        for(String receipt : receipts){
            if(receipt.equals("H1")){
                System.out.println("收到H1的回执信息");
            }else if (receipt.equals("H2")){
                System.out.println("收到H2的回执信息");
            }
        }
    }
}
