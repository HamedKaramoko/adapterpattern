# ADAPTER PATTERN

## Description

It allows to make compatible a class interface with the one expected by the client.

## Example

Let's concider we have an interface __Ride__ abstracting ways to ride (Car, Bycicle, etc...).
We know how _Car_ and _Bycicle_ work so we implement them.
We now want to integrate flying ride such as plane. It seems simple. We just have to implement the Ride interface and ouhaaaa!!!

However no one in the coding team knows how a plane work.
Fortunately another great team in the world knows how to. We then decide to use their implementation.

While trying to use it we fall into another problem.
In fact The _Plane_ developed by the other team is not conform to the _Ride_ interface we have.
It implements __FlightRide__ interface and the abstract method is __flight__ contrast to ours which is __ride__
If we had the source code we could just copy and past it into a plane class. Even though it is possible, it is not a great solution.

__Adapter pattern__ comes to save us from this situation.
We just have to create a _Plane_ implementing _Ride_. Then either implement the _FlightRide_ (Class adapter) or give to this implementation a _Plane_ object of the other team (Objet adapter).