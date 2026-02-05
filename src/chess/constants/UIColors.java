package chess.constants;
//TODO: implement white mode and dark mode
public enum UIColors {
    ;

    final private String value;
    UIColors(String value) {
        this.value = value; // uses hex format
    }

    public String getValue() {
        return this.value;
    }
}
