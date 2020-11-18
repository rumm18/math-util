/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

/**
 *
 * @author Admin
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long expected = 120;
        long actual = MathUtility.getFactorial(5); //tao goi ham 5!
        System.out.println("5!? exxpected: " + expected + "; actual:" +actual);
        //đúng cho case tình huống đầu tiên
        
        expected = 720;
        actual = MathUtility.getFactorial(6);
        System.out.println("5!? exxpected: " + expected + "; actual:" +actual);
        
        System.out.println("0!? expected: 1; actual: " +MathUtility.getFactorial(0));
        
        
        //kì vọng nhận về ngoại lệ nếu ta gọi -5!
        MathUtility.getFactorial(-5); //mừng vì như thiết kế
    }
    
}
//cất code lên server GitHub
//nhớ kho trên GitHub https://github.com/rumm18/math-util.git
//nhớ user name và pass và email vào GitHub của mình
//cần tool để upload đồng bộ code lên server từ máy mình (local) lên server
//tool có thể là: cmd, GUI, IDE(cmd,click)
//vì ta pro ta chơi cmd
//cài git scm 
//cần file đặc biệt để nói với Git tool rằng ai lên server, ai ở lại local
//file này đc gọi là .gitignore (thuần text)
//nó sẽ khác nhau tùy dự án, tùy vào IDE mình xài, ngôn ngữ lập trình mik xài
//có 1 gã dev cực kì dễ thương đã làm sẵn các file ứng với IDE, NNLT rồi
//xin anh ấy về xài
// http://gitignore.io