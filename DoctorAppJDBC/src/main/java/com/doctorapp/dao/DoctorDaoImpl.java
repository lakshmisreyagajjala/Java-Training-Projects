package com.doctorapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DBConnection;
import com.doctorapp.util.Queries;

public class DoctorDaoImpl implements IDoctorDao {

	@Override
	public void addDoctor(Doctor doctor) {
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.INSERTQUERY);) {
			preparedStatement.setString(1, doctor.getDoctorName());
			preparedStatement.setString(2, doctor.getSpecality());
			preparedStatement.setInt(3, doctor.getExperience());
			preparedStatement.setDouble(4, doctor.getFees());
			preparedStatement.execute();
			System.out.println("Doctor added sucesfully");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Doctor> findAllDoctors() {
		List<Doctor> doctorList = new ArrayList<Doctor>();

		// TODO Auto-generated method stub
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETALLQUERY);) {
			System.out.println("Fetching all doctors...");
			try (ResultSet docResultSet = preparedStatement.executeQuery();) {
				while (docResultSet.next()) {

					String name = docResultSet.getString("doctorName");
					String speciality = docResultSet.getString("speciality");
					Integer experience = docResultSet.getInt("experience");
					Double fees = docResultSet.getDouble("fees");
					Doctor doctor = new Doctor(name, speciality, fees, experience);

					doctorList.add(doctor);
					System.out.println(doctor.toString());
				}
			}
			return doctorList;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.UPDATEQUERY);) {
			preparedStatement.setDouble(1, fees);
			preparedStatement.setInt(2, doctorId);
			preparedStatement.execute();
			System.out.println("Doctor updated sucesfully");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		return 0;
		return doctorId;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.DELETEBYID);) {
			preparedStatement.setInt(1, doctorId);
			preparedStatement.execute();
			System.out.println("Doctor with id: " + doctorId + " sucessfully deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Doctor findById(int doctorId) {
		Doctor doctor = new Doctor();
		// TODO Auto-generated method stub
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.QUERYBYID);) {
			preparedStatement.setInt(1, doctorId);
			try (ResultSet rt = preparedStatement.executeQuery();) {
				while (rt.next()) {

					String name = rt.getString("doctorName");
					String speciality = rt.getString("speciality");
					Integer experience = rt.getInt("experience");
					Double fees = rt.getDouble("fees");
					doctor.setDoctorName(name);
					doctor.setSpecality(speciality);
					doctor.setExperience(experience);
					doctor.setFees(fees);
					System.out.println("Doctor found sucesfully");
					System.out.println(doctor.toString());
				}
				return doctor;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		List<Doctor> doctorList = new ArrayList<Doctor>();

		try (Connection connection = DBConnection.openConnection();
				PreparedStatement ps = connection.prepareStatement(Queries.QUERYBYSPECIALITY);) {

			ps.setString(1, speciality);
			System.out.println("Getting doctors with specialization: " + speciality);
			try (ResultSet rt = ps.executeQuery()) {
				while (rt.next()) {
					String name = rt.getString("doctorName");
					Integer experience = rt.getInt("experience");
					Double fees = rt.getDouble("fees");
					Doctor doctor = new Doctor(name, speciality, fees, experience);
					doctorList.add(doctor);
					System.out.println(doctor.toString());
				}
			}
			return doctorList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Doctor> findBySpecialityAndExperience(String speciality, int experience)
			throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		List<Doctor> doctorList = new ArrayList<Doctor>();

		try (Connection connection = DBConnection.openConnection();
				PreparedStatement ps = connection.prepareStatement(Queries.QUERYBYSPECIALITYEXP);) {

			ps.setString(1, speciality);
			ps.setInt(2, experience);
			System.out.println("Getting doctors with specialization: " + speciality + " and with experience of: "
					+ experience + " years");
			try (ResultSet rt = ps.executeQuery()) {
				while (rt.next()) {
					String name = rt.getString("doctorName");
					Double fees = rt.getDouble("fees");
					Integer doctorExperience = rt.getInt("experience");
					Doctor doctor = new Doctor(name, speciality, fees, doctorExperience);
					doctorList.add(doctor);
					System.out.println(doctor.toString());
				}
			}
			return doctorList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Doctor> findBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		List<Doctor> doctorList = new ArrayList<Doctor>();

		try (Connection connection = DBConnection.openConnection();
				PreparedStatement ps = connection.prepareStatement(Queries.QUERYBYSPECIALITYFEE);) {

			ps.setString(1, speciality);
			ps.setDouble(2, fees);
			System.out.println("Getting doctors with specialization: " + speciality + " and with fee of: " + fees);
			try (ResultSet rt = ps.executeQuery()) {
				while (rt.next()) {
					String name = rt.getString("doctorName");
					Double doctorFees = rt.getDouble("fees");
					Integer doctorExperience = rt.getInt("experience");
					Doctor doctor = new Doctor(name, speciality, doctorFees, doctorExperience);
					doctorList.add(doctor);
					System.out.println(doctor.toString());
				}
			}
			return doctorList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
