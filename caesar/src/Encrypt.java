
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Encrypt {
    String newLeeter;
    String ciphertext;
    ArrayList<String> ciphertexts = new ArrayList<>();
    String alphapet = "abcdefghijklmnopqrstuvwxyz";
    List<String> alphaptLeeters = Arrays.asList(alphapet.split(""));

    public String encrypt(BlackBox blackBox) {

        List<String> plainTextLeeters1 = Arrays.asList(blackBox.getPlaintext().split(""));
        ArrayList<String> plainTextLeeters = new ArrayList<>(plainTextLeeters1);
        Integer size = plainTextLeeters.size();

        while (ciphertexts.size() < size) {
            for (String alphaptLeeter : alphaptLeeters)
                if (plainTextLeeters.get(0).equals(alphaptLeeter)) {
                    Integer oldPostion = alphaptLeeters.indexOf(alphaptLeeter);
                    Integer newPostion = (oldPostion + blackBox.getKey()) % 26;
                    newLeeter = alphaptLeeters.get(newPostion);
                    ciphertexts.add(newLeeter);
                    plainTextLeeters.remove(0);
                    newLeeter = "";
                    break;
                }
        }
        ciphertext = String.join("", ciphertexts);
        System.out.println(ciphertext);
        return blackBox.getPlaintext();
    }


}
