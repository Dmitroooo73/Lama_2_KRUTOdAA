public class BMX extends Bicycle {
    private String frameMaterial; // Материал рамы

    public BMX(String brand, int gearCount, double weight, String frameMaterial, int durability) {
        super(brand, gearCount, weight, durability); // Вызов конструктора базового класса
        this.frameMaterial = frameMaterial;
    }

    public BMX() {
        this("Неизвестный", 1, 8.5, "ТЯЖЕЛЫЙ Алюминий", 100); // Конструктор по умолчанию
    }

    @Override
    public void ride() {
        System.out.println("Езда на BMX с рамой из " + frameMaterial);
        reduceDurability(15); // Уменьшение прочности
    }
}
