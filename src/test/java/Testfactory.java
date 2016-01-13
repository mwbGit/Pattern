import com.mwb.create.factory.Animal;
import com.mwb.create.factory.DogMethodFactory;
import com.mwb.create.factory.MethodFactory;
import com.mwb.create.factory.SimpleFactory;

/**
 * Created by mwb on 16-1-13.
 */
public class Testfactory {
    public static void main(String[] args) {
        //简单工厂模式
        Animal an= SimpleFactory.getDog();
        an.say();
        an=SimpleFactory.getPig();
        an.say();
        an=SimpleFactory.getAnimal("pig");
        an.say();
        //工厂方法模式
        MethodFactory mf=new DogMethodFactory();
            an=mf.getAnimal();
        an.say();
    }
}
