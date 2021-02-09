package excecise.Java9.Interfaces;

public interface Scalable {

    //implicitly public absract
    void setScale(double scale);

    //implicitly public static final
    double DEFAULT_SCALE = 1.0;

    // we can have(static concrete method)
    //implicitly public
    static boolean isScalable(Object obj){
        return obj instanceof Scalable;
    }

    //implicitly public
    default void resetScale(){
        setScale(DEFAULT_SCALE);
    }
}
