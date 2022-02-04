/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import ENDES.Simon;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samjimmaz
 */
public class SimonTest {
    
    public SimonTest() {
    }

    @Test
    public void testGetParameter() {
        System.out.println("getParameter");
        String key = "";
        String def = "";
        Simon instance = new Simon();
        String expResult = "";
        String result = instance.getParameter(key, def);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testInit() {
        System.out.println("init");
        Simon instance = new Simon();
        instance.init();
        fail("The test case is a prototype.");
    }

    @Test
    public void testStart() {
        System.out.println("start");
        Simon instance = new Simon();
        instance.start();
        fail("The test case is a prototype.");
    }

    @Test
    public void testStop() {
        System.out.println("stop");
        Simon instance = new Simon();
        instance.stop();
        fail("The test case is a prototype.");
    }

    @Test
    public void testDestroy() {
        System.out.println("destroy");
        Simon instance = new Simon();
        instance.destroy();
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAppletInfo() {
        System.out.println("getAppletInfo");
        Simon instance = new Simon();
        String expResult = "";
        String result = instance.getAppletInfo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetParameterInfo() {
        System.out.println("getParameterInfo");
        Simon instance = new Simon();
        String[][] expResult = null;
        String[][] result = instance.getParameterInfo();
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Simon.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMouseClicked() {
        System.out.println("mouseClicked");
        MouseEvent e = null;
        Simon instance = new Simon();
        instance.mouseClicked(e);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMousePressed() {
        System.out.println("mousePressed");
        MouseEvent e = null;
        Simon instance = new Simon();
        instance.mousePressed(e);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMouseReleased() {
        System.out.println("mouseReleased");
        MouseEvent e = null;
        Simon instance = new Simon();
        instance.mouseReleased(e);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMouseExited() {
        System.out.println("mouseExited");
        MouseEvent e = null;
        Simon instance = new Simon();
        instance.mouseExited(e);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMouseEntered() {
        System.out.println("mouseEntered");
        MouseEvent e = null;
        Simon instance = new Simon();
        instance.mouseEntered(e);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRun() {
        System.out.println("run");
        Simon instance = new Simon();
        instance.run();
        fail("The test case is a prototype.");
    }

    @Test
    public void testChangeColors() {
        System.out.println("changeColors");
        JButton b = null;
        Color c1 = null;
        Color c2 = null;
        int time = 0;
        Simon instance = new Simon();
        instance.changeColors(b, c1, c2, time);
        fail("The test case is a prototype.");
    }

    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        Simon instance = new Simon();
        instance.actionPerformed(e);
        fail("The test case is a prototype.");
    }

    @Test
    public void testParar() {
        System.out.println("parar");
        Simon instance = new Simon();
        instance.parar();
        fail("The test case is a prototype.");
    }

    @Test
    public void testMostrarAbout() {
        System.out.println("mostrarAbout");
        Simon instance = new Simon();
        instance.mostrarAbout();
        fail("The test case is a prototype.");
    }
    
}
