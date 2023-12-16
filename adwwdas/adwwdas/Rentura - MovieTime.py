from queue import Queue

movies = Queue()
snacks = Queue()

for i in range(1, 4):
    movieQue = input("Enter movie " + str(i) + " of 3: ")
    movies.put(movieQue)

for i in range(1, 4):
    snackQue = input("Enter snack " + str(i) + " of 3: ")
    snacks.put(snackQue)

print("Movies to watch are: " + str(list(movies.queue)))
print("Snacks available are: " + str(list(snacks.queue)))
print("Press 'S' each time you finish a snack.")

while not snacks.empty():
    key = input()
    if key.upper() == "S":
        snacks.get()
        print(list(snacks.queue))

if snacks.empty():
    print("No more snacks")