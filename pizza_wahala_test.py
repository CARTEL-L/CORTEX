from unittest import TestCase

from pizza_wahala import get_number_of_type

class PizzaWahalaTest(TestCase):

	def test_get_no_of_slice_gives_the_accurate_slice_with_box_type(self):

		first_pizza_type = "sapa"

		second_pizza_type = "odogwu"

		number_of_type_sapa_size = get_number_of_type(first_pizza_type)

		number_of_type_odogwu_size = get_number_of_type(second_pizza_type)

		self.assertEqual(number_of_type_sapa_size, 4)

		self.assertEqual(number_of_type_odogwu_size, 12)




	def test_get_number_of_slice_gives_accurate_slice_for_all_types(self):
		first_pizza_type = "sapa"
		second_pizza_type = "smallMoney"
		third_pizza_type = "bigBoys"
		last_pizza_type = "ododgwu"


		number_of_type_sapa_size = get_number_of_type(first_pizza_type)
		number_of_type_small_money_size = get_number_of_type(second_pizza_type)
		number_of_type_big_boys_size = get_number_of_type(third_pizza_type)
		number_of_type_odogwu_size = get_number_of_type(last_pizza_type)

		self.assertEqual(number_of_type_sapa_size, 4)
		self.assertEqual(number_of_type_small_money_size, 6)
		self.assertEqual(number_of_type_big_boys_size, 8)
		self.assertEqual(number_of_type_odogwu_size, 12)




	# def test_calculate_number_of_boxes_gives_accurate_number_of_box_based_on_pizza_type_and_guests(self):
	# 	number_of_guest = 45
	# 	another_guests = 32

	# 	sapa_type
	# 	big_boys