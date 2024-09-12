package kr.recipeProject.study.service.todo;

import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.recipeProject.study.repository.todo.TodoMapper;
import kr.recipeProject.study.vo.todo.TodoModel;

@Service
public class TodoService {

	@Autowired
	private TodoMapper todoMapper;
	
	public List<TodoModel> todoList(Map<String, Object> paramMap) throws Exception {
		return todoMapper.todoList(paramMap);
	}
	
	public int totCnt(Map<String, Object> paramMap) throws Exception {
		return todoMapper.totCnt(paramMap);
	}
	
	public void insertTodo(Map<String, Object> paramMap) throws Exception {
		todoMapper.insertTodo(paramMap);
	};
	
	public void updateTodo(Map<String, Object> paramMap) throws Exception {
		todoMapper.updateTodo(paramMap);
	};
	
	public TodoModel todoDetail(Map<String, Object> paramMap) throws Exception {
		return todoMapper.todoDetail(paramMap);
	};
	
	public void deleteTodo (Map<String, Object> paramMap) throws Exception {
		todoMapper.deleteTodo(paramMap);
	};
}
