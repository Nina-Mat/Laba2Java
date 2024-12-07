import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Класс для представления блюда
class Dish {
    private String name; // Название блюда
    private double price; // Стоимость блюда

    // Конструктор для создания блюда
    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Метод для получения названия блюда
    public String getName() {
        return name;
    }

    // Метод для получения стоимости блюда
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + price; // Форматированный вывод блюда
    }
}

        // Класс для представления ресторана
        class Restaurant {
            private String name; // Название ресторана
            private String address; // Адрес ресторана
            private String phone; // Телефон ресторана
            private List<Dish> menu; // Список блюд в ресторане

            // Конструктор для создания ресторана
            public Restaurant(String name, String address, String phone) {
                this.name = name;
                this.address = address;
                this.phone = phone;
                this.menu = new ArrayList<>(); // Инициализация списка блюд
            }

            // Метод для добавления блюда в меню
            public void addDish(Dish dish) {
                menu.add(dish);
            }

            // Метод для получения списка блюд, подходящих под условие
            public List<Dish> getDishes(Predicate<Dish> filter) {
                List<Dish> filteredDishes = new ArrayList<>();
                for (Dish dish : menu) {
                    if (filter.test(dish)) { // Применение фильтра
                        filteredDishes.add(dish);
                    }
                }
                return filteredDishes;
            }

            @Override
            public String toString() {
                return name + " (" + address + ", " + phone + ")"; // Форматированный вывод информации о ресторане
            }
        }


