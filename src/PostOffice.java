import java.util.ArrayList;

public class PostOffice implements Function{

    private double applePrice;
    private double googlePrice;
    private double IBMPrice;



    ArrayList<Observer> observerList;


    public PostOffice (){

        observerList = new ArrayList();


    }


    @Override
    public void register(Observer ob) {

        observerList.add(ob);

        int index = observerList.indexOf(ob);
        System.out.println("Observer: " + (index+1) + " is added.");
    }

    @Override
    public void unRegister(Observer ob) {
        int index1 = observerList.indexOf(ob);
        System.out.println("Observer: " + (index1+1) + " is removed.");
       observerList.remove(ob);

    }

    @Override
    public void notification() {

        for (Observer ob :observerList){
            ob.update(applePrice, googlePrice, IBMPrice);
        }

    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notification();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notification();
    }

    public void setIBMPrice(double IBMPrice) {
        this.IBMPrice = IBMPrice;
        notification();
    }
}
