import java.io.File;
import java.io.IOException;

//author: Jose Flores
public class Main {

//    public static void main(String[] args) throws Exception {
//        byte[] arreglo = FileManager
//                .readFile("C:\\Users\\josef\\OneDrive\\Documentos\\testEncrypt\\miTexto.txt"); // Lee el archivo
//        byte [] arregloEncriptado =
//                EncriptadorAES.encriptar(arreglo, "2b7e151628aed2a6abf7158809cf4f3c"); // Encripta el archivo
//
//        FileManager.writeFile("C:\\Users\\josef\\OneDrive\\Documentos\\testEncrypt\\miTextoEncriptado.crypt", arregloEncriptado);
//    }

    public static void main(String[] args) throws Exception {
        byte[] arregloEncriptado = FileManager.readFile("C:\\Users\\josef\\OneDrive\\Documentos\\testEncrypt\\miTextoEncriptado.crypt");
        byte [] arregloDesencriptado = EncriptadorAES.desencriptar(arregloEncriptado, "2b7e151628aed2a6abf7158809cf4f3c");
        FileManager.writeFile("C:\\Users\\josef\\OneDrive\\Documentos\\testEncrypt\\miTextoDesencriptado.txt", arregloDesencriptado);
    }
}
