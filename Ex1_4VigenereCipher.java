import java.util.*;

public class Ex1_4VigenereCipher{

    public static String encrypt(String str, String key, int textlen, int keylen)
    {
        String encrypted = "";
        for(int i=0; i<textlen; i++)
        {
            char ch = str.charAt(i);
            char k = key.charAt(i);
            ch = (char)((ch+k-97-97)%26+97);
            encrypted += ch;
        }
        return encrypted;
    }

    public static String decrypt(String str, String key, int textlen, int keylen)
    {
        String decrypted = "";
        for(int i=0; i<textlen; i++)
        {
            char ch = str.charAt(i);
            char k = key.charAt(i);
            ch = (char)((ch-k+26)%26+97);
            decrypted += ch;
        }
        return decrypted;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be encrypted: ");
        String str = sc.nextLine();
        System.out.println("Enter the key: ");
        String key = sc.nextLine();
        int textlen = str.length();
        int keylen = key.length();
        if(keylen<textlen)
        {
            int diff = textlen-keylen;
            int i=0;
            while(diff>0)
            {
                key += key.charAt(i%keylen);
                i++;
                diff--;
            }
        }
        //System.out.println("Key: "+key);
        String encrypted = encrypt(str, key, textlen, keylen); 
        System.out.println("Encrypted string: " + encrypted);
        String decrypted = decrypt(encrypted, key, textlen, keylen);
        System.out.println("Decrypted string: " + decrypted);
        sc.close();     
    }
}