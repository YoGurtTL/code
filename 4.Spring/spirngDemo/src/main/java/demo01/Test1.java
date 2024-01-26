package demo01;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class Test1{
    @org.junit.Test
    public void Test(){
       DemoController dc = new DemoController();
       dc.query("sp");
    }
}