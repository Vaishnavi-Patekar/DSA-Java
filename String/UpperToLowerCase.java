import java.util.Scanner;

public class UpperToLowerCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
         String str = sc.nextLine();

         upperLower(str);
    }
    
    static void upperLower(String str){
        char[] s = str.toCharArray();
        for(int i=0;i<str.length();i++){
            char ch = s[i];

            if(ch>='A' && ch<='Z'){
                char ansch = (char)(ch-'A'+'a');
                s[i] = ansch;
            }
        }

        for(char c :s){
            System.out.print(c);
        }
    }
}
