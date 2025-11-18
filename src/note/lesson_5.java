package note;

public class lesson_5 {
    public static void main(String[] args) {
        int value;
        int[] result = new int[]{11, 32, 99};
        int[] array = new int[]{0, 1, 2, 3, 4};
        int right, left;
        int tmp;
        String aa;

        int[][] array2 = new int[][]{
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };

        int[][] arrays = new int [2][2];
        arrays[0][0] = 1;
        arrays[0][1] = 2;
        arrays[1][0] = 3;
        arrays[1][1] = 3;

        array[3] = array[4];
        array[2] = array[3];


//        添え字（インデックス）
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
       }
}