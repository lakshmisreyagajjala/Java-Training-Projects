package com.doctorapp.client;

import java.util.Scanner;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

public class DoctorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		IDoctorService doctorService = new DoctorServiceImpl();
		System.out.println("Welcome to Doctor App! Please choose the below operations to perform: ");
		System.out.println(
				"1. Add Doctor\n 2. Update Doctor \n 3. Get Doctors By ID's \n 4. Get All Doctors \n 5. Delete Doctor By Id\n 6. Get Doctor By Specialist\n 7. Get Docotor By Specialist And By Experience\n 8. Get Doctor By Specialist And By Fees");
		int choice = scanner.nextInt();
		if (choice == 1) {
			scanner.nextLine();
			System.out.println("Enter name: ");
			String name = scanner.nextLine();
			System.out.println("Enter speciality: ");
			String specialist = scanner.nextLine();
			System.out.println("Enter experience: ");
			Integer experience = scanner.nextInt();
			System.out.println("Enter fees: ");
			Double fees = scanner.nextDouble();
			Doctor doctor = new Doctor(name, specialist, fees, experience);
			doctorService.addDoctor(doctor);
		} else if (choice == 2) {
			System.out.println("Enter doctor Id to update fees");
			int id = scanner.nextInt();
			System.out.println("Enter new fees to add to doctor");
			Double fees = scanner.nextDouble();
			doctorService.updateDoctor(id, fees);
		} else if (choice==3) {
			System.out.println("Enter doctor Id to fetch doctor");
			int id = scanner.nextInt();
			doctorService.getById(id);
		} else if (choice==4) {
			doctorService.getAllDoctors();	
		} else if (choice==5) {
			System.out.println("Enter doctor Id to delete doctor");
			int id = scanner.nextInt();
			doctorService.deleteDoctor(id);	
		} else if (choice==6) {
			System.out.println("Enter doctor specialization to fetch doctor");
			String speciality = scanner.nextLine();
			doctorService.getBySpeiality(speciality);
		} else if (choice==7) {
			System.out.println("Enter doctor specialization and experience to fetch doctors");
			System.out.println("Specialization: ");
			String speciality = scanner.nextLine();
			System.out.println("Enter experience: ");
			Integer experience = scanner.nextInt();
			doctorService.getBySpeialityAndExp(speciality,experience);
		} else {
			System.out.println("Enter doctor specialization and fees to fetch doctors");
			System.out.println("Specialization: ");
			String speciality = scanner.nextLine();
			System.out.println("Enter fees: ");
			Double fees = scanner.nextDouble();
			doctorService.getBySpeialityAndFees(speciality, fees);
		}


	}

}
