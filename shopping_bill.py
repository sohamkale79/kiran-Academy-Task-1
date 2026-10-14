def calculate_electronics_gst(a, b):
    amount = a + b
    gst = amount * 18 / 100
    return amount + gst


def calculate_fashion_gst(c, d):
    amount = c + d
    gst = amount * 13 / 100
    return amount + gst


def calculate_food_gst(e):
    gst = e * 7 / 100
    return e + gst


def total_bill(a, b, c, d, e):
    electronics = calculate_electronics_gst(a, b)
    fashion = calculate_fashion_gst(c, d)
    food = calculate_food_gst(e)
    return electronics + fashion + food


def calculate_discounted_bill(a, b, c, d, e):
    total = total_bill(a, b, c, d, e)
    discount = total * 20 / 100
    return total - discount


a = 100
b = 100
c = 100
d = 100
e = 100

total = total_bill(a, b, c, d, e)
discount = total * 20 / 100
final_amount = calculate_discounted_bill(a, b, c, d, e)

print(f"Total after GST = {total:.2f}")
print(f"Discount = {discount:.2f}")
print(f"Final payable amount = {final_amount:.2f}")