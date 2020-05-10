# TDD @FizzBuzz


## 开发环境
 - JDK1.8+
 
## 业务需求

你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有N名学生在上课。游戏的规则是：
### Before Class
- 1、让所有学生排成一队，然后按顺序报数。
- 2、学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是第7的倍数，那么要说Whizz。
- 3、学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。
### Class One
- 4、学生报数时，如果所报数字包含了3，那么也不能说该数字，而是要说相应的单词，比如要报13的同学应该说Fizz。
- 5、如果数字中包含了3，那么忽略规则2和规则3，比如要报30的同学只报Fizz，不报FizzBuzz。
- 6、如果数字中包含了5，那么忽略规则4和规则5，并且忽略被3整除的判定，比如要报35的同学不报Fizz，报BuzzWhizz，其他case自己补齐。
- 7、如果数字中包含了7，那么忽略规则6中忽略被3整除的判定，并且忽略被5整除的判定，比如要报75的同学只报Fizz，其他case自己补齐。

### Tasking Before Class
- 1、
**Given** the student number is only a multiple of 3 only
**When** count off
**Then** say Fizz
- 2、
**Given** the student number is only a multiple of 5 
**When** count off
**Then** say Buzz
- 3、
**Given** the student number is only a multiple of 7
**When** count off
**Then** say Whizz
- 4、
**Given** the student number is a multiple of 3 and 5 at the same time
**When** count off
**Then** say FizzBuzz
- 5、
**Given** the student number is a multiple of 5 and 7 at the same time
**When** count off
**Then** say BuzzWhizz
- 6、
**Given** the student number is a multiple of 3 and 7 at the same time
**When** count off
**Then** say FizzWhizz
- 7、
**Given** the student number is a multiple of 3 and 5 and 7 at the same time
**When** count off
**Then** say FizzBuzzWhizz
- 8、
**Given** the student number is not a multiple of 3 and 5 and 7
**When** count off
**Then** say number

### Tasking One
- 1、
**Given** the student number contains 3, ignore it is a multiple of 5 or 7
**When** count off
**Then** say Fizz

- 2、
**Given** the student number contains 5 or 3, ignore it is contains 3 or is a multiple of 3, like 51
**When** count off
**Then** say 51

- 3、
**Given** the student number contains 5, and is only a multiple of 5, like 50
**When** count off
**Then** say Buzz

- 4、
**Given** the student number contains 5, and is only a multiple of 7, like 56
**When** count off
**Then** say Whizz

- 5、
**Given** the student number contains 5 and 3, and is a multiple of 5 and 7, like 35
**When** count off
**Then** say BuzzWhizz

- 6、
**Given** the student number contains 7, ignore is a multiple of 5, like 715
**When** count off
**Then** say 715

- 7、
**Given** the student number contains 7, and is a multiple of 7, like 77
**When** count off
**Then** say Whizz

- 8、
**Given** the student number contains 7 and 5, can't ignore is a multiple of 3, like 75
**When** count off
**Then** say Fizz

- 9、
**Given** the student number contains 7 and 3, ignore is a multiple of 7 and 3, like 472392
**When** count off
**Then** say Fizz

- 10、
**Given** the student number contains 7 and 3 and 5, ignore is a multiple of 5, like 735
**When** count off
**Then** say FizzWhizz

- 11、
**Given** the student number not contains 3、5、7, and is only a multiple of 3 only
**When** count off
**Then** say Fizz
- 12、
**Given** the student number not contains 3、5、7, and is only a multiple of 5 
**When** count off
**Then** say Buzz
- 13、
**Given** the student number not contains 3、5、7, and is only a multiple of 7
**When** count off
**Then** say Whizz
- 14、
**Given** the student number not contains 3、5、7, and is a multiple of 3 and 5 at the same time
**When** count off
**Then** say FizzBuzz
- 15、
**Given** the student number not contains 3、5、7, and is a multiple of 5 and 7 at the same time
**When** count off
**Then** say BuzzWhizz
- 16、
**Given** the student number not contains 3、5、7, and is a multiple of 3 and 7 at the same time
**When** count off
**Then** say FizzWhizz
- 17、
**Given** the student number not contains 3、5、7, and is a multiple of 3 and 5 and 7 at the same time
**When** count off
**Then** say FizzBuzzWhizz
- 18、
**Given** the student number not contains 3、5、7, and is not a multiple of 3 and 5 and 7
**When** count off
**Then** say number


