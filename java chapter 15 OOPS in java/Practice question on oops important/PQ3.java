//Which of the following modifiers are not allowed in front of the class 
// a. private 
// b . protected 
// c . public 
// d . default 


// answer = a (private) and b (protected )
// if the class is private or protected then it becomes unusable and we are not able to make the object of that class.

// Access modifiers 
    // private (within class )
    // default (within class) (within package )
    // protected (within class) (within package) (outside package by subclass only )
    // public (within class ) (within package) (outside package by subclass only ) (outside package )
 

//                  private     default    protected     public 
//class               N           Y           N             Y
//nested class        Y           Y           Y             Y
// constructor        Y           Y           Y             Y
// methods            Y            Y          Y             Y
// field              Y            Y          Y             Y