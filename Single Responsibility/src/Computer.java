public class Computer {
    String brand;
    String processor;
    int ram; // in GB
    int storage; // in GB or TB
    String storageType; // e.g., SSD or HDD
    String graphicsCard;

    public Computer(String brand, String processor, int ram, int storage, String storageType, String graphicsCard) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.storageType = storageType;
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", storageType='" + storageType + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}
