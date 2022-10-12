package Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 商品 实体
 * @author zhantianxin
 * @version 1.0
 * @date 2022/10/12 10:38
 */
@Entity(name = "t_shop_product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;//主键
    private String pname;//商品名称
    private Double ppricw;//商品价格
    private Integer stock;//库存
}
