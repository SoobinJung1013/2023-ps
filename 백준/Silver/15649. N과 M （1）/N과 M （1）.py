def permutations(n, m, result, current):
    if m == 0:
        result.append(current[:])
        return

    for i in range(1, n + 1):
        if i not in current:
            current.append(i)
            permutations(n, m - 1, result, current)
            current.pop()


def main():
    n, m = map(int, input().split())
    result = []
    permutations(n, m, result, [])

    for p in result:
        print(" ".join(map(str, p)))


if __name__ == "__main__":
    main()
