package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concrete.JobPosition;

public interface JobPositionService {
	
 List<JobPosition> GetAll();
 JobPosition GetById(int id);
}
