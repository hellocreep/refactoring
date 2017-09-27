from .replace_loop_with_collection_closure_method import getManagers

employees = [
    {
        "role": "manager",
        "age": 50,
        "id": 123
    },
    {
        "role": "dev",
        "age": 30,
        "id": 3232
    }
]


class TestGetManagers:
    def test_get_managers(self):
        assert getManagers(employees) == [{
            "role": "manager",
            "age": 50,
            "id": 123
        }]
