package for_loops;

public class gauntlet {
	public static void main(String[] args) {
	
		for(int a = 0; a<101; a++){
			System.out.println(a);
		}
		
		for(int b = 0; b<101; b++){
			System.out.println(100-b);
		}
		for(int c = 1; c<51; c++){
			System.out.println(2*c);
		}
		for(int d = 1; d<51; d++){
			System.out.println(2*d-1);
		}
		for(int e = 1; e<251; e++){
			System.out.println((2*e-1) + "odd");
			System.out.println((2*e) + "even");
		}
		for(int f = 0; f<112; f++){
			System.out.println(f*7);
		}
		for(int g = 2003; g<2018; g++){
			System.out.println(g + " " + (g-2003));
		}
		for(int h = 0; h<3; h++){
			for(int i = 0; i<3; i++){
				System.out.println(h + " " + i);
			}
		}
		for(int j = 1; j<4; j++){
			System.out.println((3*j-2) + " " + (3*j-1) + " " + 3*j);
		}
		for(int k = 1; k<11; k++){
			System.out.println((10*k-9) + " " + (10*k-8) + " " + (10*k-7) + " " + (10*k-6) + " " + (10*k-5) + " " + (10*k-4) + " " + (10*k-3) + " " + (10*k-2) + " " + (10*k-1) + " " + (10*k));
		}
		for(int l = 1; l<7; l++){
			for(int j = 0; j<l; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
