package com.cms.coursemanagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.cms.coursemanagement.models.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {

}
