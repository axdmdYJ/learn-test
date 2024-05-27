package cn.tjut.juc.lock;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SyncTest {

    static final Object lock = new Object();
    static int counter = 0;
    public static void main(String[] args) {
        synchronized (lock) {
            counter++;
        }
    }
}