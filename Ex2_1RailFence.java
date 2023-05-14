import java.util.*;

public class Ex2_1RailFence {

    public static String encrypt(String text,int key){
        String encrypted = "";
        int len = text.length();
        char arr[][] = new char[key][len];
        for(int i=0;i<key;i++){
            for(int j=0;j<len;j++){
                arr[i][j] = '*';
            }
        }
        int i=0,j=0;
        while(j<len){
            while(i<key && j<len){
                arr[i][j] = text.charAt(j);
                i++;
                j++;
            }
            i-=2;
            while(i>=0 && j<len){
                arr[i][j] = text.charAt(j);
                i--;
                j++;
            }
            i+=2;
        }
        for(i=0;i<key;i++){
            for(j=0;j<len;j++){
                if(arr[i][j]!='*')
                    encrypted+=arr[i][j];
            }
        }
        for(i=0;i<key;i++){
            for(j=0;j<len;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        return encrypted;
    }

    public static String decrypt(String text,int key){
        String decrypted = "";
        int len = text.length();
        char arr[][] = new char[key][len];
        for(int i=0;i<key;i++){
            for(int j=0;j<len;j++){
                arr[i][j] = '*';
            }
        }
        int i=0,j=0;
        while(j<len){
            while(i<key && j<len){
                arr[i][j] = '-';
                i++;
                j++;
            }
            i-=2;
            while(i>=0 && j<len){
                arr[i][j] = '-';
                i--;
                j++;
            }
            i+=2;
        }
        int k=0;
        for(i=0;i<key;i++){
            for(j=0;j<len;j++){
                if(arr[i][j]=='-'){
                    arr[i][j] = text.charAt(k);
                    k++;
                }
            }
        }
        for(i=0;i<key;i++){
            for(j=0;j<len;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        i=0;
        j=0;
        while(j<len){
            while(i<key && j<len){
                decrypted+=arr[i][j];
                i++;
                j++;
            }
            i-=2;
            while(i>=0 && j<len){
                decrypted+=arr[i][j];
                i--;
                j++;
            }
            i+=2;
        }
        return decrypted;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the plain text: ");
        String text = sc.nextLine();
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        String encrypted = encrypt(text, key);
        System.out.println("Encrypted text: " + encrypted);
        String decrypted = decrypt(encrypted, key);
        System.out.println("Decrypted text: " + decrypted);
        sc.close();
    }
}
