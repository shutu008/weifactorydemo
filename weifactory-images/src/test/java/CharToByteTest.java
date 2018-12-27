import org.junit.Test;

/**
 * @author ssj
 * @create 2017-11-04 21:50
 */
public class CharToByteTest {

    @Test
    public void charToByteTest(){
        byte[] bytes = new String("#ZWGC2017100800007#M001#JPG#00044548#\n").getBytes();
        String headString = new String(bytes);
        System.out.println(headString);
        String[] split = headString.split("#");
        String sn = "";
        String sensor = "";
        String dataType = "";
        for (String s: split){
            sn = split[0];
            sensor = split[1];
            dataType = split[2];
        }
        System.out.println(sn+sensor+dataType);
        System.out.println(bytes.length);
        System.out.println("#ZWGC2017100800007#M001#JPG#00044548#".length());
    }
}
