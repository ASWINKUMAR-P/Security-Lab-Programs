import java.util.*;

public class Ex1_3HillCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be encrypted: ");
        String str = sc.nextLine();
        System.out.println("Enter the key: ");
        String key = sc.nextLine();
        int n = (int) Math.sqrt(key.length());
        int keymatrix[][] = new int[n][n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0;j < n; j++) {
                keymatrix[i][j] = key.charAt(k++) - 97;
            }
        }
        String encrypted = encrypt(str, keymatrix, n);
        System.out.println("Encrypted string: " + encrypted);
        String decrypted = decrypt(encrypted, keymatrix, n);
        System.out.println("Decrypted string: " + decrypted);
        sc.close();
    }

    public static int[][] matrixmultiply(int a[][],int b[][]){
        int c[][] = new int[a.length][b[0].length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0;j < b[0].length; j++) {
                c[i][j] = 0;
                for(int k = 0; k < b.length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                c[i][j] %= 26;
            }
        }
        return c;
    }

    public static String encrypt(String str, int keymatrix[][], int n) {
        String encrypted="";
        int textlen = str.length();
        while (textlen % n != 0) {
            str += 'x';
            textlen++;
        }
        int [][]textmatrix = new int[textlen/n][n];
        int k = 0;
        for(int i = 0; i < textlen/n; i++) {
            for (int j=0; j < n ;j++) {
                textmatrix[i][j] = str.charAt(k++) - 97;
            }
        }
        for(int i=0;i<n;i++) {
            
        }

        return encrypted;
    }

    public static String decrypt(String str, int keymatrix[][], int n) {
        String decrypted = "";
        
        return decrypted;
    }
}
