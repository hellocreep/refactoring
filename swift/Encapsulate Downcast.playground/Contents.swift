//: Encapsulate Downcast
/*:
 #### Steps:
 1. 找出必须对函数调用结果进行向下转型的地方。
 2. 将向下转型动作搬到该地方。
 */

import Foundation


class Car {
    
}

extension Car {
    func isType<T>(type: T.Type) {
        print("😆😆😆 Expect type as \(type), the result is : \(T.self == type(of: self))")
    }
}

final class Truck: Car {
    let id: Int
    init(id: Int) {
        self.id = id
    }
    
    func description() {
        print("This truck's ID is \(id)")
    }
}

class CarManager {
    var cars = Array(0 ..< 10).map { Truck(id: $0) }
    
    func getLastElement() -> Car {
        return cars.last!
    }
}


let lastTruck: Truck = CarManager().getLastElement() as! Truck
lastTruck.isType(type: Car.self)
