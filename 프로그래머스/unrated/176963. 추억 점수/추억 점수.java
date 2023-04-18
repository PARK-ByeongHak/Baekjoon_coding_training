class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i=0; i<photo.length; i++) { // photo 요소
        	for(int j=0; j<photo[i].length; j++) { // photo 요소의 요소? 뭐라 부르지;
        		for(int k=0; k<name.length; k++) { // 이름을 비교하여 같으면 그에 해당하는 추억 점수를 추가
        			if(photo[i][j].equals(name[k])) answer[i] += yearning[k];
        		}
        	}
        }
        return answer;
    }
}