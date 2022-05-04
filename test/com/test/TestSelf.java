package com.test;

import org.junit.Test;

/**
 * @author : lihan
 * @date : 2022/5/2 11:39
 */
public class TestSelf {
    @Test
    public void test_interface() {
        A testA = new TestA();
        TestB testB = (TestB) testA;
    }

    interface A {
        void a();
    }
    class TestA implements A {

        @Override
        public void a() {

        }
    }
    class TestB implements A{
        @Override
        public void a() {

        }
    }

}
