public class Violin extends MusicalInstrument{
    int volume;
    String material;

    public String getMaterial() {
        System.out.println("В процессе получения материала");
        return "Получен материал";
    }
}
