package com.flipkart.dao;

import java.util.List;

import com.flipkart.bean.Center;
import com.flipkart.bean.CenterOwner;
/**
 * Interface for Flipfit admin operations.
 */
public interface AdminDaoInterface {
	/**
	 * Views all Center Owner Requests.
	 *
	 * @return A list of all Center Owner Requests.
	 */
	public List<CenterOwner> viewRequest();
	/**
	 * Views all Center Owners.
	 *
	 * @return A list of all Center Owners.
	 */
	public List<CenterOwner> viewAllCenterOwners();
	/**
	 * Approves a Center Owner's request.
	 *
	 * @param ownerId The ID of the Center Owner whose request is to be approved.
	 * @return 1 if the request is approved, 0 otherwise.
	 */
	public int validateOwnerRequest(int ownerId);
	/**
	 * Views all Centers.
	 *
	 * @return A list of all Centers.
	 */
	public List<Center> viewCenters();
	/**
	 * Removes a Center Owner.
	 *
	 * @param ownerId The ID of the Center Owner to be removed.
	 * @return 1 if the owner is removed, 0 otherwise.
	 */
	public void removeGymOwner(int ownerId);

}
