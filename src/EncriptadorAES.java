import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncriptadorAES {

    private static final String ALGORITMO = "AES";
    private static final String TRANSFORMACION = "AES/ECB/PKCS5Padding";

    public static byte[] encriptar(byte[] arregloBytes, String password) throws Exception {
        SecretKeySpec clave = new SecretKeySpec(password.getBytes(), ALGORITMO);
        Cipher cifrador = Cipher.getInstance(TRANSFORMACION);
        cifrador.init(Cipher.ENCRYPT_MODE, clave);
        return cifrador.doFinal(arregloBytes);
    }

    public static byte[] desencriptar(byte[] arregloEncriptado, String password) throws Exception {
        SecretKeySpec clave = new SecretKeySpec(password.getBytes(), ALGORITMO);
        Cipher cifrador = Cipher.getInstance(TRANSFORMACION);
        cifrador.init(Cipher.DECRYPT_MODE, clave);
        return cifrador.doFinal(arregloEncriptado);
    }

}
