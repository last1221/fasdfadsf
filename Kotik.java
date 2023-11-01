package model;
import java.util.Scanner;

public class Kotik {

    private int weight;
    private String name;
    private int prettiness;
    private String meow;
    static int classObjects = 0;
    private boolean b = true;
    private final String hungry = "Котик проголодался.";
    private final String full = "Котик сыт и полон сил";
    private final String kittyEat = "Котик кушает, не отвлекайте его";


    public Kotik() {
    }

    public Kotik(int weight, String name) {
        this(5, weight, name, "Мяуу");
    }

    public Kotik(int prettiness, int weight, String name, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        classObjects++;
    }

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public String getMeow(){
        return meow;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public static int catCount() {
        classObjects++;
        System.out.println("Создано: " + classObjects + " котика");
        return classObjects;
    }

    public boolean play() {
        int a = (int) (Math.random() * 2);
        switch (a) {
            case 0:
                System.out.println("Котик решил поиграть сам с собой.");
                break;
            case 1:
                System.out.println("Котик играет с хозяином.");
                break;
        }
        return true;

    }

    public boolean sleep() {
        int a = (int) (Math.random() * 3);
        switch (a) {
            case 0:
                System.out.println("Котик уснул на полу.");
                break;
            case 1:
                System.out.println("Котик уснул на диване.");
                break;
            case 2:
                System.out.println("Котик уснул в лежанке.");
                break;
        }
        return true;

    }


    public boolean chaseMouse() {
        int a = (int) (Math.random() * 2);
        switch (a) {
            case 0:
                System.out.println("Котик охотится на мышь дома.");
                break;
            case 1:
                System.out.println("Котик охотится на мышь во дворе.");
                break;
        }
        return true;
    }

    public boolean goForAWalk() {
        int a = (int) (Math.random() * 2);
        switch (a) {
            case 0:
                System.out.println("Котик гуляет один во дворе.");
                break;
            case 1:
                System.out.println("Котик гуляет с друзьями.");
                break;
        }
        return true;
    }

    public boolean talking() {
        int a = (int) (Math.random() * 3);
        switch (a) {
            case (0):
                System.out.println("Котик болтает сам с собой.");
                break;
            case (1):
                System.out.println("Котик болтает с хозяином.");
                break;
            case (2):
                System.out.println("Котик болтает с друзьями во дворе");
                break;
        }
        return true;
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {

            int a = (int) (Math.random() * 6 + 1);

            switch (a) {
                case 1:
                    break;
                case 2:
                    System.out.println(i + " час " + play());
                    break;
                case 3:
                    System.out.println(i + " час " + sleep());
                    break;
                case 4:
                    System.out.println(i + " час " + chaseMouse());
                    break;
                case 5:
                    System.out.println(i + " час " + talking());
                    break;
                case 6:
                    System.out.println(i + " час " + goForAWalk());
                    break;
            }

        }

    }
}