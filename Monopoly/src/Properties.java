public class Properties {
    private String name;
    private int cost;
    private int houseCost;
    private int rent;
    private int house1Rev;
    private int house2Rev;
    private int house3Rev;
    private int house4Rev;
    private int hotelRev;
    private int mortgage;
    private double xVal;
    private double yVal;
    private int pos;;
    private Boolean owned = false;
    private Player owner;
    private int freeParkingMoney = 200;
    private int houseNum = 0;
    private int type;
    private boolean isMortgaged = false;


    public Properties() {
        name = "no name";
        cost = 0;
        houseCost = 0;
        rent = 0;
        house1Rev = 0;
        house2Rev = 0;
        house3Rev = 0;
        house4Rev = 0;
        hotelRev = 0;
        mortgage = 0;
        xVal = 0;
        yVal = 0;
        pos = 0;
    }

    public Properties(String propName, double propXVal, double propYVal, int propPos) { //for chance, chest
        name = propName;
        xVal = propXVal;
        yVal = propYVal;
        pos = propPos;
        type = 1;
    }

    public Properties(String propName, int propCost, int propMortgage, double propXVal, double propYVal, int propPos) { //for railroad, utility
        name = propName;
        cost = propCost;
        mortgage = propMortgage;
        owned = false;
        xVal = propXVal;
        yVal = propYVal;
        if (propPos == 6 || propPos == 16 || propPos == 26 || propPos == 36) {
            type = 2;
        }
        else {
            type = 3;
        }
    }

    public int getRailroadRent(int numRailroadsOwned) {
        if (numRailroadsOwned == 1 || numRailroadsOwned == 0) {
            rent = 25;
            return rent;
        }
        else if (numRailroadsOwned == 2) {
            rent = 50;
            return rent;
        }
        else if (numRailroadsOwned == 3) {
            rent = 100;
            return rent;
        }
        else {
            rent = 200;
            return rent;
        }
    }

    public int getUtilityRent(int diceVal, int numUtilityOwned) {
        if (numUtilityOwned == 1 || numUtilityOwned == 0) {
            rent = diceVal * 4;
            return rent;
        }
        else {
            rent = diceVal * 10;
            return rent;
        }
    }


    public Properties(String propName, int propCost, int propHouseCost, int propRent, int propHouse1Rev, int propHouse2Rev, int propHouse3Rev, int propHouse4Rev, int propHotelRev, int propMortgage, double propXVal, double propYVal, int propPos) {//for regular properties
        name = propName;
        cost = propCost;
        rent = propRent;
        houseCost = propHouseCost;
        house1Rev = propHouse1Rev;
        house2Rev = propHouse2Rev;
        house3Rev = propHouse3Rev;
        house4Rev = propHouse4Rev;
        hotelRev = propHotelRev;
        mortgage = propMortgage;
        xVal = propXVal;
        yVal = propYVal;
        pos = propPos;
        owned = false;
        type = 4;
    }

    public int getType() {
        return type;
    }

    public int getPos() {
        return pos;
    }

    public void setOwner(Player buyer) {
        owner = buyer;
        owned = true;
    }

    public boolean isOwned() {
        return owned;
    }

    public Player getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void boughtHouse() {
        houseNum = houseNum + 1;
    }

    public void soldHouse() {
        houseNum = houseNum - 1;
    }

    public int getNumHousesOnProp() {
        return houseNum;
    }

    public int getRev() {
        if (houseNum == 0) {
            return rent;
        }
        else if (houseNum == 1) {
            return house1Rev;
        }
        else if (houseNum == 2) {
            return house2Rev;
        }
        else if (houseNum == 3) {
            return house3Rev;
        }
        else if (houseNum == 4) {
            return house4Rev;
        }
        else {
            return hotelRev;
        }
    }


    public int getHouseCost() {
        return houseCost;
    }

    public void printHouseRev() { //This will be used to tell the user the houseRevs before buying houses
        System.out.println("Revenue: ");
        System.out.println("With one house: $" + house1Rev);
        System.out.println("With two houses: $" + house2Rev);
        System.out.println("With three houses: $" + house3Rev);
        System.out.println("With four houses: $" + house4Rev);
        System.out.println("With a hotel: $" + hotelRev);
    }

    public int getMortgage() {
        return mortgage;
    }

    public double getxVal() {
        return xVal;
    }

    public double getyVal() {
        return yVal;
    }

    public void incFreeParkingMoney(int amt) {
        freeParkingMoney = freeParkingMoney + amt;
    }

    public int getFreeParkMoney() {
        return freeParkingMoney;
    }

    public void resetFreeParkingMoney() {
        freeParkingMoney = 0;
    }

    public void mortgageProp() {
        isMortgaged = true;
    }

    public void unMortgageProp() {
        isMortgaged = false;
    }

    public boolean isPropMortgaged() {
        return isMortgaged;
    }

    public void printDetails(Player currPlayer) {

        System.out.println("This tile's name is " + getName());

        if (type == 2 || type == 3 || type == 4) {
            if (owner == null) {
                System.out.println("Unowned");
            }
            else {
                System.out.println("Owner: " + getOwner().getPlayerName());
            }

            if (owned) {
                if (type == 2) {
                    System.out.println("Rent owed to " + getOwner().getPlayerName() + " from landing on this property is $" + getRailroadRent(getOwner().getNumRailroads()));
                }
                else if (type == 3) {
                    System.out.println("Rent owed to " + getOwner().getPlayerName() + " from landing on this property is $" + getUtilityRent(1, getOwner().getNumUtilities()) + " times the value of the dice");
                }
                else if (type == 4) {
                    System.out.println("Rent owed to " + getOwner().getPlayerName() + " from landing on this property is $" + getRev());
                }
            }
            else {
                System.out.println("This property costs $" + getCost());
            }

            if (type == 4) {
                System.out.println("It costs $" + getHouseCost() + " to build a house on this property");
            }

            if (type == 2) {
                if (currPlayer.getNumRailroads() == 1) {
                    System.out.println("You own 1 railroad already");
                }
                else {
                    System.out.println("You own " + currPlayer.getNumRailroads() + " railroads already");
                }
            }

            if (type == 3) {
                if (currPlayer.getNumUtilities() == 1) {
                    System.out.println("You own 1 utility already");
                }
                else {
                    System.out.println("You own " + currPlayer.getNumUtilities() + " utilities already");
                }
            }

            System.out.println("This property can be mortgaged for $" + getMortgage());
        }
    }

    public void tradeProps(Properties propTrade, Properties propTradeFor, Player trader, Player tradee) {
        propTrade.setOwner(tradee);
        propTradeFor.setOwner(trader);
        trader.subtractVal(propTrade.getMortgage());
        trader.addVal(propTradeFor.getMortgage());
        tradee.subtractVal(propTradeFor.getMortgage());
        tradee.addVal(propTrade.getMortgage());


    }







}
