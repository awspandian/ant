/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.sbi.wms.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.sbi.wms.model.Exclusif_WMS;

/**
 * The persistence interface for the exclusif_ w m s service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Syed
 * @see Exclusif_WMSPersistenceImpl
 * @see Exclusif_WMSUtil
 * @generated
 */
public interface Exclusif_WMSPersistence extends BasePersistence<Exclusif_WMS> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Exclusif_WMSUtil} to access the exclusif_ w m s persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the exclusif_ w m s in the entity cache if it is enabled.
	*
	* @param exclusif_WMS the exclusif_ w m s
	*/
	public void cacheResult(com.sbi.wms.model.Exclusif_WMS exclusif_WMS);

	/**
	* Caches the exclusif_ w m ses in the entity cache if it is enabled.
	*
	* @param exclusif_WMSs the exclusif_ w m ses
	*/
	public void cacheResult(
		java.util.List<com.sbi.wms.model.Exclusif_WMS> exclusif_WMSs);

	/**
	* Creates a new exclusif_ w m s with the primary key. Does not add the exclusif_ w m s to the database.
	*
	* @param recId the primary key for the new exclusif_ w m s
	* @return the new exclusif_ w m s
	*/
	public com.sbi.wms.model.Exclusif_WMS create(long recId);

	/**
	* Removes the exclusif_ w m s with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param recId the primary key of the exclusif_ w m s
	* @return the exclusif_ w m s that was removed
	* @throws com.sbi.wms.NoSuchExclusif_WMSException if a exclusif_ w m s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.Exclusif_WMS remove(long recId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.sbi.wms.NoSuchExclusif_WMSException;

	public com.sbi.wms.model.Exclusif_WMS updateImpl(
		com.sbi.wms.model.Exclusif_WMS exclusif_WMS, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the exclusif_ w m s with the primary key or throws a {@link com.sbi.wms.NoSuchExclusif_WMSException} if it could not be found.
	*
	* @param recId the primary key of the exclusif_ w m s
	* @return the exclusif_ w m s
	* @throws com.sbi.wms.NoSuchExclusif_WMSException if a exclusif_ w m s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.Exclusif_WMS findByPrimaryKey(long recId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.sbi.wms.NoSuchExclusif_WMSException;

	/**
	* Returns the exclusif_ w m s with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param recId the primary key of the exclusif_ w m s
	* @return the exclusif_ w m s, or <code>null</code> if a exclusif_ w m s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.Exclusif_WMS fetchByPrimaryKey(long recId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the exclusif_ w m ses.
	*
	* @return the exclusif_ w m ses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.sbi.wms.model.Exclusif_WMS> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the exclusif_ w m ses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of exclusif_ w m ses
	* @param end the upper bound of the range of exclusif_ w m ses (not inclusive)
	* @return the range of exclusif_ w m ses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.sbi.wms.model.Exclusif_WMS> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the exclusif_ w m ses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of exclusif_ w m ses
	* @param end the upper bound of the range of exclusif_ w m ses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of exclusif_ w m ses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.sbi.wms.model.Exclusif_WMS> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the exclusif_ w m ses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of exclusif_ w m ses.
	*
	* @return the number of exclusif_ w m ses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}