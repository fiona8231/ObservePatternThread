import java.text.DecimalFormat;

public class StockThread implements Runnable {

    private int startTime;
    private String stockName;
    private double price;

    private PostOffice threadOffice;

    public StockThread(PostOffice pst, int newStartTime, String newStock, double newPrice){
      this.threadOffice = pst;
      this.startTime = newStartTime;
      this.stockName = newStock;
      this.price = newPrice;


    }

    @Override
    public void run() {


        for (int i = 0; i < 20; i++) {
            try {
               //sleep for 2 secs
                Thread.sleep(2000);

            } catch (InterruptedException e) { }

            double randomNumnber = (Math.random() * 3) - 6;
            // Formats decimals to 2 places
            DecimalFormat df = new DecimalFormat("#.##");

             price = Double.valueOf(df.format(price + randomNumnber));
            if(stockName.equals("Apple")) threadOffice.setApplePrice(price);
            else if (stockName.equals("Google")){
                threadOffice.setGooglePrice(price);
            }else if (stockName.equals("IBM")) threadOffice.setIBMPrice(price);



            System.out.println(stockName + ": " + df.format((price+randomNumnber)) + " " + df.format(randomNumnber));

            System.out.println();

        }
    }
}
