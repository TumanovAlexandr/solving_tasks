package zaur.annotation;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("zaur.annotation.Xiaomi");
        Annotation annotation = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation;
        System.out.println(sm1.OS() + " " + sm1.yearOfCompanyCreation());

        Class iphoneClass = Class.forName("zaur.annotation.Iphone");
        Annotation annotation1 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation1;
        System.out.println(sm2.OS() + " " + sm2.yearOfCompanyCreation());
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "Android";
    int yearOfCompanyCreation() default 2010;
}

@SmartPhone
class Xiaomi{
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone{
    String model;
    double price;
}
