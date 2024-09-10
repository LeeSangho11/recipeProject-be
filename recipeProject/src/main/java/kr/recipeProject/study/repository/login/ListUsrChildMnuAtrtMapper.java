package kr.recipeProject.study.repository.login;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.recipeProject.study.vo.login.LgnInfoModel;
import kr.recipeProject.study.vo.login.LoginVO;
import kr.recipeProject.study.vo.login.UserVO;
import kr.recipeProject.study.vo.login.UsrMnuAtrtModel;
import kr.recipeProject.study.vo.login.UsrMnuChildAtrtModel;

@Mapper
public interface ListUsrChildMnuAtrtMapper {
	List<UsrMnuChildAtrtModel> listUsrChildMnuAtrt(Map<String, Object> paramMap);
}
