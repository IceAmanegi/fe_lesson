//コーディング演習８：整数型配列の宣言　初期化なし
package lesson_3;

public class exam_8 {
    public void calculate() {
        int[] age = new int [10];
        int result;

        age[0] = 14;
        age[1] = 21;
        age[2] = 22;
        age[3] = 19;
        age[4] = 31;
        age[5] = 18;
        age[6] = 20;
        age[7] = 21;
        age[8] = 33;
        age[9] = 18;

        result = age[1] + age[8];

        System.out.println(result);
    }
}