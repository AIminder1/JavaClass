package ClassesAndObjectsPartOne;

public class Market {
    String nameMarket;
    String addressMarket;
    int buildings;
    String typeMarket;
    String prducts;
    int sellers;

    public Market(){
    }
    public Market(String nameMarket){
    }
    public Market(String addressMarket,int buildings){
    }

    public Market(String typeMarket, String prducts,int sellers ){}

    public static void main(String[] args) {
        Market market = new Market();

        Market marketName = new Market("AsianBazzar");

        Market marketAddress = new Market("24th St Brkl", 4);

        Market markeType = new Market("Vehicle", "Technology",400);
    }
}
