public class CaesarApp {


    public static void main(String[] args) {
        BlackBox blackBox = new BlackBox("zwew", 2);
        Encrypt encrypt = new Encrypt();
        encrypt.encrypt(blackBox);
    }
}
