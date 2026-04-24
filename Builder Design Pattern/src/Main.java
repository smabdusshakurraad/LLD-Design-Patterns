public class Main {
    public static void main(String []args){
        DesktopBuilder dellDesktopBuilder = new DellDesktopBuilder();
        DesktopBuilder hppDesktopBuilder = new HppDesktopBuilder();

        DesktopDirector dellDesktopDirector = new DesktopDirector(dellDesktopBuilder);
        DesktopDirector hppDesktopDirector = new DesktopDirector(hppDesktopBuilder);

        Desktop dellDesktop = dellDesktopDirector.buildDesktop();
        Desktop hppDesktop = hppDesktopDirector.buildDesktop();

        dellDesktop.showSpecs();
        hppDesktop.showSpecs();
    }
}
