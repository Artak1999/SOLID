public class Main {
    public static void main(String[] args) {
        Computer ibm = new Computer("IBM", "Intel",
                32,1,"SSD","Nvidia GeForce RTX 4090");
        Computer dell = new Computer("DELL","AMD",
                64,2,"SSD","Nvidia GeForce RTX 4070");
        SaveComputerData saveComputerData = new SaveComputerData();
        saveComputerData.saveToFile("cmp.txt", ibm);
        saveComputerData.saveToDatabase("cmp", dell);
    }
}