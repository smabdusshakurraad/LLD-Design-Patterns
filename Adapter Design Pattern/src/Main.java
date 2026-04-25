public class Main {

    public static void main(String []args){
        XMLData xmlData = new XMLData("sample xml data");
        DataAnalyticTools tool = new Adapter(xmlData);
        Client client = new Client();
        client.processData(tool);
    }
}
