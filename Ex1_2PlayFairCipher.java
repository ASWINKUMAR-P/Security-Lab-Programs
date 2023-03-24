import java.util.*;

public class Ex1_2PlayFairCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be encrypted: ");
        String str = sc.nextLine();
        System.out.println("Enter the key: ");
        String key = sc.nextLine();
        String encrypted = encrypt(str, key);
        System.out.println("Encrypted string: " + encrypted);
        String decrypted = decrypt(encrypted, key);
        System.out.println("Decrypted string: " + decrypted);
    }

    public static String encrypt(String str, String key) {
        String encrypted = "";
        return encrypted;
    }

    public static String decrypt(String str, String key) {
        String decrypted = "";
        return decrypted;
    }
    
}
