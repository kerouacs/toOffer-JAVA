class Solution {
    //a[i++] =1 会先赋值a[i] 再i+1
    //如果创建新变量包含数组长度，先进行边界条件判断
	//还有一种解法
    public int[] spiralOrder(int[][] matrix) {
        int[][] dirt = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        if(matrix == null || matrix.length == 0){
            return new int[0];
        }
        int[] ans = new int[matrix.length * matrix[0].length];
        int i,j;
        i=0;j=-1;
        int index=0;
        int ver = matrix.length;   
        int par = matrix[0].length; 
        int step=par;
        int dirIndex=0;
        while(step>0){
            while(step-->0){
                i= i+dirt[dirIndex][0];
                j= j+dirt[dirIndex][1];
                ans[index++]=matrix[i][j];
            }
            dirIndex=(dirIndex+1)%4;
            if(dirIndex%2==0){
                par--;
                step=par;
            }else{
                ver--;
                step=ver;
            }
        }


        return ans;
    }
}