package lesson_4;

public class exam_13 {
    public void run(){
        int [] A = new int []{100, 0, 15, 22, 69, 985, 47};

        for (int i = 0 ; i <= A.length -2; i++){
            for (int j = A.length - 1; j >= i + 1; j--) {
                if (A[j] < A[j - 1]) {
                    int w = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = w;
                }
            }
        }

        for (int i = 0; i <= A.length - 1; i++) {
            System.out.println(A[i]);

        }
    }
}
