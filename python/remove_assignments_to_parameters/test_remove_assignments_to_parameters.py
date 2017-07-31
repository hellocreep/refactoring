from .remove_assignments_to_parameters import discount


class TestDiscount:

    def test_input_val(self):
        assert discount(100, 10, 10) == 98

    def test_quantity(self):
        assert discount(20, 200, 10) == 19

    def test_year_to_date(self):
        assert discount(20, 10, 20000) == 16
