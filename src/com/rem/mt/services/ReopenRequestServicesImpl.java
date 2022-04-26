package com.rem.mt.services;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.rem.mt.daos.ReopenRequestDao;
import com.rem.mt.entities.ReopenRequest;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class ReopenRequestServicesImpl implements ReopenRequestServices {
	@Resource
	private ReopenRequestDao dao;

	@Override
	public List<ReopenRequest> displayReopenRequestList(int eid) {
		return dao.getAllReopenRequests(eid);
	}

	@Override
	public ReopenRequest addReopenRequest(ReopenRequest reopenRequest) {
		return dao.insertReopenRequest(reopenRequest);
	}

	

	@Override
	public boolean findReopenRequestApprove(int rid) {
		
		return dao.updateStatusApproved(rid);	
	}

	@Override
	public boolean findReopenRequestReject(int rid) {
		
		return dao.updateStatusRejected(rid);
	}



	
}
