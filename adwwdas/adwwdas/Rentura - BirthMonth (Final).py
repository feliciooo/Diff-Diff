birthMonth1 = set()
birthMonth2 = set()
self = set()

for i in range(1, 4):

    print("Enter birth month " + str(i) + ": ")
    birthMonth1.add(input())

for i in range(1, 4):

    print("Enter birth month " + str(i) + ": ")
    birthMonth2.add(input())

print("Group 1: " + str(birthMonth1))
print("Group 2: " + str(birthMonth2))

print("Enter your birth month: ")
self.add(input())

union = birthMonth1.union(birthMonth2)
inter = birthMonth1.intersection(birthMonth2)
diff = birthMonth1.difference(birthMonth2)

print("Union: " + str(union))
print("Intersection: " + str(inter))
print("Difference: " + str(diff))

if birthMonth1.issuperset(self) or birthMonth2.issuperset(self):
    print("You have the same birthmonth with one of your classmates.")

else:
    print("You don't have the same birthmonth with one of your classmates.")
