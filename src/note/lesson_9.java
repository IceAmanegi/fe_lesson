//その他の繰り返し
package note;

public class lesson_9 {
    public static void main(String[] args) {
        int[] A = new int[]{9, 10, 0, 2, 87, 1000};
        for (int i = 0; i <= A.length - 2; i++) {
            for (int j = A.length - 1; j >= i + 1; j--) {
                if (A[j] < A[j - 1]) {
                  A = replacement(A, j);
                }
            }
        }

//        ソートできたかの確認
        confirmation(A);
    }

    public static int[] replacement(int[] A, int j){
        int w =A[j];
        A[j] =A[j - 1];
        A[j - 1] = w;

        return A;
    }



    public static void confirmation(int[] A) {
        for (int i = 0; i <= A.length - 1; i++) {
            System.out.println(A[i]);
        }
    }
}