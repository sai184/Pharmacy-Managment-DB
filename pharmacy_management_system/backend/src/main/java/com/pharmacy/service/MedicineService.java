package com.pharmacy.service;

import com.pharmacy.dao.MedicinesDAO;
import com.pharmacy.model.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService {

    @Autowired
    private MedicinesDAO medicinesDAO;

    public List<Medicine> getAllMedicines() {
        return medicinesDAO.getAllMedicines();
    }

    public void addMedicine(Medicine medicine) {
        medicinesDAO.addMedicine(medicine);
    }

    // Additional business methods related to Medicines can go here
}
