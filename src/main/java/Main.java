import java.util.List;

import static java.time.Instant.now;

public class Main {
    public static void main(String[] args) {
//        DataRetriever dataRetriever = new DataRetriever();
//        Dish saladeVerte = dataRetriever.findDishById(1);
//        System.out.println(saladeVerte);
//
//        Dish poulet = dataRetriever.findDishById(2);
//        System.out.println(poulet);
//
//        Dish rizLegume = dataRetriever.findDishById(3);
//        rizLegume.setPrice(100.0);
//        Dish newRizLegume = dataRetriever.saveDish(rizLegume);
//        System.out.println(newRizLegume); // Should not throw exception


//        Dish rizLegumeAgain = dataRetriever.findDishById(3);
//        rizLegumeAgain.setPrice(null);
//        Dish savedNewRizLegume = dataRetriever.saveDish(rizLegume);
//        System.out.println(savedNewRizLegume); // Should throw exception

//        Ingredient laitue = dataRetriever.findIngredientById(1);
//        System.out.println(laitue);
        DataRetriever dataRetriever = new DataRetriever();
        Order orderOne = dataRetriever.findOrderByReference("ORD001");
        Order order = new Order();
        order.setId(3);
        order.setReference("ORD003");
        List<DishOrder> dishOrderList = orderOne.getDishOrderList();
        dishOrderList.getFirst().setQuantity(2);
        order.setDishOrderList(dishOrderList);
        order.setStatus(PaymentStatusEnum.PAID);
        order.setCreationDatetime(now());
        System.out.println(dataRetriever.saveOrder(order));
    }
}
