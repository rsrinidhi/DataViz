# DataViz
1. Run the java program FilterText from terminal using the command `java -cp .:commons-csv-1.1.jar FilterText "path/to/input/file.csv"`. The argument to the program is path to the input transaction file. The program creates a "Results.csv" file in the same location as the input file.
2. Create a profile in Tableau Public, https://public.tableau.com/auth/signup, by filling in the necessary credentials.
3. Download Tableau Public desktop app from https://public.tableau.com/s/download.
4. Open Tableau Public app.
5. Open the "Results.csv" file in Tableau app.
6. Navigate to Sheet 1 of the csv file.
7. Drag the dimensions ‘Account number’ and ‘Object Code Name’ into column field. Note: Order is very important
8. Drag the dimension ‘Transaction’ into row field. Expand the transaction date by year and month.
![2](https://cloud.githubusercontent.com/assets/8815203/15057829/b5fab16c-12cd-11e6-8f74-155dccd658e0.png)
9. Choose 'Bar' from the Marks drop down menu to choose the type of visualization.
![1](https://cloud.githubusercontent.com/assets/8815203/15057795/8ba82e94-12cd-11e6-8038-039a53372a69.png)
10. In order to color each of the bar, right click on 'current month actuals' under Measures.
11. Click on 'Default Properties' and then 'color'.
<br /><img src = "https://cloud.githubusercontent.com/assets/8815203/15057914/281c283e-12ce-11e6-8213-d37190d2d243.png">
12. Choose 'Full Color Range'.
<br /><img src = "https://cloud.githubusercontent.com/assets/8815203/15057919/2dbf4ea6-12ce-11e6-986b-6e0016f4efb6.png">
13. Drag 'Current Month actual' under Measures into the fields ‘Color’ and ‘Size’.
<br /><img src="https://cloud.githubusercontent.com/assets/8815203/15057922/323fe7e2-12ce-11e6-94f4-40c9cbdd0e12.png" width="200">
14. Save the visualisation to Tableau Public.
<br /><img width="340" alt="screenshot 2016-05-05 14 48 37" src="https://cloud.githubusercontent.com/assets/8815203/15058359/96b55ed0-12d0-11e6-9362-49159a282232.png">
15. If you want to compare two accounts, click on the ‘Account Number’ dimension in the Column field. Choose ‘Filter’
![6](https://cloud.githubusercontent.com/assets/8815203/15057927/38070764-12ce-11e6-9c4a-0c7c8ad4daf6.png)
16. Click on the account numbers you wish to compare. 
<img src ="https://cloud.githubusercontent.com/assets/8815203/15057930/3e9ffc2a-12ce-11e6-8a5d-aa18dd98503e.png">
17. Drag  ‘Account Number’ from Columns to Rows to compare the account number for each month by object code. 
<img src="https://cloud.githubusercontent.com/assets/8815203/15057964/69ec0e50-12ce-11e6-9fe8-328932400420.png">
18. For lesser details, the ‘Month’ field from Rows can be removed.

