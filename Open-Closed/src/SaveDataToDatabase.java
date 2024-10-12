public class SaveDataToDatabase implements SaveData {
    @Override
    public void save(String path, Computer cmp) {
        System.out.println("Save in database: " + path + ", " + cmp);
    }
}
