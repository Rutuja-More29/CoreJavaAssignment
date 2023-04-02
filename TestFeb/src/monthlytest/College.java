package monthlytest;

import javax.xml.validation.Validator;

interface College {
	 AdmissionsFactory createAdmmisionsFactory();
	// AcademicsFactory createAcademicsFactory();
}
  interface AdmissionsFactory{
	  Validator createValidator();
  }
 