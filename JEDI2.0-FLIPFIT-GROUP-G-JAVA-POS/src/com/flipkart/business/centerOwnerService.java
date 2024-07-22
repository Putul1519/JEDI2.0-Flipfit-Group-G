package com.flipkart.business;
import com.flipkart.dao.*;

import java.util.*;

import com.flipkart.bean.*;

/**
 * Service class implementing operations for center owner management.
 */
public class centerOwnerService implements centerOwnerServiceInterface{
	CenterOwnerDaoInterface ownerDao=new CenterOwnerDaoImpl();
	/**
	 * Creates a new owner with the specified details.
	 * @param userId
	 * @param userPhoneNumber
	 * @param ownerGstNo
	 * @param aadharNo
	 */
	public void createOwner(int userId,String userPhoneNumber,String ownerGstNo,String aadharNo) {
		ownerDao.createOwner(userId,userPhoneNumber,ownerGstNo,aadharNo);
	}
	/**
	 * Adds a new center.
	 * @param centerName
	 * @param centerLoc
	 * @param ownerId
	 */
	public void addCenter(String centerName, String centerLoc,int ownerId) {
		ownerDao.addCenter(centerName, centerLoc, ownerId);
		System.out.println("Gym Registered!");
	}
	/**
	 * Updates the details of a center.
	 * @param gymId
	 * @param gymName
	 * @param gymLoc
	 */
	public void updateCenterDetails(int gymId,String gymName, String gymLoc)
	{
		ownerDao.updateCenterDetails(gymId, gymName, gymLoc);
		System.out.println("Update Successfull!");
		
	}
	/**
	 * Retrieves the details of a center.
	 * @param gymId
	 * @return A list of Center objects.
	 */
	public List<Center> getCenterDetails(int gymId)
	{
		return ownerDao.getCenterDetails(gymId);
	}

	/**
	 * Adds a new slot.
	 * @param gymId
	 * @param startTime
	 * @param endTime
	 * @param slotCap
	 * @param price
	 */
	public void addSlot(int gymId, String startTime, String endTime, int slotCap,String price)
	{
		ownerDao.addSlot(gymId,startTime,endTime,slotCap,price);
		System.out.println("Slot Added!");
		
	}
	/**
	 * Retrieves all slots for a center.
	 * @param centerId
	 * @return A list of Slot objects.
	 */
	public List<Slot> viewSlots(int centerId)
	{
		return ownerDao.viewSlots(centerId);
	}
	/**
	 * Retrieves all bookings for a center.
	 * @param gymId
	 * @return A list of Booking objects.
	 */
	public List<Booking> viewAllBooking(int gymId) // try using 2D matrix
	{
		return ownerDao.viewAllBooking(gymId);
	}
	/**
	 * Edits the details of a center owner.
	 * @param ownerId
	 * @param name
	 * @param email
	 * @param contactNo
	 * @param aadharNo
	 * @param gstnNo
	 */
	public void editYourDetails(int ownerId,String name,String email,String contactNo,String aadharNo,String gstnNo)
	{
		ownerDao.editYourDetails(ownerId, name, email, contactNo, aadharNo, gstnNo);
	}
}
