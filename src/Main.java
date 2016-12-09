/**
 * Created by e165704 on 2016/12/09.
 */
public class Main {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }
        catch (NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました。");
            e.printStackTrace();
            return;
        }
    }
}
