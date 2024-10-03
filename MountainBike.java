public class MountainBike extends Bicycle {
    private String suspensionType; // Тип подвески

    public MountainBike(String brand, int gearCount, double weight, String suspensionType, int durability) {
        super(brand, gearCount, weight, durability); // Вызов конструктора базового класса
        this.suspensionType = suspensionType;
    }

    public MountainBike() {
        this("Неизвестный", 21, 15.0, "Хардтейл", 100); // Конструктор по умолчанию
    }

    @Override
    public void ride() {
        System.out.println("Езда на горном велосипеде с подвеской: " + suspensionType);
        reduceDurability(10); // Уменьшение прочности
    }
}
