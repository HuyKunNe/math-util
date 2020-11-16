/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huy.util;

/**
 *
 * @author Huy Kun Ne
 */
public class Main {
    public static void main(String[] args) {
        long expected = 120; //t hi vong 120 ói về nếu
        long actual = MathUtility.getFactorial(5); // t gọi hàm 5!
        System.out.println("5!: expected: "+expected+ "; actual: "+actual);
        // đúng cho case tình huống đầu tiên
        
        expected = 720; // hi vọng ói về 720 nếu tao gọi
        actual = MathUtility.getFactorial(6); // 6!
        System.out.println("6!: expected: "+expected+ "; actual: "+actual);
        //đúng case 2
        
        //case 3:
        System.out.println("0!: expected: 1"+ "; actual: "+MathUtility.getFactorial(0));
        
        //case 4:
        //tao kì vọng nhận về ngoại lệ IllegalArgumentException
        //nếu tao gọi -50!
        MathUtility.getFactorial(-50);
        //thấy ngoại lệ lại mừng vì hàm chạy nhw thiết kế
    }
}
//cất code lên server GitHub
//cần:
// nhớ kho trên GitHub, url: https://github.com/HuyKunNe/math-util
//nhớ userName, pass và email vào gitHub của mình
//cần tool để đồng bộ code từ local lên server (gitHub, gitLab, gitBuket)
// tool có thể làm cmd, GUI(Git Desktop, Sourve Tree), chính IDE (cmd, click)
//vì ta pro, ta chơi cmd
//cài git scm đã nói download sẵn