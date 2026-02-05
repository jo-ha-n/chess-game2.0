package chess.constants;

public enum CardNames {
    MainMenu("menu"),
    Settings("settings"),
    About("about"),
    Play("play"),
    PLayMenu("play_menu"),
    PlayVSAI("play_vs_ai"),
    PlayVSAIOptions("play_vs_ai_options"),
    PlayVSPlayerLocal("play_vs_player_local"),
    PlayVSPlayerOnline("play_vs_player_online");

    private final String value;

    CardNames(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
