//package cn.tjut.j8;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Supplier;
//
//public class Demo01Fun {
//
//    public static void main(String[] args) {
////        fun1((arr)->{
////            int sum = 0 ;
////            for (int i : arr) {
////                sum += i;
////            }
////            return sum;
////        });
////    public static void fun1(Operator operator){
////        int[] arr = {1,2,3,4};
//////        int sum = operator.getSum(arr);
//////        System.out.println("sum = " + sum);
////    }
////
////    public static void fun2(Operator operator){
////        List<Integer> list = Arrays.asList(1, 2, 3);
////        int listSum = operator.getSum(list);
////        System.out.println("List: " + listSum);
////    }
////
////        public static void fun3(Supplier < Integer > supplier) {
////            List<Integer> list = Arrays.asList(1, 2, 3);
////            int listSum = supplier.get();
////            System.out.println("List: " + listSum);
////        }
////    }
//}
//
/////**
//// * 函数式接口
//// */
////@FunctionalInterface
////interface Operator{
////
//////    int getSum(int[] arr);
////
////    int getSum(List<Integer> list);
////}