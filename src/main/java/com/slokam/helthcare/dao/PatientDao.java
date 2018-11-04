package com.slokam.helthcare.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.helthcare.entity.Patient;

@Repository
public interface PatientDao extends JpaRepository<Patient, Long>{
	@Query("select p.name,d.name,c.description,me.name,m.quantity,m.howtoUse from Complaint c join c.disease "
			+ "di join c.visiting v join v.appointment a join a.patient p join v.doctor d join c.mclist m "
			+ "join m.medicne me where di.name = ?1")
	public List<Object[]> getPatientByDisease(String diname);
	@Query("select p.name from Visiting v join v.doctor d join v.appointment a join a.patient p where d.name = ?1")
	public List<String> getPatientBYDoctor(String doctorname);
	@Query("select d.name from Visiting v join v.doctor d join v.appointment a join a.patient p where p.name = ?1")
	public List<String> getDoctorByPatient(String Pname);
	@Query("select p.name,a.primaryReason from Appointment a join  a.patient p where a.dateTime between ?1 and ?2")
	public List<Object[]> getDetailsBySdateAndEdate(Date startdate,Date enddate);
	@Query("select p.name,d.name,a.primaryReason from Visiting v join v.doctor d join v.appointment a join a.patient p"
			+ " where v.dateTime between ?1 and ?2")
	public List<Object[]> getallDetailsBySdateAndEdate(Date startdate,Date enddate);
}
