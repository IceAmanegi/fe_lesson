//コーディング演習６：３つの数値を比較し、大きい数値を表示する
package lesson_2;

public class exam_6 {
    public void maxNum(){

        int num1 = 54;
        int num2 = 31;
        int num3 = -100;

        int result;

        if(num1 > num2 && num1 > num3){
            result = num1;
        }

        else if (num2 > num3){
            result = num2;
        }

        else{
            result = num3;
        }

        System.out.println(result);
    }
}