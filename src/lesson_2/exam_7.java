//コーディング演習７：複雑な条件分岐
package lesson_2;

public class exam_7 {
    public void result() {

        int kokugo;
        int sugaku;
        int eigo;
        int rika;
        int syakai;

        kokugo = 82;
        sugaku = 90;
        eigo   = 73;
        rika   = 79;
        syakai = 87;

        if(kokugo >= 80 && eigo >= 70){
            System.out.println("合格");
        }
        else if(sugaku >= 70 && rika >= 80) {
            System.out.println("合格");
        }
        else if(kokugo + sugaku + eigo + rika + syakai > 400){
            System.out.println("合格");
        }
        else{
            System.out.println("不合格");
        }

    }
}

