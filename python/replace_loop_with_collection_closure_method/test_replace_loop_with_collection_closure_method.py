from .replace_loop_with_collection_closure_method import getManagers


class Employee:
    def __init__(self, name, manager=False):
        self.name = name
        self.manager = manager


manager = Employee('Rick', True)
dev = Employee('Morty')
employees = [
    manager,
    dev
]


class TestGetManagers:
    def test_get_managers(self):
        assert getManagers(employees) == [manager]
