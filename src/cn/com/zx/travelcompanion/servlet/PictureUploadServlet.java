package cn.com.zx.travelcompanion.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.wxggt.dao.SmallVideoDAO;
import com.wxggt.dto.SmallVideo;
import com.wxggt.util.GetFile;

/**
 * Servlet implementation class PictureUploadServlet
 */
@WebServlet("/PictureUploadServlet")
public class PictureUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PictureUploadServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		/* 设置响应头允许ajax跨域访问 */
		response.setHeader("Access-Control-Allow-Origin", "*");
		/* 星号表示所有的异域请求都可以接受， */
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		GetFile file = new GetFile();
		request.setCharacterEncoding("gb2312");
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);// 验证是否有文件传输
		String user = null, content = null, username = null;
		if (isMultipart) {
			FileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload fileUpload = new ServletFileUpload(factory);
			List<FileItem> items;
			try {
				items = fileUpload.parseRequest(request);
				user = items.get(1).getString("UTF-8");
				content = items.get(0).getString("UTF-8");
				username = items.get(2).getString("UTF-8");
				String url = file.uploadFile(items.get(3), user);
				SmallVideoDAO smallvideo = new SmallVideoDAO();
				SmallVideo sv = new SmallVideo(username, user, url, 0, 0, 0, null, content);
				smallvideo.uploadSmallVideo(sv);
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 获取传输过来的信息
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
