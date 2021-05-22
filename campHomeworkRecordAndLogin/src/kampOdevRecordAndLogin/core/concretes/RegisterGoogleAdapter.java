package kampOdevRecordAndLogin.core.concretes;

import kampOdevRecordAndLogin.core.abstracts.RegisterService;
import kampOdevRecordAndLogin.google.RegisterGoogle;

public class RegisterGoogleAdapter implements RegisterService {

	@Override
	public void login(String message) {
		RegisterGoogle registerGoogle = new RegisterGoogle();
		registerGoogle.login(message);

	}

}
