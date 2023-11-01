import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik Barsik = new Kotik(10, 5, "Барсик", "Мяуу");
        Kotik Kompot = new Kotik();
        Kompot.setPrettiness(9);
        Kompot.setWeight(6);
        Kompot.setName("Компот");
        Kompot.setMeow("Мяяуууууу");

        if (Kompot.getMeow().equals(Barsik.getMeow())) {
            System.out.println("Барсик и Компот очень похоже мяукают");
        } else {
            System.out.println("Барсик и Компот мяукают по разному");
        }

        System.out.print("Имя кота: " + Barsik.getName() +
                "\n" + "Его вес в кг: " + Barsik.getWeight() + "\n");


        Kotik.catCount();
        Barsik.liveAnotherDay();
    }
}
