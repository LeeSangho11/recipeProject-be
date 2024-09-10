package kr.recipeProject.study.service.login;

import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.recipeProject.study.repository.login.ListUsrChildMnuAtrtMapper;
import kr.recipeProject.study.repository.login.ListUsrMnuAtrtMapper;
import kr.recipeProject.study.repository.login.LoginMapper;
import kr.recipeProject.study.repository.login.LoginProcMapper;
import kr.recipeProject.study.vo.login.LgnInfoModel;
import kr.recipeProject.study.vo.login.LoginVO;
import kr.recipeProject.study.vo.login.UserVO;
import kr.recipeProject.study.vo.login.UsrMnuAtrtModel;
import kr.recipeProject.study.vo.login.UsrMnuChildAtrtModel;

@Service
public class ListUsrChildMnuAtrtService {
	
	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());

	// Get class name for logger
	private final String className = this.getClass().toString();
	   
	
	@Autowired
	private ListUsrChildMnuAtrtMapper listUsrChildMnuAtrtMapper;
	
	
	/**  사용자 자식 메뉴 권한 */
	public List<UsrMnuChildAtrtModel> listUsrChildMnuAtrt(Map<String, Object> paramMap) {
		return listUsrChildMnuAtrtMapper.listUsrChildMnuAtrt(paramMap);
	}

}
