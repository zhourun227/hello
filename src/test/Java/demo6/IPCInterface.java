package demo6;

import java.io.IOException;

interface IPCInterface{
    void sayHelloTo(String name);
    int sum(int x, int y);
    public void sayHello(Person p) throws IOException;
}