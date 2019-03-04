# Inventory_Parser

For this question, I have made the following assumptions:
1. Let us assume that the inventory details of all products for a particular supplier is stored in a directory. Consider a directory supplyHouseInventoryDetails. The structure of this directory will be as follows: there will be sub-directories inside this main directory, each such sub directory will be named as the supplierName. Inside this suplierName sub directory, we will have a file that will contain the inventory details of all the products that it has.

2. InventoryParser.java
In this file, we have the main function. 
In this class, we will invoke the updateInventory function. This will read the files in the supplyHouseInventoryDetails directory, and determine the type of each such file, eg CSV, tab delimited, xlxs/xml etc. After determining the type we will pass this to the FileParser class and create an object of the concerned type.

3. FileParser.java
Based on the type of the file, it will read and parse the file by the appropriate file type delimited. (if it is a csv then the delimiter is "," etc). During parse() function, we will determine the index of our concerned fields like productId and quantity and parse the results line by line based on this index. After each line read, we will make a call to writeToDB() which will either find and update the table entry for the (productId, supplierId)primary key if it exists in the table. Or else, it will create a new entry with this quantity if it does not exit in the database table.

The database schema is same as defined in the problem statement. with (productId and supplierId) being the primary key.

