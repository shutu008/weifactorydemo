package net.vastsum.weifactory.payapis.repository;

import net.vastsum.weifactory.payapis.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 赵艺茗
 * JPA专用
 */
public interface OrderRepository extends JpaRepository<Order,Integer>{
}
