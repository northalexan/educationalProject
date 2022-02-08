package Parser.entity;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;


public abstract class AllCounties {

    public int getValuePopulation(String url, String cssQuerty) throws IOException {

        Document pageNasRus = Jsoup.connect(url).get();
        Elements full = pageNasRus.select(cssQuerty);
        String fullStr = full.text().replaceAll("\\s", "");
        int fullInt = Integer.parseInt(fullStr);
        return fullInt;
    }
    public double getValue() throws IOException {

        Document pageNasRus = Jsoup.connect("https://www.banki.ru/products/currency/usd/").get();
        Elements pege = pageNasRus.select("body > div.layout-wrapper.padding-top-default.bg-white.position-relative > div.layout-columns-wrapper > main > section:nth-child(4) > div.currency-table > table > tbody > tr > td.currency-table__rate.currency-table__darken-bg > div.currency-table__large-text");
        String fullStr = pege.text().replace(',','.');


        double fullInt = Double.parseDouble(fullStr);
        return fullInt;
    }


}
