# React Overview

* Official docs: https://react.dev/reference/react

React is a javascript/typescript framework that makes it easier to create dynamic sites with more maintainable code structure.
It breaks things down into functions!

Examples of how easy frameworks make it:

No framework, lots of javascript: https://davidk003.github.io/CAT3-Final/
* https://github.com/davidk003/CAT3-Final
vs Framework:
https://prototype-translation-glaser-frontend.vercel.app/


Common code structure looks like:
```javascript
import React, { useState } from 'react';

const Counter = () => {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  const decrement = () => {
    setCount(count - 1);
  };

  return (
    <div className="p-4 max-w-sm mx-auto bg-white rounded-xl shadow-md space-y-2">
      <h1 className="text-2xl font-bold text-center">Simple Counter</h1>
      <p className="text-center text-xl">{count}</p>
      <div className="flex justify-center space-x-2">
        <button
          onClick={decrement}
          className="px-4 py-2 bg-red-500 text-white rounded hover:bg-red-600"
        >
          -
        </button>
        <button
          onClick={increment}
          className="px-4 py-2 bg-green-500 text-white rounded hover:bg-green-600"
        >
          +
        </button>
      </div>
    </div>
  );
};

export default Counter;
```

Rather than write more Ill just show an example (albeit not a great one)

https://davidk-lol-vite-react.vercel.app/

https://github.com/davidk003/davidk.lol-vite-react