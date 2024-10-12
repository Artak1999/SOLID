public class HP extends Computer {
    public HP(String brand, String processor, int ram,
              int storage, String storageType, String graphicsCard) {
        super(brand, processor, ram, storage, storageType, graphicsCard);
    }

    @Override
    public void setData(String brand) {
        super.setData(brand);
    }

    @Override
    public String toString() {
        return "HP{" +
                "brand='" + brand + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", storageType='" + storageType + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}
