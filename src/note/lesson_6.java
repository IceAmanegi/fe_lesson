//セクション６：繰り返し
package note;

public class lesson_6 {
    public static void main(String[] args) {
//        for(int num = 1; num <= 10; num += 1){
//            System.out.println(num);
//        }
//        for(int num1 = 10; num1 >= 1; num1 = num1 - 1){
//            System.out.println(num1);
//        }

        //入れ替え
        int [] array = new int []{1, 2, 3, 4, 5};
        int right;
        int tmp;

        for(int left = 0 ; left <= (array.length - 1) / 2 ; left += 1) {
            right = (array.length - 1) - left;
            tmp = array[right];
            array[right] = array[left];
            array[left] = tmp;
        }
//        表示処理
        for(int i = 0 ; i <= array.length - 1 ; i ++ ) {
            System.out.println(array[i]);
        }

    }
}