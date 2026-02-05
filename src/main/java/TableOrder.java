import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class TableOrder {
    private Table table;
    private Instant arrivalDateTime;
    private Instant departureDateTime;

    public boolean isAvailable(Instant at) {
        List<Order> orders = table.getOrders();
        boolean ifAnyOrderStillOnTable = orders.stream()
                .anyMatch(order -> order.getTableOrder().getDepartureDateTime() == null);
        if (ifAnyOrderStillOnTable) {
            return false;
        }
        Order lastOrderOnThisTable = orders.stream()
                .filter(order -> order.getTableOrder().getTable().equals(this.getTable()))
                .max(Comparator.comparing(Order::getCreationDatetime))
                .orElse(null);
        if (lastOrderOnThisTable == null) {
            return true;
        }
        return !lastOrderOnThisTable.getTableOrder().getDepartureDateTime().isAfter(at);
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Instant getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(Instant arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Instant getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(Instant departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TableOrder that)) return false;
        return Objects.equals(table, that.table) && Objects.equals(arrivalDateTime, that.arrivalDateTime) && Objects.equals(departureDateTime, that.departureDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(table, arrivalDateTime, departureDateTime);
    }

    @Override
    public String toString() {
        return "TableOrder{" +
                "table=" + table +
                ", arrivalDateTime=" + arrivalDateTime +
                ", departureDateTime=" + departureDateTime +
                '}';
    }
}
