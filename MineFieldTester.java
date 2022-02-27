public class MineFieldTester {

   private static boolean[][] MineField1 = { 
      { true , true , true , true , true  }, 
      { true , true , false, false, false },
      { false, false, false, false, false }, 
      { false, false, false, false, false }, 
      { false, false, false, false, false }
   };

   private static boolean[][] MineField2 = { 
      { true }
   };

   public static void main(String[] args) {
      MineField mf = new MineField(MineField1);
      mf.print();
      System.out.println(mf.numMines());
      System.out.println(mf.numAdjacentMines(0, 0));
   }

}
