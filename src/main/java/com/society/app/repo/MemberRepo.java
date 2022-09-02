package com.society.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.society.app.model.Member;


public interface MemberRepo extends JpaRepository<Member, Integer>{

}
