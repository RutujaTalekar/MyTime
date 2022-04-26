package com.rem.mt.services;

import java.util.List;

import com.rem.mt.entities.ReopenRequest;

public interface ReopenRequestServices {
	public List<ReopenRequest> displayReopenRequestList(int eid);
	public ReopenRequest addReopenRequest(ReopenRequest reopenRequest);
	public boolean findReopenRequestApprove(int rid);
	public boolean findReopenRequestReject(int rid);

	

}
