package core.providers;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JaCoCoProvider {
    public static void main(String[] args) {
        int value = getBranchesCoverage();
        System.out.println(value);
    }
    private static int missedInstructions;
    private static int missedBranches;

    public static int getInstructionsCoverage() {
        getJaCoCo();
        return missedInstructions;
    }

    public static int getBranchesCoverage() {
        getJaCoCo();
        return missedBranches;
    }

    private static void getJaCoCo(){
       try {
            File input = new File("build/reports/jacoco/test/html/index.html");
            Document doc = Jsoup.parse(input, "UTF-8");
            Element tfoot = doc.selectFirst("tfoot");
            Element tr = tfoot.selectFirst("tr");
            Elements tds = tr.select("td");
            for (Element td : tds) {
                if( td.text().contains("%")){
                    int pr = Integer.parseInt(td.text().split("%")[0]);
                    if(tds.indexOf(td) ==2) missedInstructions = 100-pr;
                    if(tds.indexOf(td) ==4) missedBranches = 100-pr;
                }
            }
       } catch(IOException e){
            e.printStackTrace();
        }
    }

}
