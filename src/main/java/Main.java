import com.ingredients.entity.Order;
import com.ingredients.entity.OrderStatusEnum;
import com.ingredients.entity.OrderTypeEnum;

public class Main {
    public static void main(String[] args) {
//      com.ingredients.entity.Dish dish = dataRetriever.findDishById(1);
//        System.out.println(dish);
//
//        List<com.ingredients.entity.DishIngredient> i = dataRetriever.findDishIngredientByDishId(4);
//        System.out.println(i);

//        List<com.ingredients.entity.Ingredient> createdIngredients = dataRetriever.createIngredients(List.of(new com.ingredients.entity.Ingredient(null, "Pain", com.ingredients.entity.CategoryEnum.OTHER, 600.0)));
//        System.out.println(createdIngredients);
//
//        com.ingredients.entity.Dish dish = new com.ingredients.entity.Dish();
//        dish.setId(2);
//        dish.setDishType(com.ingredients.entity.DishTypeEnum.MAIN);
//        dish.setName("Poulet grillé");
//        dish.setPrice(12000.00);

//        com.ingredients.entity.Ingredient poulet = new com.ingredients.entity.Ingredient();
//        poulet.setId(3);
//        poulet.setName("Poulet");
//
//
//        com.ingredients.entity.DishIngredient di1 = new com.ingredients.entity.DishIngredient();
//        di1.setIngredient(poulet);
//        di1.setDish(dish);
//        di1.setQuantity_required(1.00);
//        di1.setUnit(com.ingredients.entity.UnitEnum.KG);
//
//        dish.setIngredients(List.of(di1));
//
//        dataRetriever.saveDish(dish);
//
//        System.out.println(dish);

//      com.ingredients.entity.Dish dish = dataRetriever.findDishById(1);
//        System.out.println(dish.getDishCost());
//
//        System.out.println(dish);
//        System.out.println("Coût du plat = " + dish.getGrossMargin());

//        com.ingredients.entity.Ingredient laitue = new com.ingredients.entity.Ingredient();
//        laitue.setId(1);
//        laitue.setName("Laitue");
//        laitue.setPrice(800.0);
//        laitue.setCategory(com.ingredients.entity.CategoryEnum.VEGETABLE);
//
//        com.ingredients.entity.StockMovement in1 = new com.ingredients.entity.StockMovement();
//        in1.setId(11);
//        in1.setValue(new com.ingredients.entity.StockValue(10.0, com.ingredients.entity.UnitEnum.KG));
//        in1.setType(com.ingredients.entity.MouvementTypeEnum.IN);
//        in1.setCreationDatetime(Instant.parse("2024-01-05T09:00:00Z"));
//
//        laitue.setStockMovementList(List.of(in1));
//        dataRetriever.saveIngredient(laitue);

//        Instant t = Instant.parse("2024-01-06T12:00:00Z");
//        List<com.ingredients.entity.Ingredient> ingredients = dataRetriever.findAllIngredients();
//        System.out.println("=== Vérification du stock au " + t + " ===");
//        for (com.ingredients.entity.Ingredient ingredient : ingredients) {
//           Double smIN = 0.0;
//           Double smOUT = 0.0;
//           for (com.ingredients.entity.StockMovement sm : ingredient.getStockMovementList()){
//               if (!sm.getCreationDatetime().isAfter(t)){
//                   if (sm.getType() == com.ingredients.entity.MouvementTypeEnum.IN){
//                       smIN += sm.getValue().getQuantity();
//                   } else if (sm.getType() == com.ingredients.entity.MouvementTypeEnum.OUT) {
//                       smOUT += sm.getValue().getQuantity();
//                   }
//               }
//           }
//            System.out.println(ingredient.getName() + " = " + smIN +" - " + smOUT + " = " + ingredient.getStockValueAt(t));
//        }

//        com.ingredients.entity.Order order = new com.ingredients.entity.Order();
//        order.setType(com.ingredients.entity.OrderTypeEnum.EAT_IN);
//        order.setDishOrderList(List.of());
//        order.setCreationDatetime(Instant.now());
//
//        com.ingredients.entity.Dish dish = dataRetriever.findDishById(1);
//
//        com.ingredients.entity.DishOrder dishOrder = new com.ingredients.entity.DishOrder();
//        dishOrder.setDish(dish);
//        dishOrder.setQuantity(1);
//
//        order.setDishOrderList(List.of(dishOrder));
//
//        com.ingredients.entity.Order savedOrder = dataRetriever.saveOrder(order);
//
//        System.out.println("Commande sauvegardée : "
//                + savedOrder.getReference());
//        System.out.println(dataRetriever.findOrderByReference("ORD00001"));
//
//        DataRetriever dataRetriever = new DataRetriever();
//        Order o = dataRetriever.findOrderByReference("ORD100");
//        o.setType(OrderTypeEnum.EAT_IN);
//        o.setOrderStatus(OrderStatusEnum.READY);
//        dataRetriever.saveOrder(o);
//
//        System.out.println("successfully saved order");
//        System.out.println(o.getOrderStatus());
    }
}
