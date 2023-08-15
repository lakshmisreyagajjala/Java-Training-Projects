package com.doctorapp.service;

import java.util.List;

import com.doctorapp.dao.DoctorDaoImpl;
import com.doctorapp.dao.IDoctorDao;
import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public class DoctorServiceImpl implements IDoctorService {
	IDoctorDao doctorService = new DoctorDaoImpl();
	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorService.addDoctor(doctor);

	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		return doctorService.updateDoctor(doctorId, fees);
	}

	@Override
	public Doctor getById(int doctorId) {
		// TODO Auto-generated method stub
		return doctorService.findById(doctorId);
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		doctorService.deleteDoctor(doctorId);

	}

	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return doctorService.findAllDoctors();
	}

	@Override
	public List<Doctor> getBySpeiality(String speciality) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return doctorService.findBySpeciality(speciality);
	}

	@Override
	public List<Doctor> getBySpeialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return doctorService.findBySpecialityAndExperience(speciality, experience);
	}

	@Override
	public List<Doctor> getBySpeialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return doctorService.findBySpecialityAndFees(speciality, fees);
	}

}
