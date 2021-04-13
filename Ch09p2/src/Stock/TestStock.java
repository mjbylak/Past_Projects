/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stock;

/**
 *
 * @author mitch
 */
  class die {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
 class Stock {
     //datafields
     String symbol;
     String name;
     double previousClosingPrice;
     double currentPrice;
     
     //constructors
    Stock (String newSymbol, String newName, double newPreviousClosingPrice, double newCurrentPrice) {
        name = newName;
        symbol = newSymbol;
        previousClosingPrice = newPreviousClosingPrice;
        currentPrice = newCurrentPrice;
    }
    
    double getChangePercent() {
    return (currentPrice- previousClosingPrice)*100/previousClosingPrice;     
    }
    
} 

    public class TestStock {
        public static void main (String [] args) {
            Stock stock1 = new Stock("ORCL", "Oracle", 34.5, 34.35);
            System.out.println(stock1.name+" known as " + stock1.symbol + " has a percent change of "+ stock1.getChangePercent());
        }
    }