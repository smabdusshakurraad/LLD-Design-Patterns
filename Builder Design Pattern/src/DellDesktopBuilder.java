public class DellDesktopBuilder implements DesktopBuilder{

    Desktop desktop;
    public DellDesktopBuilder(){
        this.desktop = new Desktop();
    }
    @Override
    public void buildMonitor() {
        desktop.setMonitor("Dell Monitor");
    }

    @Override
    public void buildKeyboard() {
        desktop.setKeyboard("Dell keyboard");

    }

    @Override
    public void buildMouse() {
        desktop.setMouse("Dell Mouse");

    }

    @Override
    public void buildSpeaker() {
        desktop.setSpeaker("Dell Speaker");
    }

    @Override
    public void buildRam() {
        desktop.setRam("Dell Ram");
    }

    @Override
    public void buildProcessor() {
        desktop.setProcessor("Dell processor");
    }

    @Override
    public void buildMotherboard() {
        desktop.setMotherboard("Dell Mother Board");
    }

    @Override
    public Desktop getDesktop() {
        return this.desktop;
    }
}
