package kampOdevRecordAndLogin;

import kampOdevRecordAndLogin.business.abstracts.UserService;
import kampOdevRecordAndLogin.business.concretes.UserManager;
import kampOdevRecordAndLogin.core.concretes.RegisterGoogleAdapter;
import kampOdevRecordAndLogin.dataAccess.concretes.MyDbUserDao;
import kampOdevRecordAndLogin.entity.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "faruk", "maden", "faruk@gmail.com", "1234567");
		User user2 = new User(2, "ali", "veli", "ali@gmail.com", "abcdefghýjk");
		UserService userService = new UserManager(new MyDbUserDao(), new RegisterGoogleAdapter());
		userService.add(user);
		userService.add(user2);
		userService.login(user, "faruk@gmail.com", "1234567");
		userService.loginWithGoogle(user);

	}

}
