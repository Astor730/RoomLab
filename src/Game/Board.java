package Game;
import Rooms.Room;
import Rooms.WinningRoom;
public class Board
{
    public Room[][] map = new Room[5][5];
    private int x;
    private int y;
    public Board(int x,int y,Room[][]map)
    {
        this.x = x;
        this.y = y;
        this.map = map;
    }
    public void makeMap()
    {
        for(int i = 0;i<map.length;i++)
        {
            for(int x = 0; x<map[i].length;x++)
            {
                map[i][x] = new Room(i,x);
            }
        }
    }
    public void print()
    {
        String row = "";
        for(int i = 0; i<map.length;i++)
        {
            row = "";
            for(int x = 0;x<map[i].length;x++)
            {
                row = row + map[i][x].toString();
            }
            System.out.println(row);
        }
    }
}
