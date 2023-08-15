package com.doctorapp.service;

import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorService {

	void addDoctor(Doctor doctor);

	int updateDoctor(int doctorId, double fees);

	Doctor getById(int doctorId);

	void deleteDoctor(int doctorId);

	List<Doctor> getAllDoctors();

	List<Doctor> getBySpeiality(String speciality) throws DoctorNotFoundException;

	List<Doctor> getBySpeialityAndExp(String speciality, int experience) throws DoctorNotFoundException;

	List<Doctor> getBySpeialityAndFees(String speciality, double fees) throws DoctorNotFoundException;

}
