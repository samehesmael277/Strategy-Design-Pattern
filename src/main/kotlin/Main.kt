fun main(args: Array<String>) {
    val creditCardPayment = CreditCardPayment()
    val payPalPayment = PayPalPayment()

    val shoppingCart = ShoppingCart(creditCardPayment)

    shoppingCart.checkout(200.0)

    shoppingCart.setPaymentStrategy(payPalPayment)
    shoppingCart.checkout(300.0)
}