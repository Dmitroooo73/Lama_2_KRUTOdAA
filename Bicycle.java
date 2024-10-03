public abstract class Bicycle {
    protected String brand;
    protected int gearCount;
    protected double weight;
    private int durability;
    private static int bicycleCount = 0; // Статический счетчик созданных объектов

    public Bicycle(String brand, int gearCount, double weight, int durability) {
        this.brand = brand;
        this.gearCount = gearCount;
        this.weight = weight;
        this.durability = durability;
        bicycleCount++;
    }

    public Bicycle() {
        this("Неизвестный", 1, 10.0, 100); // Конструктор по умолчанию
    }

    public abstract void ride(); // Абстрактный метод

    // Метод вывода информации о велосипеде
    public void displayInfo() {
        System.out.println(brand + ": " + gearCount + " гоночных передач, вес: " + weight + " кг, ХП: " + durability);
    }

    // Метод уменьшения прочности
    public void reduceDurability(int amount) {
        if (durability > 0) {
            durability -= amount;
            System.out.println(brand + " имеет всего лишь хпешек: " + durability);
        } else {
            System.out.println(brand + " сломан и не может использоваться.");
        }
    }

    // Метод ремонта велосипеда
    public void repair(int amount) {
        durability += amount;
        System.out.println(brand + " отхилен. ХП: " + durability);
    }

    public static int getBicycleCount() {
        return bicycleCount; // Статический метод получения количества объектов
    }
}
