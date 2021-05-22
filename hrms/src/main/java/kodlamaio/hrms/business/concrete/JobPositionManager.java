package kodlamaio.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concrete.JobPosition;

@Service

public class JobPositionManager implements JobPositionService {
	private JobPositionDao dao;

	@Autowired
	public JobPositionManager(JobPositionDao dao) {

		this.dao = dao;
	}

	@Override
	public List<JobPosition> GetAll() {

		return dao.findAll();
	}

	@Override
	public JobPosition GetById(int id) {
		
		return dao.getById(id);
	}

}
