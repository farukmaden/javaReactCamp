package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.JobTitlesService;
import javakamp.hrms.dataAccess.abstracts.JobTitlesDao;
import javakamp.hrms.entities.concretes.JobTitles;

@Service
public class JobTitleManager implements JobTitlesService{
	
	private JobTitlesDao jobTitleDao;

	@Autowired
	public JobTitleManager(JobTitlesDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public List<JobTitles> getAll() {
		return this.jobTitleDao.findAll();
	}

}
