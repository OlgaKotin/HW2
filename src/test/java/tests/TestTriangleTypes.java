package tests;

import org.example.Triangle;
import org.example.TriangleType;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTriangleTypes {

    @Test
    public void triangleTest001(){
    Triangle triangle = new Triangle();
    TriangleType triangleType = triangle.getTriangleType(90,45,45);
    System.out.println("TYPE: "+triangleType.toString());
    Assert.assertEquals(triangleType, TriangleType.ISOSCELES);
    }
    @Test
    public void triangleTest002(){
        Triangle triangle = new Triangle();
        TriangleType triangleType = triangle.getTriangleType(1,1,178);
        System.out.println("TYPE: "+triangleType.toString());
        Assert.assertEquals(triangleType, TriangleType.ISOSCELES);
    }
    @Test
    public void triangleTest003(){
        Triangle triangle = new Triangle();
        TriangleType triangleType = triangle.getTriangleType(60,60,60);
        System.out.println("TYPE: "+triangleType.toString());
        Assert.assertEquals(triangleType, TriangleType.EQUILATERAL);
    }
    @Test
    public void triangleTest004() {
        Triangle triangle = new Triangle();
        TriangleType triangleType = triangle.getTriangleType(90, 30, 60);
        System.out.println("TYPE: " + triangleType.toString());
        Assert.assertEquals(triangleType, TriangleType.SCALENE);
    }
    @Test
    public void triangleTest005() {
        Triangle triangle = new Triangle();
        TriangleType triangleType = triangle.getTriangleType(1, 2, 177);
        System.out.println("TYPE: " + triangleType.toString());
        Assert.assertEquals(triangleType, TriangleType.SCALENE);
    }
    @Test
    public void triangleTest006(){
        Triangle triangle = new Triangle();
        TriangleType triangleType = triangle.getTriangleType(30,170,40);
        System.out.println("TYPE: "+triangleType.toString());
        Assert.assertEquals(triangleType, TriangleType.INVALID);
    }
    @Test
    public void triangleTest007() {
        Triangle triangle = new Triangle();
        TriangleType triangleType = triangle.getTriangleType(-60, 60, 60);
        System.out.println("TYPE: " + triangleType.toString());
        Assert.assertEquals(triangleType, TriangleType.INVALID);
    }
    @Test
    public void triangleTest008(){
        Triangle triangle = new Triangle();
        TriangleType triangleType = triangle.getTriangleType(0,0,0);
        System.out.println("TYPE: "+triangleType.toString());
        Assert.assertEquals(triangleType, TriangleType.INVALID);
    }
    @Test
    public void triangleTest009(){
        Triangle triangle = new Triangle();
        TriangleType triangleType = triangle.getTriangleType(-10,100,90);
        System.out.println("TYPE: "+triangleType.toString());
        Assert.assertEquals(triangleType, TriangleType.INVALID);
    }
    @Test
    public void triangleTest010(){
        Triangle triangle = new Triangle();
        TriangleType triangleType = triangle.getTriangleType(0,90,90);
        System.out.println("TYPE: "+triangleType.toString());
        Assert.assertEquals(triangleType, TriangleType.INVALID);
    }
}
