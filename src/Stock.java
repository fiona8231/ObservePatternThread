public class Stock implements Observer {

    private double apple, google, ibm;

    public static int arrayListIndex = 0;
    private PostOffice post;


    public Stock(PostOffice newPost){
        this.post = newPost;
        newPost.register(this);
       // arrayListIndex++;
       // System.out.println("Observer: " + arrayListIndex + " is added.");
    }



    public void update(double Appleprice, double Googleprice,double IBMprice) {
            this.apple = Appleprice;
            this.google = Googleprice;
            this.ibm = IBMprice;

            printThePrice();
    }

    private void printThePrice() {

        System.out.println("Apple Price: " + apple + " Google Price: " + google + " IBM Price: " + ibm );
    }
}
