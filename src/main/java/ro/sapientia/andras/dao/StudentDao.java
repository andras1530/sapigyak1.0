

package ro.sapientia.andras.dao;

import org.springframework.stereotype.Repository;

import ro.sapientia.andras.pojo.StudentPojo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<StudentPojo, Integer> {

}
