public class MonopolyTest {
    public static void main(String[] args) {
        Properties testProp = new Properties("test", 4, 2, 3);

        Properties testProp1 = new Properties("Test", 3, 2, 7);

        Properties testProp2 = new Properties("TesT", 2, 1, 1);

        Player testPlayer = new Player("Test Guy");

        Player testPlayer2 = new Player("Test Guy 2");

        String shape = "Heart";
        Monopoly.drawBoard();
        Monopoly.drawBorder(testPlayer, 27, 7.5, 12, testPlayer, testPlayer2);
        Monopoly.drawHotel(22, 2.5, 12);


    }
}
