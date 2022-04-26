package com.rem.mt.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import com.rem.mt.entities.ReopenRequest;
@Repository
public class ReopenRequestDaoImpl implements ReopenRequestDao {
	
	@PersistenceContext
    private EntityManager manager;

	
	@Override
	public List<ReopenRequest> getAllReopenRequests(int eid) {
		int ei,eio;
		List <ReopenRequest> reopenRequestList = null;
		List<ReopenRequest> reopenRequestListAll = new ArrayList<ReopenRequest>();
		System.out.println(reopenRequestListAll);
		
		//Fetching the list of eids under the obtained manid 
		Query qry1= manager.createQuery("select empId from Employee where manId =" +eid);
		List<Integer> eidList = qry1.getResultList();
		
		//Fetching the list of Reopenrequest for respective eid
		for(ei=0; ei<eidList.size();ei++){
		Query qry = manager.createQuery("from ReopenRequest where eId="+eidList.get(ei));
		reopenRequestList= qry.getResultList();
		
		//Adding the obtained list for the respective eid into another list
		reopenRequestListAll.addAll(reopenRequestList);
		}
		
		return reopenRequestListAll;
	}
	@Override
	public ReopenRequest insertReopenRequest(ReopenRequest reopenRequest) {
		Query qry = manager.createQuery("select MAX(rId) from ReopenRequest");
		Integer maxrId = (Integer) qry.getSingleResult();
		if(maxrId==null) {
			maxrId = 1;
		}
		else {
			maxrId += 1;
		}	
		System.out.println("Added");
		reopenRequest.setrId(maxrId);
		manager.persist(reopenRequest);
		return reopenRequest;
	}

	@Override
	public boolean updateStatusApproved(int rid) {
		if(manager.find(ReopenRequest.class, rid) != null) {
			//ReopenRequest reopen = new ReopenRequest();
			ReopenRequest reopen = manager.find(ReopenRequest.class, rid);
			reopen.setReopenStatus("Approved");
		
			return true;
		}
		return false;
		
	}
	
	@Override
	public boolean updateStatusRejected(int rid) {
		if(manager.find(ReopenRequest.class, rid) != null) {
			ReopenRequest reopen = manager.find(ReopenRequest.class, rid);
			//ReopenRequest reopen = new ReopenRequest();
			reopen.setReopenStatus("Rejected");
		
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteReopenRequest(int rid) {
		
	
		return false;
	}

}
