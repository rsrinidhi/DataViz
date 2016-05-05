import java.io.*;
import org.apache.commons.csv.*;

public class FilterText{

    public static void filter(String fileName) throws  IOException{
        String[] tokens = fileName.split("/");
        String output = "";
        
        for(int i = 1; i <tokens.length-1; i++)
            output = output.concat("/").concat(tokens[i]);
        
        output = output.concat("/").concat("Results.csv");
        
        Reader in = new FileReader(fileName);
        FileWriter fw = new FileWriter(output,true);

        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        String accountNumber, accountName = "AccountName", objectCode, objectCodeName, transactionDate, actuals;
        int lineCount = 0;

        for (CSVRecord record : records) {
            accountNumber = record.get(2);
            objectCode = record.get(5);
            objectCodeName = record.get(7);
            transactionDate = record.get(12);
            actuals = record.get(29);

            if(lineCount != 0){

                int temp = Integer.parseInt(accountNumber);

                if(temp >= 1112600 && temp <= 1174600)
                    accountName =  "State";
                else if(temp >= 2001541 && temp <= 2797480)
                    accountName = "Designated";
                else if(temp >= 3000820 && temp <= 4432000)
                    accountName = "Sponsored projects";
                else if(temp >= 5102060 && temp <= 5552600)
                    accountName = "Other Restricted";

            }

            fw.write(accountNumber + "," + accountName + "," + objectCode + "," + objectCodeName + "," + transactionDate + "," + actuals + "\n");

            lineCount++;
        }

        fw.close();
    }

    public static void main(String[] args) throws IOException{
        String fileName = args[0];

        filter(fileName);
    }
}
