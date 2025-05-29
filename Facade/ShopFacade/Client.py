from ShopFacade import ShopFacade

shop_facade = ShopFacade()
while True:
    print("Wybierz opcje:\n1: kup produkt\n2: zobacz produkty\n3: zobacz producentow")
    option = input()
    if option == "1":
        shop_facade.buy_product()
    elif option == "2":
        shop_facade.show_products()
    elif option == "3":
        shop_facade.show_producers()
    else:
        break