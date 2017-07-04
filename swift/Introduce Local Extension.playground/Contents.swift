//: Introduce Local Extension
/*:
 #### Steps:
 
 1. 建立一个扩展类，将它作为原始类的子类或包装类。
 2. 如果需要的话在扩展类中加入转型构造函数。
 3. 在扩展类中加入新特性。
 4. 根据需要，将原对象替换为扩展对象。
 5. 将针对原始类定义的所有外加函数搬移到扩展类中。
 */
import Foundation

// Local Extension by subclass
/*
class MyDate: NSDate {
    var tomorrow: NSDate {
        return NSDate(timeInterval: 60 * 60 * 24, since: self as Date)
    }
    
    var yesterday: NSDate {
        return NSDate(timeInterval: 60 * 60 * -24, since: self as Date)
    }
    
    var startOfDay: NSDate {
        return NSCalendar.current.startOfDay(for: self as Date) as NSDate
    }
}
 */

extension NSDate {
    var tomorrow: NSDate {
        return NSDate(timeInterval: 60 * 60 * 24, since: self as Date)
    }
    
    /*
     ...
    */
}

//Wrapper
struct DateWrapper {
    let date: Date
    var tomorrow: Date {
        return Date(timeInterval: 60 * 60 * 24, since: date)
    }
    var yesterday: Date {
        return Date(timeInterval: 60 * 60 * -24, since: date)
    }
    
    var startOfDay: Date {
        return Calendar.current.startOfDay(for: date)
    }
}

let today = DateWrapper(date: Date())

let tomorrow = today.tomorrow
let yesterday = today.yesterday
let startOfToday = today.startOfDay
