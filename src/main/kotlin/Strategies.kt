class CreditCardPayment: PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $amount using Credit Card.")
    }
}

class PayPalPayment : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $amount using PayPal.")
    }
}