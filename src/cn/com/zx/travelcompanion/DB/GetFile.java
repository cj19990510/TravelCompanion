package cn.com.zx.travelcompanion.DB;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class GetFile {
	// 文件上传的方法
	public String uploadFile(FileItem item, String user) throws Exception {
		char indexChar = '\\';
		String fileName = user + "_" + new Date().getTime() + item.getName().substring(item.getName().lastIndexOf("."));// 给文件重命名
		System.out.println(fileName);
		File saveFile = new File(fileName);
		item.write(saveFile);// 将item中的信息写进file里
		AliYunUpload aliyun = new AliYunUpload();
		String url = aliyun.uploadFile(saveFile, fileName);// 将文件上传到oSS
		return url;
	}

}
