package chapter6;

public class Sample2 {
    public static void main(String[] args) {

        Tax tax = new Tax(100, "田中宏", 300000, 100000);
        tax.setKoujo(120000);

        System.out.println("控除税＝" + tax.getKoujo());

        System.out.println("所得税を上回る");
    }
}
