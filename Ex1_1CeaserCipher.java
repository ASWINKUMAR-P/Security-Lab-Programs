import java.util.*;

public class Ex1_1CeaserCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be encrypted: ");
        String str = sc.nextLine();
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        String encrypted = encrypt(str, key);
        System.out.println("Encrypted string: " + encrypted);
        String decrypted = decrypt(encrypted, key);
        System.out.println("Decrypted string: " + decrypted);
    }

    public static String encrypt(String str, int key) {
        String encrypted = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = (char) ((ch + key - 65) % 26 + 65);
            } else if (Character.isLowerCase(ch)) {
                ch = (char) ((ch + key - 97) % 26 + 97);
            }
            encrypted += ch;
        }
        return encrypted;
    }

    public static String decrypt(String str, int key) {
        String decrypted = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - key - 65 + 26) % 26 + 65);
            } else if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - key - 97 + 26) % 26 + 97);
            }
            decrypted += ch;
        }
        return decrypted;
    }
}