public class Adapter extends DataAnalyticTools {
    private XMLData xmlData;

    public Adapter(XMLData xmlData) {
        super();
        this.xmlData = xmlData;
    }

    public void analyseData(){
        System.out.println( "Converting XML Data " + xmlData.getXmlData() + " to JSON data" );
        super.setJsonData(xmlData.getXmlData());
        super.analyseData();
    }
}
