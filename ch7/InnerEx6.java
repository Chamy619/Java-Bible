class InnerEx6 {
    Object iv = new Object() {
        void method() {}
    };

    static Object cv = new Object() {
        void method() {}
    };

    void method() {
        Object lv = new Object() {
            void method() {}
        };
    }
}