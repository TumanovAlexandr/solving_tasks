package test_task;

public enum MyEnum implements MyInterface {
    VALUE1 {
        @Override
        public void myMethod() {
            System.out.println("Implementation of MyInterface method in VALUE1");
        }
    },
    VALUE2 {
        @Override
        public void myMethod() {
            System.out.println("Implementation of MyInterface method in VALUE2");
        }
    };
}
