# DataViz
1. Run the java program FilterText from terminal using the command `java -cp .:commons-csv-1.1.jar FilterText "path/to/input/file.csv"`. The argument to the program is path to the input transaction file. The program creates a "Results.csv" file in the same location as the input file.
2. Create a profile in Tableau Public, https://public.tableau.com/auth/signup, by filling in the necessary credentials.
3. Download Tableau Public desktop app from https://public.tableau.com/s/download.
4. Open Tableau Public app.
5. Open the "Results.csv" file in Tableau app.
6. Navigate to Sheet 1 of the csv file.
4. Drag the dimensions ‘Account number’ and ‘Object Code Name’ into column field. Note: Order is very important
5. Drag the dimension ‘Transaction’ into row field. Expand the transaction date by year and month.

6. Choose 'Bar' from the Marks drop down menu to choose the type of visualization.
7. In order to color each of the bar, right click on 'current month actuals' under Measures.
8. Click on 'Default Properties' and then 'color'.
9. Choose 'Full Color Range'.
10. Drag 'Current Month actual' under Measures into the fields ‘Color’ and ‘Size’.
11. The output is a visualization that consists of transactions by account number and object code name sorted by month and year.

https://public.tableau.com/views/Book1_10796/Sheet1?:embed=y&:display_count=yes&:showTabs=y

12. If you want to compare two accounts, click on the ‘Account Number’ dimension in the Column field. Choose ‘Filter’

 


13. Click on the account numbers you wish to compare. 

  

14. Drag  ‘Account Number’ from Columns to Rows to compare the account number for each month by object code. 

 

15. For lesser details, the ‘Month’ field from
