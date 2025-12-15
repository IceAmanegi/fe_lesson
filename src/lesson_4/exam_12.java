package lesson_4;

public class exam_12 {
    public void run(){
        int [] array = new int []{98, 12, 9, 102, 88};
        int i = 0 ;
        int result = 0;

        while(i<=array.length -1){
            result = result + array[i];
                    i ++;
        }

        System.out.println(result / array.length);

    }
}