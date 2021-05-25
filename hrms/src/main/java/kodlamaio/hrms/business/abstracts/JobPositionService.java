package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concrete.JobPosition;

public interface JobPositionService {
	
 DataResult<List<JobPosition>> GetAll();
 DataResult<JobPosition> GetById(int id);
 
 
}
