// WAP to find the volume of cube : side*side*side,
// volume of cuboid: length*breadth*height, 
// volume of Sphere:4/3*3.14*radius*radius*radius

import java.util.Scanner;
class VolumeOfShape{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Cube \n2. Cuboid\n3. Sphere\n4. Exit\nEnter your choice: ");
	    double s,l,b,h,r;
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("Enter Side of Cube: ");
                s=sc.nextDouble();
		        System.out.println("Volume of Cube is: "+(s*s*s)); break;
	        case 2:
		        System.out.print("Enter Length,Bredth,height of Cuboid: ");
	     	    l=sc.nextDouble();b=sc.nextDouble();h=sc.nextDouble();
		        System.out.println("Volume of Cuboid: "+(l*b*h));
			    break;

	        case 3:
		        System.out.print("Enter Radius of Sphare: ");
	        	r=sc.nextDouble();
	        	System.out.println("Volume of Sphare: "+(4/3*Math.PI*r*r*r));
                break;
	        case 4:      break;
	        default:
	        	System.out.print("Please Enter 1,2,3,4 only ");
		
        }
    }
}
