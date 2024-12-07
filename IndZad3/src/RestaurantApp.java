import java.util.List;

public class RestaurantApp {
    public static void main(String[] args) {
        // Создание экземпляра ресторана
        Restaurant restaurant = new Restaurant("Italian Bistro", "123 Pasta St", "123-456-7890");

        // Добавление блюд в меню
        restaurant.addDish(new Dish("Spaghetti Carbonara", 12.99));
        restaurant.addDish(new Dish("Margherita Pizza", 10.99));
        restaurant.addDish(new Dish("Tiramisu", 6.99));
        restaurant.addDish(new Dish("Bruschetta", 5.99));

        // Вывод информации о ресторане
        System.out.println(restaurant);

        // 1. Фильтрация и вывод блюд, стоимость которых меньше 10
        // Лямбда-выражение: dish -> dish.getPrice() < 10
        // Это выражение используется для фильтрации блюд по цене
        List<Dish> cheapDishes = restaurant.getDishes(dish -> dish.getPrice() < 10);
        System.out.println("Дешевые блюда:");
        cheapDishes.forEach(System.out::println); // Вывод дешевых блюд

        // 2. Фильтрация и вывод блюд, названия которых начинаются с буквы 'T'
        // Лямбда-выражение: dish -> dish.getName().startsWith("T")
        // Это выражение используется для фильтрации блюд по названию.
        List<Dish> tDishes = restaurant.getDishes(dish -> dish.getName().startsWith("T"));
        System.out.println("Блюда, начинающиеся на 'T':");
        tDishes.forEach(System.out::println); // Вывод блюд, начинающихся на 'T'

        // 3. Фильтрация и вывод блюд, стоимость которых больше 7
        // Лямбда-выражение: dish -> dish.getPrice() > 7
        // Это выражение используется для фильтрации блюд по цене.
        List<Dish> expensiveDishes = restaurant.getDishes(dish -> dish.getPrice() > 7);
        System.out.println("Дорогие блюда:");
        expensiveDishes.forEach(System.out::println); // Вывод дорогих блюд
    }
}

