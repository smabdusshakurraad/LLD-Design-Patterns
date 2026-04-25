public class GUIAbstractFactory {
    public static Ifactory createFactory(String osType){
        if(osType.equals("windows")){
            return new WindowFactory();
        }
        else if(osType.equals("mac")){
            return new MacFactory();
        }
        else
            return new MacFactory();
    }
}
