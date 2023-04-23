import java.io.*;

public class FileManager {

    public static byte[] readFile(String filePath) throws IOException {
        File file = new File(filePath);
        byte[] fileContent = new byte[(int) file.length()];
        FileInputStream inputStream = new FileInputStream(file);
        inputStream.read(fileContent);
        inputStream.close();
        return fileContent;
    }

    public static void writeFile(String filePath, byte[] data) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(filePath);
        outputStream.write(data);
        outputStream.close();
    }
}
