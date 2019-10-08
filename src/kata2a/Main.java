package kata2a;

public class Main {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(1,2,5,4,2,1,8,6,0,-1,3,2,1);
        HistogramDisplay display = new HistogramDisplay(histogram);
        display.execute();
    }
    
}
