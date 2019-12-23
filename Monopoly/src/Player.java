public class Player {

    private int playerMoney;
    private String playerName;
    private int playerPos;
    private int playerVal;
    private Properties[] ownedProperties = new Properties[40];
    private int numProps;
    private boolean inJail;
    private int numRailroads = 0;
    private int numUtilities = 0;
    private int jailTurns = 0;
    private String shape;

    public Player() {
        playerMoney = 1500;
        playerName = "";
        playerPos = 1;
        playerVal = 1500;
        numProps = 0;
        inJail = false;
    }

    public Player(String inPlayerName) {
        playerMoney = 1500;
        playerName = inPlayerName;
        playerPos = 1;
        playerVal = 1500;
        numProps = 0;
        inJail = false;
    }

    public void setShape(String inShape) {
        shape = inShape;
    }

    public String getShape() {
        return shape;
    }

    public void subtractMoney(int amt) {
        playerMoney = playerMoney - amt; //When you buy a property, make sure to run BouguhtProperty
        playerVal = playerVal - amt;
    }

    public void addMoney(int amt) {
        playerMoney = playerMoney + amt;
        playerVal = playerVal + amt;
    }

    public void addVal(int amt) { //This is just for adding amt for misc things like buying a house
        playerVal = playerVal + amt;
    }

    public void subtractVal(int amt) {
        playerVal = playerVal - amt;
    }

    public int getMoney() {
        return playerMoney;
    }

    public String getName() {
        return playerName;
    }

    public void changePos(int newPos) {
        playerPos = newPos;
    }

    public int getPos() {
        return playerPos;
    }

    public void boughtProperty(Properties prop) {
        subtractMoney(prop.getCost());
        playerVal = playerVal + prop.getMortgage();
        ownedProperties[numProps] = prop; //So that you can print the array of the props, using the number of props as your stop valve
        numProps = numProps + 1;            //The user can then enter a number, which would be i in the array, which would then provide the details of the ith property of this array
    }

    public void decValMortgageProperty(Properties prop) {
        playerVal = playerVal - prop.getMortgage();
    } //Need to code for what happens to value when mortgaging and unmortgaging
    public int getVal() {
        return playerVal;
    }

    public void enterJail() { //NEED TO MAKE A CONDITION FOR WHAT HAPPENS WHEN PLAYER IS IN JAIL
        inJail = true;
        playerPos = 11;
    }

    public void exitJail() {
        inJail = false;
    }

    public boolean isInJail() {
        return inJail;
    }

    public void incJailCounter() {
        jailTurns = jailTurns + 1;
    }

    public void resetJailCounter() {
        jailTurns = 0;
    }

    public int getJailCounter() {
        return jailTurns;
    }

    public void buyRailroad() {
        numRailroads = numRailroads + 1;
    }

    public int getNumRailroads() {
        return numRailroads;
    }

    public void buyUtility() {
        numUtilities = numUtilities + 1;
    }

    public int getNumUtilities() {
        return numUtilities;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getNumProps() {
        return numProps;
    }

    public int getNumHouses(Properties prop, Player currPlayer) {
        if (prop.getOwner() == currPlayer) {
            return prop.getNumHousesOnProp();
        }
        else {
            return 0;
        }
    }

    public void buyHouse(Properties prop) {
        subtractMoney(prop.getHouseCost());
        addVal(prop.getHouseCost() / 2);
    }

    public void sellHouse(Properties prop) {
        addMoney(prop.getHouseCost() / 2);
        subtractVal(prop.getHouseCost() / 2);
    }

    int GOOJF = 0;
    public void receiveGOOJF() { //If the player receives a get out of jail free card
        GOOJF = GOOJF + 1;
    }

    public int getGOOJF() { //Get the number of get out of jail free cards
        return GOOJF;
    }

    public void useGOOJF() {
        GOOJF = GOOJF - 1;
    }
}
