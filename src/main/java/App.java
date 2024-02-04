import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean1.getName());
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean2.getName());

        System.out.println("Верно? " + (bean == bean2));
        System.out.println("Верно? " + (catBean1 == catBean2));

    }
}