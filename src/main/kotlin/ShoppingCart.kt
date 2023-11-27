class ShoppingCart(private var paymentStrategy: PaymentStrategy) {

    fun setPaymentStrategy(paymentStrategy: PaymentStrategy) {
        this.paymentStrategy = paymentStrategy
    }

    fun checkout(amount: Double) {
        paymentStrategy.pay(amount)
    }
}