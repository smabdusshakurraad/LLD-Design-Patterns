public interface DesktopBuilder {
    void buildMonitor();
    void buildKeyboard();
    void buildMouse();
    void buildSpeaker();
    void buildRam();
    void buildProcessor();
    void buildMotherboard();
    Desktop getDesktop();
}
