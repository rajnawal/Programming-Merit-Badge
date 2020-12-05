import random
print("Ask a question. q to quit")
q = input()
while (q != "q"):
    i = random.randint(1,8)
    if (i == 1):
        print("Maybe")
    elif (i == 2):
        print("Ask Again")
    elif (i == 3):
        print("Its hazy")
    elif (i == 4):
        print("Definitely not")
    elif (i == 5):
        print("The stars say so")
    elif (i == 6):
        print("Without a doubt")
    elif (i == 7):
        print("Most Likely")
    elif (i == 8):
        print("Very Doubtful")
    q = input()
