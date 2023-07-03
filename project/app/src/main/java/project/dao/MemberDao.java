package project.dao;

import org.apache.ibatis.annotations.Mapper;
import project.vo.Member;

@Mapper
public interface MemberDao {
  void insert(Member m);
}
