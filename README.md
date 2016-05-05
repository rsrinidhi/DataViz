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
<img src = "https://cloud.githubusercontent.com/assets/8815203/15057914/281c283e-12ce-11e6-8213-d37190d2d243.png" width="300" style = "float:left">
















