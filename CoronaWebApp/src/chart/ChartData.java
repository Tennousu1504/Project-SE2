package chart;
import java.util.ArrayList;
import java.util.List;
public class ChartData {
    private static final List<KeyValue> chartDataList;
    static {
        chartDataList = new ArrayList<ChartData.KeyValue>();
        chartDataList.add(new KeyValue("USA", "759687"));
        chartDataList.add(new KeyValue("Spain", "195944"));
        chartDataList.add(new KeyValue("Italy", "178972"));
        chartDataList.add(new KeyValue("Germany", "141672"));
        chartDataList.add(new KeyValue("United Kingdom", "120067"));
        chartDataList.add(new KeyValue("France", "112606"));
        chartDataList.add(new KeyValue("Turkey", "86306"));
    }
    public static List<KeyValue> getChartDataList() {
        return chartDataList;
    }
    public static class KeyValue {
        String key;
        String value;
        public KeyValue(String key, String value) {
            super();
            this.key = key;
            this.value = value;
        }
        public String getKey() {
            return key;
        }
        public void setKey(String key) {
            this.key = key;
        }
        public String getValue() {
            return value;
        }
        public void setValue(String value) {
            this.value = value;
        }
    }
}