# JAVA RMI Implmentation

## Steps to Run

1. Install Java in your system
2. Clone this repository
3. To compile all files, use the command below:
```
javac *.java
```
4. Create stub using: 
```
rmic PowerService
```
5. Initialize registry using:
```
start rmiregistry 5000 ( for Windows user)

rmiregistry 5000 & ( for Unix User)
```
6. Start the RMI server we have created using:
```
java PowerServiceServer
```
7. In another command shell, start RMI client as well using:
```
java PowerServiceClient
```
8. The server performs following operations:

- 1. Calculates square
- 2. Calculates power
- 3. Adds two numbers
- 4. Subracts two numbers
- 5. Multiplies two numbers
- 6. Divides two numbers
- 7. Finds GCD of two numbers
- 8. Finds LCM of two numbers

You can type in any number from 1 to 8 to perform your desired operation, once you run RMI client.
