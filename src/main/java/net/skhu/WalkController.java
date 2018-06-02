package net.skhu;


import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/walk")
public class WalkController {

	@RequestMapping("test")
	public String test() throws IOException{
//		StringBuilder urlBuilder = new StringBuilder("http://openapi.forest.go.kr/openapi/service/cultureInfoService/gdTrailInfoOpenAPI"); /*URL*/
//        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=lco1hBydNCh2%2FdcDDkSBod92Ace0eyP9JzPBVIwJKlWlSoxF6uQ%2BLgMXuzDX5a0pqK%2By0q7lhlZvQPIEndZsxQ%3D%3D"); /*Service Key*/
//        urlBuilder.append("&" + URLEncoder.encode("searchMtNm","UTF-8") + "=" + URLEncoder.encode("도봉산", "UTF-8")); /*2619990400*/
//        urlBuilder.append("&" + URLEncoder.encode("searchArNm","UTF-8") + "=" + URLEncoder.encode("경기", "UTF-8"));
////        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));
////        urlBuilder.append("&" + URLEncoder.encode("startPage","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));
////        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8"));
////        urlBuilder.append("&" + URLEncoder.encode("pageSize","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8"));
//        URL url = new URL(urlBuilder.toString());
//        System.out.println(url);
//        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//        //HttpURLConnection을 사용하면 별도의 소켓 사용없이 URL을 호출할수 있다.
//        conn.setRequestMethod("GET");
//        //전달 방식을 설정한다 . 기본값이 GET 이다.
//        conn.setRequestProperty("Content-type", "application/json");
//        //헤더 값을 설정한다.
//        //타입설정 application/json 형식으로 전송
//        conn.setRequestProperty("Accept", "application/json");
//        //서버 Response Data를 Json 형식의 타입으로 요청
//        System.out.println("Response code: " + conn.getResponseCode());
//        //실제 서버로 request 요청하는 부분(응답코드를 받는대 200 이면 성공, 나머지는 에러
        return "공공데이터";
	}
}
