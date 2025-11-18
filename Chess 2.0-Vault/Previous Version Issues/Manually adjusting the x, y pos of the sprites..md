#old_issue 
Since with [[Problem with scaling of sprites]], to display the chess sprites on the chessboard I had to randomly make up some numbers to make it exact placement on each tiles.

```java
public int getTileSize() { return (int)((chessBoardSize - (chessBoardOffset * 2)) * chessBoardScale) / 8; }  
  
public int getSnappedPos(int i) { return (int)(chessBoardOffset * chessBoardScale) + (getTileSize() * i); }  
  
public int getSnappedXPos(int col ){ return getSnappedPos(col) + getTileSize() / 4; }  
  
public int getSnappedYPos(int row ){ return getSnappedPos(row) - getTileSize() / 7; }
```

looking back now I don't know where these numbers, `2, 8, 4, 7` came from. Overall [[Bad code structure]].

