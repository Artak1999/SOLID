public class SaveComputerData {
    public void saveToFile(String path, Computer cmp) {
        System.out.println("Save in file: " + path + ", " + cmp);
    }
    public void saveToDatabase(String path, Computer cmp) {
        System.out.println("Save in database: " + path + ", " + cmp);
    }
}
