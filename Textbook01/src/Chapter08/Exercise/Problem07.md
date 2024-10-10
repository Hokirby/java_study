### 7. DaoExample 클래스의 main() 메소드에서 dbWork()메소드를 호출 할 떄 OracleDao와 MySqlDao 객체를 매개값으로 주고 호출했습니다. dbWork() 메소드는 두 객체를 모두 매개값으로 받기 위해 DataAccessObject 타입의 매개변수를 가지고 있습니다. 실행결과를 보고 DataAccessObject 인터페이스와 OracleDao, MySqlDao 구현 클래스를 각각 작성해보세요.

```
public class DaoExample {
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }
    
    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }
}
```

나의 답:

```
public class OracleDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("Oracle DB에서 검색");
    }
    @Override
    public void insert() {
        System.out.println("Oracle DB에 삽입");
    }
    @Override
    public void update() {
        System.out.println("Oracle DB를 수정");
    }
    @Override
    public void delete() {
        System.out.println("Oracle DB에서 삭제");
    }
}

```

```
public class MySqlDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("MySql DB에서 검색");
    }
    @Override
    public void insert() {
        System.out.println("MySql DB에 삽입");
    }
    @Override
    public void update() {
        System.out.println("MySql DB를 수정");
    }
    @Override
    public void delete() {
        System.out.println("MySql DB에서 삭제");
    }
}

```