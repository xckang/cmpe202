### design pattern

- Strategy Pattern

  ```IPrinter``` is the Strategy.

  ```ReceiptPrinter``` and ```SlipPrinter``` are the ConcreteStrategy.


  ```Order``` is the Context.


### results
receipt:
```
------------------------------------------
|               FIVE GUYS                |
|            BURGER AND FRIES            |
|            STORE # CA-1294             |
|         5353 ALMADEN EXPY N60          |
|           SAN JOSE, CA 95118           |
|            (P) 408-274-9300            |
|                                        |
|                                        |
|          12/1/2016 1:46:54PM           |
|               FIVE GUYS                |
|                                        |
|  Order Number: 45                      |
|  1   LBB                         5.59  |
|      {{{{Bacon}}}}                     |
|      LETTUCE                           |
|      TOMATO                            |
|      ->|G ONION                        |
|      ->|JALA Grilled                   |
|  1   LTL CAJ                     2.79  |
|                                        |
|      Sub. Total:                $8.38  |
|      Tax:                       $0.75  |
|      Total:                     $9.13  |
|                                        |
|      Cash                       $20.00 |
|      Change                     $10.87 |
|  Register: 1     Tran Seq No:   57845  |
|  Cashier: Sakda* S.                    |
|       **************************       |
|  Don't throw away your receipt.        |
|                                        |
------------------------------------------
```
packaging slip:
```
------------------------------------------
|  Patties - 1                           |
|                                        |
|                                        |
|  Order Number: 45                      |
|          12/1/2016 1:46:54PM           |
|               FIVE GUYS                |
|                                        |
|  Sandwich#                             |
|  1   LBB                               |
|      LETTUCE                           |
|      TOMATO                            |
|      ->|G ONION                        |
|      ->|JALA Grilled                   |
|      {{{{Bacon}}}}                     |
|  1   LTL CAJ                           |
|  Register: 1     Tran Seq No:   57845  |
|  Cashier: Sakda* S.                    |
------------------------------------------
```