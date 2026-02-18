import java.util.*;

public class RemoveVowels{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
         String str = sc.nextLine();

         vowels(str);


    }

    static void vowels(String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
        if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
            continue;
        }
   System.out.print(ch);
                }
    }

}