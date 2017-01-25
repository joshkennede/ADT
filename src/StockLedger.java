/**
 * Created by joshkennede on 1/24/17.
 */
/*public class StockLedger {
    private QueueInterface<StockPurchase> ledger;
    public StockLedger() {
        ledger = new LinkedQueue<StockPurchase>();
    } // end default constructor

    public void buy(int sharesBought, double pricePerShare) {
        for (; sharesBought > 0; sharesBought--) {
            StockPurchase purchase = new StockPurchase(pricePerShare);
            ledger.enqueue(purchase);
        } // end for
    } // end buy

    public double sell(int sharesSold, double pricePerShare) {
        double saleAmount = sharesSold * pricePerShare;
        double totalCost = 0;
        while (sharesSold > 0) {
            StockPurchase share = ledger.dequeue();
            double shareCost = share.getCostPerShare();
            sharesSold--;
        } // end while
        return saleAmount - totalCost;
    } // end sell
} // end StockLedger*/
