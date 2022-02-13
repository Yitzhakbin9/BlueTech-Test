import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

/*
כתבו קטע תוכנית המצהיר על מערך מטיפוס שלם בגודל 10 ,ומציב בכל תא ערך מספרי
 ששווה לריבוע מקומו הסידורי. למשל, בתא 0 יהיה הערך 0 ובתא 5 יהיה הערך 25.
 */

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }

    }




    /*
    כתבו פונקציה רקורסיבית שמחשבת את מספר הדרכים לעלות n מדרגות כאשר בכל צעד עולים מדרגה אחת או שתי מדרגות
    public static int takeStairs(int n) לעלות מדרגה אחת? רק אפשרות אחת לעלות 2 מדרגות? לעלות
    "רגיל" או לדלג 2 לעלות 3 מדרגות? ראשונה ולדלג 2 , לדלג 2 ושלישית , לעלות "רגיל"...
*/

    public static int takeStairs(int n) {

        if (n < 0) return 0;
        if (n == 0) return 1;
        return takeStairs(n - 1) + takeStairs(n - 2);

    }
}
