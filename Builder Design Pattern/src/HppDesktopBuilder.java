public class HppDesktopBuilder implements DesktopBuilder{
    private Desktop desktop;
    
    public HppDesktopBuilder(){
        this.desktop = new Desktop();
    }

    @Override
    public void buildMonitor() {
        desktop.setMonitor("Hpp Monitor");
    }

    @Override
    public void buildKeyboard() {
        desktop.setKeyboard("Hpp keyboard");

    }

    @Override
    public void buildMouse() {
        desktop.setMouse("Hpp Mouse");

    }

    @Override
    public void buildSpeaker() {
        desktop.setSpeaker("Hpp Speaker");
    }

    @Override
    public void buildRam() {
        desktop.setRam("Hpp Ram");
    }

    @Override
    public void buildProcessor() {
        desktop.setProcessor("Hpp processor");
    }

    @Override
    public void buildMotherboard() {
        desktop.setMotherboard("Hpp Mother Board");
    }

    @Override
    public Desktop getDesktop() {
        return this.desktop;
    }
}
