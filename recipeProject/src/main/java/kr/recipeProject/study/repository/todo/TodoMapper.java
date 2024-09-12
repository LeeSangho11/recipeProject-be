package kr.recipeProject.study.repository.todo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.recipeProject.study.vo.todo.TodoModel;

@Mapper
public interface TodoMapper {

	public List<TodoModel> todoList(Map<String, Object> paramMap);
	
	public int totCnt(Map<String, Object> paramMap);
	
	public void updateTodo(Map<String, Object> paramMap) throws Exception;
	
	public void insertTodo(Map<String, Object> paramMap) throws Exception;
	
	public TodoModel todoDetail(Map<String, Object> paramMap) throws Exception;
	
	public void deleteTodo(Map<String, Object> paramMap) throws Exception;
}
