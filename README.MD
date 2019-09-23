#  TTD Training


### E.1 – TDD lifecycle & naming 
  
Objective
- Introduce naming convention
- Create production code from test
- Start from assertion
- Tip for deciding the first test to write: The simplest possible.
  
Problem description: Stack
  
Implement a Stack class with the following public methods:
  
+ void push(Object object)
+ Object pop()
  
Stack should throw an exception if popped when empty.

### E.2 Roman numerals

E.2 – Test-Driving Algorithms
  
Objective
- Grow an algorithm bit by bit
- Delay treating exceptions (in this case, because they are more complex)
- Intentionally cause duplication
- Focus on simple structures first
  
 
Problem description: Roman Numerals Converter
  
Implement a Roman numeral converter. The code must be able to take decimals up
to 3999 and convert to their roman equivalent.
 
Examples
1    - I
5    - V
10   - X
50   - L
100  - C
500  - D
1000 - M
2499 - MMCDXCIX
3949 - MMMCMXLIX


### E3 ...

E.3 – Expressing Business Rules
  
Objective
- Clearly express business rules and domain.
- It's OK to write a passing test if it express a valid business rule.
 
Problem description: Leap Year
 
Here are the rules for identifying a Leap Year:
- Is leap year if divisible by 400
- Is NOT leap year if divisible by 100 but not by 400
- Is leap year if divisible by 4



### 4 

E.2 – Test-Driving Algorithms
  
Objective
- Grow an algorithm bit by bit
- Delay treating exceptions (in this case, because they are more complex)
- Intentionally cause duplication
- Focus on simple structures first
  
 
Problem description: Roman Numerals Converter
  
Implement a Roman numeral converter. The code must be able to take decimals up
to 3999 and convert to their roman equivalent.
 
Examples
1    - I
5    - V
10   - X
50   - L
100  - C
500  - D
1000 - M
2499 - MMCDXCIX
3949 - MMMCMXLIX

### 6
E.6 – Outside-In TDD with Acceptance Tests
  
Objective:
Learn and practice the double loop of TDD
Test application from outside, according to side effect
  
Problem description:  Bank kata
  
Create a simple bank application with the following features:
  
- Deposit money
- Withdraw money
- Print a bank statement to the console.
  
Acceptance criteria
Statement should have the following the format:
  DATE       | AMOUNT  | BALANCE
  10/04/2014 | 500.00  | 1400.00
  02/04/2014 | -100.00 | 900.00
  01/04/2014 | 1000.00 | 1000.00
 
Note: Start with an acceptance test
 
 
public class AccountService {
 
  public void deposit(int amount);
 
  public void withdraw(int amount);
 
  public void printStatement();
 
}