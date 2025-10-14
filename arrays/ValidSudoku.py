from typing import List


class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = [set() for _ in range(9)]
        cols = [set() for _ in range(9)]
        boxes = [set() for _ in range(9)]

        for i in range(len(board)):
            for j in range(len(board[i])):
                cell = board[i][j]
                if cell == ".": continue

                box = (i // 3) * 3 + (j // 3)

                if cell in rows[i] or cell in cols[j] or cell in boxes[box]:
                    return False
                
                rows[i].add(cell)
                cols[j].add(cell)
                boxes[box].add(cell)
        return True
        