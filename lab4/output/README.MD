## CRC Cards

| Waitlist | |
| - | - |
| <b><i>Responsibility</i></b> | <b><i>Colaborator</i></b> |
| Keep track of waiting customers in order. | |
| Find next customers for available table. | |
| Ask server to inform the customers. | MsgServer |

| Customers | |
| - | - |
| <b><i>Responsibility</i></b> | <b><i>Colaborator</i></b> |
| Provide info about a customer party such as name, phone and party size. |  |
| Send register request to the restaurant. | MsgServer |
| Cancel waiting. | MsgServer |
| Confirm table if called. | MsgServer |

| MsgServer | |
| - | - |
| <b><i>Responsibility</i></b> | <b><i>Colaborator</i></b> |
| Add new customers to waitlist. | Waitlist |
| Remove customers from waitlist. | Waitlist |
| Inform customers of available table. | Customers |

## Statements

I choose the <b> Chain of Responsibility </b> Pattern because of the following reason:
- More than one customer party might be seated on a open table. Only customers themselves can dicide whether or not to take the seat. Seating decision should be made accordingly.
- A waiting chain is naturally formed, it's easy to know the successor customers.
- The goal is to issue a table without specifying the customers to be seated.
- Customers might change ideas about keeping waiting before getting an offer, the waitlist must be specified dynamically.

```Waitlist``` plays the role of
 <b>Handler</b>.


```Customers``` handles the seating event throught ```MsgServer```, plays the role of <b>ConcreteHandler</b>.


New available table is the <b>Client</b>
 of the Pattern, which is not shown in the CRC Cards.

 ## Collaboration Diagram

 ![Collaboration Diagram](https://github.com/xckang/cmpe202/tree/master/lab4/output/CollaborationDiagram.png)