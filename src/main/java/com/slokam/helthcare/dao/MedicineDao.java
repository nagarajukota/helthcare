package com.slokam.helthcare.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.helthcare.entity.Medicine;

@Repository
public interface MedicineDao extends JpaRepository<Medicine, Long>{
	@Query("select p.name,d.name,di.name,di.description from Medication m join m.medicne me join m.complaint c "
			+ " join c.disease di join c.visiting v "
			+ "join v.appointment a join v.doctor d join a.patient p where me.name = ?1")
	public List<Object[]> getPatientdetailsByMedicene(String medicinename);
}
