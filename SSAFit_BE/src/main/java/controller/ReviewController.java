package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dto.Review;
import model.service.ReviewService;
import model.service.ReviewServiceImpl;

@WebServlet("/review")
public class ReviewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ReviewService service = ReviewServiceImpl.getInstance();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch (action) {
		case "writeform": 
			doWriteForm(request, response);
			break;
		case "write":
			doWrite(request, response);
			break;
		case "list":
			doList(request, response);
			break;
		case "detail":
			doDetail(request, response);
			break;
		case "delete":
			doRemove(request, response);
			break;
		case "updateform":
			doUpdateForm(request, response);
			break;
		case "update":
			doUpdate(request, response);
			break;
		default:
			System.out.println("에러페이지로 가라");
			break;
		}
			
		
		
	}

	private void doUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Review review = service.getReview(Integer.parseInt(request.getParameter("id")));
		review.setUserName(request.getParameter("userName"));
		review.setContent(request.getParameter("content"));
		
		service.modifyReview(review);
		
		response.sendRedirect("review?action=list");
	}

	private void doUpdateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		Review review = service.getReview(id);
		request.setAttribute("review", review);
		request.getRequestDispatcher("/WEB-INF/review/updateform.jsp").forward(request, response);
	}

	private void doRemove(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		service.removeReview(id);
		response.sendRedirect("review?action=list");
	}

	private void doDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		request.setAttribute("review", service.getReview(id));
		request.getRequestDispatcher("/WEB-INF/review/detail.jsp").forward(request, response);
	}

	private void doList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("list", service.getList());
		request.getRequestDispatcher("/WEB-INF/review/list.jsp").forward(request, response);
	}

	private void doWrite(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String userName = request.getParameter("userName");
		String content = request.getParameter("content");
		
		Review review = new Review(userName, content);
		
		service.writeReview(review);
		
		
		response.sendRedirect("review?action=list");
		
		
		
	}

	private void doWriteForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/review/writeform.jsp").forward(request, response);
	}
	

}
