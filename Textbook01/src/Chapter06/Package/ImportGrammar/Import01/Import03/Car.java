package Chapter06.Package.ImportGrammar.Import01.Import03;

//import 문으로 다른 패키지 클래스 사용을 명시
import Chapter06.Package.ImportGrammar.Import01.SnowTire;
import Chapter06.Package.ImportGrammar.Import01.Import02.AllSeasonTire;
import Chapter06.Package.ImportGrammar.Import01.Import02.Tire;

public class Car {
    //부품 필드 선언
    Chapter06.Package.ImportGrammar.Import01.Tire tire1 = new Chapter06.Package.ImportGrammar.Import01.Tire();
    Tire tire2 = new Tire();
    SnowTire tire3 = new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();
}
