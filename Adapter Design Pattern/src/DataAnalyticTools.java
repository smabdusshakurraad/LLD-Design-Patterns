public class DataAnalyticTools {
    private String jsonData;

    public DataAnalyticTools(){

    }
    public DataAnalyticTools(String jsonData){
        this.jsonData = jsonData;
    }

    public void setJsonData(String jsonData){
        this.jsonData = jsonData;
    }

    public void analyseData(){
        System.out.println("Analysing Data " + this.jsonData);
    }
}
