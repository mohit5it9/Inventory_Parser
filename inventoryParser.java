public class InventoryParser {

        public static voig main(String[] args) {

        }


        private bool isCsv(File file) {

        }

        private bool isTabDelimited(File file) {

        }

        private bool isExcel(File file) {

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
                        FileParser parsedFile = new FileParser(fileEntry,type);        
                }
        }
}
