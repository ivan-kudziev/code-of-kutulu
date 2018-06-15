package codeofkutulu.mazes;

/**
 * Doubles up the Pac
 * @author johnny
 *
 */
public class BigPacMan extends Maze {
  final static String[] map = { 
      ".....###....ww....###.....",
      ".###.....###..###.....###.",
      ".#...#.#...#..#...#.#...#.",
      ".#.#.#.#.#.#..#.#.#.#.#.#.",
      "....S................S....",
      "#.####.####.##.####.####.#",
      "..........................",
      ".#.#.#.#.#.#..#.#.#.#.#.#.",
      ".#...#.#...#..#...#.#...#.",
      ".###.....###..###.....###.",
      ".....###..........###.....",
      ".....###..........###.....",
      ".###.....###..###.....###.",
      ".#...#.#...#..#...#.#...#.",
      ".#.#.#.#.#.#..#.#.#.#.#.#.",
      "..........................",
      "#.####.####.##.####.####.#",
      "....S................S....",
      ".#.#.#.#.#.#..#.#.#.#.#.#.",
      ".#...#.#...#..#...#.#...#.",
      ".###.....###..###.....###.",
      ".....###....ww....###....."
  };  
  
  @Override
  public String[] getMap() 		{ 	return map; }
  
  public BigPacMan() {
	  super("Big pac-man");
  }

}