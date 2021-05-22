package kampOdevRecordAndLogin.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kampOdevRecordAndLogin.dataAccess.abstracts.UserDao;
import kampOdevRecordAndLogin.entity.concretes.User;

public class MyDbUserDao implements UserDao {

	public List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println(user.getName() + ": Kullanýcý doðrulama mail'i gönderildi . Doðrulama mail'i onaylandý . Kayýt baþarýlý");

	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName() + ": Kullanýsý veri tananýndan silindi");

	}

	@Override
	public void update(User user) {
		System.out.println(user.getName() + ": Kullanýsý veri tananýnda güncellendi");

	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean emailExist(User user) {
		for (User person : users)
			if (person.getEmail() == user.getEmail()) {
				return false;
			}
		return true;
	}

}
