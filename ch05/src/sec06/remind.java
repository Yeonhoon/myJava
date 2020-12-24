package sec06;

public class remind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"Àå¿¬ÈÆ","Àå±¤Áø","È«¹Ì·É","ÀÌÀç¼­"};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		String[][] boards = new String [2][2];
		System.out.println(boards.length);
		System.out.println(boards[0].length);
		System.out.println(boards[1].length);
		for(int i=0; i<boards.length; i++) {
			for(int j=0; j<boards[i].length; j++) {
				System.out.println(boards[i][j]);
			}
			
		}
		
		
		
		String[] xx=  {"a","b","c"};
		Printnames(xx);
		Printnames(new String[] {"x","y","z"});
		
	}
	
	public static void Printnames(String[] names) {
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
