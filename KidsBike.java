public class KidsBike extends Bicycle {
    private boolean hasTrainingWheels; // Наличие тренировочных колес

    public KidsBike(String brand, int gearCount, double weight, boolean hasTrainingWheels, int durability) {
        super(brand, gearCount, weight, durability); // Вызов конструктора базового класса
        this.hasTrainingWheels = hasTrainingWheels;
    }

    public KidsBike() {
        this("Неизвестный", 1, 7.0, true, 100); // Конструктор по умолчанию
    }

    @Override
    public void ride() {
        System.out.println("Езда на самом лютом детском велосипеде " + (hasTrainingWheels ? "с" : "без") + " тренировочными колесами.");
        reduceDurability(5); // Уменьшение прочности
    }
}
