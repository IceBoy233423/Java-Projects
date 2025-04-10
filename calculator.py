num1 = 0
num2 = 0
operation = ""

def add(num1, num2):
  return num1 + num2
def subtract(num1, num2):
  return num1 - num2;
def multiply(num1, num2):
  return num1 * num2
def divide(num1, num2):
 if y!= 0:
   return num1 / num2
 else:
   return "Error!"
   # Defines algebraic properties of calculator

while True:
  try: 
    num1 = int(input("Enter 1st Number (0 - 9):"))
    num2 = int(input("Enter 2nd Number (0 - 9):"))
    #While 2 numbers aren't typed, input these 2 statements until 2 numbers from 0 to 9 are typed
    if num1 < 0 or num1 > 9 or num2 < 0 or num2 > 9:
      raise ValueError("Numbers should be between 0 and 9")
    break
  except ValueError as e:
    print("Invalid! Please enter a valid integer between 0 and 9.")
    #If a number isn't from 0 to 9, restart the inputs

while True:
  try:
    operation = input("Enter operation (+, -, *, /):")
    if operation not in ["+", "-", "*", "/"]:
      raise ValueError("Invalid operation. Please enter +, -, *, or /.")
    break
  except ValueError as e:
    print("Invalid! Please enter a valid operation.")
    #If one of the 4 symbols shown isn't typed, then it must be typed again


if operation == "+":
  print(f"{num1} + {num2} = {add(num1, num2)}")
elif operation == "-":
  print(f"{num1} - {num2} = {subtract(num1, num2)}")
elif operation == "*":
  print(f"{num1} * {num2} = {multiply(num1, num2)}")
elif operation == "/":
  print(f"{num1} / {num2} = {divide(num1, num2)}")
  #determines which algebraic property to perform based off symbol
