/**
 * Created by Стас on 14.09.2015.
 */
// получили суперклевый класс, который будет уметь делать всякие разные операции над числами.
// Его структура предопределена, благодаря интерфейсам.
public class Calculator implements СalcMethods, CompareMethods {
    @Override
    public Boolean compare(Number a, Number b) {
        return null;
    }

    @Override
    public Number addition(Number a, Number b) {
        if(a instanceof RealNumber && b instanceof RealNumber){
            RealNumber r = new RealNumber(((RealNumber) a).getRx()+((RealNumber) b).getRx());
            return r;
        }
         else {
            if(a instanceof RealNumber  && b instanceof ImagineNumber){
              ImagineNumber i = new ImagineNumber(((RealNumber)a).getRx() + ((ImagineNumber)b).getRx(),((ImagineNumber)b).getIy());
                return i;
            }
             else {
                if(b instanceof RealNumber  && a instanceof ImagineNumber){
                    ImagineNumber i = new ImagineNumber(((RealNumber)b).getRx() + ((ImagineNumber)a).getRx(),((ImagineNumber)a).getIy());
                    return i;
                }
                 else {
                    if(a instanceof ImagineNumber && b instanceof ImagineNumber){
                        ImagineNumber r = new ImagineNumber(((ImagineNumber) a).getRx()+((ImagineNumber) b).getRx(),
                                ((ImagineNumber) a).getIy() + ((ImagineNumber) b).getIy());
                        return r;
                    }
                     else {
                        return null;
                    }
                }
            }
        }

    }

    @Override
    public Number subsctruction(Number a, Number b) {
        return null;
    }

    @Override
    public Number multiplication(Number a, Number b) {
        return null;
    }

    @Override
    public Number division(Number a, Number b) {
        return null;
    }
}
