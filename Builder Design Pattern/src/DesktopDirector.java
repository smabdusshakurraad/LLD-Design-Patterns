public class DesktopDirector {
    private DesktopBuilder builder;

    public DesktopDirector(DesktopBuilder desktopBuilder){
        this.builder = desktopBuilder;
    }

    public Desktop buildDesktop(){
        builder.buildMonitor();
        builder.buildKeyboard();
        builder.buildMouse();
        builder.buildSpeaker();
        builder.buildRam();
        builder.buildProcessor();
        builder.buildMotherboard();

        return builder.getDesktop();
    }

    public Desktop getDesktop(){
        return builder.getDesktop();
    }
}
