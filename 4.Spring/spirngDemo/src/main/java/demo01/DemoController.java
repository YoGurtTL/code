package demo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.*;

/**
 * 测试示例，设置请求header参数
 */
public class DemoController {

    private RestTemplate restTemplate = new RestTemplate();

    private String ssoBaseUrl = "http://172.30.247.13:9002";

    public void query(String art){
        String appCode = "ywtcyth";//CA统一分配
        String appSecret = "SCCA-1638088713231773697";//CA统一分配

        // 设置提交的参数，sp和art，其中sp为后端项目配置
        MultiValueMap<String, String> params= new LinkedMultiValueMap<String, String>();
        params.add("appCode", appCode);

        // 设置请求头数据.
        Long requestTime = System.currentTimeMillis();
        System.out.println(requestTime);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("TIMESTAMP",requestTime.toString());
        httpHeaders.add("APP_CODE",appCode);
        httpHeaders.add("SIGNATURE",calc((MultiValueMap)params, requestTime, appSecret));
        HttpEntity<MultiValueMap> httpEntity = new HttpEntity<MultiValueMap>(params,httpHeaders);
        // 调用接口, 获取返回值
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(ssoBaseUrl.concat("/scca-person-server/v2/sync/organ/listsub"), httpEntity, String.class);
        System.out.println(responseEntity.getBody());
    }

    /**
     * 加密
     * @param paramMap
     * @param requestTime
     * @param key
     * @return
     */
    public static String calc(Map<String, Object> paramMap, Long requestTime, String key){
        TreeMap<String, String> treeMap = new TreeMap<>();
        Set<Map.Entry<String,Object>> set = paramMap.entrySet();
        for (Map.Entry<String, Object> entry : set) {
            Object param = entry.getValue();
            String val;
            if (param instanceof Collection){
                StringBuilder sb = new StringBuilder();
                Collection coll = (Collection) param;
                for(Object o : coll) {
                    sb.append(o.toString());
                }
                val = sb.toString();
            }else{
                val = param.toString();
            }
            treeMap.put(entry.getKey(), val);
        }
        StringBuilder toSign = new StringBuilder();
        treeMap.forEach((k, v)->{
            toSign.append(k).append("=").append(v).append("&");
        });
        if (toSign.length() > 0){
            toSign.setLength(toSign.length() - 1);
        }
        toSign.append(requestTime);
        System.out.println("toSign：" + toSign);

        // hmac
        SecretKey secretKey = null;
        try {
            secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKey);
            byte[] resultBytes = mac.doFinal(toSign.toString().getBytes("UTF-8"));
            String signature = bytesToHex(resultBytes);
            System.out.println(signature);
            return signature;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

}
