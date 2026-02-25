import java.time.LocalDate;

public class StockStat {
    private String ingredientName;
    private LocalDate periodDate;
    private StockValue stockValue;

    @Override
    public String toString() {
        return "StockStat{" +
                "ingredientName=" + ingredientName +
                ", periodDate=" + periodDate +
                ", stockValue=" + stockValue +
                '}';
    }

    public String getIdIngredient() {
        return ingredientName;
    }

    public LocalDate getPeriodDate() {
        return periodDate;
    }

    public StockValue getStockValue() {
        return stockValue;
    }

    public void setIdIngredient(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public void setPeriodDate(LocalDate periodDate) {
        this.periodDate = periodDate;
    }

    public void setStockValue(StockValue stockValue) {
        this.stockValue = stockValue;
    }

    public StockStat(String ingredientName, LocalDate periodDate, StockValue stockValue) {
        this.ingredientName = ingredientName;
        this.periodDate = periodDate;
        this.stockValue = stockValue;
    }
}
