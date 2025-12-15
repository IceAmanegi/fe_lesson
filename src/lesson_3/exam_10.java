//コーディング演習１０：２次元配列
package lesson_3;

public class exam_10 {
    public void result() {
        int [][] tall = new int[3][4];

        tall[0][0] =173;
        tall[0][1] =169;
        tall[0][2] =176;
        tall[0][3] =182;

        tall[1][0] =170;
        tall[1][1] =171;
        tall[1][2] =175;
        tall[1][3] =172;

        tall[2][0] =180;
        tall[2][1] =168;
        tall[2][2] =167;
        tall[2][3] =173;

        System.out.println(tall[0][0] + "," + tall[0][1] + "," + tall[0][2] + "," + tall[0][3]);
        System.out.println(tall[1][0] + "," + tall[1][1] + "," + tall[1][2] + "," + tall[1][3]);
        System.out.println(tall[2][0] + "," + tall[2][1] + "," + tall[2][2] + "," + tall[2][3]);

    }
}