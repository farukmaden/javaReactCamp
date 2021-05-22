package kampOdevRecordAndLogin.business.abstracts;

import java.util.List;

import kampOdevRecordAndLogin.entity.concretes.User;

public interface UserService {
	void add(User user);

	void delete(User user);

	void update(User user);

	List<User> getAll();

	void login(User user, String email, String password);

	void loginWithGoogle(User user);
}
