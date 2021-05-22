package kampOdevRecordAndLogin.business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import kampOdevRecordAndLogin.business.abstracts.UserService;
import kampOdevRecordAndLogin.core.abstracts.RegisterService;
import kampOdevRecordAndLogin.dataAccess.abstracts.UserDao;
import kampOdevRecordAndLogin.entity.concretes.User;

public class UserManager implements UserService {

	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	private UserDao userDao;
	private RegisterService registerService;

	public UserManager(UserDao userDao, RegisterService registerService) {
		super();
		this.userDao = userDao;
		this.registerService = registerService;
	}

	@Override
	public void add(User user) {
		if (!nameControl(user.getName())) {
			System.out.println("İsminiz en az 3 karakter içermeli");
		} else if (!lastNameControl(user.getLastName())) {
			System.out.println("Soyisminiz en az 3 karakter içermeli");
		} else if (!passwordControl(user.getPassword())) {
			System.out.println("Şifre en az 7 karakter içermeli");
		} else if (!emailControl(user.getEmail())) {
			System.out.println("E mail bilgileriniz geçersiz dir");
		} else if (!userDao.emailExist(user)) {
			System.out.println("E mail şuan kullanımda");
		} else {
			System.out.println("");
			this.userDao.add(user);
		}

	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);

	}

	@Override
	public void update(User user) {
		this.userDao.update(user);

	}

	@Override
	public List<User> getAll() {
		System.out.println(userDao.getAll());
		return null;
	}

	private boolean nameControl(String name) {
		if (name.length() <= 2) {
			return false;
		} else {
			return true;
		}
	}

	private boolean lastNameControl(String lastName) {
		if (lastName.length() <= 2) {
			return false;
		} else {
			return true;
		}
	}

	private boolean passwordControl(String password) {
		if (password.length() <= 6) {
			return false;
		} else {
			return true;
		}
	}

	private boolean emailControl(String email) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(email).find();
	}

	@Override
	public void login(User user, String email, String password) {
		if (user.getEmail() != email) {
			System.out.println("E mailiniz hatalı");
		} else if (user.getPassword() != password) {
			System.out.println("Parolanız hatalı");
		} else {
			System.out.println(user.getName() + " : Giriş işleminiz başarılı");
		}

	}

	@Override
	public void loginWithGoogle(User user) {
		this.registerService.login("Google ile giriş yaptınız :" + user.getName());

	}

}
