## How to run

1. Build Gradle `./gradlew build`
2. Run main `./gradlew run`

## To run tests
1. `./gradlew test`

## Schema Rules: 

1. `currency` is at the root level, since I presume it's unlikely to change across tiers.
2. `price` is configured in cents(Integer). This is so as to avoid the limitations of floating point datatype in storing decimas as seen [here](https://stackoverflow.com/questions/3730019/why-not-use-double-or-float-to-represent-currency)
3.  If a `range` in a tier doesn't have `to`, that tier rule applies for any amount of quantity.

``` json
  {
    "productId": "trello-basic",
    "currency": "USD",
    "tiers": [
      {
        "range": {
          "from": 1,
          "to": 5
        },
        "price": 500,
        "priceModel": "FLAT"
      },
      {
        "range": {
          "from": 6
        },
        "price": 500,
        "priceModel": "VOLUME"
      }
    ]
  }
```

## Some ideas of improvement
1. We needs some sort of rule schema validation. For instance when configuring rules for a given product, we ensure the rule can accommodate any input quantity. By default this isn't handled.
2. Right now cost calculations are a simple multiplication, however as we need more complex operations it's probably a good idea to switch to a datatype like [Java Money](https://www.baeldung.com/java-money-and-currency) which can handle currency division, rounding etc. better.   
