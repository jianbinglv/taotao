package dao.item;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;

public class ItemTest {

	@Test
	public void getItemByid(){
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring/applicationContext-dao.xml");
		TbItemMapper mapper = (TbItemMapper) context.getBean("tbItemMapper");
		TbItem item = mapper.selectByPrimaryKey(738388L);
		System.out.println(item);
	}
}
