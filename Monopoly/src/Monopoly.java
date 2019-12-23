import java.awt.*;
import java.rmi.activation.ActivationGroup_Stub;
import java.util.Scanner;
import java.util.Random;

public class Monopoly {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);


        Properties medAv = new Properties("Mediterranean Avenue", 60, 50, 2, 10, 30, 90, 160, 250, 30, 10.5, 1.0, 2);
        Properties balAv = new Properties("Baltic Avenue", 60, 50, 4, 20, 60, 180, 320, 450, 30, 8.5, 1.0, 4);
        Properties oriAv = new Properties("Oriental Avenue", 100, 50, 6, 30, 90, 270, 400, 550, 50, 5.5, 1.0, 7);
        Properties verAv = new Properties("Vermont Avenue", 100, 50, 6, 30, 90, 270, 400, 550, 50, 3.5, 1.0, 9);
        Properties conAv = new Properties("Connecticut Avenue", 120, 50, 8, 40, 100, 300, 450, 600, 60, 2.5, 1.0, 10);
        Properties stcPl = new Properties("St. Charles Place", 140, 100, 10, 50, 150, 450, 625, 750, 70, 1, 2.5, 12);
        Properties staAv = new Properties("States Avenue", 140, 100, 10, 50, 150, 450, 625, 750, 70, 1, 4.5, 14);
        Properties virAv = new Properties("Virginia Avenue", 160, 100, 12, 60, 180, 500, 700, 900, 80, 1, 5.5, 15);
        Properties stjPl = new Properties("St. James Place", 180, 100, 14, 70, 200, 550, 750, 950, 90, 1, 7.5, 17);
        Properties tenAv = new Properties("Tennessee Avenue", 180, 100, 14, 70, 200, 550, 750, 950, 90, 1, 9.5, 19);
        Properties newAv = new Properties("New York Avenue", 200, 100, 16, 80, 220, 600, 800, 1000, 100, 1, 10.5, 20);
        Properties kenAv = new Properties("Kentucky Avenue", 220, 150, 18, 90, 250, 700, 875, 1050, 110, 2.5, 12, 22);
        Properties indAv = new Properties("Indiana Avenue", 220, 150, 18, 90, 250, 700, 875, 1050, 110, 4.5, 12, 24);
        Properties illAv = new Properties("Illinois Avenue", 240, 150, 20, 100, 300, 750, 925, 1100, 120, 5.5, 12, 25);
        Properties atlAv = new Properties("Atlantic Avenue", 260, 150, 22, 110, 330, 800, 975, 1150, 130, 7.5, 12, 27);
        Properties venAv = new Properties("Ventnor Avenue", 260, 150, 22, 110, 330, 800, 975, 1150, 130, 8.5, 12, 28);
        Properties marGa = new Properties("Marvin Gardens", 280, 150, 24, 120, 360, 850, 1025, 1200, 140, 10.5, 12, 30);
        Properties pacAv = new Properties("Pacific Avenue", 300, 200, 26, 130, 390, 900, 1100, 1275, 150, 12, 10.5, 32);
        Properties norAv = new Properties("North Carolina Avenue", 300, 200, 26, 130, 390, 900, 1100, 1275, 150, 12, 9.5, 33);
        Properties penAv = new Properties("Pennsylvania Avenue", 320, 200, 28, 150, 450, 1000, 1200, 1400, 160, 12, 7.5, 35);
        Properties parPl = new Properties("Park Place", 350, 200, 35, 175, 500, 1100, 1300, 1500, 175, 12, 4.5, 38);
        Properties boardwalk = new Properties("Boardwalk", 400, 200, 50, 200, 600, 1400, 1700, 2000, 200, 12, 2.5, 40);
        Properties reaRa = new Properties("Reading Railroad", 200, 100, 6.5, 1, 6);
        Properties penRa = new Properties("Pennsylvania Railroad", 200, 100, 1, 6.5, 16);
        Properties boRa = new Properties("B&O Railroad", 200, 100, 6.5, 12, 26);
        Properties shoLi = new Properties("Short Line", 200, 100, 12, 6.5, 36);
        Properties eleCo = new Properties("Electric Company", 150, 75, 1, 3.5, 13);
        Properties watWo = new Properties("Water Works", 150, 75, 9.5, 12, 29);
        Properties chance1 = new Properties("Chance", 4.5, 1, 8);
        Properties chance2 = new Properties("Chance", 3.5, 12, 23);
        Properties chance3 = new Properties("Chance", 12, 5.5, 37);
        Properties chest1 = new Properties("Community Chest", 9.5, 1, 3);
        Properties chest2 = new Properties("Community Chest", 1, 8.5, 18);
        Properties chest3 = new Properties("Community Chest", 12, 8.5, 34);
        Properties go = new Properties("Go", 12, 1, 1);
        Properties jail = new Properties("Jail", 1, 1, 11);
        Properties frePa = new Properties("Free Parking", 1, 12, 21);
        Properties goToJail = new Properties("Go to Jail", 12, 12, 31);
        Properties inTax = new Properties("Income Tax", 7.5, 1, 5);
        Properties luxTax = new Properties("Luxury Tax", 12, 3.5, 39);

        Properties[] tileArray = new Properties [40];
        tileArray[0] = go;
        tileArray[1] = medAv;
        tileArray[2] = chest1;
        tileArray[3] = balAv;
        tileArray[4] = inTax;
        tileArray[5] = reaRa;
        tileArray[6] = oriAv;
        tileArray[7] = chance1;
        tileArray[8] = verAv;
        tileArray[9] = conAv;
        tileArray[10] = jail;
        tileArray[11] = stcPl;
        tileArray[12] = eleCo;
        tileArray[13] = staAv;
        tileArray[14] = virAv;
        tileArray[15] = penRa;
        tileArray[16] = stjPl;
        tileArray[17] = chest2;
        tileArray[18] = tenAv;
        tileArray[19] = newAv;
        tileArray[20] = frePa;
        tileArray[21] = kenAv;
        tileArray[22] = chance2;
        tileArray[23] = indAv;
        tileArray[24] = illAv;
        tileArray[25] = boRa;
        tileArray[26] = atlAv;
        tileArray[27] = venAv;
        tileArray[28] = watWo;
        tileArray[29] = marGa;
        tileArray[30] = goToJail;
        tileArray[31] = pacAv;
        tileArray[32] = norAv;
        tileArray[33] = chest3;
        tileArray[34] = penAv;
        tileArray[35] = shoLi;
        tileArray[36] = chance3;
        tileArray[37] = parPl;
        tileArray[38] = luxTax;
        tileArray[39] = boardwalk;


        Properties[] p1Properties = new Properties[40];
        Properties[] p2Properties = new Properties[40];
        Properties[] p3Properties = new Properties[40];
        Properties[] p4Properties = new Properties[40];

        String[] chanceCards = new String [15];
        //Write code for each individual outcome in a separate method
        chanceCards[0] = "Advance to Go (Collect $400)";
        chanceCards[1] = "Advance to Illinois Ave—If you pass Go, collect $200";
        chanceCards[2] = "Advance to St. Charles Place – If you pass Go, collect $200";
        chanceCards[3] = "Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times the amount thrown.";
        chanceCards[4] = "Advance token to the nearest Railroad and pay owner twice the rental to which he/she {he} is otherwise entitled. If Railroad is unowned, you may buy it from the Bank.";
        chanceCards[5] = "Bank pays you dividend of $50";
        chanceCards[6] = "Get Out of Jail Free";
        chanceCards[7] = "Go to Jail. Go directly to Jail. Do not pass Go, do not collect $200";
        chanceCards[8] = "Make general repairs on all your property. For each house pay $25. For each hotel $100";
        chanceCards[9] = "Pay poor tax of $15";
        chanceCards[10] = "Take a trip to Reading Railroad. If you pass Go, collect $200";
        chanceCards[11] = "Take a walk on the Boardwalk–Advance token to Boardwalk";
        chanceCards[12] = "You have been elected Chairman of the Board. Pay each player $50";
        chanceCards[13] = "Your building and loan matures. Collect $150";
        chanceCards[14] = "You have won a crossword competition. Collect $100";


        String[] communityChest = new String [17];

        communityChest[0] = "Advance to Go (Collect $400)";
        communityChest[1] = "Bank error in your favor. Collect $200";
        communityChest[2] = "Doctor's fee. Pay $50";
        communityChest[3] = "From sale of stock you get $50";
        communityChest[4] = "Get Out of Jail Free";
        communityChest[5] = "Go to Jail. Go directly to jail. Do not pass Go. Do not collect $200";
        communityChest[6] = "Grand Opera Night. Collect $50 from every player for opening night seats";
        communityChest[7] = "Holiday Fund matures. Receive $100";
        communityChest[8] = "Income tax refund. Collect $20";
        communityChest[9] = "It is your birthday. Collect $10";
        communityChest[10] = "Life insurance matures. Collect $100";
        communityChest[11] = "Pay hospital fees of $100";
        communityChest[12] = "Pay school fees of $150";
        communityChest[13] = "Receive $25 consultancy fee";
        communityChest[14] = "You are assessed for street repairs. $40 per house. $115 per hotel";
        communityChest[15] = "You have won second prize in a beauty contest–Collect $10";
        communityChest[16] = "You inherit $100";


        drawBoard();

        String yesNo;
        System.out.println("Hello! Welcome to Monopoly! My name is Rich Uncle Pennybags. Do you know the rules?");
        System.out.println("Enter 'y' or 'n'");
        yesNo = scnr.next();

        if (yesNo.equals("y")) {
            System.out.println("Great! Let's continue.");
        }
        else {
            System.out.println("Here are the rules: ");
            printRules();
        }

        System.out.println();

        System.out.println("How many players will be joining us today?");
        int numPlayers = scnr.nextInt();
        scnr.nextLine();

        String player1;
        String player2;
        String player3;
        String player4;

        if (numPlayers < 2 || numPlayers > 4) {
            System.out.println("Monopoly is a two to four player game!");
            System.out.println("Please re-enter the number of players: ");
            numPlayers = scnr.nextInt();
        }

        if (numPlayers == 2) {
            System.out.println("Hello player 1. What is your name?");
            player1 = scnr.nextLine();
            System.out.println("Welcome " + player1 + "!"); //For some reason it makes me enter p1 name twice
            System.out.println("Hello player 2. What is your name?");
            player2 = scnr.nextLine();
            System.out.println("Welcome " + player2 + "!");
            System.out.println();
            playGame2(player1, player2, tileArray, p1Properties, p2Properties, chanceCards, communityChest);
        }

        if(numPlayers == 3) {
            System.out.println("Hello player 1. What is your name?");
            player1 = scnr.nextLine();
            System.out.println("Welcome " + player1 + "!");
            System.out.println("Hello player 2. What is your name?");
            player2 = scnr.nextLine();
            System.out.println("Welcome " + player2 + "!");
            System.out.println("Hello player 3. What is your name?");
            player3 = scnr.nextLine();
            System.out.println("Welcome " + player3 + "!");
            System.out.println();
            playGame3(player1, player2, player3, tileArray);
        }

        if(numPlayers == 4) {
            System.out.println("Hello player 1. What is your name?");
            player1 = scnr.nextLine();
            System.out.println("Welcome " + player1 + "!");
            System.out.println("Hello player 2. What is your name?");
            player2 = scnr.nextLine();
            System.out.println("Welcome " + player2 + "!");
            System.out.println("Hello player 3. What is your name?");
            player3 = scnr.nextLine();
            System.out.println("Welcome " + player3 + "!");
            System.out.println("Hello player 4. What is your name?");
            player4 = scnr.nextLine();
            System.out.println("Welcome " + player4 + "!");
            System.out.println();
            playGame4(player1, player2, player3, player4, tileArray);
        }














        int pos = 1;

        Properties tile = tileArray[pos - 1];


    }


    public static void playGame2(String player1, String player2, Properties[] tileArray, Properties[] p1Properties, Properties[] p2Properties, String[] chanceCards, String[] communityChest) {

        Scanner scnr = new Scanner(System.in);
        Player p1 = new Player(player1);
        Player p2 = new Player(player2);
        int p1Money = p1.getMoney();
        int p2Money = p2.getMoney();
        Player currPlayer;
        int p1Pos = p1.getPos();
        int p2Pos = p2.getPos();
        int choice2;
        int choice3;

        System.out.println(p1.getName() + ", what shape would you like to be?");
        System.out.println("1 - Star");
        System.out.println("2 - Triangle");
        System.out.println("3 - Circle");
        System.out.println("4 - Square");
        System.out.println("5 - Heart");
        System.out.println("6 - Arrow");
        System.out.println("Type the number of your choice");
        choice3 = scnr.nextInt();
        if (choice3 == 1) {
            p1.setShape("Star");
        }
        else if (choice3 == 2) {
            p1.setShape("Triangle");
        }
        else if (choice3 == 3) {
            p1.setShape("Circle");
        }
        else if (choice3 == 4) {
            p1.setShape("Square");
        }
        else if (choice3 == 5) {
            p1.setShape("Heart");
        }
        else {
            p1.setShape("Arrow");
        }
        System.out.println(p2.getName() + ", what shape would you like to be?");
        System.out.println("1 - Star");
        System.out.println("2 - Triangle");
        System.out.println("3 - Circle");
        System.out.println("4 - Square");
        System.out.println("5 - Heart");
        System.out.println("6 - Arrow");
        System.out.println("Type the number of your choice");
        choice3 = scnr.nextInt();
        if (choice3 == 1) {
            p2.setShape("Star");
        }
        else if (choice3 == 2) {
            p2.setShape("Triangle");
        }
        else if (choice3 == 3) {
            p2.setShape("Circle");
        }
        else if (choice3 == 4) {
            p2.setShape("Square");
        }
        else if (choice3 == 5) {
            p2.setShape("Heart");
        }
        else {
            p2.setShape("Arrow");
        }

        drawPlayer(p1, p1.getShape(), 1, 12, 1, p1, p2);
        drawPlayer(p2, p2.getShape(), 1, 12, 1, p1, p2);

        System.out.println("Roll the dice to see who goes first.");
        int p1Roll = rollDiceBeginning();
        int p2Roll = rollDiceBeginning();
        System.out.println(player1 + "'s Roll: " + p1Roll);
        System.out.println(player2 + "'s Roll: " + p2Roll);

        if (p1Roll == p2Roll) {
            System.out.println("Roll Again");
            p1Roll = rollDiceBeginning();
            p2Roll = rollDiceBeginning();
            System.out.println(player1 + "'s Roll: " + p1Roll);
            System.out.println(player2 + "'s Roll: " + p2Roll);
        }
        if (p1Roll == p2Roll) {
            System.out.println("Roll Again");
            p1Roll = rollDiceBeginning();
            p2Roll = rollDiceBeginning();
            System.out.println(player1 + "'s Roll: " + p1Roll);
            System.out.println(player2 + "'s Roll: " + p2Roll);
        }
        if (p1Roll == p2Roll) {
            System.out.println("Roll Again");
            p1Roll = rollDiceBeginning();
            p2Roll = rollDiceBeginning();
            System.out.println(player1 + "'s Roll: " + p1Roll);
            System.out.println(player2 + "'s Roll: " + p2Roll);
        }
        if (p1Roll > p2Roll) {
            System.out.println("It is " + player1 + "'s turn.");
            currPlayer = p1;
        }
        else {
            System.out.println("It is " + player2 + "'s turn.");
            currPlayer = p2;
        }


        //Going to need to create a while loop here so that the game keeps going until someone loses
        int[] dice = new int[2];
        int diceVal;
        int rentOwed;
        String yesNo;
        int chosenProp;
        int choice1;
        int numHousesToBuy;
        int numHousesToSell;
        int amtMoney;
        int chosenProp1;
        int amtMoney1;
        int turns = 0;
        boolean doubles;
        int pastPos;

        while (currPlayer.getVal() > 0) {
            turns = 0;
            doubles = true;
            System.out.println("=======================================================");
            if (!currPlayer.isInJail()) {
                System.out.println(currPlayer.getName() + ", what would you like to do?");
                int choice = printPreTurnMenu(currPlayer);
                while (choice != 6) {
                    if (choice == 1 && doubles) {
                        rollDice(dice);
                        diceVal = dice[0] + dice[1];
                        System.out.println(dice[0] + ", " + dice[1]);
                        System.out.println("You rolled " + diceVal);
                        if (dice[0] == dice[1]) {
                            doubles = true;
                            System.out.println("Doubles!");
                        } else {
                            doubles = false;
                        }

                        turns = turns + 1;

                        if (doubles && turns == 3) {
                            System.out.println("You're speeding! Go to jail");
                            erasePlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
                            currPlayer.enterJail();
                            drawPlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
                            break;
                        }

                        pastPos = currPlayer.getPos();
                        currPlayer.changePos(currPlayer.getPos() + diceVal);
                        if (currPlayer.getPos() > 40) {
                            currPlayer.addMoney(200);
                            System.out.println("Passed Go, collect $200");
                            currPlayer.changePos(currPlayer.getPos() - 40);
                            pastPos = (40 - diceVal) + currPlayer.getPos();
                        }
                        movePlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), tileArray[pastPos - 1].getxVal(), tileArray[pastPos - 1].getyVal(), p1, p2, diceVal);
                        if (currPlayer.getPos() == 1) { //Go
                            currPlayer.addMoney(400);
                            System.out.println("Landed on Go, collect $400");
                        }
                        else if (currPlayer.getPos() == 11) {
                            System.out.println("Just visiting");
                        }
                        else if (currPlayer.getPos() == 21) { //Free Parking
                            System.out.println("Congratulations! Free Parking!");
                            System.out.println("You have received $" + tileArray[20].getFreeParkMoney());
                            currPlayer.addMoney(tileArray[20].getFreeParkMoney());
                            tileArray[20].resetFreeParkingMoney();
                        } else if (currPlayer.getPos() == 31) { //Go to jail
                            System.out.println("Go straight to jail. Do not pass Go. Do not collect $200");
                            currPlayer.enterJail();
                            drawPlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
                            erasePlayer(currPlayer, currPlayer.getShape(), 31, 12, 12, p1, p2);
                        } else if (currPlayer.getPos() == 3 || currPlayer.getPos() == 18 || currPlayer.getPos() == 34) {
                            System.out.println("Community chest!");
                            drawChest2Players(communityChest, currPlayer, tileArray, p1, p2);
                        } else if (currPlayer.getPos() == 8 || currPlayer.getPos() == 23 || currPlayer.getPos() == 37) {
                            System.out.println("Chance!");
                            if (currPlayer == p1) {
                                drawChance2Players(chanceCards, p1Properties, currPlayer, tileArray, p1, p2);
                            } else {
                                drawChance2Players(chanceCards, p2Properties, currPlayer, tileArray, p1, p2);
                            }
                        } else if (currPlayer.getPos() == 5) { //Income tax
                            currPlayer.subtractMoney(200);
                            tileArray[21].incFreeParkingMoney(200);
                            System.out.println("Income tax. Pay $200");
                        } else if (currPlayer.getPos() == 39) { //Luxury tax
                            currPlayer.subtractMoney(100);
                            tileArray[21].incFreeParkingMoney(100);
                            System.out.println("Luxury tax. Pay $100");
                        } else if (currPlayer.getPos() == 6 || currPlayer.getPos() == 16 || currPlayer.getPos() == 26 || currPlayer.getPos() == 36) { //railroad
                            if (tileArray[currPlayer.getPos() - 1].isOwned()) {
                                if (tileArray[currPlayer.getPos() - 1].getOwner() != currPlayer) {
                                    if (!tileArray[currPlayer.getPos() - 1].isPropMortgaged()) {
                                        if (currPlayer == p1) {
                                            rentOwed = tileArray[currPlayer.getPos() - 1].getRailroadRent(p2.getNumRailroads());
                                            System.out.println("Rent paid to " + p2.getName() + ": $" + rentOwed);
                                            p1.subtractMoney(rentOwed);
                                            p2.addMoney(rentOwed);
                                        } else {
                                            rentOwed = tileArray[currPlayer.getPos() - 1].getRailroadRent(p1.getNumRailroads());
                                            System.out.println("Rent paid to " + p1.getName() + ": $" + rentOwed);
                                            p2.subtractMoney(rentOwed);
                                            p1.addMoney(rentOwed);
                                        }
                                    } else {
                                        System.out.println("This property has been mortgaged");
                                    }
                                } else {
                                    System.out.println("You own this property");
                                    //indicate that the tile is owned by currPlayer
                                }
                            } else {
                                System.out.println(tileArray[currPlayer.getPos() - 1].getName() + " costs $" + tileArray[currPlayer.getPos() - 1].getCost());
                                System.out.println("Would you like to see this property's details? (y or n)");
                                yesNo = scnr.next();
                                if (yesNo.equals("y")) {
                                    tileArray[currPlayer.getPos() - 1].printDetails(currPlayer);
                                }
                                System.out.println("Would you like to buy this property? (y or n)");
                                yesNo = scnr.next();
                                if (yesNo.equals("y")) {
                                    tileArray[currPlayer.getPos() - 1].setOwner(currPlayer);
                                    if (currPlayer == p1) {
                                        addProperty(p1Properties, tileArray[currPlayer.getPos() - 1], currPlayer.getNumProps());

                                    } else {
                                        addProperty(p2Properties, tileArray[currPlayer.getPos() - 1], currPlayer.getNumProps());
                                    }
                                    currPlayer.boughtProperty(tileArray[currPlayer.getPos() - 1]);
                                    currPlayer.buyRailroad();
                                    drawBorder(currPlayer, currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
                                    System.out.println("Property bought");
                                }
                            }
                        } else if (currPlayer.getPos() == 13 || currPlayer.getPos() == 29) {
                            if (tileArray[currPlayer.getPos() - 1].isOwned()) {
                                if (tileArray[currPlayer.getPos() - 1].getOwner() != currPlayer) {
                                    if (!tileArray[currPlayer.getPos() - 1].isPropMortgaged()) {
                                        if (currPlayer == p1) {
                                            rentOwed = tileArray[currPlayer.getPos() - 1].getUtilityRent(diceVal, p2.getNumUtilities());
                                            System.out.println("Rent paid to " + p2.getName() + ": $" + rentOwed);
                                            p1.subtractMoney(rentOwed);
                                            p2.addMoney(rentOwed);
                                        } else {
                                            rentOwed = tileArray[currPlayer.getPos() - 1].getUtilityRent(diceVal, p1.getNumUtilities());
                                            System.out.println("Rent paid to " + p1.getName() + ": $" + rentOwed);
                                            p2.subtractMoney(rentOwed);
                                            p1.addMoney(rentOwed);
                                        }
                                    } else {
                                        System.out.println("This property has been mortgaged");
                                    }
                                } else {
                                    System.out.println("You own this tile");
                                }
                            } else {
                                System.out.println(tileArray[currPlayer.getPos() - 1].getName() + " costs $" + tileArray[currPlayer.getPos() - 1].getCost());
                                System.out.println("Would you like to see this property's details? (y or n)");
                                yesNo = scnr.next();
                                if (yesNo.equals("y")) {
                                    tileArray[currPlayer.getPos() - 1].printDetails(currPlayer);
                                }
                                System.out.println("Would you like to buy this property? (y or n)");
                                yesNo = scnr.next();
                                if (yesNo.equals("y")) {
                                    tileArray[currPlayer.getPos() - 1].setOwner(currPlayer);
                                    if (currPlayer == p1) {
                                        addProperty(p1Properties, tileArray[currPlayer.getPos() - 1], currPlayer.getNumProps());
                                    } else {
                                        addProperty(p2Properties, tileArray[currPlayer.getPos() - 1], currPlayer.getNumProps());
                                    }
                                    currPlayer.boughtProperty(tileArray[currPlayer.getPos() - 1]);
                                    currPlayer.buyUtility();
                                    drawBorder(currPlayer, currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
                                    System.out.println("Property bought");

                                }

                            }
                        } else { //This is for normal spaces
                            if (tileArray[currPlayer.getPos() - 1].isOwned()) {
                                if (tileArray[currPlayer.getPos() - 1].getOwner() != currPlayer) {
                                    if (!tileArray[currPlayer.getPos() - 1].isPropMortgaged()) {
                                        if (currPlayer == p1) {
                                            rentOwed = tileArray[currPlayer.getPos() - 1].getRev();
                                            System.out.println("Rent paid to " + p2.getName() + ": $" + rentOwed);
                                            p1.subtractMoney(rentOwed);
                                            p2.addMoney(rentOwed);
                                        } else {
                                            rentOwed = tileArray[currPlayer.getPos() - 1].getRev();
                                            System.out.println("Rent paid to " + p1.getName() + ": $" + rentOwed);
                                            p2.subtractMoney(rentOwed);
                                            p1.addMoney(rentOwed);
                                        }
                                    } else {
                                        System.out.println("This property has been mortgaged");
                                    }
                                } else {
                                    System.out.println("You own this property");
                                }
                            } else {
                                System.out.println(tileArray[currPlayer.getPos() - 1].getName() + " costs $" + tileArray[currPlayer.getPos() - 1].getCost());
                                System.out.println("Would you like to see this property's details? (y or n)");
                                yesNo = scnr.next();
                                if (yesNo.equals("y")) {
                                    tileArray[currPlayer.getPos() - 1].printDetails(currPlayer);
                                }
                                System.out.println("Would you like to buy this property? (y or n)");
                                yesNo = scnr.next();
                                if (yesNo.equals("y")) {
                                    tileArray[currPlayer.getPos() - 1].setOwner(currPlayer);
                                    if (currPlayer == p1) {
                                        addProperty(p1Properties, tileArray[currPlayer.getPos() - 1], currPlayer.getNumProps());
                                    } else {
                                        addProperty(p2Properties, tileArray[currPlayer.getPos() - 1], currPlayer.getNumProps());
                                    }
                                    drawBorder(currPlayer, currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
                                    currPlayer.boughtProperty(tileArray[currPlayer.getPos() - 1]);
                                    System.out.println("Property bought");
                                }
                            }
                        }
                    } else if (choice == 1 && !doubles) {
                        System.out.println("You do not get to roll again");
                    } else if (choice == 2) {
                        tileArray[currPlayer.getPos() - 1].printDetails(currPlayer);
                    } else if (choice == 3) {
                        //Manage properties
                        System.out.println("Your properties: ");
                        if (currPlayer == p1) { //REMEMBER THIS IS ONLY FOR PLAYER 1. NEED TO DO SAME THING FOR PLAYER 2
                            sortPlayerProps(p1Properties, currPlayer.getNumProps());
                            printPlayerProps(p1Properties, currPlayer.getNumProps());

                            System.out.println("Enter the number of the property you would like to manage");
                            chosenProp = scnr.nextInt();
                            if (!p1Properties[chosenProp - 1].isPropMortgaged()) {
                                System.out.println("You have chosen " + p1Properties[chosenProp - 1].getName() + ". What would you like to do?");
                                System.out.println("1 - See details");
                                System.out.println("2 - Buy houses");
                                System.out.println("3 - Sell houses");
                                System.out.println("4 - Mortgage property");
                                System.out.println("5 - Cancel");

                                choice1 = scnr.nextInt();

                                if (choice1 == 1) {
                                    p1Properties[chosenProp - 1].printDetails(currPlayer);
                                } else if (choice1 == 2) {
                                    if (canPlayerBuyHouses(currPlayer, tileArray, p1Properties[chosenProp - 1])) {
                                        p1Properties[chosenProp - 1].printHouseRev();
                                        System.out.println("Houses for this property cost $" + p1Properties[chosenProp - 1].getHouseCost() + " each");
                                        System.out.println("You currently have " + p1Properties[chosenProp - 1].getNumHousesOnProp() + " house(s) on this property. How many houses would you like to buy? (Say 0 for none)");
                                        System.out.println("Note: the fifth house is the hotel. You cannot buy more than a hotel");
                                        numHousesToBuy = scnr.nextInt();
                                        //If houses is 5, say they cannot buy anymore
                                        //If houses is 4, limit it to 1 more house bought
                                        //If houses is 3, limit it to 2 more houses bought
                                        if ((currPlayer.getNumHouses(p1Properties[chosenProp - 1], currPlayer) + numHousesToBuy) > 5) {
                                            System.out.println("This would exceed the maximum house limit of 5");
                                        } else if (numHousesToBuy == 0) {
                                            System.out.println("Okay. This action has been canceled");
                                        } else {
                                            for (int i = 0; i < numHousesToBuy; i++) {
                                                p1Properties[chosenProp - 1].boughtHouse();
                                                currPlayer.buyHouse(p1Properties[chosenProp - 1]);
                                            }
                                            if (p1Properties[chosenProp - 1].getNumHousesOnProp() == 5) {
                                                drawHotel(p1Properties[chosenProp - 1].getPos(), p1Properties[chosenProp - 1].getxVal(), p1Properties[chosenProp - 1].getyVal());
                                                System.out.println("You now have a hotel on " + p1Properties[chosenProp - 1].getName() + ". Rent for this space is now $" + p1Properties[chosenProp - 1].getRev());
                                            } else if (p1Properties[chosenProp - 1].getNumHousesOnProp() == 1) {
                                                drawHouse(p1Properties[chosenProp - 1].getPos(), p1Properties[chosenProp - 1].getxVal(), p1Properties[chosenProp - 1].getyVal(), 1);
                                                System.out.println("You now have 1 house on " + p1Properties[chosenProp - 1].getName() + ". Rent for this space is now $" + p1Properties[chosenProp - 1].getRev());
                                            } else {
                                                drawHouse(p1Properties[chosenProp - 1].getPos(), p1Properties[chosenProp - 1].getxVal(), p1Properties[chosenProp - 1].getyVal(), p1Properties[chosenProp - 1].getNumHousesOnProp());
                                                System.out.println("You now have " + p1Properties[chosenProp - 1].getNumHousesOnProp() + " houses on " + p1Properties[chosenProp - 1].getName() + ". Rent for this space is now $" + p1Properties[chosenProp - 1].getRev());
                                            }
                                        }
                                    }
                                    else {
                                        if (p1Properties[chosenProp - 1] == tileArray[5] || p1Properties[chosenProp - 1] == tileArray[15] || p1Properties[chosenProp - 1] == tileArray[25]
                                        || p1Properties[chosenProp - 1] == tileArray[35] || p1Properties[chosenProp - 1] == tileArray[12] || p1Properties[chosenProp - 1] == tileArray[28]) {
                                            System.out.println("Houses can't be built on this property");
                                        }
                                        else {
                                            System.out.println("You don't own all properties of this color. You cannot buy houses");
                                        }
                                    }

                                } else if (choice1 == 3) {
                                    if (p1Properties[chosenProp - 1].getNumHousesOnProp() > 0) {
                                        p1Properties[chosenProp - 1].printHouseRev();
                                        System.out.println("Each house on this property sells for $" + (p1Properties[chosenProp - 1].getHouseCost() / 2));
                                        System.out.println("You own " + p1Properties[chosenProp - 1].getNumHousesOnProp() + " houses on this property. How many houses would you like to sell? (Say 0 for none)");
                                        numHousesToSell = scnr.nextInt();

                                        if (p1Properties[chosenProp - 1].getNumHousesOnProp() - numHousesToSell < 0) {
                                            System.out.println("You do not own that many houses");
                                        } else if (numHousesToSell == 0) {
                                            System.out.println("Okay. This action has been canceled");
                                        } else {
                                            for (int i = 0; i < numHousesToSell; i++) {
                                                p1Properties[chosenProp - 1].soldHouse();
                                                currPlayer.sellHouse(p1Properties[chosenProp - 1]);
                                            }
                                            if (p1Properties[chosenProp - 1].getNumHousesOnProp() == 0) {
                                                clearColoredSquare(p1Properties[chosenProp - 1].getPos(), p1Properties[chosenProp - 1].getxVal(), p1Properties[chosenProp - 1].getyVal());
                                            }
                                            else if (p1Properties[chosenProp - 1].getNumHousesOnProp() == 1) {
                                                drawHouse(p1Properties[chosenProp - 1].getPos(), p1Properties[chosenProp - 1].getxVal(), p1Properties[chosenProp - 1].getyVal(), 1);
                                            }
                                            else if (p1Properties[chosenProp - 1].getNumHousesOnProp() == 2) {
                                                drawHouse(p1Properties[chosenProp - 1].getPos(), p1Properties[chosenProp - 1].getxVal(), p1Properties[chosenProp - 1].getyVal(), 2);
                                            }
                                            else if (p1Properties[chosenProp - 1].getNumHousesOnProp() == 3) {
                                                drawHouse(p1Properties[chosenProp - 1].getPos(), p1Properties[chosenProp - 1].getxVal(), p1Properties[chosenProp - 1].getyVal(), 3);
                                            }
                                            else if (p1Properties[chosenProp - 1].getNumHousesOnProp() == 4) {
                                                drawHouse(p1Properties[chosenProp - 1].getPos(), p1Properties[chosenProp - 1].getxVal(), p1Properties[chosenProp - 1].getyVal(), 4);
                                            }

                                            System.out.println("You have received $" + ((p1Properties[chosenProp - 1].getHouseCost() / 2) * numHousesToSell));

                                            System.out.println("You now have " + p1Properties[chosenProp - 1].getNumHousesOnProp() + " house(s) on this property");
                                        }
                                    }
                                    else {
                                        System.out.println("You have no houses you can sell");
                                    }

                                } else if (choice1 == 4) { //Mortgaging
                                    if (p1Properties[chosenProp - 1].getNumHousesOnProp() == 0) {
                                        System.out.println("You will gain $" + p1Properties[chosenProp - 1].getMortgage() + " from mortgaging this property, but you will not receive any rent. Would you like to mortgage? (y or n)");
                                        yesNo = scnr.next();
                                        if (yesNo.equals("y")) {
                                            p1Properties[chosenProp - 1].mortgageProp();
                                            mortgageBorder(currPlayer, p1Properties[chosenProp - 1].getPos(), p1Properties[chosenProp - 1].getxVal(), p1Properties[chosenProp - 1].getyVal(), p1, p2);
                                            System.out.println("Property mortgaged");
                                        } else {
                                            System.out.println("Okay. This action has been canceled");
                                        }
                                    } else {
                                        System.out.println("You cannot mortgage a property with houses. Sell your houses first");
                                    }
                                } else if (choice1 == 5){
                                    System.out.println("Okay. This action has been canceled");
                                }
                                else {
                                    System.out.println("Invalid choice");
                                }
                            } else {
                                System.out.println("You have chosen " + p1Properties[chosenProp - 1].getName() + ". What would you like to do?");
                                System.out.println("1 - See details");
                                System.out.println("2 - Buy back mortgaged property");
                                System.out.println("3 - Cancel");
                                choice1 = scnr.nextInt();

                                if (choice1 == 1) {
                                    p1Properties[chosenProp - 1].printDetails(currPlayer);
                                } else if (choice1 == 2) { //Buying back the mortgaged property
                                    System.out.println("This property costs $" + p1Properties[chosenProp - 1].getCost() + " to buy back. Would you like to buy it? (y or n)");
                                    yesNo = scnr.next();
                                    if (yesNo.equals("y")) {
                                        p1Properties[chosenProp - 1].unMortgageProp();
                                        p1.subtractMoney(p1Properties[chosenProp - 1].getCost());
                                        p1.addVal(p1Properties[chosenProp - 1].getMortgage());
                                        drawBorder(currPlayer, currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
                                        System.out.println("Property bought back");
                                    } else {
                                        System.out.println("Okay. This action has been canceled");
                                    }
                                } else if (choice1 == 3){
                                    System.out.println("Okay. This action has been canceled");
                                }
                                else {
                                    System.out.println("Invalid choice");
                                }
                            }

                        }

                    /*
                    NEXT UP IS THE SAME THING BUT FOR PLAYER 2
                     */
                        else {
                            sortPlayerProps(p2Properties, currPlayer.getNumProps());
                            printPlayerProps(p2Properties, currPlayer.getNumProps());

                            System.out.println("Enter the number of the property you would like to manage");
                            chosenProp = scnr.nextInt();
                            if (!p2Properties[chosenProp - 1].isPropMortgaged()) {
                                System.out.println("You have chosen " + p2Properties[chosenProp - 1].getName() + ". What would you like to do?");
                                System.out.println("1 - See details");
                                System.out.println("2 - Buy houses");
                                System.out.println("3 - Sell houses");
                                System.out.println("4 - Mortgage property");
                                System.out.println("5 - Cancel");

                                choice1 = scnr.nextInt();

                                if (choice1 == 1) {
                                    p2Properties[chosenProp - 1].printDetails(currPlayer);
                                } else if (choice1 == 2) {
                                    if (canPlayerBuyHouses(currPlayer, tileArray, p2Properties[chosenProp - 1])) {
                                        p2Properties[chosenProp - 1].printHouseRev();
                                        System.out.println("Houses for this property cost $" + p2Properties[chosenProp - 1].getHouseCost() + " each");
                                        System.out.println("You currently have " + p2Properties[chosenProp - 1].getNumHousesOnProp() + " house(s) on this property. How many houses would you like to buy? (Say 0 for none)");
                                        System.out.println("Note: the fifth house is the hotel. You cannot buy more than a hotel");
                                        numHousesToBuy = scnr.nextInt();
                                        //If houses is 5, say they cannot buy anymore
                                        //If houses is 4, limit it to 1 more house bought
                                        //If houses is 3, limit it to 2 more houses bought
                                        if ((currPlayer.getNumHouses(p2Properties[chosenProp - 1], currPlayer) + numHousesToBuy) > 5) {
                                            System.out.println("This would exceed the maximum house limit of 5");
                                        } else if (numHousesToBuy == 0) {
                                            System.out.println("Okay. This action has been canceled");
                                        } else {
                                            for (int i = 0; i < numHousesToBuy; i++) {
                                                p2Properties[chosenProp - 1].boughtHouse();
                                                currPlayer.buyHouse(p2Properties[chosenProp - 1]);
                                            }
                                            if (p2Properties[chosenProp - 1].getNumHousesOnProp() == 5) {
                                                drawHotel(p2Properties[chosenProp - 1].getPos(), p2Properties[chosenProp - 1].getxVal(), p2Properties[chosenProp - 1].getyVal());
                                                System.out.println("You now have a hotel on " + p2Properties[chosenProp - 1].getName() + ". Rent for this space is now $" + p2Properties[chosenProp - 1].getRev());
                                            } else if (p2Properties[chosenProp - 1].getNumHousesOnProp() == 1) {
                                                drawHouse(p2Properties[chosenProp - 1].getPos(), p2Properties[chosenProp - 1].getxVal(), p2Properties[chosenProp - 1].getyVal(), 1);
                                                System.out.println("You now have 1 house on " + p2Properties[chosenProp - 1].getName() + ". Rent for this space is now $" + p2Properties[chosenProp - 1].getRev());
                                            } else {
                                                drawHouse(p2Properties[chosenProp - 1].getPos(), p2Properties[chosenProp - 1].getxVal(), p2Properties[chosenProp - 1].getyVal(), p2Properties[chosenProp - 1].getNumHousesOnProp());
                                                System.out.println("You now have " + p2Properties[chosenProp - 1].getNumHousesOnProp() + " houses on " + p2Properties[chosenProp - 1].getName() + ". Rent for this space is now $" + p2Properties[chosenProp - 1].getRev());
                                            }
                                        }
                                    }
                                    else {
                                        System.out.println("You don't own all properties of this color. You cannot buy houses");
                                    }
                                } else if (choice1 == 3) {
                                    if (p2Properties[chosenProp - 1].getNumHousesOnProp() > 0) {
                                        p2Properties[chosenProp - 1].printHouseRev();
                                        System.out.println("Each house on this property sells for $" + (p2Properties[chosenProp - 1].getHouseCost() / 2));
                                        System.out.println("You own " + p2Properties[chosenProp - 1].getNumHousesOnProp() + " houses on this property. How many houses would you like to sell? (Say 0 for none)");
                                        numHousesToSell = scnr.nextInt();

                                        if (p2Properties[chosenProp - 1].getNumHousesOnProp() - numHousesToSell < 0) {
                                            System.out.println("You do not own that many houses");
                                        } else if (numHousesToSell == 0) {
                                            System.out.println("Okay. This action has been canceled");
                                        } else {
                                            for (int i = 0; i < numHousesToSell; i++) {
                                                p2Properties[chosenProp - 1].soldHouse();
                                                currPlayer.sellHouse(p2Properties[chosenProp - 1]);
                                            }

                                            if (p2Properties[chosenProp - 1].getNumHousesOnProp() == 0) {
                                                clearColoredSquare(p2Properties[chosenProp - 1].getPos(), p2Properties[chosenProp - 1].getxVal(), p2Properties[chosenProp - 1].getyVal());
                                            }
                                            else if (p2Properties[chosenProp - 1].getNumHousesOnProp() == 1) {
                                                drawHouse(p2Properties[chosenProp - 1].getPos(), p2Properties[chosenProp - 1].getxVal(), p2Properties[chosenProp - 1].getyVal(), 1);
                                            }
                                            else if (p1Properties[chosenProp - 1].getNumHousesOnProp() == 2) {
                                                drawHouse(p2Properties[chosenProp - 1].getPos(), p2Properties[chosenProp - 1].getxVal(), p2Properties[chosenProp - 1].getyVal(), 2);
                                            }
                                            else if (p1Properties[chosenProp - 1].getNumHousesOnProp() == 3) {
                                                drawHouse(p2Properties[chosenProp - 1].getPos(), p2Properties[chosenProp - 1].getxVal(), p2Properties[chosenProp - 1].getyVal(), 3);
                                            }
                                            else if (p1Properties[chosenProp - 1].getNumHousesOnProp() == 4) {
                                                drawHouse(p2Properties[chosenProp - 1].getPos(), p2Properties[chosenProp - 1].getxVal(), p2Properties[chosenProp - 1].getyVal(), 4);
                                            }

                                            System.out.println("You have received $" + ((p2Properties[chosenProp - 1].getHouseCost() / 2) * numHousesToSell));

                                            System.out.println("You now have " + p2Properties[chosenProp - 1].getNumHousesOnProp() + " house(s) on this property");
                                        }
                                    }
                                    else {
                                        System.out.println("You have no houses you can sell");
                                    }

                                } else if (choice1 == 4) { //Mortgaging
                                    if (p2Properties[chosenProp - 1].getNumHousesOnProp() == 0) {
                                        System.out.println("You will gain $" + p2Properties[chosenProp - 1].getMortgage() + " from mortgaging this property, but you will not receive any rent. Would you like to mortgage? (y or n)");
                                        yesNo = scnr.next();
                                        if (yesNo.equals("y")) {
                                            p2Properties[chosenProp - 1].mortgageProp();
                                            mortgageBorder(currPlayer, p1Properties[chosenProp - 1].getPos(), p1Properties[chosenProp - 1].getxVal(), p1Properties[chosenProp - 1].getyVal(), p1, p2);
                                            System.out.println("Property mortgaged");
                                        } else {
                                            System.out.println("Okay. This action has been canceled");
                                        }
                                    } else {
                                        System.out.println("You cannot mortgage a property with houses. Sell your houses first");
                                    }
                                } else if (choice1 == 5){
                                    System.out.println("Okay. This action has been canceled");
                                }
                                else {
                                    System.out.println("Invalid choice");
                                }
                            } else {
                                System.out.println("You have chosen " + p2Properties[chosenProp - 1].getName() + ". What would you like to do?");
                                System.out.println("1 - See details");
                                System.out.println("2 - Buy back mortgaged property");
                                System.out.println("3 - Cancel");
                                choice1 = scnr.nextInt();

                                if (choice1 == 1) {
                                    p2Properties[chosenProp - 1].printDetails(currPlayer);
                                } else if (choice1 == 2) { //Buying back the mortgaged property
                                    System.out.println("This property costs $" + p2Properties[chosenProp - 1].getCost() + " to buy back. Would you like to buy it? (y or n)");
                                    yesNo = scnr.next();
                                    if (yesNo.equals("y")) {
                                        p2Properties[chosenProp - 1].unMortgageProp();
                                        p2.subtractMoney(p2Properties[chosenProp - 1].getCost());
                                        p2.addVal(p2Properties[chosenProp - 1].getMortgage());
                                        drawBorder(currPlayer, currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
                                        System.out.println("Property bought back");
                                    } else {
                                        System.out.println("Okay. This action has been canceled");
                                    }
                                } else if (choice1 == 3){
                                    System.out.println("Okay. This action has been canceled");
                                }
                                else {
                                    System.out.println("Invalid choice");
                                }
                            }
                        }

                    } else if (choice == 4) {
                        //check owned properties of someone else
                        if (currPlayer == p1) {
                            sortPlayerProps(p2Properties, p2.getNumProps());
                            printPlayerProps(p2Properties, p2.getNumProps());

                        } else {
                            sortPlayerProps(p1Properties, p1.getNumProps());
                            printPlayerProps(p1Properties, p1.getNumProps());
                        }
                    } else if (choice == 5) {
                        //Trade
                        System.out.println("These are your opponent's properties: ");
                        if (currPlayer == p1) {
                            sortPlayerProps(p2Properties, p2.getNumProps());
                            printPlayerProps(p2Properties, p2.getNumProps());
                        } else {
                            sortPlayerProps(p1Properties, p1.getNumProps());
                            printPlayerProps(p1Properties, p1.getNumProps());
                        }
                        System.out.println("Enter the number of the property you would like to trade for, along with any additional money.");
                        System.out.println("Property: ");
                        chosenProp = scnr.nextInt();
                        System.out.println("Money (0 if none): ");
                        amtMoney = scnr.nextInt();

                        System.out.println("These are your properties: ");

                        if (currPlayer == p1) {
                            sortPlayerProps(p1Properties, p1.getNumProps());
                            printPlayerProps(p1Properties, p1.getNumProps());
                        } else {
                            sortPlayerProps(p2Properties, p2.getNumProps());
                            printPlayerProps(p2Properties, p2.getNumProps());
                        }
                        System.out.println("Enter the number of the property you will give up in exchange, along with any additional money.");
                        System.out.println("Property: ");
                        chosenProp1 = scnr.nextInt();
                        System.out.println("Money (0 if none): ");
                        amtMoney1 = scnr.nextInt();

                        if (currPlayer == p1) {
                            if (amtMoney == 0 && amtMoney1 == 0) {
                                System.out.println("The proposed trade is " + p1Properties[chosenProp1 - 1].getName() + " for " + p2Properties[chosenProp - 1].getName());
                                System.out.println(p2.getName() + ", do you accept this trade? (y or n)");
                                yesNo = scnr.next();
                                if (yesNo.equals("y")) {
                                    drawBorder(p2, p1Properties[chosenProp1 - 1].getPos(), p1Properties[chosenProp1 - 1].getxVal(), p1Properties[chosenProp1 - 1].getyVal(), p1, p2);
                                    drawBorder(p1, p2Properties[chosenProp - 1].getPos(), p2Properties[chosenProp - 1].getxVal(), p2Properties[chosenProp - 1].getyVal(), p1, p2);
                                    p1Properties[chosenProp1 - 1].tradeProps(p1Properties[chosenProp1 - 1], p2Properties[chosenProp - 1], p1, p2);
                                    tradeProperty(p1Properties, p2Properties, chosenProp1 - 1, chosenProp - 1);
                                    System.out.println("Trade completed");
                                } else {
                                    System.out.println("Trade canceled");
                                }

                            } else if (amtMoney == 0) {
                                System.out.println("The proposed trade is " + p1Properties[chosenProp1 - 1].getName() + " and $" + amtMoney1 + " for " + p2Properties[chosenProp - 1].getName());
                                System.out.println(p2.getName() + ", do you accept this trade? (y or n)");
                                yesNo = scnr.next();
                                if (yesNo.equals("y")) {
                                    drawBorder(p2, p1Properties[chosenProp1 - 1].getPos(), p1Properties[chosenProp1 - 1].getxVal(), p1Properties[chosenProp1 - 1].getyVal(), p1, p2);
                                    drawBorder(p1, p2Properties[chosenProp - 1].getPos(), p2Properties[chosenProp - 1].getxVal(), p2Properties[chosenProp - 1].getyVal(), p1, p2);
                                    p1Properties[chosenProp1 - 1].tradeProps(p1Properties[chosenProp1 - 1], p2Properties[chosenProp - 1], p1, p2);
                                    tradeProperty(p1Properties, p2Properties, chosenProp1 - 1, chosenProp - 1);
                                    p1.subtractMoney(amtMoney1);
                                    p2.addMoney(amtMoney1);
                                    System.out.println("Trade completed");
                                } else {
                                    System.out.println("Trade canceled");
                                }
                            } else if (amtMoney1 == 0) {
                                System.out.println("The proposed trade is " + p1Properties[chosenProp1 - 1].getName() + " for " + p2Properties[chosenProp - 1].getName() + " and $" + amtMoney);
                                System.out.println(p2.getName() + ", do you accept this trade? (y or n)");
                                yesNo = scnr.next();
                                if (yesNo.equals("y")) {
                                    drawBorder(p2, p1Properties[chosenProp1 - 1].getPos(), p1Properties[chosenProp1 - 1].getxVal(), p1Properties[chosenProp1 - 1].getyVal(), p1, p2);
                                    drawBorder(p1, p2Properties[chosenProp - 1].getPos(), p2Properties[chosenProp - 1].getxVal(), p2Properties[chosenProp - 1].getyVal(), p1, p2);
                                    p1Properties[chosenProp1 - 1].tradeProps(p1Properties[chosenProp1 - 1], p2Properties[chosenProp - 1], p1, p2);
                                    tradeProperty(p1Properties, p2Properties, chosenProp1 - 1, chosenProp - 1);
                                    p2.subtractMoney(amtMoney);
                                    p1.addMoney(amtMoney);
                                    System.out.println("Trade completed");
                                } else {
                                    System.out.println("Trade canceled");
                                }
                            } else {
                                System.out.println("The proposed trade is " + p1Properties[chosenProp1 - 1].getName() + " and $" + amtMoney1 + " for " + p2Properties[chosenProp - 1].getName() + " and $" + amtMoney);
                                System.out.println(p2.getName() + ", do you accept this trade? (y or n)");
                                yesNo = scnr.next();
                                if (yesNo.equals("y")) {
                                    drawBorder(p2, p1Properties[chosenProp1 - 1].getPos(), p1Properties[chosenProp1 - 1].getxVal(), p1Properties[chosenProp1 - 1].getyVal(), p1, p2);
                                    drawBorder(p1, p2Properties[chosenProp - 1].getPos(), p2Properties[chosenProp - 1].getxVal(), p2Properties[chosenProp - 1].getyVal(), p1, p2);
                                    p1Properties[chosenProp1 - 1].tradeProps(p1Properties[chosenProp1 - 1], p2Properties[chosenProp - 1], p1, p2);
                                    tradeProperty(p1Properties, p2Properties, chosenProp1 - 1, chosenProp - 1);
                                    p1.subtractMoney(amtMoney1);
                                    p2.addMoney(amtMoney1);
                                    p1.addMoney(amtMoney);
                                    p2.subtractMoney(amtMoney);
                                    System.out.println("Trade completed");
                                } else {
                                    System.out.println("Trade canceled");
                                }
                            }
                        }
                        //When currPlayer == p2
                        else {
                            if (amtMoney == 0 && amtMoney1 == 0) {
                                System.out.println("The proposed trade is " + p2Properties[chosenProp1 - 1].getName() + " for " + p1Properties[chosenProp - 1].getName());
                                System.out.println(p1.getName() + ", do you accept this trade? (y or n)");
                                yesNo = scnr.next();
                                if (yesNo.equals("y")) {
                                    drawBorder(p1, p2Properties[chosenProp1 - 1].getPos(), p2Properties[chosenProp1 - 1].getxVal(), p2Properties[chosenProp1 - 1].getyVal(), p1, p2);
                                    drawBorder(p2, p1Properties[chosenProp - 1].getPos(), p1Properties[chosenProp - 1].getxVal(), p1Properties[chosenProp - 1].getyVal(), p1, p2);
                                    p2Properties[chosenProp1 - 1].tradeProps(p2Properties[chosenProp1 - 1], p1Properties[chosenProp - 1], p2, p1);
                                    tradeProperty(p2Properties, p1Properties, chosenProp1 - 1, chosenProp - 1);
                                    System.out.println("Trade completed");
                                } else {
                                    System.out.println("Trade canceled");
                                }

                            } else if (amtMoney == 0) {
                                System.out.println("The proposed trade is " + p2Properties[chosenProp1 - 1].getName() + " and $" + amtMoney1 + " for " + p1Properties[chosenProp - 1].getName());
                                System.out.println(p1.getName() + ", do you accept this trade? (y or n)");
                                yesNo = scnr.next();
                                if (yesNo.equals("y")) {
                                    drawBorder(p1, p2Properties[chosenProp1 - 1].getPos(), p2Properties[chosenProp1 - 1].getxVal(), p2Properties[chosenProp1 - 1].getyVal(), p1, p2);
                                    drawBorder(p2, p1Properties[chosenProp - 1].getPos(), p1Properties[chosenProp - 1].getxVal(), p1Properties[chosenProp - 1].getyVal(), p1, p2);
                                    p2Properties[chosenProp1 - 1].tradeProps(p2Properties[chosenProp1 - 1], p1Properties[chosenProp - 1], p2, p1);
                                    tradeProperty(p2Properties, p1Properties, chosenProp1 - 1, chosenProp - 1);
                                    p2.subtractMoney(amtMoney1);
                                    p1.addMoney(amtMoney1);
                                    System.out.println("Trade completed");
                                } else {
                                    System.out.println("Trade canceled");
                                }
                            } else if (amtMoney1 == 0) {
                                System.out.println("The proposed trade is " + p2Properties[chosenProp1 - 1].getName() + " for " + p1Properties[chosenProp - 1].getName() + " and $" + amtMoney);
                                System.out.println(p1.getName() + ", do you accept this trade? (y or n)");
                                yesNo = scnr.next();
                                if (yesNo.equals("y")) {
                                    drawBorder(p1, p2Properties[chosenProp1 - 1].getPos(), p2Properties[chosenProp1 - 1].getxVal(), p2Properties[chosenProp1 - 1].getyVal(), p1, p2);
                                    drawBorder(p2, p1Properties[chosenProp - 1].getPos(), p1Properties[chosenProp - 1].getxVal(), p1Properties[chosenProp - 1].getyVal(), p1, p2);
                                    p2Properties[chosenProp1 - 1].tradeProps(p2Properties[chosenProp1 - 1], p1Properties[chosenProp - 1], p2, p1);
                                    tradeProperty(p2Properties, p1Properties, chosenProp1 - 1, chosenProp - 1);
                                    p1.subtractMoney(amtMoney);
                                    p2.addMoney(amtMoney);
                                    System.out.println("Trade completed");
                                } else {
                                    System.out.println("Trade canceled");
                                }
                            } else {
                                System.out.println("The proposed trade is " + p2Properties[chosenProp1 - 1].getName() + " and $" + amtMoney1 + " for " + p1Properties[chosenProp - 1].getName() + " and $" + amtMoney);
                                System.out.println(p1.getName() + ", do you accept this trade? (y or n)");
                                yesNo = scnr.next();
                                if (yesNo.equals("y")) {
                                    drawBorder(p1, p2Properties[chosenProp1 - 1].getPos(), p2Properties[chosenProp1 - 1].getxVal(), p2Properties[chosenProp1 - 1].getyVal(), p1, p2);
                                    drawBorder(p2, p1Properties[chosenProp - 1].getPos(), p1Properties[chosenProp - 1].getxVal(), p1Properties[chosenProp - 1].getyVal(), p1, p2);
                                    p2Properties[chosenProp1 - 1].tradeProps(p2Properties[chosenProp1 - 1], p1Properties[chosenProp - 1], p2, p1);
                                    tradeProperty(p2Properties, p1Properties, chosenProp1 - 1, chosenProp - 1);
                                    p2.subtractMoney(amtMoney1);
                                    p1.addMoney(amtMoney1);
                                    p2.addMoney(amtMoney);
                                    p1.subtractMoney(amtMoney);
                                    System.out.println("Trade completed");
                                } else {
                                    System.out.println("Trade canceled");
                                }
                            }
                        }
                    } else if (choice == 6) {
                        System.out.println("Turn has ended");
                    } else {
                        System.out.println("Invalid choice");
                    }

                    choice = printPostTurnMenu(currPlayer);

                }
                System.out.println("Turn has ended");
                if (currPlayer == p1) {
                    currPlayer = p2;
                } else {
                    currPlayer = p1;
                }
            }
            else {
                if (currPlayer.getJailCounter() < 3) {
                    System.out.println("Oh no! " + currPlayer.getName() + ", you're in jail!");
                    System.out.println("You will automatically exit jail after " + (3 - currPlayer.getJailCounter()) + " more turn(s)");
                    System.out.println("Enter the number of your chosen option");
                    System.out.println("1 - Roll the dice. You get 3 tries to roll doubles");
                    System.out.println("2 - Wait out this turn in jail");
                    System.out.println("3 - Use a get out of jail free card (only if you have one)");
                    choice2 = scnr.nextInt();

                    if (choice2 == 1) {
                        for (int i = 0; i < 3; i++) {
                            rollDice(dice);
                            System.out.println(dice[0] + ", " + dice[1]);
                            if (dice[0] == dice[1]) {
                                System.out.println("Doubles! You've escaped! You may now roll");
                                currPlayer.exitJail();
                                break;
                            }
                        }
                        if (currPlayer.isInJail()) {
                            System.out.println("Tough luck, here's to another day...");
                            currPlayer.incJailCounter();
                        }
                        else {
                            currPlayer.resetJailCounter();
                        }

                    }
                    else if (choice2 == 2) {
                        currPlayer.incJailCounter();
                        System.out.println("Doin' hard time...");
                    }
                    else {
                        if (currPlayer.getGOOJF() > 0) {
                            System.out.println("You've escaped! You may resume play next turn");
                            currPlayer.useGOOJF();
                            currPlayer.exitJail();
                            currPlayer.resetJailCounter();
                        }
                        else {
                            System.out.println("Nice try, but you were caught since you have no get out of jail free cards.");
                            System.out.println("You must wait out your turn in jail");
                            currPlayer.incJailCounter();
                        }
                    }






                }
                else {
                    System.out.println("You've done your time, you may exit jail and resume play next turn");
                    currPlayer.exitJail();
                    currPlayer.resetJailCounter();
                }

                if (currPlayer == p1) {
                    currPlayer = p2;
                }
                else {
                    currPlayer = p1;
                }
            }
        }

    }

    public static void playGame3(String player1, String player2, String player3, Properties[] tileArray) {

    }

    public static void playGame4(String player1, String player2, String player3, String player4, Properties[] tileArray) {

    }


    public static void drawChance2Players(String[] chanceCards, Properties[] playerProps, Player currPlayer, Properties[] tileArray, Player p1, Player p2) { //playerProps is the properties of the currPlayer
        Random randGen = new Random();
        Scanner scnr = new Scanner(System.in);

        int rentOwed;
        String yesNo;
        int randCard = randGen.nextInt(15);

        System.out.println(chanceCards[randCard]);

        if (randCard == 0) {
            erasePlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
            currPlayer.changePos(1);
            drawPlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
            currPlayer.addMoney(400);
        }
        else if (randCard == 1) {
            if (currPlayer.getPos() > 25) {
                currPlayer.addMoney(200);
                System.out.println("$200 collected");
            }
            erasePlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);

            currPlayer.changePos(25);
            drawPlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);

            if (tileArray[currPlayer.getPos() - 1].isOwned()) {
                if (currPlayer != tileArray[currPlayer.getPos() - 1].getOwner()) {
                    if (!tileArray[currPlayer.getPos() - 1].isPropMortgaged()) {
                        if (currPlayer == p1) {
                            rentOwed = tileArray[currPlayer.getPos() - 1].getRev();
                            System.out.println("Rent paid to " + p2.getName() + ": $" + rentOwed);
                            p1.subtractMoney(rentOwed);
                            p2.addMoney(rentOwed);
                        }
                        else {
                            rentOwed = tileArray[currPlayer.getPos() - 1].getRev();
                            System.out.println("Rent paid to " + p1.getName() + ": $" + rentOwed);
                            p1.addMoney(rentOwed);
                            p2.subtractMoney(rentOwed);
                        }
                    }
                    else {
                        System.out.println("This property has been mortgaged");
                    }
                }
                else {
                    System.out.println("You own this property");
                }
            }
            else {


                System.out.println(tileArray[currPlayer.getPos() - 1].getName() + " costs $240");
                System.out.println("Would you like to see this property's details? (y or n)");
                yesNo = scnr.next();
                if (yesNo.equals("y")) {
                    tileArray[currPlayer.getPos() - 1].printDetails(currPlayer);
                }
                System.out.println("Would you like to buy this property? (y or n)");
                yesNo = scnr.next();
                if (yesNo.equals("y")) {
                    tileArray[currPlayer.getPos() - 1].setOwner(currPlayer);
                    addProperty(playerProps, tileArray[currPlayer.getPos() - 1], currPlayer.getNumProps());
                    drawBorder(currPlayer, currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
                    currPlayer.boughtProperty(tileArray[currPlayer.getPos() - 1]);
                    System.out.println("Property bought");
                }

            }
        }
        else if (randCard == 2) {
            if (currPlayer.getPos() > 12) {
                currPlayer.addMoney(200);
                System.out.println("$200 collected");
            }
            erasePlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
            currPlayer.changePos(12);
            drawPlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);

            if (tileArray[currPlayer.getPos() - 1].isOwned()) {
                if (currPlayer != tileArray[currPlayer.getPos() - 1].getOwner()) {
                    if (!tileArray[currPlayer.getPos() - 1].isPropMortgaged()) {
                        if (currPlayer == p1) {
                            rentOwed = tileArray[currPlayer.getPos() - 1].getRev();
                            System.out.println("Rent paid to " + p2.getName() + ": $" + rentOwed);
                            p1.subtractMoney(rentOwed);
                            p2.addMoney(rentOwed);
                        }
                        else {
                            rentOwed = tileArray[currPlayer.getPos() - 1].getRev();
                            System.out.println("Rent paid to " + p1.getName() + ": $" + rentOwed);
                            p2.subtractMoney(rentOwed);
                            p1.addMoney(rentOwed);
                        }
                    }
                    else {
                        System.out.println("This property has been mortgaged");
                    }
                }
                else {
                    System.out.println("You own this property");
                }
            }
            else {
                System.out.println(tileArray[currPlayer.getPos() - 1].getName() + " costs $140");
                System.out.println("Would you like to see this property's details? (y or n)");
                yesNo = scnr.next();
                if (yesNo.equals("y")) {
                    tileArray[currPlayer.getPos() - 1].printDetails(currPlayer);
                }
                System.out.println("Would you like to buy this property? (y or n)");
                yesNo = scnr.next();
                if (yesNo.equals("y")) {
                    tileArray[currPlayer.getPos() - 1].setOwner(currPlayer);
                    drawBorder(currPlayer, currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
                    addProperty(playerProps, tileArray[currPlayer.getPos() - 1], currPlayer.getNumProps());
                    currPlayer.boughtProperty(tileArray[currPlayer.getPos() - 1]);
                    System.out.println("Property bought");
                }
            }
        }
        else if (randCard == 3) {
            int utilityPos;
            erasePlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
            if ((currPlayer.getPos() > 13) && (currPlayer.getPos() < 30)) {
                currPlayer.changePos(29);
                utilityPos = 29;
            }
            else if (currPlayer.getPos() > 29) {
                currPlayer.changePos(13);
                utilityPos = 13;
                currPlayer.addMoney(200);
                System.out.println("$200 collected");
            }
            else  {
                currPlayer.changePos(13);
                utilityPos = 13;
            }

            drawPlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);

            int diceVal;

            if (tileArray[utilityPos - 1].isOwned()) {
                if (tileArray[utilityPos - 1].getOwner() != currPlayer) {
                    if (!tileArray[utilityPos - 1].isPropMortgaged()) {
                        if (currPlayer == p1) {
                            diceVal = rollDiceBeginning();
                            System.out.println("You rolled " + diceVal);
                            rentOwed = tileArray[utilityPos - 1].getUtilityRent(diceVal, 2);  //Always two because the chance card specifies *10
                            System.out.println("Rent paid to " + p2.getName() + ": $" + rentOwed);
                            p1.subtractMoney(rentOwed);
                            p2.addMoney(rentOwed);
                        }
                        else {
                            diceVal = rollDiceBeginning();
                            System.out.println("You rolled " + diceVal);
                            rentOwed = tileArray[utilityPos - 1].getUtilityRent(diceVal, 2);
                            System.out.println("Rent paid to " + p1.getName() + ": $" + rentOwed);
                            p2.subtractMoney(rentOwed);
                            p1.addMoney(rentOwed);
                        }
                    }
                    else {
                        System.out.println("This property has been mortgaged");
                    }
                }
                else {
                    System.out.println("You own this property");
                }
            }
            else {
                System.out.println(tileArray[currPlayer.getPos() - 1].getName() + " costs $150");
                System.out.println("Would you like to see this property's details? (y or n)");
                yesNo = scnr.next();
                if (yesNo.equals("y")) {
                    tileArray[currPlayer.getPos() - 1].printDetails(currPlayer);
                }
                System.out.println("Would you like to buy this property? (y or n)");
                yesNo = scnr.next();
                if (yesNo.equals("y")) {
                    tileArray[utilityPos - 1].setOwner(currPlayer);
                    addProperty(playerProps, tileArray[utilityPos - 1], currPlayer.getNumProps());
                    currPlayer.boughtProperty(tileArray[utilityPos - 1]);
                    drawBorder(currPlayer, currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
                    System.out.println("Property bought");
                    currPlayer.buyUtility();
                }
            }
        }
        else if (randCard == 4) {
            int railroadPos;
            erasePlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
            if (currPlayer.getPos() > 36) {
                currPlayer.changePos(6);
                railroadPos = 6;
                currPlayer.addMoney(200);
                System.out.println("$200 collected");
            }
            else if (currPlayer.getPos() > 26) {
                currPlayer.changePos(36);
                railroadPos = 36;
            }
            else if (currPlayer.getPos() > 16) {
                currPlayer.changePos(26);
                railroadPos = 26;
            }
            else if (currPlayer.getPos() > 6) {
                currPlayer.changePos(16);
                railroadPos = 16;
            }
            else {
                currPlayer.changePos(6);
                railroadPos = 6;
            }
            drawPlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);

            if (tileArray[railroadPos - 1].isOwned()) {
                if (tileArray[railroadPos - 1].getOwner() != currPlayer) {
                    if (!tileArray[railroadPos - 1].isPropMortgaged()) {
                        if (currPlayer == p1) {
                            rentOwed = 2 * (tileArray[railroadPos - 1].getRailroadRent(p2.getNumRailroads()));
                            System.out.println("Rent paid to " + p2.getName() + ": $" + rentOwed);
                            p1.subtractMoney(rentOwed);
                            p2.addMoney(rentOwed);
                        }
                        else {
                            rentOwed = 2 * (tileArray[railroadPos - 1].getRailroadRent(p1.getNumRailroads()));
                            System.out.println("Rent paid to " + p1.getName() + ": $" + rentOwed);
                            p2.subtractMoney(rentOwed);
                            p1.addMoney(rentOwed);
                        }
                    }
                    else {
                        System.out.println("This property is mortgaged");
                    }
                }
                else {
                    System.out.println("You own this property");
                }
            }
            else {
                System.out.println(tileArray[currPlayer.getPos() - 1].getName() + " costs $200");
                System.out.println("Would you like to see this property's details? (y or n)");
                yesNo = scnr.next();
                if (yesNo.equals("y")) {
                    tileArray[currPlayer.getPos() - 1].printDetails(currPlayer);
                }
                System.out.println("Would you like to buy this property? (y or n)");
                yesNo = scnr.next();
                if (yesNo.equals("y")) {
                    tileArray[railroadPos - 1].setOwner(currPlayer);
                    currPlayer.boughtProperty(tileArray[railroadPos - 1]);
                    addProperty(playerProps, tileArray[railroadPos - 1], currPlayer.getNumProps());
                    currPlayer.buyRailroad();
                    drawBorder(currPlayer, currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
                    System.out.println("Property bought");
                }
            }
        }
        else if (randCard == 5) {
            currPlayer.addMoney(50);
        }
        else if (randCard == 6) {
            currPlayer.receiveGOOJF();
        }
        else if (randCard == 7) {
            erasePlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
            currPlayer.enterJail(); //This may need to be flushed out
            drawPlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
        }
        else if (randCard == 8) {
            int amount = 0;
            for (int i = 0; i < 40; i++) {
                if (currPlayer.getNumHouses(tileArray[i], currPlayer) == 5) {
                    amount = amount + 100;
                }
                else if (currPlayer.getNumHouses(tileArray[i], currPlayer) > 0) {
                    amount = amount + (currPlayer.getNumHouses(tileArray[i], currPlayer) * 25);
                }
            }
            currPlayer.subtractMoney(amount);
            System.out.println("Total amount paid: $" + amount);
            tileArray[21].incFreeParkingMoney(amount);
        }
        else if (randCard == 9) {
            currPlayer.subtractMoney(15);
            tileArray[21].incFreeParkingMoney(15);
        }
        else if (randCard == 10) {
            if (currPlayer.getPos() > 6) {
                currPlayer.addMoney(200);
                System.out.println("$200 collected");
            }
            erasePlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
            currPlayer.changePos(6);
            drawPlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);

            if (tileArray[5].isOwned()) {
                if (tileArray[5].getOwner() != currPlayer) {
                    if (!tileArray[5].isPropMortgaged()) {
                        if (currPlayer == p1) {
                            rentOwed = tileArray[5].getRailroadRent(p2.getNumRailroads());
                            p1.subtractMoney(rentOwed);
                            p2.addMoney(rentOwed);
                        }
                        else {
                            rentOwed = tileArray[5].getRailroadRent(p1.getNumRailroads());
                            p1.addMoney(rentOwed);
                            p2.subtractMoney(rentOwed);
                        }
                    }
                    else {
                        System.out.println("This property has been mortgaged");
                    }
                }
                else {
                    System.out.println("You own this property");
                }
            }
            else {
                System.out.println(tileArray[currPlayer.getPos() - 1].getName() + " costs $200");
                System.out.println("Would you like to see this property's details? (y or n)");
                yesNo = scnr.next();
                if (yesNo.equals("y")) {
                    tileArray[currPlayer.getPos() - 1].printDetails(currPlayer);
                }
                System.out.println("Would you like to buy this property? (y or n)");
                yesNo = scnr.next();
                if (yesNo.equals("y")) {
                    tileArray[5].setOwner(currPlayer);
                    currPlayer.buyRailroad();
                    currPlayer.boughtProperty(tileArray[5]);
                    addProperty(playerProps, tileArray[5], currPlayer.getNumProps());
                    drawBorder(currPlayer, currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
                    System.out.println("Property bought");
                }
            }
        }
        else if (randCard == 11) {
            erasePlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
            currPlayer.changePos(40);
            drawPlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
            if (tileArray[39].isOwned()) {
                if (tileArray[39].getOwner() != currPlayer) {
                    if (!tileArray[39].isPropMortgaged()) {
                        if (currPlayer == p1) {
                            rentOwed = tileArray[39].getRev();
                            p1.subtractMoney(rentOwed);
                            p2.addMoney(rentOwed);
                        }
                        else {
                            rentOwed = tileArray[39].getRev();
                            p1.addMoney(rentOwed);
                            p2.subtractMoney(rentOwed);
                        }
                    }
                    else {
                        System.out.println("This property has been mortgaged");
                    }
                }
                else {
                    System.out.println("You own this property");
                }
            }
            else {
                System.out.println(tileArray[currPlayer.getPos() - 1].getName() + " costs $400");
                System.out.println("Would you like to see this property's details? (y or n)");
                yesNo = scnr.next();
                if (yesNo.equals("y")) {
                    tileArray[currPlayer.getPos() - 1].printDetails(currPlayer);
                }
                System.out.println("Would you like to buy this property? (y or n)");
                yesNo = scnr.next();
                if (yesNo.equals("y")) {
                    tileArray[39].setOwner(currPlayer);
                    currPlayer.boughtProperty(tileArray[39]);
                    addProperty(playerProps, tileArray[39], currPlayer.getNumProps());
                    drawBorder(currPlayer, currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
                    System.out.println("Property bought");
                }
            }
        }
        else if (randCard == 12) {
            if (currPlayer == p1) {
                p1.subtractMoney(50);
                p2.addMoney(50);
                System.out.println("Amount paid");
            }
            else {
                p1.addMoney(50);
                p2.subtractMoney(50);
                System.out.println("Amount paid");
            }
        }
        else if (randCard == 13) {
            currPlayer.addMoney(150);
            System.out.println("Amount collected");
        }
        else if (randCard == 14) {
            currPlayer.addMoney(100);
            System.out.println("Amount collected");
        }
    }

    public static void drawChest2Players(String[] communityChest, Player currPlayer, Properties[] tileArray, Player p1, Player p2) {
        Random randGen = new Random();
        Scanner scnr = new Scanner(System.in);

        int rentOwed;
        String yesNo;
        int randCard = randGen.nextInt(17);

        System.out.println(communityChest[randCard]);

        if (randCard == 0) {
            erasePlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
            currPlayer.changePos(1);
            drawPlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
            currPlayer.addMoney(400);
        }
        else if (randCard == 1) {
            currPlayer.addMoney(200);
        }
        else if (randCard == 2) {
            currPlayer.subtractMoney(50);
            tileArray[21].incFreeParkingMoney(50);
        }
        else if (randCard == 3) {
            currPlayer.addMoney(50);
        }
        else if (randCard == 4) {
            currPlayer.receiveGOOJF();
        }
        else if (randCard == 5) {
            erasePlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
            currPlayer.enterJail(); //flush out jail function more
            drawPlayer(currPlayer, currPlayer.getShape(), currPlayer.getPos(), tileArray[currPlayer.getPos() - 1].getxVal(), tileArray[currPlayer.getPos() - 1].getyVal(), p1, p2);
        }
        else if (randCard == 6) {
            if (currPlayer == p1) {
                p1.addMoney(50);
                p2.subtractMoney(50);
            }
            else {
                p1.subtractMoney(50);
                p2.addMoney(50);
            }
        }
        else if (randCard == 7) {
            currPlayer.addMoney(100);
        }
        else if (randCard == 8) {
            currPlayer.addMoney(20);
        }
        else if (randCard == 9) {
            currPlayer.addMoney(10);
        }
        else if (randCard == 10) {
            currPlayer.addMoney(100);
        }
        else if (randCard == 11) {
            currPlayer.subtractMoney(100);
            tileArray[21].incFreeParkingMoney(100);
        }
        else if (randCard == 12) {
            currPlayer.subtractMoney(150);
            tileArray[21].incFreeParkingMoney(150);
        }
        else if (randCard == 13) {
            currPlayer.addMoney(25);
        }
        else if (randCard == 14) {
            int amount = 0;
            for (int i = 0; i < 40; i++) {
                if (currPlayer.getNumHouses(tileArray[i], currPlayer) == 5) {
                    amount = amount + 115;
                }
                else if (currPlayer.getNumHouses(tileArray[i], currPlayer) > 0) {
                    amount = amount + (currPlayer.getNumHouses(tileArray[i], currPlayer) * 40);
                }
            }
            currPlayer.subtractMoney(amount);
            System.out.println("Total amount paid: $" + amount);
            tileArray[21].incFreeParkingMoney(amount);
        }
        else if (randCard == 15) {
            currPlayer.addMoney(15);
        }
        else if (randCard == 16) {
            currPlayer.addMoney(100);
        }
    }




    public static int rollDiceBeginning() {
        Random randGen = new Random();
        int dice1 = randGen.nextInt(6) + 1;
        int dice2 = randGen.nextInt(6) + 1;
        return dice1 + dice2;
    }

    public static void rollDice(int[] dice) { //Change to returning an int array with each dice val, diceval = 0 + 1 in other method. this is to check for doubles. Can use a counter for doubles to see if use can roll again or if they go to jail
        Random randGen = new Random();
        dice[0] = randGen.nextInt(6) + 1;
        dice[1] = randGen.nextInt(6) + 1;
    }

    public static void addProperty(Properties[] playerProps, Properties boughtProp, int numProps) { //numProps will be the numProps from the player class. boughtProp is whatever prop the player is standing on. When a player buys a prop, run this method, then boughtProperty from player class
        playerProps[numProps] = boughtProp;
    }

    public static void tradeProperty(Properties[] traderProps, Properties[] tradeeprops, int indexOfPropTrade, int indexOfPropTradeFor) {
        //THIS IS CODE FOR TRADING PROPERTY. FINISH THIS
        Properties tempVal;
        tempVal = traderProps[indexOfPropTrade];
        traderProps[indexOfPropTrade] = tradeeprops[indexOfPropTradeFor];
        tradeeprops[indexOfPropTradeFor] = tempVal;
    }

    public static boolean canPlayerBuyHouses(Player currPlayer, Properties[] tileArray, Properties currProperty) {
        boolean canBuy = false;
        if (currProperty == tileArray[1] || currProperty == tileArray[3]) {
            if (currProperty == tileArray[1]) {
                if (currProperty.getOwner() == currPlayer && tileArray[3].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
            else {
                if (currProperty.getOwner() == currPlayer && tileArray[1].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
        }
        else if (currProperty == tileArray[6] || currProperty == tileArray[8] || currProperty == tileArray[9]) {
            if (currProperty == tileArray[6]) {
                if (currProperty.getOwner() == currPlayer && tileArray[8].getOwner() == currPlayer && tileArray[9].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
            else if (currProperty == tileArray[8]) {
                if (currProperty.getOwner() == currPlayer && tileArray[6].getOwner() == currPlayer && tileArray[9].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
            else {
                if (currProperty.getOwner() == currPlayer && tileArray[8].getOwner() == currPlayer && tileArray[6].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
        }
        else if (currProperty == tileArray[11] || currProperty == tileArray[13] || currProperty == tileArray[14]) {
            if (currProperty == tileArray[11]) {
                if (currProperty.getOwner() == currPlayer && tileArray[13].getOwner() == currPlayer && tileArray[14].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
            else if (currProperty == tileArray[13]) {
                if (currProperty.getOwner() == currPlayer && tileArray[11].getOwner() == currPlayer && tileArray[14].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
            else {
                if (currProperty.getOwner() == currPlayer && tileArray[13].getOwner() == currPlayer && tileArray[11].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
        }
        else if (currProperty == tileArray[16] || currProperty == tileArray[18] || currProperty == tileArray[19]) {
            if (currProperty == tileArray[16]) {
                if (currProperty.getOwner() == currPlayer && tileArray[18].getOwner() == currPlayer && tileArray[19].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
            else if (currProperty == tileArray[18]) {
                if (currProperty.getOwner() == currPlayer && tileArray[16].getOwner() == currPlayer && tileArray[19].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
            else {
                if (currProperty.getOwner() == currPlayer && tileArray[18].getOwner() == currPlayer && tileArray[16].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }

        }
        else if (currProperty == tileArray[21] || currProperty == tileArray[23] || currProperty == tileArray[24]) {
            if (currProperty == tileArray[21]) {
                if (currProperty.getOwner() == currPlayer && tileArray[23].getOwner() == currPlayer && tileArray[24].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
            else if (currProperty == tileArray[23]) {
                if (currProperty.getOwner() == currPlayer && tileArray[21].getOwner() == currPlayer && tileArray[24].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
            else {
                if (currProperty.getOwner() == currPlayer && tileArray[23].getOwner() == currPlayer && tileArray[21].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
        }
        else if (currProperty == tileArray[26] || currProperty == tileArray[27] || currProperty == tileArray[29]) {
            if (currProperty == tileArray[26]) {
                if (currProperty.getOwner() == currPlayer && tileArray[27].getOwner() == currPlayer && tileArray[29].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
            else if (currProperty == tileArray[27]) {
                if (currProperty.getOwner() == currPlayer && tileArray[26].getOwner() == currPlayer && tileArray[29].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
            else {
                if (currProperty.getOwner() == currPlayer && tileArray[27].getOwner() == currPlayer && tileArray[26].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
        }
        else if (currProperty == tileArray[31] || currProperty == tileArray[32] || currProperty == tileArray[34]) {
            if (currProperty == tileArray[31]) {
                if (currProperty.getOwner() == currPlayer && tileArray[32].getOwner() == currPlayer && tileArray[34].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
            else if (currProperty == tileArray[32]) {
                if (currProperty.getOwner() == currPlayer && tileArray[31].getOwner() == currPlayer && tileArray[34].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
            else {
                if (currProperty.getOwner() == currPlayer && tileArray[32].getOwner() == currPlayer && tileArray[31].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
        }
        else if (currProperty == tileArray[37] || currProperty == tileArray[39]) {
            if (currProperty == tileArray[37]) {
                if (currProperty.getOwner() == currPlayer && tileArray[39].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
            else {
                if (currProperty.getOwner() == currPlayer && tileArray[37].getOwner() == currPlayer) {
                    canBuy = true;
                }
            }
        }

        return canBuy;
    }

    public static void sortPlayerProps(Properties[] playerProps, int numProps) {
        Properties tempVal;
        int i;
        int numSwaps = 1;
        while (numSwaps != 0) {
            numSwaps = 0;
            for (i = 0; i < numProps; i++) {
                if (numProps == 1) {
                    playerProps[0] = playerProps[0];
                }
                else {

                    if (i != numProps - 1) {
                        if (playerProps[i].getPos() > playerProps[i + 1].getPos()) {
                            tempVal = playerProps[i];
                            playerProps[i] = playerProps[i + 1];
                            playerProps[i + 1] = tempVal;
                            numSwaps = numSwaps + 1;
                        }
                    }
                    else {
                        if (playerProps[i].getPos() < playerProps[i-1].getPos()) {
                            tempVal = playerProps[i];
                            playerProps[i] = playerProps[i-1];
                            playerProps[i-1] = tempVal;
                            numSwaps = numSwaps + 1;
                        }
                    }
                }
            }

        }
    }

    public static void printPlayerProps(Properties[] playerProps, int numProps) {
        for (int i = 0; i < numProps; i++) {
            System.out.println(i+1 + " - " + playerProps[i].getName());
        }
    }


    public static int printPreTurnMenu(Player currPlayer) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("You have $" + currPlayer.getMoney());
        System.out.println("1 - Roll Dice");
        System.out.println("2 - View property you are standing on");
        System.out.println("3 - Manage properties"); //see properties, choose one, bring up options like build houses, mortgage, details
        System.out.println("4 - Check someone else's owned properties");
        System.out.println("5 - Trade with another player");
        System.out.println("6 - Skip turn");

        int choice = scnr.nextInt();
        if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6) {
            return choice;
        }
        else {
            System.out.println("Invalid choice. Select another number");
            choice = scnr.nextInt();
            return choice;
        }
    }

    public static int printPostTurnMenu(Player currPlayer) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        System.out.println("You have $" + currPlayer.getMoney());
        System.out.println("1 - Roll Dice (Only if you rolled doubles)"); //make sure to add some sort of counter to see if the player has rolled dice already. If they have and no doubles, say they cannot roll again. Reset counter at top of while loop or something
        System.out.println("2 - View property you are standing on");
        System.out.println("3 - Manage properties");
        System.out.println("4 - Check someone else's owned properties");
        System.out.println("5 - Trade with another player");
        System.out.println("6 - End Turn");
        int choice = scnr.nextInt();

        if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6) {
            return choice;
        }
        else {
            System.out.println("Invalid choice. Select another number");
            choice = scnr.nextInt();
            return choice;
        }
    }


    public static void printRules() {
        System.out.println("You'll figure it out");
    }

    public static void movePlayer(Player currPlayer, String shape, int pos, double x, double y, double preX, double preY, Player p1, Player p2, int diceVal) {
        drawPlayer(currPlayer, shape, pos, x, y, p1, p2);
        erasePlayer(currPlayer, shape, pos - diceVal, preX, preY, p1, p2);
    }

    public static void erasePlayer(Player currPlayer, String shape, int pos, double x, double y, Player p1, Player p2) { //Take the position as input. Above, when erasing the previous shape, use pos as currPlayer.getPos() - diceVal
        if (pos == 1) {
            StdDraw.setPenRadius(.003);
            if (shape.equals("Star")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p1) { //p1 is -.2 x, p2 is +.2x Each y is +1.3
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y + .45, x - .35, y + .15);
                    StdDraw.line(x - .35, y + .15, x - .05, y + .35);
                    StdDraw.line(x - .05, y + .35, x - .35, y + .35);
                    StdDraw.line(x - .35, y + .35, x - .05, y + .15);
                    StdDraw.line(x - .05, y + .15, x - .2, y + .45);
                }
                else {

                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y + .45, x + .05, y + .15);
                    StdDraw.line(x + .05, y + .15, x + .35, y + .35);
                    StdDraw.line(x + .35, y + .35, x + .05, y + .35);
                    StdDraw.line(x + .05, y + .35, x + .35, y + .15);
                    StdDraw.line(x + .35, y + .15, x + .2, y + .45);
                }
            }
            else if (shape.equals("Triangle")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y + .45, x - .05, y + .15);
                    StdDraw.line(x - .05, y + .15, x - .35, y + .15);
                    StdDraw.line(x - .35, y + .15, x - .2, y + .45);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y + .45, x + .35, y + .15);
                    StdDraw.line(x + .35, y + .15, x + .05, y + .15);
                    StdDraw.line(x + .05, y + .15, x + .2, y + .45);
                }
            }
            else if (shape.equals("Circle")) {
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledCircle(x - .2, y + .3, .155);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledCircle(x + .2, y + .3, .155);
                }
            }
            else if (shape.equals("Square")) {
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledSquare(x - .2, y + .3, .158);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledSquare(x + .2, y + .3, .158);
                }
            }
            else if (shape.equals("Heart")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y + .2, x - .4, y + .4);
                    StdDraw.line(x - .4, y + .4, x - .3, y + .5);
                    StdDraw.line(x - .3, y + .5, x - .2, y + .4);
                    StdDraw.line(x - .2, y + .4, x - .1, y + .5);
                    StdDraw.line(x - .1, y + .5, x, y + .4);
                    StdDraw.line(x, y + .4, x - .2, y + .2);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y + .2, x, y + .4);
                    StdDraw.line(x, y + .4, x + .1, y + .5);
                    StdDraw.line(x + .1, y + .5, x + .2, y + .4);
                    StdDraw.line(x + .2, y + .4, x + .3, y + .5);
                    StdDraw.line(x + .3, y + .5, x + .4, y + .4);
                    StdDraw.line(x + .4, y + .4, x + .2, y + .2);
                }
            }
            else if (shape.equals("Arrow")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y + .15, x - .2, y + .45);
                    StdDraw.line(x - .2, y + .45, x - .3, y + .3);
                    StdDraw.line(x - .2, y + .45, x - .1, y + .3);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y + .15, x + .2, y + .45);
                    StdDraw.line(x + .2, y + .45, x + .1, y + .3);
                    StdDraw.line(x + .2, y + .45, x + .3, y + .3);
                }
            }
        }
        else if (pos > 1 && pos < 11) {
            StdDraw.setPenRadius(.003);
            if (shape.equals("Star")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p1) { //p1 is -.2 x, p2 is +.2x Each y is +1.3
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y + 1.45, x - .35, y + 1.15);
                    StdDraw.line(x - .35, y + 1.15, x - .05, y + 1.35);
                    StdDraw.line(x - .05, y + 1.35, x - .35, y + 1.35);
                    StdDraw.line(x - .35, y + 1.35, x - .05, y + 1.15);
                    StdDraw.line(x - .05, y + 1.15, x - .2, y + 1.45);
                }
                else {

                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y + 1.45, x + .05, y + 1.15);
                    StdDraw.line(x + .05, y + 1.15, x + .35, y + 1.35);
                    StdDraw.line(x + .35, y + 1.35, x + .05, y + 1.35);
                    StdDraw.line(x + .05, y + 1.35, x + .35, y + 1.15);
                    StdDraw.line(x + .35, y + 1.15, x + .2, y + 1.45);
                }
            }
            else if (shape.equals("Triangle")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y + 1.45, x - .05, y + 1.15);
                    StdDraw.line(x - .05, y + 1.15, x - .35, y + 1.15);
                    StdDraw.line(x - .35, y + 1.15, x - .2, y + 1.45);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y + 1.45, x + .35, y + 1.15);
                    StdDraw.line(x + .35, y + 1.15, x + .05, y + 1.15);
                    StdDraw.line(x + .05, y + 1.15, x + .2, y + 1.45);
                }
            }
            else if (shape.equals("Circle")) {
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledCircle(x - .2, y + 1.3, .155);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledCircle(x + .2, y + 1.3, .155);
                }
            }
            else if (shape.equals("Square")) {
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledSquare(x - .2, y + 1.3, .158);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledSquare(x + .2, y + 1.3, .158);
                }
            }
            else if (shape.equals("Heart")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y + 1.2, x - .4, y + 1.4);
                    StdDraw.line(x - .4, y + 1.4, x - .3, y + 1.5);
                    StdDraw.line(x - .3, y + 1.5, x - .2, y + 1.4);
                    StdDraw.line(x - .2, y + 1.4, x - .1, y + 1.5);
                    StdDraw.line(x - .1, y + 1.5, x, y + 1.4);
                    StdDraw.line(x, y + 1.4, x - .2, y + 1.2);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y + 1.2, x, y + 1.4);
                    StdDraw.line(x, y + 1.4, x + .1, y + 1.5);
                    StdDraw.line(x + .1, y + 1.5, x + .2, y + 1.4);
                    StdDraw.line(x + .2, y + 1.4, x + .3, y + 1.5);
                    StdDraw.line(x + .3, y + 1.5, x + .4, y + 1.4);
                    StdDraw.line(x + .4, y + 1.4, x + .2, y + 1.2);
                }
            }
            else if (shape.equals("Arrow")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y + 1.15, x - .2, y + 1.45);
                    StdDraw.line(x - .2, y + 1.45, x - .3, y + 1.3);
                    StdDraw.line(x - .2, y + 1.45, x - .1, y + 1.3);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y + 1.15, x + .2, y + 1.45);
                    StdDraw.line(x + .2, y + 1.45, x + .1, y + 1.3);
                    StdDraw.line(x + .2, y + 1.45, x + .3, y + 1.3);
                }
            }
        }
        else if (pos == 11) {
            StdDraw.setPenRadius(.003);
            if (shape.equals("Star")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p1) { //p1 is -.2 x, p2 is +.2x Each y is +1.3
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y + .45, x - .35, y + .15);
                    StdDraw.line(x - .35, y + .15, x - .05, y + .35);
                    StdDraw.line(x - .05, y + .35, x - .35, y + .35);
                    StdDraw.line(x - .35, y + .35, x - .05, y + .15);
                    StdDraw.line(x - .05, y + .15, x - .2, y + .45);
                }
                else {

                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y + .45, x + .05, y + .15);
                    StdDraw.line(x + .05, y + .15, x + .35, y + .35);
                    StdDraw.line(x + .35, y + .35, x + .05, y + .35);
                    StdDraw.line(x + .05, y + .35, x + .35, y + .15);
                    StdDraw.line(x + .35, y + .15, x + .2, y + .45);
                }
            }
            else if (shape.equals("Triangle")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y + .45, x - .05, y + .15);
                    StdDraw.line(x - .05, y + .15, x - .35, y + .15);
                    StdDraw.line(x - .35, y + .15, x - .2, y + .45);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y + .45, x + .35, y + .15);
                    StdDraw.line(x + .35, y + .15, x + .05, y + .15);
                    StdDraw.line(x + .05, y + .15, x + .2, y + .45);
                }
            }
            else if (shape.equals("Circle")) {
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledCircle(x - .2, y + .3, .155);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledCircle(x + .2, y + .3, .155);
                }
            }
            else if (shape.equals("Square")) {
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledSquare(x - .2, y + .3, .158);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledSquare(x + .2, y + .3, .158);
                }
            }
            else if (shape.equals("Heart")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y + .2, x - .4, y + .4);
                    StdDraw.line(x - .4, y + .4, x - .3, y + .5);
                    StdDraw.line(x - .3, y + .5, x - .2, y + .4);
                    StdDraw.line(x - .2, y + .4, x - .1, y + .5);
                    StdDraw.line(x - .1, y + .5, x, y + .4);
                    StdDraw.line(x, y + .4, x - .2, y + .2);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y + .2, x, y + .4);
                    StdDraw.line(x, y + .4, x + .1, y + .5);
                    StdDraw.line(x + .1, y + .5, x + .2, y + .4);
                    StdDraw.line(x + .2, y + .4, x + .3, y + .5);
                    StdDraw.line(x + .3, y + .5, x + .4, y + .4);
                    StdDraw.line(x + .4, y + .4, x + .2, y + .2);
                }
            }
            else if (shape.equals("Arrow")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y + .15, x - .2, y + .45);
                    StdDraw.line(x - .2, y + .45, x - .3, y + .3);
                    StdDraw.line(x - .2, y + .45, x - .1, y + .3);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y + .15, x + .2, y + .45);
                    StdDraw.line(x + .2, y + .45, x + .1, y + .3);
                    StdDraw.line(x + .2, y + .45, x + .3, y + .3);
                }
            }
        }
        else if (pos > 11 && pos < 21) {
            //x + 1.3, p1 y +.2 p2 y - .2
            StdDraw.setPenRadius(.003);
            if (shape.equals("Star")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + 1.45, y + .2, x + 1.15, y + .35);
                    StdDraw.line(x + 1.15, y + .35, x + 1.35, y + .05);
                    StdDraw.line(x + 1.35, y + .05, x + 1.35, y + .35);
                    StdDraw.line(x + 1.35, y + .35, x + 1.15, y + .05);
                    StdDraw.line(x + 1.15, y + .05, x + 1.45, y + .2);
                }
                else {

                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + 1.45, y - .2, x + 1.15, y - .05);
                    StdDraw.line(x + 1.15, y - .05, x + 1.35, y - .35);
                    StdDraw.line(x + 1.35, y - .35, x + 1.35, y - .05);
                    StdDraw.line(x + 1.35, y - .05, x + 1.15, y - .35);
                    StdDraw.line(x + 1.15, y - .35, x + 1.45, y - .2);
                }
            }
            else if (shape.equals("Triangle")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + 1.45, y + .2, x + 1.15, y + .05);
                    StdDraw.line(x + 1.15, y + .05, x + 1.15, y + .35);
                    StdDraw.line(x + 1.15, y + .35, x + 1.45, y + .2);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + 1.45, y - .2, x + 1.15, y - .35);
                    StdDraw.line(x + 1.15, y - .35, x + 1.15, y - .05);
                    StdDraw.line(x + 1.15, y - .05, x + 1.45, y - .2);
                }
            }
            else if (shape.equals("Circle")) {
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledCircle(x + 1.3, y + .2, .155);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledCircle(x + 1.3, y - .2, .155);
                }
            }
            else if (shape.equals("Square")) {
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledSquare(x + 1.3, y + .2, .158);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledSquare(x + 1.3, y - .2, .158);
                }
            }
            else if (shape.equals("Heart")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + 1.2, y + .2, x + 1.4, y + .4);
                    StdDraw.line(x + 1.4, y + .4, x + 1.5, y + .3);
                    StdDraw.line(x + 1.5, y + .3, x + 1.4, y + .2);
                    StdDraw.line(x + 1.4, y + .2, x + 1.5, y + .1);
                    StdDraw.line(x + 1.5, y + .1, x + 1.4, y);
                    StdDraw.line(x + 1.4, y, x + 1.2, y + .2);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + 1.2, y - .2, x + 1.4, y);
                    StdDraw.line(x + 1.4, y, x + 1.5, y - .1);
                    StdDraw.line(x + 1.5, y - .1, x + 1.4, y - .2);
                    StdDraw.line(x + 1.4, y - .2, x + 1.5, y - .3);
                    StdDraw.line(x + 1.5, y - .3, x + 1.4, y - .4);
                    StdDraw.line(x + 1.4, y - .4, x + 1.2, y - .2);
                }
            }
            else if (shape.equals("Arrow")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + 1.15, y + .2, x + 1.45, y + .2);
                    StdDraw.line(x + 1.45, y + .2, x + 1.3, y + .3);
                    StdDraw.line(x + 1.45, y + .2, x + 1.3, y + .1);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + 1.15, y - .2, x + 1.45, y - .2);
                    StdDraw.line(x + 1.45, y - .2, x + 1.3, y - .1);
                    StdDraw.line(x + 1.45, y - .2, x + 1.3, y - .3);
                }
            }
        }
        else if (pos == 21) {
            StdDraw.setPenRadius(.003);
            if (shape.equals("Star")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p2) { //p1 is -.2 x, p2 is +.2x Each y is +1.3
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y - .45, x - .35, y - .15);
                    StdDraw.line(x - .35, y - .15, x - .05, y - .35);
                    StdDraw.line(x - .05, y - .35, x - .35, y - .35);
                    StdDraw.line(x - .35, y - .35, x - .05, y - .15);
                    StdDraw.line(x - .05, y - .15, x - .2, y - .45);
                }
                else {

                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y - .45, x + .05, y - .15);
                    StdDraw.line(x + .05, y - .15, x + .35, y - .35);
                    StdDraw.line(x + .35, y - .35, x + .05, y - .35);
                    StdDraw.line(x + .05, y - .35, x + .35, y - .15);
                    StdDraw.line(x + .35, y - .15, x + .2, y - .45);
                }
            }
            else if (shape.equals("Triangle")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y - .45, x - .05, y - .15);
                    StdDraw.line(x - .05, y - .15, x - .35, y - .15);
                    StdDraw.line(x - .35, y - .15, x - .2, y - .45);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y - .45, x + .35, y - .15);
                    StdDraw.line(x + .35, y - .15, x + .05, y - .15);
                    StdDraw.line(x + .05, y - .15, x + .2, y - .45);
                }
            }
            else if (shape.equals("Circle")) {
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledCircle(x - .2, y - .3, .155);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledCircle(x + .2, y - .3, .155);
                }
            }
            else if (shape.equals("Square")) {
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledSquare(x - .2, y - .3, .158);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledSquare(x + .2, y - .3, .158);
                }
            }
            else if (shape.equals("Heart")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y - .2, x - .4, y - .4);
                    StdDraw.line(x - .4, y - .4, x - .3, y - .5);
                    StdDraw.line(x - .3, y - .5, x - .2, y - .4);
                    StdDraw.line(x - .2, y - .4, x - .1, y - .5);
                    StdDraw.line(x - .1, y - .5, x, y - .4);
                    StdDraw.line(x, y - .4, x - .2, y - .2);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y - .2, x, y - .4);
                    StdDraw.line(x, y - .4, x + .1, y - .5);
                    StdDraw.line(x + .1, y - .5, x + .2, y - .4);
                    StdDraw.line(x + .2, y - .4, x + .3, y - .5);
                    StdDraw.line(x + .3, y - .5, x + .4, y - .4);
                    StdDraw.line(x + .4, y - .4, x + .2, y - .2);
                }
            }
            else if (shape.equals("Arrow")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y - .15, x - .2, y - .45);
                    StdDraw.line(x - .2, y - .45, x - .3, y - .3);
                    StdDraw.line(x - .2, y - .45, x - .1, y - .3);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y - .15, x + .2, y - .45);
                    StdDraw.line(x + .2, y - .45, x + .1, y - .3);
                    StdDraw.line(x + .2, y - .45, x + .3, y - .3);
                }
            }
        }
        else if (pos > 21 && pos < 31) {
            //Same as 1-11 but flipped upside down
            StdDraw.setPenRadius(.003);
            if (shape.equals("Star")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p2) { //p1 is -.2 x, p2 is +.2x Each y is +1.3
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y - 1.45, x - .35, y - 1.15);
                    StdDraw.line(x - .35, y - 1.15, x - .05, y - 1.35);
                    StdDraw.line(x - .05, y - 1.35, x - .35, y - 1.35);
                    StdDraw.line(x - .35, y - 1.35, x - .05, y - 1.15);
                    StdDraw.line(x - .05, y - 1.15, x - .2, y - 1.45);
                }
                else {

                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y - 1.45, x + .05, y - 1.15);
                    StdDraw.line(x + .05, y - 1.15, x + .35, y - 1.35);
                    StdDraw.line(x + .35, y - 1.35, x + .05, y - 1.35);
                    StdDraw.line(x + .05, y - 1.35, x + .35, y - 1.15);
                    StdDraw.line(x + .35, y - 1.15, x + .2, y - 1.45);
                }
            }
            else if (shape.equals("Triangle")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y - 1.45, x - .05, y - 1.15);
                    StdDraw.line(x - .05, y - 1.15, x - .35, y - 1.15);
                    StdDraw.line(x - .35, y - 1.15, x - .2, y - 1.45);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y - 1.45, x + .35, y - 1.15);
                    StdDraw.line(x + .35, y - 1.15, x + .05, y - 1.15);
                    StdDraw.line(x + .05, y - 1.15, x + .2, y - 1.45);
                }
            }
            else if (shape.equals("Circle")) {
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledCircle(x - .2, y - 1.3, .155);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledCircle(x + .2, y - 1.3, .155);
                }
            }
            else if (shape.equals("Square")) {
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledSquare(x - .2, y - 1.3, .158);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledSquare(x + .2, y - 1.3, .158);
                }
            }
            else if (shape.equals("Heart")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y - 1.2, x - .4, y - 1.4);
                    StdDraw.line(x - .4, y - 1.4, x - .3, y - 1.5);
                    StdDraw.line(x - .3, y - 1.5, x - .2, y - 1.4);
                    StdDraw.line(x - .2, y - 1.4, x - .1, y - 1.5);
                    StdDraw.line(x - .1, y - 1.5, x, y - 1.4);
                    StdDraw.line(x, y - 1.4, x - .2, y - 1.2);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y - 1.2, x, y - 1.4);
                    StdDraw.line(x, y - 1.4, x + .1, y - 1.5);
                    StdDraw.line(x + .1, y - 1.5, x + .2, y - 1.4);
                    StdDraw.line(x + .2, y - 1.4, x + .3, y - 1.5);
                    StdDraw.line(x + .3, y - 1.5, x + .4, y - 1.4);
                    StdDraw.line(x + .4, y - 1.4, x + .2, y - 1.2);
                }
            }
            else if (shape.equals("Arrow")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y - 1.15, x - .2, y - 1.45);
                    StdDraw.line(x - .2, y - 1.45, x - .3, y - 1.3);
                    StdDraw.line(x - .2, y - 1.45, x - .1, y - 1.3);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y - 1.15, x + .2, y - 1.45);
                    StdDraw.line(x + .2, y - 1.45, x + .1, y - 1.3);
                    StdDraw.line(x + .2, y - 1.45, x + .3, y - 1.3);
                }
            }


        }
        else if (pos == 31) {
            StdDraw.setPenRadius(.003);
            if (shape.equals("Star")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p2) { //p1 is -.2 x, p2 is +.2x Each y is +1.3
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y - .45, x - .35, y - .15);
                    StdDraw.line(x - .35, y - .15, x - .05, y - .35);
                    StdDraw.line(x - .05, y - .35, x - .35, y - .35);
                    StdDraw.line(x - .35, y - .35, x - .05, y - .15);
                    StdDraw.line(x - .05, y - .15, x - .2, y - .45);
                }
                else {

                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y - .45, x + .05, y - .15);
                    StdDraw.line(x + .05, y - .15, x + .35, y - .35);
                    StdDraw.line(x + .35, y - .35, x + .05, y - .35);
                    StdDraw.line(x + .05, y - .35, x + .35, y - .15);
                    StdDraw.line(x + .35, y - .15, x + .2, y - .45);
                }
            }
            else if (shape.equals("Triangle")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y - .45, x - .05, y - .15);
                    StdDraw.line(x - .05, y - .15, x - .35, y - .15);
                    StdDraw.line(x - .35, y - .15, x - .2, y - .45);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y - .45, x + .35, y - .15);
                    StdDraw.line(x + .35, y - .15, x + .05, y - .15);
                    StdDraw.line(x + .05, y - .15, x + .2, y - .45);
                }
            }
            else if (shape.equals("Circle")) {
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledCircle(x - .2, y - .3, .155);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledCircle(x + .2, y - .3, .155);
                }
            }
            else if (shape.equals("Square")) {
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledSquare(x - .2, y - .3, .158);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledSquare(x + .2, y - .3, .158);
                }
            }
            else if (shape.equals("Heart")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y - .2, x - .4, y - .4);
                    StdDraw.line(x - .4, y - .4, x - .3, y - .5);
                    StdDraw.line(x - .3, y - .5, x - .2, y - .4);
                    StdDraw.line(x - .2, y - .4, x - .1, y - .5);
                    StdDraw.line(x - .1, y - .5, x, y - .4);
                    StdDraw.line(x, y - .4, x - .2, y - .2);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y - .2, x, y - .4);
                    StdDraw.line(x, y - .4, x + .1, y - .5);
                    StdDraw.line(x + .1, y - .5, x + .2, y - .4);
                    StdDraw.line(x + .2, y - .4, x + .3, y - .5);
                    StdDraw.line(x + .3, y - .5, x + .4, y - .4);
                    StdDraw.line(x + .4, y - .4, x + .2, y - .2);
                }
            }
            else if (shape.equals("Arrow")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - .2, y - .15, x - .2, y - .45);
                    StdDraw.line(x - .2, y - .45, x - .3, y - .3);
                    StdDraw.line(x - .2, y - .45, x - .1, y - .3);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x + .2, y - .15, x + .2, y - .45);
                    StdDraw.line(x + .2, y - .45, x + .1, y - .3);
                    StdDraw.line(x + .2, y - .45, x + .3, y - .3);
                }
            }
        }
        else { //31-40
            //same as 11-21 but flipped
            StdDraw.setPenRadius(.003);
            if (shape.equals("Star")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - 1.45, y + .2, x - 1.15, y + .35);
                    StdDraw.line(x - 1.15, y + .35, x - 1.35, y + .05);
                    StdDraw.line(x - 1.35, y + .05, x - 1.35, y + .35);
                    StdDraw.line(x - 1.35, y + .35, x - 1.15, y + .05);
                    StdDraw.line(x - 1.15, y + .05, x - 1.45, y + .2);
                }
                else {

                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - 1.45, y - .2, x - 1.15, y - .05);
                    StdDraw.line(x - 1.15, y - .05, x - 1.35, y - .35);
                    StdDraw.line(x - 1.35, y - .35, x - 1.35, y - .05);
                    StdDraw.line(x - 1.35, y - .05, x - 1.15, y - .35);
                    StdDraw.line(x - 1.15, y - .35, x - 1.45, y - .2);
                }
            }
            else if (shape.equals("Triangle")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - 1.45, y + .2, x - 1.15, y + .05);
                    StdDraw.line(x - 1.15, y + .05, x - 1.15, y + .35);
                    StdDraw.line(x - 1.15, y + .35, x - 1.45, y + .2);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - 1.45, y - .2, x - 1.15, y - .35);
                    StdDraw.line(x - 1.15, y - .35, x - 1.15, y - .05);
                    StdDraw.line(x - 1.15, y - .05, x - 1.45, y - .2);
                }
            }
            else if (shape.equals("Circle")) {
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledCircle(x - 1.3, y + .2, .155);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledCircle(x - 1.3, y - .2, .155);
                }
            }
            else if (shape.equals("Square")) {
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledSquare(x - 1.3, y + .2, .158);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.filledSquare(x - 1.3, y - .2, .158);
                }
            }
            else if (shape.equals("Heart")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - 1.2, y + .2, x - 1.4, y + .4);
                    StdDraw.line(x - 1.4, y + .4, x - 1.5, y + .3);
                    StdDraw.line(x - 1.5, y + .3, x - 1.4, y + .2);
                    StdDraw.line(x - 1.4, y + .2, x - 1.5, y + .1);
                    StdDraw.line(x - 1.5, y + .1, x - 1.4, y);
                    StdDraw.line(x - 1.4, y, x - 1.2, y + .2);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - 1.2, y - .2, x - 1.4, y);
                    StdDraw.line(x - 1.4, y, x - 1.5, y - .1);
                    StdDraw.line(x - 1.5, y - .1, x - 1.4, y - .2);
                    StdDraw.line(x - 1.4, y - .2, x - 1.5, y - .3);
                    StdDraw.line(x - 1.5, y - .3, x - 1.4, y - .4);
                    StdDraw.line(x - 1.4, y - .4, x - 1.2, y - .2);
                }
            }
            else if (shape.equals("Arrow")) {
                StdDraw.setPenRadius(.004);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - 1.15, y + .2, x - 1.45, y + .2);
                    StdDraw.line(x - 1.45, y + .2, x - 1.3, y + .3);
                    StdDraw.line(x - 1.45, y + .2, x - 1.3, y + .1);
                }
                else {
                    StdDraw.setPenColor(215, 232, 222);
                    StdDraw.line(x - 1.15, y - .2, x - 1.45, y - .2);
                    StdDraw.line(x - 1.45, y - .2, x - 1.3, y - .1);
                    StdDraw.line(x - 1.45, y - .2, x - 1.3, y - .3);
                }
            }
        }

    }

    public static void drawPlayer(Player currPlayer, String shape, int pos, double x, double y, Player p1, Player p2) {
        if (pos == 1) {
            StdDraw.setPenRadius(.002);
            if (shape.equals("Star")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p1) { //p1 is -.2 x, p2 is +.2x Each y is +1.3
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x - .2, y + .45, x - .35, y + .15);
                    StdDraw.line(x - .35, y + .15, x - .05, y + .35);
                    StdDraw.line(x - .05, y + .35, x - .35, y + .35);
                    StdDraw.line(x - .35, y + .35, x - .05, y + .15);
                    StdDraw.line(x - .05, y + .15, x - .2, y + .45);
                }
                else {

                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x + .2, y + .45, x + .05, y + .15);
                    StdDraw.line(x + .05, y + .15, x + .35, y + .35);
                    StdDraw.line(x + .35, y + .35, x + .05, y + .35);
                    StdDraw.line(x + .05, y + .35, x + .35, y + .15);
                    StdDraw.line(x + .35, y + .15, x + .2, y + .45);
                }
            }
            else if (shape.equals("Triangle")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x - .2, y + .45, x - .05, y + .15);
                    StdDraw.line(x - .05, y + .15, x - .35, y + .15);
                    StdDraw.line(x - .35, y + .15, x - .2, y + .45);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x + .2, y + .45, x + .35, y + .15);
                    StdDraw.line(x + .35, y + .15, x + .05, y + .15);
                    StdDraw.line(x + .05, y + .15, x + .2, y + .45);
                }
            }
            else if (shape.equals("Circle")) {
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledCircle(x - .2, y + .3, .15);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledCircle(x + .2, y + .3, .15);
                }
            }
            else if (shape.equals("Square")) {
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledSquare(x - .2, y + .3, .15);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(x + .2, y + .3, .15);
                }
            }
            else if (shape.equals("Heart")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x - .2, y + .2, x - .4, y + .4);
                    StdDraw.line(x - .4, y + .4, x - .3, y + .5);
                    StdDraw.line(x - .3, y + .5, x - .2, y + .4);
                    StdDraw.line(x - .2, y + .4, x - .1, y + .5);
                    StdDraw.line(x - .1, y + .5, x, y + .4);
                    StdDraw.line(x, y + .4, x - .2, y + .2);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x + .2, y + .2, x, y + .4);
                    StdDraw.line(x, y + .4, x + .1, y + .5);
                    StdDraw.line(x + .1, y + .5, x + .2, y + .4);
                    StdDraw.line(x + .2, y + .4, x + .3, y + .5);
                    StdDraw.line(x + .3, y + .5, x + .4, y + .4);
                    StdDraw.line(x + .4, y + .4, x + .2, y + .2);
                }
            }
            else if (shape.equals("Arrow")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x - .2, y + .15, x - .2, y + .45);
                    StdDraw.line(x - .2, y + .45, x - .3, y + .3);
                    StdDraw.line(x - .2, y + .45, x - .1, y + .3);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x + .2, y + .15, x + .2, y + .45);
                    StdDraw.line(x + .2, y + .45, x + .1, y + .3);
                    StdDraw.line(x + .2, y + .45, x + .3, y + .3);
                }
            }
        }
        else if (pos > 1 && pos < 11) {
            StdDraw.setPenRadius(.002);
            if (shape.equals("Star")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p1) { //p1 is -.2 x, p2 is +.2x Each y is +1.3
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x - .2, y + 1.45, x - .35, y + 1.15);
                    StdDraw.line(x - .35, y + 1.15, x - .05, y + 1.35);
                    StdDraw.line(x - .05, y + 1.35, x - .35, y + 1.35);
                    StdDraw.line(x - .35, y + 1.35, x - .05, y + 1.15);
                    StdDraw.line(x - .05, y + 1.15, x - .2, y + 1.45);
                }
                else {

                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x + .2, y + 1.45, x + .05, y + 1.15);
                    StdDraw.line(x + .05, y + 1.15, x + .35, y + 1.35);
                    StdDraw.line(x + .35, y + 1.35, x + .05, y + 1.35);
                    StdDraw.line(x + .05, y + 1.35, x + .35, y + 1.15);
                    StdDraw.line(x + .35, y + 1.15, x + .2, y + 1.45);
                }
            }
            else if (shape.equals("Triangle")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x - .2, y + 1.45, x - .05, y + 1.15);
                    StdDraw.line(x - .05, y + 1.15, x - .35, y + 1.15);
                    StdDraw.line(x - .35, y + 1.15, x - .2, y + 1.45);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x + .2, y + 1.45, x + .35, y + 1.15);
                    StdDraw.line(x + .35, y + 1.15, x + .05, y + 1.15);
                    StdDraw.line(x + .05, y + 1.15, x + .2, y + 1.45);
                }
            }
            else if (shape.equals("Circle")) {
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledCircle(x - .2, y + 1.3, .15);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledCircle(x + .2, y + 1.3, .15);
                }
            }
            else if (shape.equals("Square")) {
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledSquare(x - .2, y + 1.3, .15);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(x + .2, y + 1.3, .15);
                }
            }
            else if (shape.equals("Heart")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x - .2, y + 1.2, x - .4, y + 1.4);
                    StdDraw.line(x - .4, y + 1.4, x - .3, y + 1.5);
                    StdDraw.line(x - .3, y + 1.5, x - .2, y + 1.4);
                    StdDraw.line(x - .2, y + 1.4, x - .1, y + 1.5);
                    StdDraw.line(x - .1, y + 1.5, x, y + 1.4);
                    StdDraw.line(x, y + 1.4, x - .2, y + 1.2);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x + .2, y + 1.2, x, y + 1.4);
                    StdDraw.line(x, y + 1.4, x + .1, y + 1.5);
                    StdDraw.line(x + .1, y + 1.5, x + .2, y + 1.4);
                    StdDraw.line(x + .2, y + 1.4, x + .3, y + 1.5);
                    StdDraw.line(x + .3, y + 1.5, x + .4, y + 1.4);
                    StdDraw.line(x + .4, y + 1.4, x + .2, y + 1.2);
                }
            }
            else if (shape.equals("Arrow")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x - .2, y + 1.15, x - .2, y + 1.45);
                    StdDraw.line(x - .2, y + 1.45, x - .3, y + 1.3);
                    StdDraw.line(x - .2, y + 1.45, x - .1, y + 1.3);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x + .2, y + 1.15, x + .2, y + 1.45);
                    StdDraw.line(x + .2, y + 1.45, x + .1, y + 1.3);
                    StdDraw.line(x + .2, y + 1.45, x + .3, y + 1.3);
                }
            }
        }
        else if (pos == 11) {
            StdDraw.setPenRadius(.002);
            if (shape.equals("Star")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p1) { //p1 is -.2 x, p2 is +.2x Each y is +1.3
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x - .2, y + .45, x - .35, y + .15);
                    StdDraw.line(x - .35, y + .15, x - .05, y + .35);
                    StdDraw.line(x - .05, y + .35, x - .35, y + .35);
                    StdDraw.line(x - .35, y + .35, x - .05, y + .15);
                    StdDraw.line(x - .05, y + .15, x - .2, y + .45);
                }
                else {

                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x + .2, y + .45, x + .05, y + .15);
                    StdDraw.line(x + .05, y + .15, x + .35, y + .35);
                    StdDraw.line(x + .35, y + .35, x + .05, y + .35);
                    StdDraw.line(x + .05, y + .35, x + .35, y + .15);
                    StdDraw.line(x + .35, y + .15, x + .2, y + .45);
                }
            }
            else if (shape.equals("Triangle")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x - .2, y + .45, x - .05, y + .15);
                    StdDraw.line(x - .05, y + .15, x - .35, y + .15);
                    StdDraw.line(x - .35, y + .15, x - .2, y + .45);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x + .2, y + .45, x + .35, y + .15);
                    StdDraw.line(x + .35, y + .15, x + .05, y + .15);
                    StdDraw.line(x + .05, y + .15, x + .2, y + .45);
                }
            }
            else if (shape.equals("Circle")) {
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledCircle(x - .2, y + .3, .15);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledCircle(x + .2, y + .3, .15);
                }
            }
            else if (shape.equals("Square")) {
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledSquare(x - .2, y + .3, .15);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(x + .2, y + .3, .15);
                }
            }
            else if (shape.equals("Heart")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x - .2, y + .2, x - .4, y + .4);
                    StdDraw.line(x - .4, y + .4, x - .3, y + .5);
                    StdDraw.line(x - .3, y + .5, x - .2, y + .4);
                    StdDraw.line(x - .2, y + .4, x - .1, y + .5);
                    StdDraw.line(x - .1, y + .5, x, y + .4);
                    StdDraw.line(x, y + .4, x - .2, y + .2);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x + .2, y + .2, x, y + .4);
                    StdDraw.line(x, y + .4, x + .1, y + .5);
                    StdDraw.line(x + .1, y + .5, x + .2, y + .4);
                    StdDraw.line(x + .2, y + .4, x + .3, y + .5);
                    StdDraw.line(x + .3, y + .5, x + .4, y + .4);
                    StdDraw.line(x + .4, y + .4, x + .2, y + .2);
                }
            }
            else if (shape.equals("Arrow")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x - .2, y + .15, x - .2, y + .45);
                    StdDraw.line(x - .2, y + .45, x - .3, y + .3);
                    StdDraw.line(x - .2, y + .45, x - .1, y + .3);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x + .2, y + .15, x + .2, y + .45);
                    StdDraw.line(x + .2, y + .45, x + .1, y + .3);
                    StdDraw.line(x + .2, y + .45, x + .3, y + .3);
                }
            }
        }
        else if (pos > 11 && pos < 21) {
        //x + 1.3, p1 y +.2 p2 y - .2
            StdDraw.setPenRadius(.002);
            if (shape.equals("Star")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x + 1.45, y + .2, x + 1.15, y + .35);
                    StdDraw.line(x + 1.15, y + .35, x + 1.35, y + .05);
                    StdDraw.line(x + 1.35, y + .05, x + 1.35, y + .35);
                    StdDraw.line(x + 1.35, y + .35, x + 1.15, y + .05);
                    StdDraw.line(x + 1.15, y + .05, x + 1.45, y + .2);
                }
                else {

                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x + 1.45, y - .2, x + 1.15, y - .05);
                    StdDraw.line(x + 1.15, y - .05, x + 1.35, y - .35);
                    StdDraw.line(x + 1.35, y - .35, x + 1.35, y - .05);
                    StdDraw.line(x + 1.35, y - .05, x + 1.15, y - .35);
                    StdDraw.line(x + 1.15, y - .35, x + 1.45, y - .2);
                }
            }
            else if (shape.equals("Triangle")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x + 1.45, y + .2, x + 1.15, y + .05);
                    StdDraw.line(x + 1.15, y + .05, x + 1.15, y + .35);
                    StdDraw.line(x + 1.15, y + .35, x + 1.45, y + .2);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x + 1.45, y - .2, x + 1.15, y - .35);
                    StdDraw.line(x + 1.15, y - .35, x + 1.15, y - .05);
                    StdDraw.line(x + 1.15, y - .05, x + 1.45, y - .2);
                }
            }
            else if (shape.equals("Circle")) {
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledCircle(x + 1.3, y + .2, .15);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledCircle(x + 1.3, y - .2, .15);
                }
            }
            else if (shape.equals("Square")) {
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledSquare(x + 1.3, y + .2, .15);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(x + 1.3, y - .2, .15);
                }
            }
            else if (shape.equals("Heart")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x + 1.2, y + .2, x + 1.4, y + .4);
                    StdDraw.line(x + 1.4, y + .4, x + 1.5, y + .3);
                    StdDraw.line(x + 1.5, y + .3, x + 1.4, y + .2);
                    StdDraw.line(x + 1.4, y + .2, x + 1.5, y + .1);
                    StdDraw.line(x + 1.5, y + .1, x + 1.4, y);
                    StdDraw.line(x + 1.4, y, x + 1.2, y + .2);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x + 1.2, y - .2, x + 1.4, y);
                    StdDraw.line(x + 1.4, y, x + 1.5, y - .1);
                    StdDraw.line(x + 1.5, y - .1, x + 1.4, y - .2);
                    StdDraw.line(x + 1.4, y - .2, x + 1.5, y - .3);
                    StdDraw.line(x + 1.5, y - .3, x + 1.4, y - .4);
                    StdDraw.line(x + 1.4, y - .4, x + 1.2, y - .2);
                }
            }
            else if (shape.equals("Arrow")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p1) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x + 1.15, y + .2, x + 1.45, y + .2);
                    StdDraw.line(x + 1.45, y + .2, x + 1.3, y + .3);
                    StdDraw.line(x + 1.45, y + .2, x + 1.3, y + .1);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x + 1.15, y - .2, x + 1.45, y - .2);
                    StdDraw.line(x + 1.45, y - .2, x + 1.3, y - .1);
                    StdDraw.line(x + 1.45, y - .2, x + 1.3, y - .3);
                }
            }
        }
        else if (pos == 21) {
            StdDraw.setPenRadius(.002);
            if (shape.equals("Star")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p2) { //p1 is -.2 x, p2 is +.2x Each y is +1.3
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x - .2, y - .45, x - .35, y - .15);
                    StdDraw.line(x - .35, y - .15, x - .05, y - .35);
                    StdDraw.line(x - .05, y - .35, x - .35, y - .35);
                    StdDraw.line(x - .35, y - .35, x - .05, y - .15);
                    StdDraw.line(x - .05, y - .15, x - .2, y - .45);
                }
                else {

                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x + .2, y - .45, x + .05, y - .15);
                    StdDraw.line(x + .05, y - .15, x + .35, y - .35);
                    StdDraw.line(x + .35, y - .35, x + .05, y - .35);
                    StdDraw.line(x + .05, y - .35, x + .35, y - .15);
                    StdDraw.line(x + .35, y - .15, x + .2, y - .45);
                }
            }
            else if (shape.equals("Triangle")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x - .2, y - .45, x - .05, y - .15);
                    StdDraw.line(x - .05, y - .15, x - .35, y - .15);
                    StdDraw.line(x - .35, y - .15, x - .2, y - .45);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x + .2, y - .45, x + .35, y - .15);
                    StdDraw.line(x + .35, y - .15, x + .05, y - .15);
                    StdDraw.line(x + .05, y - .15, x + .2, y - .45);
                }
            }
            else if (shape.equals("Circle")) {
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledCircle(x - .2, y - .3, .15);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledCircle(x + .2, y - .3, .15);
                }
            }
            else if (shape.equals("Square")) {
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(x - .2, y - .3, .15);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledSquare(x + .2, y - .3, .15);
                }
            }
            else if (shape.equals("Heart")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x - .2, y - .2, x - .4, y - .4);
                    StdDraw.line(x - .4, y - .4, x - .3, y - .5);
                    StdDraw.line(x - .3, y - .5, x - .2, y - .4);
                    StdDraw.line(x - .2, y - .4, x - .1, y - .5);
                    StdDraw.line(x - .1, y - .5, x, y - .4);
                    StdDraw.line(x, y - .4, x - .2, y - .2);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x + .2, y - .2, x, y - .4);
                    StdDraw.line(x, y - .4, x + .1, y - .5);
                    StdDraw.line(x + .1, y - .5, x + .2, y - .4);
                    StdDraw.line(x + .2, y - .4, x + .3, y - .5);
                    StdDraw.line(x + .3, y - .5, x + .4, y - .4);
                    StdDraw.line(x + .4, y - .4, x + .2, y - .2);
                }
            }
            else if (shape.equals("Arrow")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x - .2, y - .15, x - .2, y - .45);
                    StdDraw.line(x - .2, y - .45, x - .3, y - .3);
                    StdDraw.line(x - .2, y - .45, x - .1, y - .3);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x + .2, y - .15, x + .2, y - .45);
                    StdDraw.line(x + .2, y - .45, x + .1, y - .3);
                    StdDraw.line(x + .2, y - .45, x + .3, y - .3);
                }
            }
        }
        else if (pos > 21 && pos < 31) {
            //Same as 1-11 but flipped upside down
            StdDraw.setPenRadius(.002);
            if (shape.equals("Star")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p2) { //p1 is -.2 x, p2 is +.2x Each y is +1.3
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x - .2, y - 1.45, x - .35, y - 1.15);
                    StdDraw.line(x - .35, y - 1.15, x - .05, y - 1.35);
                    StdDraw.line(x - .05, y - 1.35, x - .35, y - 1.35);
                    StdDraw.line(x - .35, y - 1.35, x - .05, y - 1.15);
                    StdDraw.line(x - .05, y - 1.15, x - .2, y - 1.45);
                }
                else {

                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x + .2, y - 1.45, x + .05, y - 1.15);
                    StdDraw.line(x + .05, y - 1.15, x + .35, y - 1.35);
                    StdDraw.line(x + .35, y - 1.35, x + .05, y - 1.35);
                    StdDraw.line(x + .05, y - 1.35, x + .35, y - 1.15);
                    StdDraw.line(x + .35, y - 1.15, x + .2, y - 1.45);
                }
            }
            else if (shape.equals("Triangle")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x - .2, y - 1.45, x - .05, y - 1.15);
                    StdDraw.line(x - .05, y - 1.15, x - .35, y - 1.15);
                    StdDraw.line(x - .35, y - 1.15, x - .2, y - 1.45);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x + .2, y - 1.45, x + .35, y - 1.15);
                    StdDraw.line(x + .35, y - 1.15, x + .05, y - 1.15);
                    StdDraw.line(x + .05, y - 1.15, x + .2, y - 1.45);
                }
            }
            else if (shape.equals("Circle")) {
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledCircle(x - .2, y - 1.3, .15);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledCircle(x + .2, y - 1.3, .15);
                }
            }
            else if (shape.equals("Square")) {
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(x - .2, y - 1.3, .15);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledSquare(x + .2, y - 1.3, .15);
                }
            }
            else if (shape.equals("Heart")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x - .2, y - 1.2, x - .4, y - 1.4);
                    StdDraw.line(x - .4, y - 1.4, x - .3, y - 1.5);
                    StdDraw.line(x - .3, y - 1.5, x - .2, y - 1.4);
                    StdDraw.line(x - .2, y - 1.4, x - .1, y - 1.5);
                    StdDraw.line(x - .1, y - 1.5, x, y - 1.4);
                    StdDraw.line(x, y - 1.4, x - .2, y - 1.2);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x + .2, y - 1.2, x, y - 1.4);
                    StdDraw.line(x, y - 1.4, x + .1, y - 1.5);
                    StdDraw.line(x + .1, y - 1.5, x + .2, y - 1.4);
                    StdDraw.line(x + .2, y - 1.4, x + .3, y - 1.5);
                    StdDraw.line(x + .3, y - 1.5, x + .4, y - 1.4);
                    StdDraw.line(x + .4, y - 1.4, x + .2, y - 1.2);
                }
            }
            else if (shape.equals("Arrow")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x - .2, y - 1.15, x - .2, y - 1.45);
                    StdDraw.line(x - .2, y - 1.45, x - .3, y - 1.3);
                    StdDraw.line(x - .2, y - 1.45, x - .1, y - 1.3);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x + .2, y - 1.15, x + .2, y - 1.45);
                    StdDraw.line(x + .2, y - 1.45, x + .1, y - 1.3);
                    StdDraw.line(x + .2, y - 1.45, x + .3, y - 1.3);
                }
            }


        }
        else if (pos == 31) {
            StdDraw.setPenRadius(.002);
            if (shape.equals("Star")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p2) { //p1 is -.2 x, p2 is +.2x Each y is +1.3
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x - .2, y - .45, x - .35, y - .15);
                    StdDraw.line(x - .35, y - .15, x - .05, y - .35);
                    StdDraw.line(x - .05, y - .35, x - .35, y - .35);
                    StdDraw.line(x - .35, y - .35, x - .05, y - .15);
                    StdDraw.line(x - .05, y - .15, x - .2, y - .45);
                }
                else {

                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x + .2, y - .45, x + .05, y - .15);
                    StdDraw.line(x + .05, y - .15, x + .35, y - .35);
                    StdDraw.line(x + .35, y - .35, x + .05, y - .35);
                    StdDraw.line(x + .05, y - .35, x + .35, y - .15);
                    StdDraw.line(x + .35, y - .15, x + .2, y - .45);
                }
            }
            else if (shape.equals("Triangle")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x - .2, y - .45, x - .05, y - .15);
                    StdDraw.line(x - .05, y - .15, x - .35, y - .15);
                    StdDraw.line(x - .35, y - .15, x - .2, y - .45);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x + .2, y - .45, x + .35, y - .15);
                    StdDraw.line(x + .35, y - .15, x + .05, y - .15);
                    StdDraw.line(x + .05, y - .15, x + .2, y - .45);
                }
            }
            else if (shape.equals("Circle")) {
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledCircle(x - .2, y - .3, .15);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledCircle(x + .2, y - .3, .15);
                }
            }
            else if (shape.equals("Square")) {
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(x - .2, y - .3, .15);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledSquare(x + .2, y - .3, .15);
                }
            }
            else if (shape.equals("Heart")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x - .2, y - .2, x - .4, y - .4);
                    StdDraw.line(x - .4, y - .4, x - .3, y - .5);
                    StdDraw.line(x - .3, y - .5, x - .2, y - .4);
                    StdDraw.line(x - .2, y - .4, x - .1, y - .5);
                    StdDraw.line(x - .1, y - .5, x, y - .4);
                    StdDraw.line(x, y - .4, x - .2, y - .2);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x + .2, y - .2, x, y - .4);
                    StdDraw.line(x, y - .4, x + .1, y - .5);
                    StdDraw.line(x + .1, y - .5, x + .2, y - .4);
                    StdDraw.line(x + .2, y - .4, x + .3, y - .5);
                    StdDraw.line(x + .3, y - .5, x + .4, y - .4);
                    StdDraw.line(x + .4, y - .4, x + .2, y - .2);
                }
            }
            else if (shape.equals("Arrow")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x - .2, y - .15, x - .2, y - .45);
                    StdDraw.line(x - .2, y - .45, x - .3, y - .3);
                    StdDraw.line(x - .2, y - .45, x - .1, y - .3);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x + .2, y - .15, x + .2, y - .45);
                    StdDraw.line(x + .2, y - .45, x + .1, y - .3);
                    StdDraw.line(x + .2, y - .45, x + .3, y - .3);
                }
            }
        }
        else { //31-40
            //same as 11-21 but flipped
            StdDraw.setPenRadius(.002);
            if (shape.equals("Star")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x - 1.45, y + .2, x - 1.15, y + .35);
                    StdDraw.line(x - 1.15, y + .35, x - 1.35, y + .05);
                    StdDraw.line(x - 1.35, y + .05, x - 1.35, y + .35);
                    StdDraw.line(x - 1.35, y + .35, x - 1.15, y + .05);
                    StdDraw.line(x - 1.15, y + .05, x - 1.45, y + .2);
                }
                else {

                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x - 1.45, y - .2, x - 1.15, y - .05);
                    StdDraw.line(x - 1.15, y - .05, x - 1.35, y - .35);
                    StdDraw.line(x - 1.35, y - .35, x - 1.35, y - .05);
                    StdDraw.line(x - 1.35, y - .05, x - 1.15, y - .35);
                    StdDraw.line(x - 1.15, y - .35, x - 1.45, y - .2);
                }
            }
            else if (shape.equals("Triangle")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x - 1.45, y + .2, x - 1.15, y + .05);
                    StdDraw.line(x - 1.15, y + .05, x - 1.15, y + .35);
                    StdDraw.line(x - 1.15, y + .35, x - 1.45, y + .2);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x - 1.45, y - .2, x - 1.15, y - .35);
                    StdDraw.line(x - 1.15, y - .35, x - 1.15, y - .05);
                    StdDraw.line(x - 1.15, y - .05, x - 1.45, y - .2);
                }
            }
            else if (shape.equals("Circle")) {
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledCircle(x - 1.3, y + .2, .15);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledCircle(x - 1.3, y - .2, .15);
                }
            }
            else if (shape.equals("Square")) {
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(x - 1.3, y + .2, .15);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledSquare(x - 1.3, y - .2, .15);
                }
            }
            else if (shape.equals("Heart")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x - 1.2, y + .2, x - 1.4, y + .4);
                    StdDraw.line(x - 1.4, y + .4, x - 1.5, y + .3);
                    StdDraw.line(x - 1.5, y + .3, x - 1.4, y + .2);
                    StdDraw.line(x - 1.4, y + .2, x - 1.5, y + .1);
                    StdDraw.line(x - 1.5, y + .1, x - 1.4, y);
                    StdDraw.line(x - 1.4, y, x - 1.2, y + .2);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x - 1.2, y - .2, x - 1.4, y);
                    StdDraw.line(x - 1.4, y, x - 1.5, y - .1);
                    StdDraw.line(x - 1.5, y - .1, x - 1.4, y - .2);
                    StdDraw.line(x - 1.4, y - .2, x - 1.5, y - .3);
                    StdDraw.line(x - 1.5, y - .3, x - 1.4, y - .4);
                    StdDraw.line(x - 1.4, y - .4, x - 1.2, y - .2);
                }
            }
            else if (shape.equals("Arrow")) {
                StdDraw.setPenRadius(.003);
                if (currPlayer == p2) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.line(x - 1.15, y + .2, x - 1.45, y + .2);
                    StdDraw.line(x - 1.45, y + .2, x - 1.3, y + .3);
                    StdDraw.line(x - 1.45, y + .2, x - 1.3, y + .1);
                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.line(x - 1.15, y - .2, x - 1.45, y - .2);
                    StdDraw.line(x - 1.45, y - .2, x - 1.3, y - .1);
                    StdDraw.line(x - 1.45, y - .2, x - 1.3, y - .3);
                }
            }
        }
    }

    public static void clearColoredSquare(int pos, double x, double y) {
        if (pos > 0 && pos < 11) {
            if (pos == 2 || pos == 4) {
                StdDraw.setPenColor(104, 55, 34);
            }
            else {
                StdDraw.setPenColor(154, 230, 249);
            }
            StdDraw.filledRectangle(x, y + .82, .5 - (4 * .008) - .01, (.33 / 2) - (4 * .008) - .01);
        }
        else if (pos > 11 && pos < 21) {
            if (pos == 12 || pos == 14 || pos == 15) {
                StdDraw.setPenColor(193, 75, 172);
            }
            else {
                StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
            }
            StdDraw.filledRectangle(x + .82, y, (.33/2) - (4 * .008) -.01, .5 - (4 * .008) - .01);
        }
        else if (pos > 21 && pos < 31) {
            if (pos == 22 || pos == 24 || pos == 25) {
                StdDraw.setPenColor(StdDraw.RED);
            }
            else {
                StdDraw.setPenColor(StdDraw.YELLOW);
            }
            StdDraw.filledRectangle(x, y - .84, .5 - (4 * .008) - .01, (.33/2) - (4 * .008) - .01);
        }
        else {
            if (pos == 32 || pos == 33 || pos == 35) {
                StdDraw.setPenColor(45, 170, 39);
            }
            else {
                StdDraw.setPenColor(Color.blue);
            }
            StdDraw.filledRectangle(x - .84, y, (.33/2) - (4 * .008) - .01, .5 - (4 * .008) - .01);
        }
    }

    public static void drawHouse(int pos, double x, double y, int numHouses) {
        clearColoredSquare(pos, x, y);
        StdDraw.setPenColor(6, 129, 26);
        if (pos > 0 && pos < 11) {
            if (numHouses == 1) {
                StdDraw.filledSquare(x, y + .82, .075);
            }
            else if (numHouses == 2) {
                StdDraw.filledSquare(x + .1, y + .82, .075);
                StdDraw.filledSquare(x - .1, y + .82, .075);
            }
            else if (numHouses == 3) {
                StdDraw.filledSquare(x - .2, y + .82, .075);
                StdDraw.filledSquare(x, y + .82, .075);
                StdDraw.filledSquare(x + .2, y + .82, .075);
            }
            else if (numHouses == 4) {
                StdDraw.filledSquare(x - .3, y + .82, .075);
                StdDraw.filledSquare(x - .1, y + .82, .075);
                StdDraw.filledSquare(x + .1, y + .82, .075);
                StdDraw.filledSquare(x + .3, y + .82, .075);
            }
        }
        else if (pos > 11 && pos < 21) {
            if (numHouses == 1) {
                StdDraw.filledSquare(x + .82, y, .075);
            }
            else if (numHouses == 2) {
                StdDraw.filledSquare(x + .82, y - .1, .075);
                StdDraw.filledSquare(x + .82, y + .1, .075);
            }
            else if (numHouses == 3) {
                StdDraw.filledSquare(x + .82, y - .2, .075);
                StdDraw.filledSquare(x + .82, y, .075);
                StdDraw.filledSquare(x + .82, y + .2, .075);
            }
            else if (numHouses == 4) {
                StdDraw.filledSquare(x + .82, y - .3, .075);
                StdDraw.filledSquare(x + .82, y - .1, .075);
                StdDraw.filledSquare(x + .82, y + .1, .075);
                StdDraw.filledSquare(x + .82, y + .3, .075);
            }
        }
        else if (pos > 21 && pos < 31) {
            if (numHouses == 1) {
                StdDraw.filledSquare(x, y - .84, .075);
            }
            else if (numHouses == 2) {
                StdDraw.filledSquare(x + .1, y - .84, .075);
                StdDraw.filledSquare(x - .1, y - .84, .075);
            }
            else if (numHouses == 3) {
                StdDraw.filledSquare(x - .2, y - .84, .075);
                StdDraw.filledSquare(x, y - .84, .075);
                StdDraw.filledSquare(x + .2, y - .84, .075);
            }
            else if (numHouses == 4) {
                StdDraw.filledSquare(x - .3, y - .84, .075);
                StdDraw.filledSquare(x - .1, y - .84, .075);
                StdDraw.filledSquare(x + .1, y - .84, .075);
                StdDraw.filledSquare(x + .3, y - .84, .075);
            }
        }
        else {
            if (numHouses == 1) {
                StdDraw.filledSquare(x - .84, y, .075);
            }
            else if (numHouses == 2) {
                StdDraw.filledSquare(x - .84, y - .1, .075);
                StdDraw.filledSquare(x - .84, y + .1, .075);
            }
            else if (numHouses == 3) {
                StdDraw.filledSquare(x - .84, y - .2, .075);
                StdDraw.filledSquare(x - .84, y, .075);
                StdDraw.filledSquare(x - .84, y + .2, .075);
            }
            else if (numHouses == 4) {
                StdDraw.filledSquare(x - .84, y - .3, .075);
                StdDraw.filledSquare(x - .84, y - .1, .075);
                StdDraw.filledSquare(x - .84, y + .1, .075);
                StdDraw.filledSquare(x - .84, y + .3, .075);
            }
        }
    }

    public static void drawHotel(int pos, double x, double y) { //Make sure to include erasing houses by filling the rectangle again
        clearColoredSquare(pos, x, y);
        StdDraw.setPenColor(159, 0, 0);
        if (pos > 0 && pos < 11) {
            StdDraw.filledRectangle(x, y + .82, .15, .075);
        }
        else if (pos > 11 && pos < 21) {
            StdDraw.filledRectangle(x + .82, y, .075, .15);
        }
        else if (pos > 21 && pos < 31) {
            StdDraw.filledRectangle(x, y - .84, .15, .075);
        }
        else {
            StdDraw.filledRectangle(x - .84, y, .075, .15);
        }
    }

    public static void mortgageBorder(Player currPlayer, int pos, double x, double y, Player p1, Player p2) {
        StdDraw.setPenRadius(.006);
        StdDraw.setPenColor(StdDraw.GREEN);
        if ((pos > 0 && pos < 11) || (pos > 21 && pos < 31)) {
            StdDraw.line(x + .5, y - 1, x + .5, y + 1);
            StdDraw.line(x + .5, y + 1, x - .5, y + 1);
            StdDraw.line(x - .5, y + 1, x - .5, y - 1);
            StdDraw.line(x - .5, y - 1, x + .5, y - 1);
        }
        else {
            StdDraw.line(x + 1, y - .5, x + 1, y + .5);
            StdDraw.line(x + 1, y + .5, x - 1, y + .5);
            StdDraw.line(x - 1, y + .5, x - 1, y - .5);
            StdDraw.line(x - 1, y - .5, x + 1, y - .5);
        }
    }

    public static void drawBorder(Player currPlayer, int pos, double x, double y, Player p1, Player p2) {
        StdDraw.setPenRadius(.006);
        if ((pos > 0 && pos < 11) || (pos > 21 && pos < 31)) {
            if (currPlayer == p1) {
                StdDraw.setPenColor(StdDraw.RED);
            }
            else {
                StdDraw.setPenColor(StdDraw.BLUE);
            }

            StdDraw.line(x + .5, y - 1, x + .5, y + 1);
            StdDraw.line(x + .5, y + 1, x - .5, y + 1);
            StdDraw.line(x - .5, y + 1, x - .5, y - 1);
            StdDraw.line(x - .5, y - 1, x + .5, y - 1);

            if (pos < 11) {
                StdDraw.line(x - .5, y + .66, x + .5, y + .66);
            }
            else {
                StdDraw.line(x - .5, y - .66, x + .5, y - .66);
            }



        }
        else {
            if (currPlayer == p1) {
                StdDraw.setPenColor(StdDraw.RED);
            }
            else {
                StdDraw.setPenColor(StdDraw.BLUE);
            }

            StdDraw.line(x + 1, y - .5, x + 1, y + .5);
            StdDraw.line(x + 1, y + .5, x - 1, y + .5);
            StdDraw.line(x - 1, y + .5, x - 1, y - .5);
            StdDraw.line(x - 1, y - .5, x + 1, y - .5);

            if (pos > 11 && pos < 21) {
                StdDraw.line(x + .66, y - .5, x + .66, y + .5);
            }
            else {
                StdDraw.line(x - .66, y - .5, x - .66, y + .5);
            }
        }
    }

    public static void drawBoard() {
        StdDraw.setXscale(0, 13.0);
        StdDraw.setYscale(0, 13.0);

        StdDraw.setPenColor(215, 232, 222);
        StdDraw.filledSquare(13.0, 13.0, 13.0);

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(.008);
        double radius = .008;
        StdDraw.line(2, 0, 2, 13);
        StdDraw.line(11, 0, 11, 13);
        StdDraw.line(0, 2, 13, 2);
        StdDraw.line(0, 11, 13, 11);

        for (int i = 3; i < 11; i++) {
            StdDraw.line(i, 11, i, 13);
            StdDraw.line(i, 0, i, 2);
            StdDraw.line(0, i, 2, i);
            StdDraw.line(11, i, 13, i);
        }

        StdDraw.line(2, 1.66, 4, 1.66);
        StdDraw.line(5, 1.66, 6, 1.66);
        StdDraw.line(8, 1.66, 9, 1.66);
        StdDraw.line(10, 1.66, 11, 1.66);
        StdDraw.setPenColor(104, 55, 34);
        StdDraw.filledRectangle(10.5, 1.82,.5 - (4 * radius) - .01, (.33/2) - (4 * radius) - .01);
        StdDraw.filledRectangle(8.5, 1.82, .5 - (4 * radius) - .01, (.33/2) - (4 * radius) - .01);
        StdDraw.setPenColor(154, 230, 249);
        StdDraw.filledRectangle(2.5, 1.82, .5 - (4 * radius) - .01, (.33/2) - (4 * radius) - .01);
        StdDraw.filledRectangle(3.5, 1.82, .5 - (4 * radius) - .01, (.33/2) - (4 * radius) - .01);
        StdDraw.filledRectangle(5.5, 1.82, .5 - (4 * radius) - .01, (.33/2) - (4 * radius) - .01);

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.line(1.66, 2, 1.66, 3);
        StdDraw.line(1.66, 4, 1.66, 6);
        StdDraw.line(1.66, 7, 1.66, 8);
        StdDraw.line(1.66, 9, 1.66, 11);
        StdDraw.setPenColor(193, 75, 172);
        StdDraw.filledRectangle(1.82, 2.5, (.33/2) - (4 * radius) - .01, .5 - (4 * radius) - .01);
        StdDraw.filledRectangle(1.82, 4.5, (.33/2) - (4 * radius) - .01, .5 - (4 * radius) - .01);
        StdDraw.filledRectangle(1.82, 5.5, (.33/2) - (4 * radius) - .01, .5 - (4 * radius) - .01);
        StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
        StdDraw.filledRectangle(1.82, 7.5, (.33/2) - (4 * radius) - .01, .5 - (4 * radius) - .01);
        StdDraw.filledRectangle(1.82, 9.5, (.33/2) - (4 * radius) - .01, .5 - (4 * radius) - .01);
        StdDraw.filledRectangle(1.82, 10.5, (.33/2) - (4 * radius) - .01, .5 - (4 * radius) - .01);

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.line(2, 11.33, 3, 11.33);
        StdDraw.line(4, 11.33, 6, 11.33);
        StdDraw.line(7, 11.33, 9, 11.33);
        StdDraw.line(10, 11.33, 11, 11.33);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledRectangle(2.5, 11.16, .5 - (4 * radius) - .01, (.33/2) - (4 * radius) - .01);
        StdDraw.filledRectangle(4.5, 11.16, .5 - (4 * radius) - .01, (.33/2) - (4 * radius) - .01);
        StdDraw.filledRectangle(5.5, 11.16, .5 - (4 * radius) - .01, (.33/2) - (4 * radius) - .01);
        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.filledRectangle(7.5, 11.16, .5 - (4 * radius) - .01, (.33/2) - (4 * radius) - .01);
        StdDraw.filledRectangle(8.5, 11.16, .5 - (4 * radius) - .01, (.33/2) - (4 * radius) - .01);
        StdDraw.filledRectangle(10.5, 11.16, .5 - (4 * radius) - .01, (.33/2) - (4 * radius) - .01);

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.line(11.33, 2, 11.33, 3);
        StdDraw.line(11.33, 4, 11.33, 5);
        StdDraw.line(11.33, 7, 11.33, 8);
        StdDraw.line(11.33, 9, 11.33, 11);
        StdDraw.setPenColor(45, 170, 39);
        StdDraw.filledRectangle(11.16, 10.5, (.33/2) - (4 * radius) - .01, .5 - (4 * radius) - .01);
        StdDraw.filledRectangle(11.16, 9.5, (.33/2) - (4 * radius) - .01, .5 - (4 * radius) - .01);
        StdDraw.filledRectangle(11.16, 7.5, (.33/2) - (4 * radius) - .01, .5 - (4 * radius) - .01);
        StdDraw.setPenColor(Color.blue);
        StdDraw.filledRectangle(11.16, 2.5, (.33/2) - (4 * radius) - .01, .5 - (4 * radius) - .01);
        StdDraw.filledRectangle(11.16, 4.5, (.33/2) - (4 * radius) - .01, .5 - (4 * radius) - .01);



        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(.005);
        StdDraw.text(1, .7, "Jail");
        StdDraw.text(12, .7, "Go");
        StdDraw.text(1, 12.70, "Free");
        StdDraw.text(1, 12.3, "Parking");
        StdDraw.text(12, 12, "Go to Jail");

        Font font = new Font("Sans-serif", Font.PLAIN, 7);
        StdDraw.setFont(font);
        StdDraw.text(2.4, .85, "Connecticut", 90);
        StdDraw.text(2.6, .85, "Avenue", 90);
        StdDraw.text(3.4, .85, "Vermont", 90);
        StdDraw.text(3.6, .85, "Avenue", 90);
        StdDraw.text(5.4, .85, "Oriental", 90);
        StdDraw.text(5.6, .85, "Avenue", 90);

        StdDraw.text(8.4, .85, "Baltic", 90);
        StdDraw.text(8.6, .85, "Avenue", 90);
        StdDraw.text(10.4,.85, "Mediterranean", 90);
        StdDraw.text(10.6,.85, "Avenue", 90);

        StdDraw.text(.85, 2.6, "St. Charles");
        StdDraw.text(.85, 2.4, "Place");
        StdDraw.text(.85, 4.6, "States");
        StdDraw.text(.85, 4.4, "Avenue");
        StdDraw.text(.85, 5.6, "Virginia");
        StdDraw.text(.85, 5.4, "Avenue");

        StdDraw.text(.85, 7.6, "St. James");
        StdDraw.text(.85, 7.4, "Place");
        StdDraw.text(.85, 9.6, "Tennessee");
        StdDraw.text(.85, 9.4, "Avenue");
        StdDraw.text(.85, 10.6, "New York");
        StdDraw.text(.85, 10.4, "Avenue");

        StdDraw.text(2.4, 12.15, "Kentucky", 90);
        StdDraw.text(2.6, 12.15, "Avenue", 90);
        StdDraw.text(4.4, 12.15, "Indiana", 90);
        StdDraw.text(4.6, 12.15, "Avenue", 90);
        StdDraw.text(5.4, 12.15, "Illinois", 90);
        StdDraw.text(5.6, 12.15, "Avenue", 90);

        StdDraw.text(7.4, 12.15, "Atlantic", 90);
        StdDraw.text(7.6, 12.15, "Avenue", 90);
        StdDraw.text(8.4, 12.15, "Ventnor", 90);
        StdDraw.text(8.6, 12.15, "Avenue", 90);
        StdDraw.text(10.4, 12.15, "Marvin", 90);
        StdDraw.text(10.6, 12.15, "Gardens", 90);

        StdDraw.text(12.15, 2.5, "Boardwalk");
        StdDraw.text(12.15, 4.6, "Park");
        StdDraw.text(12.15, 4.4, "Place");

        StdDraw.text(12.15, 7.6, "Pennsylvania");
        StdDraw.text(12.15, 7.4, "Avenue");
        StdDraw.text(12.15, 9.6, "North Carolina");
        StdDraw.text(12.15, 9.4, "Avenue");
        StdDraw.text(12.15, 10.6, "Pacific");
        StdDraw.text(12.15, 10.4, "Avenue");

        Font font1 = new Font("Sans-serif", Font.PLAIN, 9);
        StdDraw.setFont(font1);
        StdDraw.text(2.5, .1, "$120");
        StdDraw.text(3.5, .1, "$100");
        StdDraw.text(5.5, .1, "$100");
        StdDraw.text(8.5, .1, "$60");
        StdDraw.text(10.5, .1, "$60");

        StdDraw.text(.8, 10.15, "$200");
        StdDraw.text(.8, 9.15, "$180");
        StdDraw.text(.8, 7.15, "$180");
        StdDraw.text(.8, 5.15, "$160");
        StdDraw.text(.8, 4.15, "$140");
        StdDraw.text(.8, 2.15, "$140");

        StdDraw.text(2.5, 12.80, "$220");
        StdDraw.text(4.5, 12.80, "$220");
        StdDraw.text(5.5, 12.80, "$240");
        StdDraw.text(7.5, 12.80, "$260");
        StdDraw.text(8.5, 12.80, "$260");
        StdDraw.text(10.5, 12.80, "$280");

        StdDraw.text(12.15, 10.15, "$300");
        StdDraw.text(12.15, 9.15, "$300");
        StdDraw.text(12.15, 7.15, "$320");
        StdDraw.text(12.15, 4.15, "$350");
        StdDraw.text(12.15, 2.15, "$400");

        StdDraw.text(6.5, .1, "$200");
        StdDraw.text(6.5, 12.80, "$200");
        StdDraw.text(.9, 6.15, "$200");
        StdDraw.text(12.05, 6.15, "$200");

        StdDraw.text(12.1, 3.15, "Pay $100");
        StdDraw.text(7.5, .3, "Pay");
        StdDraw.text(7.5, .1, "$100");
        StdDraw.text(.9, 3.15, "$150");
        StdDraw.text(9.5, 12.8, "$150");

        Font font2 = new Font("Sans-serif", Font.PLAIN, 44);
        StdDraw.setFont(font2);
        StdDraw.setPenColor(193, 75, 172);
        StdDraw.text(4.5, 1, "?");
        StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
        StdDraw.text(12, 5.5, "?", 90);
        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        StdDraw.text(3.5, 12, "?");

        Font font3 = new Font("Sans-serif", Font.PLAIN, 8);
        StdDraw.setFont(font3);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(4.5, .5, "Chance");
        StdDraw.text(12.5, 5.5, "Chance", 90);
        StdDraw.text(3.5, 11.5, "Chance");

        Font chest = new Font("Sans-serif", Font.BOLD, 20);
        StdDraw.setFont(chest);
        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        StdDraw.text(.9, 8.45, "CHEST");
        StdDraw.text(9.55, .9, "CHEST", 90);
        StdDraw.text(12.05, 8.45, "CHEST");

        StdDraw.setPenColor(StdDraw.BLACK);
        Font railroad = new Font("Sans-serif", Font.BOLD, 10);
        StdDraw.setFont(railroad);
        StdDraw.text(6.5, 1.7, "CHOO");
        StdDraw.text(6.5, 1.4, "CHOO");
        StdDraw.text(6.5, 12.35, "CHOO");
        StdDraw.text(6.5, 12.05, "CHOO");
        StdDraw.text(.95, 6.7, "CHOO CHOO");
        StdDraw.text(12.05, 6.7, "CHOO CHOO");
        StdDraw.text(12.05, 3.7, "LUXURY TAX");
        StdDraw.setFont(font1);
        StdDraw.text(7.5, 1.6, "Income");
        StdDraw.text(7.5, 1.3, "Tax");
        StdDraw.text(7.5, .9, "-$$$$");
        StdDraw.text(.95, 3.7, "***Electric***");
        StdDraw.text(.95, 3.5, "***Company***");
        StdDraw.text(9.5, 12.2, "Water");
        StdDraw.text(9.5, 11.95, "***");
        StdDraw.text(9.5, 11.8, "Works");
        StdDraw.text(9.5, 11.55, "***");
        StdDraw.text(9.5, 11.4, "It's Wet");
        StdDraw.setFont(font);
        StdDraw.text(6.5, .7, "Reading");
        StdDraw.text(6.5, .4, "Railroad");
        StdDraw.text(6.5, 11.7, "B&O");
        StdDraw.text(6.5, 11.4, "Railroad");
        StdDraw.text(.95, 6.42, "Pennsylvania Railroad");
        StdDraw.text(12.05, 6.42, "Short Line");
        StdDraw.text(12.05, 3.4, "$$$$");




    }

    //Maybe make a property for each tiles location on board
    //Make a property for each position (1 - x), so you can keep track of where pieces are


}
