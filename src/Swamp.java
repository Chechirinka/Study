@Frog (name = "Frogintheswamp")

public class Swamp {
    static int count = 0;


    public static void main(String[] args) {
        System.out.println(count);
        checlAnn(Swamp.class);
        checlAnn(String.class);
        System.out.println(count);
    }

    public static void checlAnn(Class<?> clas)
    {
        if(clas.isAnnotationPresent(Frog.class))
        {
            System.out.println(clas.getAnnotation(Frog.class));
        }
        else
        {
            System.out.println("На класс Лягушка не навешана");
        }
    }
}
