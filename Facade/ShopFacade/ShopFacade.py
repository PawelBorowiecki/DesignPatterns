from Payment import Payment
from ProductCatalog import ProductCatalog
from ProducerCatalog import ProducerCatalog


class ShopFacade:
    def __init__(self):
        self.payment = Payment()
        self.producer_catalog = ProducerCatalog()
        self.product_catalog = ProductCatalog()

    def buy_product(self):
        print("Podaj nazwe produktu")
        name = input()
        print(f"Zakupiono produkt {name}")

    def show_products(self):
        for i in self.product_catalog.get_products():
            print(i)

    def show_producers(self):
        for i in self.producer_catalog.get_producers():
            print(i)