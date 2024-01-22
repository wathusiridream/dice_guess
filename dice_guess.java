import java.util.Random;
import java.util.Scanner;

public class dice_guess {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Scanner keyboard = new Scanner(System.in);

        char playAgain;  // เพิ่มตัวแปรเพื่อเก็บค่าที่ผู้ใช้ป้อน

        do {
            int dice1 = randomNumber.nextInt(6);
            int dice2 = randomNumber.nextInt(6);
            int sumDice = dice1 + dice2 + 2;

            System.out.print("Please choose (0: low, 1: high): ");
            int choice = keyboard.nextInt();

            if (sumDice <= 6 && choice == 0) {
                System.out.println("Congratulations");
                System.out.println(sumDice);
            } else if (sumDice > 6 && choice == 1) {
                System.out.println("Congratulations");
                System.out.println(sumDice);
            } else {
                System.out.println("Sorry, you're wrong");
                System.out.println(sumDice);
            }

            // ถามผู้ใช้ว่าต้องการเล่นอีกรอบหรือไม่
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = keyboard.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');  // เช็คว่าผู้ใช้ต้องการเล่นอีกรอบหรือไม่
        
        keyboard.close();  // ปิด Scanner เมื่อเสร็จสิ้น
    }
}
