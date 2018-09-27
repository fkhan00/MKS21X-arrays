class ArrayDemo{
  public static void printArray(int[] ary){
    System.out.println(ary);
  }
    
    
  public static void printArrray(int[][] arry){
    System.out.println(arry);
  }
    
    
  public static int countZeros2D(int[][] nums)
  {
    int counter = 0;
    for(int i = 0; i < 2; i ++)
    {
      for(int j = 0; j < 2; j ++)
      {
        if (nums[i][j] == 0)
        {
          counter += 1;
        }
      }
    }
    return counter;
  }


  public static int[][] fill2D(int[][] vals)
  {
    for(int i = 0; i < 2; i ++)
    {
      for(int j = 0; j < 2; j ++)
      {
        if (i == j)
        {
          vals[i][j] = 3;
        }
        else
        {
          vals[i][j] = 0;
        }
      }
    }
    return vals;
  }
    
    
    
  public static int[][] fill2DCopy(int[][] values)
  {
    for(int i = 0; i < 2; i ++)
    {
      for(int j = 0; j < 2; j ++)
      {
        if (values[i][j] < 0)
        {
          values[i][j] = 3;
        }
        else
        {
          values[i][j] = 1;
        }
      }
    }
    return values;
  }
    public static void TestCase()
    {
    int [][] TCA = new int[2][2];
    TCA[0][0] = 0;
    TCA[0][1] = 2;
    TCA[1][0] = 5;
    TCA[1][1] = 0;
    System.out.println("The Test Case Array is:");
    printArrray(TCA);
    System.out.println(fill2D(TCA));
    System.out.println(fill2DCopy(TCA));
    System.out.println(countZeros2D(TCA));
    }
}
