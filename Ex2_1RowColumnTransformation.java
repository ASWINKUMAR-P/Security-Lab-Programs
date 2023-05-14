import java.util.*;

public class Ex2_1RowColumnTransformation {

    public static String encrypt(String text,int keys[]){
        String encrypted = "";
        int len = text.length();
        int keysize = keys.length;
        int rows = len/keysize;
        if(len%keysize!=0)
            rows++;
        char arr[][] = new char[rows][keysize];
        int k=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<keysize;j++){
                if(k<len)
                    arr[i][j] = text.charAt(k++);
                else
                    arr[i][j] = '*';
            }
        }
        for(int i=0;i<keysize;i++){
            for(int j=0;j<rows;j++){
                encrypted+=arr[j][keys[i]-1];
            }
        }
        return encrypted;
    }

    public static String decrypt(String text,int keys[]){
        String decrypted = "";
        int len = text.length();
        int keysize = keys.length;
        int rows = len/keysize;
        if(len%keysize!=0)
            rows++;
        char arr[][] = new char[rows][keysize];
        int k=0;
        for(int i=0;i<keysize;i++){
            for(int j=0;j<rows;j++){
                arr[j][keys[i]-1] = text.charAt(k++);
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<keysize;j++){
                if(arr[i][j]!='*')
                    decrypted+=arr[i][j];
            }
        }
        return decrypted;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text to be encrypted:");
        String text = sc.nextLine();
        System.out.println("Enter the key:");
        int keysize = sc.nextInt();
        int [] keys = new int[keysize];
        for(int i=0;i<keysize;i++){
            keys[i] = sc.nextInt();
        }
        String encrypted = encrypt(text, keys);
        System.out.println("Encrypted text: " + encrypted);
        String decrypted = decrypt(encrypted, keys);
        System.out.println("Decrypted text: " + decrypted);
        sc.close();
    }    
}


/* 
a b c d e f g
h i j k l m n
o p q r s t u
v w x y z * *
*/