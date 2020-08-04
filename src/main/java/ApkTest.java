import reader.PayloadReader;
import reader.SignatureNotFoundException;
import writer.PayloadWriter;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

public class ApkTest {

    public static void main(String[] args) throws IOException, SignatureNotFoundException {
        PayloadWriter.put(new File("/Users/guoyong/Desktop/QQQ.apk"),100,"这是自己添加的内容");
//      byte[] msg =   PayloadReader.get(new File("/Users/guoyong/Desktop/QQQ.apk"),100);
//      String aa = new String(msg);
//      System.out.println(aa);

    }


}
