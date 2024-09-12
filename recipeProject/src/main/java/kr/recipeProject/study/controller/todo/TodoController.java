package kr.recipeProject.study.controller.todo;

import java.io.File;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.recipeProject.study.service.todo.TodoService;
import kr.recipeProject.study.vo.notice.NoticeModel;
import kr.recipeProject.study.vo.todo.TodoModel;

@Controller
@RequestMapping("/system/")
public class TodoController {

	@Autowired
	private TodoService todoService;
	
		@RequestMapping("todoList")
		@ResponseBody
		public Map<String, Object> todoList(@RequestParam Map<String, Object> paramMap) throws Exception {

			int currentPage = Integer.parseInt((String) paramMap.get("currentpage")); // 현재페이지
			int pageSize = Integer.parseInt((String) paramMap.get("pagesize"));
			int pageIndex = (currentPage - 1) * pageSize;
			
			paramMap.put("pageIndex", pageIndex);
			paramMap.put("pageSize", pageSize);

			List<TodoModel> todoList = todoService.todoList(paramMap);

			// 목록 수 추출해서 보내기
			int todoCnt = todoService.totCnt(paramMap);

			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put("listData", todoList); // success 용어 담기
			resultMap.put("totalcnt", todoCnt); // 리턴 값 해쉬에 담기
			resultMap.put("pageSize", pageSize);
			resultMap.put("currentPage", currentPage);

			return resultMap;
		}
		
		@PostMapping("todoUpdate")
		@ResponseBody
		public Map<String, Object> todoUpdate(@RequestParam Map<String, Object> paramMap, HttpServletRequest request) throws Exception {

			Map<String, Object> returnmap = new HashMap<String,Object>();
			
			try {		
				todoService.updateTodo(paramMap);
				//noticeService.noticeUpdatefile(paramMap, request);
				
				returnmap.put("result",1);
				returnmap.put("resultMsg","수정 되었습니다.");
				
				return returnmap;
				
			} catch (Exception e) {
				throw e;
			}
		}
		
		@PostMapping("todoInsert")
		@ResponseBody
		public Map<String, Object> insertNotice(@RequestParam Map<String, Object> paramMap, HttpServletRequest request) throws Exception {

			Map<String, Object> returnmap = new HashMap<String,Object>();
			try {
				todoService.insertTodo(paramMap);
				//noticeService.insertNoticefile(paramMap,request);
				
				returnmap.put("result",1);
				returnmap.put("resultMsg","등록 되었습니다.");
				
				return returnmap;
				
			} catch (Exception e) {
				throw e;
			}
		}
		
		@PostMapping("todoDetail")
		@ResponseBody
		public Map<String, Object> todoDetail(@RequestParam Map<String, Object> paramMap) throws Exception {
		
			Map<String, Object> resultMap = new HashMap<String, Object>();
			try {
				TodoModel todoDetail = todoService.todoDetail(paramMap);
				
				resultMap.put("todoDetail", todoDetail);
				
				return resultMap;
				
			} catch (Exception e) {
				throw e;
			}
		}
		
		@PostMapping("todoDelete")
		@ResponseBody
		public Map<String, Object> todoDelete(@RequestParam Map<String, Object> paramMap) throws Exception {
		
			Map<String, Object> resultMap = new HashMap<String, Object>();
			try {
				todoService.deleteTodo(paramMap);
				
				resultMap.put("result",1);
				resultMap.put("resultMsg","삭제 되었습니다.");
				
				return resultMap;
				
			} catch (Exception e) {
				throw e;
			}
		}

}
