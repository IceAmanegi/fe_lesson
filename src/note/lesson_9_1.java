//戻り値

package note;

public class lesson_9_1 {
    public static void main(String[] args) {
       String ret = function("Abc");
       System.out.println(ret);
    }

    public static String function(String str) {
        str = "[" + str + "]";
        return str;
        }
    }
