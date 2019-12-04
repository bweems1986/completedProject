package com.company;

public class WarehouseManager extends OfficeManager {

    public WarehouseManager(){
    }

    /**
     * allows warehouse manager to examine part information by part name
     * @param partName
     */
    @Override
    public void examinePartName(String partName) {
        super.examinePartName(partName);
    }

    /**
     * allows warehouse manager to examine part information by part number
     * @param partNumber
     */
    @Override
    public void examinePartNumber(int partNumber) {
        super.examinePartNumber(partNumber);
    }
}
