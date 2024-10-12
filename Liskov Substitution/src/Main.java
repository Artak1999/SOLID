public class Main {
    public static void main(String[] args) {
        HP hp = new HP("HP", "AMD",
                32,1,"SSD","Nvidia GeForce RTX 4090");
        hp.setData("Acer");
        System.out.println(hp);
    }
}