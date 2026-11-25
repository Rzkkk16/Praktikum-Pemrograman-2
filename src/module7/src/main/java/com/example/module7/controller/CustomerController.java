package com.example.module7.controller;

import com.example.module7.model.Customer;
import com.example.module7.service.CustomerService;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.text.TableView;
import java.awt.*;

public class CustomerController {
    @FXML private TextField nameField;
    @FXML private TextField emailField;
    @FXML private TextField phoneField;

    @FXML private TableView<Customer> customerTable;
    @FXML private TableColumn<Customer, String> nameColumn;
    @FXML private TableColumn<Customer, String> emailColumn;
    @FXML private TableColumn<Customer, String> phoneColumn;

    private final CustomerService customerService = new CustomerService();

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));

        loadCustomers();

        customerTable.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSelection, selectedCustomer) -> {
                    if (selectedCustomer != null) {
                        nameField.setText(selectedCustomer.getName());
                        emailField.setText(selectedCustomer.getEmail());
                        phoneField.setText(selectedCustomer.getPhone());
                    }
                }
        );
    }

    private void loadCustomers() {
        customerTable.setItems(customerService.findAllCustomers());
    }

    private void clearFields() {
        nameField.clear();
        emailField.clear();
        phoneField.clear();
        customerTable.getSelectionModel().clearSelection();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void handleAddCustomer() {
        try {
            Customer customer = new Customer(0, nameField.getText(), emailField.getText(), phoneField.getText());
            customerService.addCustomer(customer);
            loadCustomers();
            clearFields();
        } catch (IllegalArgumentException e) {
            showAlert("Validation Error", e.getMessage());
        }
    }

    @FXML
    private void handleEditCustomer() {
        Customer selected = customerTable.getSelectionModel().getSelectedItem();
        if (selected == null) {
            showAlert("Selection Error", "Please select a customer from the table to edit.");
            return;
        }

        try {
            selected.setName(nameField.getText());
            selected.setEmail(emailField.getText());
            selected.setPhone(phoneField.getText());

            customerService.updateCustomer(selected);
            loadCustomers();
            clearFields();
        } catch (IllegalArgumentException e) {
            showAlert("Validation Error", e.getMessage());
        }
    }

    @FXML
    private void handleDeleteCustomer() {
        Customer selected = customerTable.getSelectionModel().getSelectedItem();
        if (selected == null) {
            showAlert("Selection Error", "Please select a customer from the table to delete.");
            return;
        }

        customerService.deleteCustomer(selected.getCustomerId());
        loadCustomers();
        clearFields();
    }
}