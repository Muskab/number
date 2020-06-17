import java.util.Scanner;

public interface Numb {
    public static void main(String[] args){
        Scanner userInput=new Scanner (System.in);
        System.out.println("Enter a number: ");
        int userAnswer = userInput.nextInt();
        System.out.println("Number\tsquare");
        for (int i = 1;i <= userAnswer; i++ ){
            System.out.print(i);
            System.out.print("\t" + i*i);
            System.out.println();


        }


    }
}
