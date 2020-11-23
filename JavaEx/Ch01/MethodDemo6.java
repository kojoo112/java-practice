package Ch01;

public class MethodDemo6 {
  
    	public static int numbering(int init, int limit) {
    		int i = init; 
    		int output = 0; // 정수형 변수 output을 초기화
    		while (i<limit) {
    		output += i; 
    		i++;
    		}
    		return output; // public static 오른쪽에 int 를 작성하여 정수를 반환한다는 것을 확인.
    		}

    		public static void main(String[] args) {
    		int result = numbering(1,5); // numbering의 return 자료형이 int 이므로 result도 int 형으로 설정
    		System.out.println(result);
    		}
        
    }

