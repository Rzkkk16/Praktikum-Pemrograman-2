package com.example.module7.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;

public class MainController {
    @FXML private CustomerController customerTabController;
    @FXML private BookController bookTabController;
    @FXML private SaleController saleTabController;

    @FXML private Tab saleTabContainer;

    @FXML
    public void initialize() {
        saleTabContainer.setOnSelectionChanged(event -> {
            if (saleTabContainer.isSelected() && saleTabController != null) {
                saleTabController.refreshData();
            }
        });
    }
}
