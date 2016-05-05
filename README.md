# README.md

#About the Java program
The Java program "FilterText.java" takes the transaction .csv file as argument. It selects the fields "Account Number", "Account Type", "Object Code", "Object Code Name", "Transaction Date" and "Current month actuals" from the input file and creates a new file, "Results.csv" with the selected fields.

#How to run the Java program?
1. Run the java program, "FilterText" from terminal using the command `java -cp .:commons-csv-1.1.jar FilterText "path/to/input/file.csv"`. The argument to the program is the path to the input transaction file. The program creates a "Results.csv" file in the same location as the input file.

#Installating Tableau
1. Create a profile in Tableau Public, https://public.tableau.com/auth/signup, by filling in the necessary credentials.
2. Download Tableau Public desktop app from https://public.tableau.com/s/download.
 
#How to visualise the transactions in Tableau?
1. Open Tableau Public app.
2. Open the "Results.csv" file in Tableau app that was created by the Java program.
<br /><img width="345" alt="screenshot 2016-05-05 15 57 05" src="https://cloud.githubusercontent.com/assets/8815203/15059790/0f5345a6-12da-11e6-8528-340d6dd50a96.png">
3. Navigate to Sheet 1 of the csv file.
<br /><img width="380" alt="screenshot 2016-05-05 16 02 11" src="https://cloud.githubusercontent.com/assets/8815203/15059891/d421ef54-12da-11e6-8a14-054a94657f10.png">
4. Choose 'Bar' from the Marks drop down menu to choose the type of visualization.
![1](https://cloud.githubusercontent.com/assets/8815203/15057795/8ba82e94-12cd-11e6-8038-039a53372a69.png)
5. In order to color each of the bar, right click on 'current month actuals' under Measures.
6. Click on 'Default Properties' and then 'color'.
<br /><img src = "https://cloud.githubusercontent.com/assets/8815203/15057914/281c283e-12ce-11e6-8213-d37190d2d243.png">
7. Choose 'Full Color Range'.
<br /><img src = "https://cloud.githubusercontent.com/assets/8815203/15057919/2dbf4ea6-12ce-11e6-986b-6e0016f4efb6.png">
8. Drag 'Current Month actual' under Measures into the fields ‘Color’ and ‘Size’.
<br /><img src="https://cloud.githubusercontent.com/assets/8815203/15057922/323fe7e2-12ce-11e6-94f4-40c9cbdd0e12.png" width="200">
9. Drag the dimensions ‘Account number’ and ‘Object Code Name’ into column field. Note: Order is very important
<br /><img width="199" alt="screenshot 2016-05-05 16 04 18" src="https://cloud.githubusercontent.com/assets/8815203/15059971/7d5eb386-12db-11e6-98b3-529d52af0be5.png">
10. Drag the dimension ‘Transaction’ into row field. Expand the transaction date by year and month.This would show the visualization of the transaction for each account number for corresponding month.
![2](https://cloud.githubusercontent.com/assets/8815203/15057829/b5fab16c-12cd-11e6-8f74-155dccd658e0.png)
11. If you want to compare two accounts, click on the ‘Account Number’ dimension in the Column field. Choose ‘Filter’
![6](https://cloud.githubusercontent.com/assets/8815203/15057927/38070764-12ce-11e6-9c4a-0c7c8ad4daf6.png)
12. Click on the account numbers you wish to compare. 
<img src ="https://cloud.githubusercontent.com/assets/8815203/15057930/3e9ffc2a-12ce-11e6-8a5d-aa18dd98503e.png">
13. Drag  ‘Account Number’ from Columns to Rows to compare the account number for each month by object code. 
<img src="https://cloud.githubusercontent.com/assets/8815203/15057964/69ec0e50-12ce-11e6-9fe8-328932400420.png">
14. If 'Account Number' is removed from Rows, then the visualization would show the transaction per object code for the corresponding month.
15. Save the visualisation to Tableau Public.
<br /><img width="340" alt="screenshot 2016-05-05 14 48 37" src="https://cloud.githubusercontent.com/assets/8815203/15058359/96b55ed0-12d0-11e6-9362-49159a282232.png">

#Select Visualisation
1. A visualisation of the transaction for the entire CS department sorted by object code for the fiscal year 2014-2015 can be viewed here: https://public.tableau.com/profile/srinidhi5986#!/vizhome/TransactionsByDateCode/Sheet1
2. A visualisation of the transaction for each account number in the CS department sorted by object code for the fiscal year 2014-2015 can be viewed here: https://public.tableau.com/profile/srinidhi5986#!/vizhome/Book1_10796/Sheet1
3. A visualisation of the transaction that compares two account numbers sorted by object code for the fiscal year 2014-2015 can be viewed here: https://public.tableau.com/profile/srinidhi5986#!/vizhome/CompareAccounts_Year/Sheet1
