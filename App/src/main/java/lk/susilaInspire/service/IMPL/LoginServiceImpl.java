package lk.susilaInspire.service.IMPL;

import lk.susilaInspire.entity.Login;
import lk.susilaInspire.repo.LoginRepo;
import lk.susilaInspire.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {


    private LoginRepo repo;

    public Login login(String username, String password) {
        Login user = repo.findByUsernameAndPassword(username, password);
        return user;
    }


}
