//: Introduce Foreign Method
/*:
 #### Steps:
 1. Create a method in the client class that dose what you need. (与业务逻辑无关)
 2. Make an instance of the server class the first parameter.
 3. Comment the method as "foreign method; should be in server".
 
 
 PS: 如果需要引入的外部方法过多，不应该使用此方法进行重构，请参考Introduce Local Extension
 */

import Foundation

//Before
var nextDay = Date(timeIntervalSinceNow: 60 * 60 * 24)

//After 
func getNextDay(now: Date) -> Date {
    return Date(timeInterval: 60 * 60 * 24, since: now)
}

var _nextDay = getNextDay(now: Date())
