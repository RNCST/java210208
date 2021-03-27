package mybatis.step1;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BookDao {
	String resource = "mybatis/step1/MapperConfig.xml";
	//이것을 통하여 xml문서의 정보를 읽어서 커넥션을 얻어내는데 사용함.
	SqlSessionFactory sqlMapper = null;
	public List<Map<String,Object>> getBookList(){
		List<Map<String,Object>> bookList = null;
		SqlSession session = null;
		try {
			//insert here
			Reader reader = Resources.getResourceAsReader(resource);
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);	
			session = sqlMapper.openSession();
			
			String currentTime = session.selectOne("currentTime");
			System.out.println("currentTime => "+currentTime);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookList;
	}
	public static void main(String[] args) {
		BookDao bDao = new BookDao();
		List<Map<String,Object>> bookList = null;
		bookList = bDao.getBookList();
		System.out.println(bookList);
	}
}
