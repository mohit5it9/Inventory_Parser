public class InventoryParser {

        public static voig main(String[] args) {
                // entry point of our app
        }


        private bool isCsv(File file) {
                // checks the file name extension and returns True if the file is of csv extension; else False
        }

        private bool isTabDelimited(File file) {
                // checks the file name extension and returns True if the file is of tab delimited extension; else False
        }

        private bool isExcel(File file) {
                // checks the file name extension and returns True if the file is of xml/xmls extension; else False
        }

        public void updateInventory(File directory) {
                for (File fileEntry: directory.listFiles()) {
                        String type;
                        if (isCsv(fileEntry)
                                type = 'csv';
                        if (isTabDelimited(fileEntry)
                                type = 'tab';
                        if (isExcel(fileEntry)
                                type = 'excel';
                        // create object of our FileParser class
                        FileParser parsedFile = new FileParser(fileEntry, type);
                        parsedFile.parse();
                }
        }
}
