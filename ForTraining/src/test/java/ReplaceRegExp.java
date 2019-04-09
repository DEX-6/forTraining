import org.junit.Test;

public class ReplaceRegExp {
    @Test
    public void test(){
        String pattern = "qwe &%asd%& qwe &%zxc%&";
        String regExp_1 = "&%asd%&";
        String regExp_2 = "&%zxc%&";
        String newValue = "123";
        String result = pattern.replaceAll(regExp_1, newValue);
        result = result.replaceAll(regExp_2, newValue);
    }
}
