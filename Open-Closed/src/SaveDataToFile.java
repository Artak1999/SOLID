public class SaveDataToFile implements SaveData {
    @Override
    public void save(String path, Computer cmp) {
        System.out.println("Save in file: " + path + ", " + cmp);
    }
}
