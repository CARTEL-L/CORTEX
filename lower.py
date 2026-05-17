text = input('Input text: ')
count = 0
for ch in range(text):
    if ch.islower():
        count += 1

print(count)
