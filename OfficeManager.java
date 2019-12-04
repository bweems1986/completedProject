package com.company;

public class OfficeManager extends Warehouse {

    public OfficeManager() {

    }

    /**
     * this method allows the office manager to enter a part by name to get the information of said part
     * @param partName
     */
    public void examinePartName(String partName) {//office manager can enter a part name and receives part info
        boolean found = false;

        for (int i = 0; bikeParts.size() > i; i++) {
            BikePart currentPart = bikeParts.get(i);

            if (currentPart.getPartName().equals(partName)) {
                found = true;
                System.out.println("PartName: " + currentPart.getPartName() + " PartNumber: " + currentPart.getPartNumber() + " ListPrice: " + currentPart.getListPrice() + " SalePrice: "
                        + currentPart.getSalePrice() + " Quantity: " + currentPart.getQuantity());
            }
        }
        if (!found) {
            System.out.println("Invalid part name");
        }
    }

    /**
     * this method allows the office manager to enter a part by number to the the information for said part
     * @param partNumber
     */
    public void examinePartNumber(int partNumber) {//office manager can enter part number and get part info
        boolean found = false;

        for (int i = 0; bikeParts.size() > i; i++) {
            BikePart currentPart = bikeParts.get(i);

            if (currentPart.getPartNumber() == partNumber) {
                found = true;
                System.out.println("PartName: " + currentPart.getPartName() + " " + "PartNumber: " + currentPart.getPartNumber() + " " +
                        "ListPrice: " + currentPart.getListPrice() + " " + "SalePrice: "
                        + currentPart.getSalePrice() + " " + "Quantity: " + currentPart.getQuantity());
            }
        }
        if (!found) {
            System.out.println("Invalid part number");
        }
    }

    /**
     * this method alerts the office manager when there are part/s that are near or below their minimum quantity and need
     * to be restocked in the warehouse
     */
    public void orderPartsAlert() {//need an additional method that notifies all parts that are at/below minimum qty
        //this method should be used in conjunction with sellpart
        for (int i = 0; bikeParts.size() > i; i++) {
            BikePart currentPart = bikeParts.get(i);

            if (currentPart.getQuantity() <= currentPart.getMinimumQuantity() + 1) {
                System.out.println("The quantity is getting low for this part: " + currentPart.getPartName() + " " + "The current quantity is: " + currentPart.getQuantity() + " " + "The minimum quantity is: " + currentPart.getMinimumQuantity());
            }
        }
    }

    /**
     * this method generates the commission of the salesperson that is chosen.
     */
    public void salesCommissions() {
        SalesAssociate salesAssociate = new SalesAssociate();
        salesAssociate.commission();

    }
}

