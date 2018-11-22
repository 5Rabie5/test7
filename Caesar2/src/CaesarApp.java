public class CaesarApp {
    public static void main(String[] args) {
        BlackBox blackBox=new BlackBox();
        blackBox.setKey(1);
        blackBox.setMassege("hallo");
        String messge="hello";
        Encorypt encorypt=new Encorypt();
        System.out.println(encorypt.encoryptMessage(messge));
    }
}
