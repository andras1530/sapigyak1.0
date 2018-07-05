package ro.sapientia.andras.dao;


import org.springframework.stereotype.Repository;

import ro.sapientia.andras.pojo.UserPojo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<UserPojo, Integer> {

}
