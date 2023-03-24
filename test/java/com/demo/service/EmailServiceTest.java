package com.demo.service;

import com.demo.domain.Order;
import org.junit.*;
//import org.mockito.Mock;

import static org.junit.Assert.*;


public class EmailServiceTest
{
    //Order order = new Order(1, "Item1", 100);
    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        System.out.println("before class");
    }
    @Before
    public void testBefore() throws Exception
    {
        System.out.println("before");
    }
        Order order = new Order(1, "Item1", 100);

    @Test
    public void sendEmailTest(){
        //order.setCustomerNotified(true);
        Assert.assertThrows(RuntimeException.class, () -> order.setCustomerNotified(false));

    }
    @Test
    public void sendEmailTestWithReturn(){
        order.setCustomerNotified(false);
        Assert.assertEquals(true, true);
    }
    @Test
    public void testEmailWithOneParam_ThrowsRuntimeException(){
        Order o = new Order();
        Assert.assertThrows(RuntimeException.class, ()->EmailService.getInstance().sendEmail(order));
    };
    @Test
    public  void testEmailWithTwoParam_ReturnTrue()
    {
        assertTrue(EmailService.getInstance().sendEmail(new Order(), "a@.com"));
    }

    @After
    public void testAfter() throws Exception
    {
        System.out.println("After");
    }

    @AfterClass
    public static void testAfterClass() throws Exception {
        System.out.println("After class");

    }



    }


