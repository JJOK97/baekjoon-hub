def solution(park, routes):
    answer = [0, 0]
    
    x = len(park)
    y = len(park[0])

    for i in range(x):
        for j in range(y):
            if park[i][j] == "S":
                answer = [i, j]
                break

    move = {
        "N": (-1, 0),
        "S": (1, 0),
        "W": (0, -1),
        "E": (0, 1)
    }

    for route in routes:
        dir, dist = route.split()
        dx, dy = move[dir]
        dist = int(dist)

        nx, ny = answer[0], answer[1]
        valid = True

        for i in range(1, dist + 1):
            tx = nx + dx * i
            ty = ny + dy * i
            if not (0 <= tx < x and 0 <= ty < y) or park[tx][ty] == "X":
                valid = False
                break

        if valid:
            answer[0] += dx * dist
            answer[1] += dy * dist

    return answer
