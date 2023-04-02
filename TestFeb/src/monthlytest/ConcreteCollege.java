package monthlytest;

import javax.xml.validation.Validator;

class UdergraduateAdmissionsFactory implements AdmissionsFactory{

	@Override
	public Validator createValidator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class GraduateAdmissionFactory implements AdmissionsFactory{

	@Override
	public Validator createValidator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

	


public class ConcreteCollege implements College {

	@Override
	public AdmissionsFactory createAdmmisionsFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
