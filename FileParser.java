public class FileParser {
    String supplierId;
    public fileParser(File file) {
      // will set the supplierId here from fileName
    }
   
    private string passDelimiter(String type) {
        // for each file type pass corresponding delimiter, for eg for csv pass ",".
    }
    
    private void writeToDb( String productId, int quantity) {
            //query to store supplier id, product id and quantity to our inventory table.
            //supplier id is retrieved from constructor.
            // first runs a query to identify if primary key (supplierId, productId) exists in the table;
            // if it exists then it will run another query to update the quantity corresponding to that primary key
            // if the concerned key didn't exist, then we will just create this new entry with the concered quantity.
    }
    public void parse() {
        // will read the file from reader like BufferReader.
        
        // we will use delimiter returned by passDelimiter function to split the data across columns
        
        // We will store the index of "productId" and "quantity" by parsing the first line, then we will parse all the lines one by one
        // and extract the product_id and quantity from the index derived from parsing first line. While parsing each line, we will 
        // call writeToDB() method that runs a query and stores the product_id and quantity as argument.
    }

}
