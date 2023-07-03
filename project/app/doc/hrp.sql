-- 회원
CREATE TABLE hrp_member (
  member_id      INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
  name           VARCHAR(50)  NOT NULL COMMENT '이름', -- 이름
  tel            VARCHAR(30)  NOT NULL COMMENT '전화번호', -- 전화번호
  email          VARCHAR(40)  NOT NULL COMMENT '이메일', -- 이메일
  password       VARCHAR(64)  NOT NULL COMMENT '비밀번호', -- 비밀번호
  position       VARCHAR(10)  NOT NULL COMMENT '직급', -- 직급
  post_no        VARCHAR(10)  NOT NULL COMMENT '우편번호', -- 우편번호
  basic_address  VARCHAR(255) NOT NULL COMMENT '기본주소', -- 기본주소
  detail_address VARCHAR(255) NULL     COMMENT '상세주소', -- 상세주소
  birth          DATE         NOT NULL COMMENT '생년월일', -- 생년월일
  created_date   DATETIME     NOT NULL DEFAULT now() COMMENT '가입일' -- 가입일
)
COMMENT '회원';


-- 회원
ALTER TABLE hrp_member
  ADD CONSTRAINT PK_hrp_member -- 회원 기본키
  PRIMARY KEY (
  member_id -- 회원번호
  );

-- 회원 유니크 인덱스
CREATE UNIQUE INDEX UIX_hrp_member
  ON hrp_member ( -- 회원
    email ASC    -- 이메일
  );

  ALTER TABLE hrp_member
  MODIFY COLUMN member_id INTEGER NOT NULL AUTO_INCREMENT COMMENT '회원번호';