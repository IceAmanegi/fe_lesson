package note;

public class lesson_4 {
    public static void main(String[] args) {
        int ret;
        int age = 34;

        if(age <= 3) {
            ret = 100;
         }else if (age <= 9){
            ret = 300;
         }else{
            ret = 500;
        }

        System.out.println(ret);


        int value;

        value = 100;

        if(value != 0 || value == 100){
            System.out.println("０ではない、または１００");
        }
        else{
            System.out.println("０かつ１００ではない");
        }


    }
}