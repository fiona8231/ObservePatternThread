public class Test {

    public static void main(String[] args){

        PostOffice postOffice = new PostOffice();
      /*
        Stock obsever1= new Stock(postOffice);

        postOffice.setApplePrice(300);
        postOffice.setGooglePrice(400);
        postOffice.setIBMPrice(200);


        postOffice.unRegister(obsever1);
        Stock obsever2 = new Stock(postOffice);
        Stock obsever3 = new Stock(postOffice);
        */


        Runnable thread1 = new StockThread(postOffice, 2,"Apple", 200);
        Runnable  thread2 = new StockThread(postOffice, 2,"Google", 300);
        Runnable  thread3 = new StockThread(postOffice, 2,"IBM", 150);

      new Thread(thread1).start();
      new Thread(thread2).start();
      new Thread(thread3).start();



    }

}
