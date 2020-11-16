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
public class MathUtility {

    //ta se làm class fake class Math với các hàm static để sài chung cho mọi người
    //mình sẽ làm class này fake y chang class Mark của JDK
    //Math.PI .abd() .sqrt() .pow() .sin()
    //cái gì mà là đồ sài chung, không lưu trữ riêng lẻ info ta sẽ chơi static
    public static final double Pi = 3.14;
    //xài MathUtility.Pi y chang math.PI

    //hàm tính n~ = 1.2.3.4...n
    //n phải >=0, cho nên 21! tràn long rồi
    //ta chỉ tính n! từ 0..20!
    // ngoài vùng này, dù âm hay lố 20, éo tính, chửi = Exception
    //học cách ném ngoại lệ luôn
    //quy ước 0! =1! = 1;
    //đưa nào n âm, hoặc n > 20, ta không thèm tính gì cả, chửi exception
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n mmust be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        //chỗ này thằng nào xài else trừ điểm
        //ngay chỗ này chính là n =2..20
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    // ta tự tin gáy hàm ta chạy ngon, chạy đúng
    // nhưng: team thì cần chứng minh điều đó, đảm bảo chất lượng code, chấy lượng hàm
    // muốn chứng mình hàm chạy đúng hay không ta cần test thử
    // test nghĩa là đưa hàm ra để xài, gọi các tham số khác nhau 
    // ví dụ gọi hàm getFactorial (với các số khác nhau đưa vào)

    public MathUtility() {
    }
    // ta tự tin gáy hàm ta chạy ngon, chạy đúng
    // nhưng: team thì cần chứng minh điều đó, đảm bảo chất lượng code, chấy lượng hàm
    // muốn chứng mình hàm chạy đúng hay không ta cần test thử
    // test nghĩa là đưa hàm ra để xài, gọi các tham số khác nhau 
    // ví dụ gọi hàm getFactorial (với các số khác nhau đưa vào)    
    // các giá trị đầu vào đại diện cho việc xài hàm
    // ta còn gọi là test cases, các tình huống cần test, các tình huống xài hàm
    //khi test hàm ta cần quan tâm 2 việc
    //1. dự kiến hàm trả về giá trị, khi hàm chậy với 1 đầu vào nào đó
    //  dư kiến hàm trả về giá trị, tui gọi là Expected value
    // ví dụ hàm sẽ trả về 120 khi gọi getF(5)
    //2. hàm khi chạy với 1 đầu vào nào đó, thì nó sẽ ói/ return về 1 value
    // cái value trả về của hàmkhi chạy được ọi là actual value
    
    //NGHỀ TEST CHÍNH LÀ: SO SÁNH COI EXPECTED VALUE CÓ BẰNG VỚI ACTUAL VALUE HEM?
    // NẾU CÓ BẰNG HÀM CÓ ĐÚNG CHO CASE/TÌNH HUỐNG NÀY
    // NẾU KHÔNG BĂNG, HÀM TÍNH TOÁN SAI HAOCỰ KÌ VỌNG SAI
    
    //HÀM MÀ TỐT THÌ PHẢI LÀ ÊXPECTED == ACTUAL MỌI TÌNH HUỐNG
    //NẾU  TỐT THÌ TA MỚI ĐEM XÀI, ÁN, PUBLIC CỘNG ĐỒNG XÀI
     
    //LÀM SAO ĐỂ TEST HÀM COI CÓ TỐT KHOONG, EXPECTED == ACTUAL
    //HAI KĨ THUẬT ĐƯỢC ÁP DUNG
    
    //KĨ THUẬT 1: nhìn bằng măý và so sánh từng cặp expecteđ với actual
    //      chính là kĩ thuật sout(expected), sout(actual-hàm ói về gì khi chạy)
    // kĩ thuật này đơn giản, dễ làm, nhưng mắc sai sót do có quá nhiều cặp expected vs actual cần so bằng mắt
    //KỸ THUẬT 2: nhìn bằng mắt, không cần so sánh từng cặp, để máy so sánh giùm luôn
    //      nếu mắt chỉ nhìn 2 màu xanh đỏ duy nhất
    //nếu tất cả các cặp actual vs expected đều thỏa, màu xanh cho tất cả
    // nếu hầu hết các cặp actual vs expected đều thỏa, có 1 vài cái không thỏa
    // thì kết luận ngay, hàm sai, màu đỏ cho tất cả
    //điều này giải thihcs là: đúng thì phải đúng cho tất cả mọi tình huống hàm chạy
    //chỉ 1 thằng sai -> hàm sai
    
    // KỸ THUẬT 2 NÀY DÙNG MÀU SẮC, MÚN LÀM VẬY PHẢI SÀI THƯ VIỆN BỔ SUNG THÊM 
    // CHÍNH LÀ FILE. JAR, .DLL ĐƯỢC CÙN CAPÁ THÊM NGOÀI JDK
    // Các thư viện này tùy thuộc ngôn ngữ lập trình, được gọi chung là UNIT TEST FRAMEWORK
    //C#: thư viện cụ thể NUnit, MSUNit, xUnit
    //Java: thư viện cụ thể JUnit, TestNG, xUnit
    //PHP: PHPUnit
    //C++: CPPUnit
    //  ...s
}
