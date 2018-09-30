import java.text.DecimalFormat;

public class StockThread implements Runnable {

    private int startTime;
    private String stockName;
    private double price;

    private Function threadOffice;

    public StockThread(Function pst, int newStartTime, String newStock, double newPrice){
      this.threadOffice = pst;
      this.startTime = newStartTime;
      this.stockName = newStock;
      this.price = newPrice;


    }

    @Override
    public void run() {


        for (int i = 1; i < 20; i++) {
            try {
               //sleep for 2 secs
                Thread.sleep(2000);

            } catch (InterruptedException e) { }

            double randomNumnber = (Math.random() * (.06)) - .03;
            // Formats decimals to 2 places
            DecimalFormat df = new DecimalFormat("#.##");

             price =  Double.valueOf(df.format((price + randomNumnber)));
            if(stockName.equals("Apple")) ((PostOffice)threadOffice).setApplePrice(price);
            if (stockName.equals("Google")) ((PostOffice)threadOffice).setGooglePrice(price);
            if (stockName.equals("IBM")) ((PostOffice)threadOffice).setIBMPrice(price);



            System.out.println(stockName + ": " + df.format((price)) + " " + df.format((randomNumnber)));

            System.out.println();

        }
    }
}
