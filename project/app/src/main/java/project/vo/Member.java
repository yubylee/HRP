package project.vo;

import java.io.Serializable;
import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.Data;

@Data
public class Member implements Serializable {
  private static final long serialVersionUID = 1L;
  private int no;
  private String name;
  private String tel;
  private String email;
  private String password;
  private String position;
  private String postNo;
  private String basicAddress;
  private String detailAddress;
  private Date birth;

  @JsonFormat(
      shape = Shape.STRING,
      pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")

  private Date createDate;
}
