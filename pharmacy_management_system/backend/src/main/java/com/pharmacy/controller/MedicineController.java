package com.pharmacy.controllers;

import com.pharmacy.dao.MedicineDAO;
import com.pharmacy.model.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicines")
@CrossOrigin(origins = "*")
public class MedicineController {

    @Autowired
    private MedicineDAO medicineDAO;

    @GetMapping
    public List<Medicine> getAllMedicines() {
        return medicineDAO.getAllMedicines();
    }

    @PostMapping
    public boolean addMedicine(@RequestBody Medicine medicine) {
        return medicineDAO.addMedicine(medicine);
    }

    @PutMapping("/{id}")
    public boolean updateMedicine(@PathVariable int id, @RequestBody Medicine medicine) {
        return medicineDAO.updateMedicine(id, medicine);
    }

    @DeleteMapping("/{id}")
    public boolean deleteMedicine(@PathVariable int id) {
        return medicineDAO.deleteMedicine(id);
    }
}
