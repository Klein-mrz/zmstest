import net.sf.jsqlparser.expression.operators.relational.NotEqualsTo;
import okhttp3.*;

import java.io.IOException;
import java.net.URLDecoder;

public class aa
{
    public static void main(String[] args) throws IOException {
        doIt();
    }

    public static void doIt() throws IOException {
        OkHttpClient client=new OkHttpClient();
        RequestBody requestBody=new FormBody.Builder().add("", "").build();
        Request request=new Request.Builder()
                .url("https://www.biquger.com/biquge/111013/")
                .get()
                //.addHeader("Content-Type", "text/html; charset=gbk")
                .build();
        Call call=client.newCall(request);
        Response response =call.execute();
        String result =new String(response.body().bytes(),"GBK") ;
        System.out.println(result);
    }
}
