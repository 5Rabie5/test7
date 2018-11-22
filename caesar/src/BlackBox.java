public class BlackBox {

    private String plaintext;
    private Integer key;

    public BlackBox(String plaintext, Integer key) {
        this.plaintext = plaintext;
       this.key = key;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public Integer getKey() {
        return key;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public void setKey(Integer key) {
        this.key = key;
    }
}
