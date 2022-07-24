import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class crawing {

	
	public static void main(String[] args) {
		//수집 대상의 url
		final String mungUrl = "https://www.insiderdog.kr/goods/catalog?page=1&searchMode=catalog&category=c0008&per=40&sorting=ranking&filter_display=lattice";
		Connection conn = Jsoup.connect(mungUrl);
		try {

			Document document = conn.get();
			Elements lmageUrlElements = document.getElementsByClass("item_img_area");
			
			for(Element element : lmageUrlElements) {
				System.out.println(element.attr("abs:src"));
			   }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}