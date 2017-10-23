package cn.ou.dao;

import java.util.List;

import cn.ou.entity.Product;

/**
 * 商品Dao层接口
 * 实现数据库语句
 * @author Administrator
 *
 */
public interface ProdDao {
	
	/**
	 * 查询全部商品
	 * @return 全部商品对应的集合对象
	 */
	public List<Product> findAll();

	/**
	 * 修改商品的库存
	 * @param id：商品id
	 * @param pnum：修改后的商品数据
	 * @return 返回影响的行数
	 */
	public int changePnum(String id, int pnum);

	/**
	 * 根据商品id删除商品信息
	 * @param id：商品id
	 * @return true：表示删除成功，false：表示删除失败
	 */
	public int deleteProdById(String id);

	/**
	 * 根据关键字查询符合条件的商品
	 * @param name：商品名称关键字
	 * @param cate：商品分类关键字
	 * @param min：价格区间最小值
	 * @param max：价格区间最大值
	 * @return 返回符合条件的所有商品
	 */
	public List<Product> findAllById(String name, String cate, Double min, Double max);

	/**
	 * 根据商品id查询对应的商品详细信息
	 * @param id ：商品id
	 * @return 返回商品的详细信息对象
	 */
	public Product findProdById(String id);

}
