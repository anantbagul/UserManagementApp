package com.bagulIt.service;

import java.util.Map;

public interface ServiceI {

	public String loginCheck(LoginForm loginForm)

	public Map<Integer, String> getCountries();

	public Map<Integer, String> getStates(Integer countryId);

	public Map<Integer, String> getCities(Integer stateId);

	public boolean emailUnique(String email);

	public boolean saveUser(UserForm userForm);

	private boolean isTempPwdValid(String email, String tempPwd);

	public boolean unlockAccount(UnlockAccForm unlockAccForm);

	public String forgotPwd(String emailId);
}
