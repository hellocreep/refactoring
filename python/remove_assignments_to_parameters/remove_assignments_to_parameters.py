def discount(input_val, quantity, year_to_date):
    result = input_val
    if input_val > 50:
        result -= 2
    if quantity > 100:
        result -= 1
    if year_to_date > 10000:
        result -= 4
    return result


"""
Evaluation Strategy - call by sharing
"""


class Evaluation:
    def __init__(self):
        num = 5
        self.triple(num)
        print(num)

    def triple(self, num):
        num = num * 3
        print(num)


class Evaluation2:
    def __init__(self, d):
        self.reassign(d)
        print(d)

    def reassign(self, d):
        d = {"value": "key"}
        print(d)


class Evaluation3:
    def __init__(self, lst=[], lst2=[]):
        self.update(lst)
        print(lst)

        self.replace(lst2)
        print(lst2)

    def update(self, lst):
        lst.append("third")
        print(lst)

    def replace(self, lst):
        lst = ["second", "first"]
        print(lst)
