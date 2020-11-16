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
public class MathUtility {
    //mình sẽ làm class này fake y chang clss Math của JDK
    //Math.PI .abs() .sqrt()  .pơ()  .sin()
    //cái gì mà là đồ xài chung, ko lưi trữ riêng lẻ i4 ta sẽ chơi static
    public static final double PI = 3.1415;
    //xài MathUtility.PI y chang Math.PI
    //hàm tính n! = 1.2.3...n
    //n phải >=0, 0! =1! = 1;
    // quy ước n! tăng nhanh, cho nên 21! tràn long rồi
    //ta chỉ tính n! từ 0...20
    //ngoài vùng này, dù âm hay lố 20, éo tính, chửi = exception
    //học cách ném ngoại lệ luôn
    public  static long getFactorial(int n){
        if (n <0 || n >20)
            throw new IllegalArgumentException("n must be between 0 and 20");
        if (n==0 || n ==1)
            return 1;
        long result = 1;
        for (int i = 2; i <= n; i++) 
            result *= i;
        return result;
            
        
    }
}
//ta tựu tin gáy ta chạy ngon, chạy đúng
// nhưng: team thì cần chứng minh điều đó, đảm bảo chất lượng code, chất lượng 
//test nghĩa là đưa hàm ra xài, gọi với các tham số khác nhau
//getF(-5), getF(0), getF(5),...
// các giá trị đầu vào đại diện cho việc xài hmaf,
//ta còn gọi là test cases, các tình huống cần test, các tính huống xài hàm khi ta test, ta cần quan tâm 2 việc:
//1. dự kiến hàm trả về giá trị gì khi hàm chạy vs 1 đầu vào nào đó
//dự kiến hàm trả về giá trị, tui gọi là EXPECTED VALUE
// ví dụ: hàm sẽ trả về 120 khi gọi getF(5)
//2. hàm khi chạy với 1 đầu vào nào đó, thì ta sẽ return về 1 value
//cái value trả về của hàm khi chạy đc gọi là ACTUAL VALUE

//NGHỀ TEST chính là so sánh cói EXPECTED VALUE có bằng với ACTUAL VALUE không
//nếu có bằng, hàm đúng cho case này
//nếu không bằng, hàm tính toán sai hoặc kì vọng sai 

//Hàm mà tốt thì phải là EXPECTED -- ACTUAL mọi tình huống
//Nếu tốt ta mới đem ra xài, bán , public cộng đồng xài.

//làm sao để  test coi có tốt không, EXPECTED ==ACTUAL
//Hai kĩ thuật đc áp dụng
//Kĩ thuật 1: nhìn bằng mắt và so sánh từng cặp EXPECTED vs ACTUAL: "sout(expected),sout(actual-hàm return gì khi chạy)
//            kĩ thuật này đơn giản dễ làm nhưng hay sai xót do có quá nhiều cặp EXPected--Actual cần so sánh bằng mắt
//Kĩ thuật 2: nhìn bằng mắt, không cần so sanh từng cặp, để máy so dùm, mắt chỉ nhign hai màu xanh đỏ duy nhất 
//            nếu tấ cả các cặp Actual vs Expected đều thỏa màu xanh cho cả đám
//            nếu hầu hết các cặp Actual vs Expected đều thỏa, có vài cái không thỏa 
//thì kết luận ngay hàm sai , màu đỏ cho tất cả
// điều này giải thích là: đúng thì phải đúng cho tất cả mọi itnhf huống hàm chạy 
//chỉ cần 1 thằng sai, hàm sai
//Kĩ thuật 2 này dùng màu sắc, mún làm vậy phải xài thư viện bổ sung thêm
//chính là FILE .JAR, .DLL đc cung cấp thêm ngoài JDK
//các thư viện này tùy thuộc vào ngôn ngữ lập trình và đc gọi chung là Uni Test Framework
//C#: thư viện cụ thể NUnit, MSUnit
//Java: thư viện cụ thể JUnit, TestNG, xUnit
//PHP: PHPUnit
//C++: CPPUnit