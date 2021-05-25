package kodlamaio.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
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
	public DataResult<List<JobPosition>> GetAll() {

		return new SuccessDataResult<List<JobPosition>>(dao.findAll(), "İş mövqeləri listələndi");
	}

	@Override
	public DataResult<JobPosition> GetById( int id) {
		
		return new SuccessDataResult<JobPosition>(dao.findById(id).get(), "İş mövqesinin detayları listələndi");
	}

}
