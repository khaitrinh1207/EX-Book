public class FictionBook extends Book implements Discount{
    private String category;
    private  double promotionalPrice;

    public FictionBook(){}

    public FictionBook(int bookCode, String name, double price, String author, String category, double promotionalPrice) {
        super(bookCode, name, price, author);
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPromotionalPrice() {
        return promotionalPrice;
    }

    public void setPromotionalPrice(double promotionalPrice) {
        this.promotionalPrice = promotionalPrice;
    }

    @Override
    public void setDiscount(int persent) {
        this.promotionalPrice = getPrice()*(100-persent)/100;
    }

    @Override
    public String toString() {
        return "category='" + category + '\'' +
                ", promotionalPrice=" + promotionalPrice + '\t'+
                super.toString();
    }
}
