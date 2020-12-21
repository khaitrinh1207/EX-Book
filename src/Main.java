public class Main {
    public static void main(String[] args) {

        // khởi tạo 5 quyển programmingbook :

        ProgrammingBook[] progammingbook = new ProgrammingBook[5];
        progammingbook[0] = new ProgrammingBook(101,"nameBook1",10000,"Khaitrinh","Java","Libraries");
        progammingbook[1] = new ProgrammingBook(102,"nameBook2",11000,"Khaitrinh","Java","API");
        progammingbook[2] = new ProgrammingBook(103,"nameBook3",12000,"Khaitrinh","PHP","AJAX");
        progammingbook[3] = new ProgrammingBook(104,"nameBook4",13000,"Khaitrinh","C++","Security");
        progammingbook[4] = new ProgrammingBook(105,"nameBook5",15500,"Khaitrinh","PYTHON","Compilers");
        System.out.println("Danh sách Programmingbooks : ");
        for (Book i: progammingbook) {
            System.out.println(i);
        }

        // Khởi tạo 5 quyển fictionbook :

        FictionBook[] fictionbook = new FictionBook[5];
        fictionbook[0] = new FictionBook(201,"nameBookA",20000,"KhaiTrinh","Fiction1",18000);
        fictionbook[1] = new FictionBook(202,"nameBookB",19000,"KhaiTrinh","Fiction2",17100);
        fictionbook[2] = new FictionBook(203,"nameBookC",14000,"KhaiTrinh","Fiction3",12600);
        fictionbook[3] = new FictionBook(204,"nameBookD",22000,"KhaiTrinh","Fiction4",19800);
        fictionbook[4] = new FictionBook(205,"nameBookE",28000,"KhaiTrinh","Fiction5",25200);
        System.out.println(" Danh sách FictionBooks : ");
        for (Book i: fictionbook) {
            System.out.println(i);
        }

        // Tổng tiền sách Programmingbook và FictionBook:

        double tolalPrice = 0;
        double totalPriceProbook = 0;
        for (Book i: progammingbook) {
            tolalPrice += i.getPrice();
            totalPriceProbook += i.getPrice();
        }
        for (Book j: fictionbook) {
            tolalPrice += j.getPrice();
        }
        System.out.println("\n"+"Tổng tiền : "+tolalPrice+ " VND");

        // Số sách Programmingbook có language là "java" :

        int count = 0;
        for (ProgrammingBook i: progammingbook) {
            if ( i.getLanguage() == "Java")
                count++;
        }
        System.out.println("\n"+"Số sách java : "+count+ " quyển");

        // Tổng tiền sau khuyến mãi : VD Discount = 10%

        double totalPriceFictionbook = 0;
        for (FictionBook i: fictionbook) {
            i.setDiscount(10);
            totalPriceFictionbook += i.getPromotionalPrice();
        }
        System.out.println("\n"+"Tổng tiền sách Fiction sau khuyến mãi : "+ totalPriceFictionbook+" VND");
    }
}
