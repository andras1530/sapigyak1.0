

package ro.sapientia.andras.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ro.sapientia.andras.pojo.*;

@Component
@Repository
public interface StudentDao extends JpaRepository<StudentPojo, Integer> {

}
