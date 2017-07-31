def discount(input_val, quantity, year_to_date):
    if input_val > 50:
        input_val -= 2
    if quantity > 100:
        input_val -= 1
    if year_to_date > 10000:
        input_val -= 4
    return input_val


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
    def __init__(self, lst=[], lst2=[]):
        self.update(lst)
        print(lst)

        self.replace(lst2)
        print(lst2)

    def update(self, lst):
        lst.append("Division")
        print(lst)

    def replace(self, lst):
        lst = ["Joy", "Side"]
        print(lst)
