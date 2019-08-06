package cn.com.zx.travelcompanion.DB;
/*
 *@author 作者 陈杰
 *@vrsion 创建时间 2019.02.13
 * */
import java.io.File;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectResult;

public class AliYunUpload {
	// 阿里云API的内或外网域名
	private static String ENDPOINT;
	// 阿里云API的密钥Access Key ID
	private static String ACCESS_KEY_ID;
	// 阿里云API的密钥Access Key Secret
	private static String ACCESS_KEY_SECRET;
	// 阿里云API的bucket名称
	private static String BACKET_NAME;

	static {
		ENDPOINT = "https://oss-cn-beijing.aliyuncs.com";
		ACCESS_KEY_ID = "LTAIxKZFw0nQWQQf"; // 自己的密钥
		ACCESS_KEY_SECRET = "JTwlPRxFwZuWZpFyijyGoXRcBr1vlo";
		BACKET_NAME = "travelcompanion";
	}

	// 上传图片文件，返回地址
	public String uploadFile(File file, String filename) {
		OSSClient client = new OSSClient(ENDPOINT, ACCESS_KEY_ID, ACCESS_KEY_SECRET);
		String imgUrl;
		// 创建上传object的metadata:描述object的属性
		ObjectMetadata metadata = new ObjectMetadata();

		metadata.setContentEncoding("utf-8");
		metadata.setContentDisposition("inline");
		// 设置上传文件的类型
		metadata.setContentType("picture/*");
		// 上传文件
		String key = "Picture/" + filename;
		PutObjectResult putresult = client.putObject(BACKET_NAME, key, file, metadata);
		imgUrl = "http://wxggt.oss-cn-beijing.aliyuncs.com/" + key;// 文件保存的路径
		client.shutdown();
		return imgUrl;
	}
}
