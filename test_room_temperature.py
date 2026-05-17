import unittest

import room_temperature

class TestRoomTemperature(unittest.TestCase):

	def test_temperature_output(self):
		result = temperature(25)
		self.asseertEqual(result, "The temperature is 25")
