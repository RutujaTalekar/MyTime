package com.rem.mt.daos;

import java.util.List;

import com.rem.mt.entities.ReopenRequest;

public interface ReopenRequestDao {
	public List<ReopenRequest> getAllReopenRequests(int eid);
	public ReopenRequest insertReopenRequest(ReopenRequest reopenRequest);
	public boolean updateStatusApproved(int rid);
	public boolean updateStatusRejected(int rid);

	public boolean deleteReopenRequest(int rid);
	 

}
