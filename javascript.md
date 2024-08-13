# Javascript

## DOM access with javascript
* https://developer.mozilla.org/en-US/docs/Web/API/Document_Object_Model
* https://developer.mozilla.org/en-US/docs/Web/API/HTML_DOM_API

``` html
<p id="demo">This is the original text.</p>
<button onclick="changeText()">Change Text</button>
```
```javascript
function changeText() {
    document.getElementById("demo").textContent = "The text has been changed!";
}
function changeColor() {
    document.getElementById("demo").style.color = "red";
}
function hideText() {
    document.getElementById("demo").style.display = "none";
}

function showText() {
    document.getElementById("demo").style.display = "block";
}
```

Altneratively using getelementsbyclass, and query selectors:
```javascript
document.getElementsByClassName("example")[0].style.color = "blue";
document.querySelector(".example").textContent = "Text changed using querySelector!";
```

You can also add new elements to the DOM, which really shows you how javascript can make your html come to life and the level of access it has.

## Promises
A Promise in JavaScript represents the eventual completion (or failure) of an asynchronous operation and its resulting value. A Promise can be in one of three states: pending, fulfilled, or rejected.

``` javascript
let promise = new Promise((resolve, reject) => {
    let success = true; // Simulate an operation that can succeed or fail
    if (success) {
        resolve("Operation was successful!");
    } else {
        reject("Operation failed.");
    }
});

promise.then(result => {
    console.log(result); // "Operation was successful!"
}).catch(error => {
    console.log(error);
});
```
## Async Await
async and await are syntax features that allow you to write asynchronous code in a synchronous manner. async functions always return a Promise, and await is used to wait for a Promise to resolve.

```javascript
async function fetchData() {
    let promise = new Promise((resolve, reject) => {
        setTimeout(() => resolve("Data fetched!"), 2000);
    });

    let result = await promise; // Wait until the promise resolves
    console.log(result); // "Data fetched!"
}

fetchData();
```

## Fetch API
An asynchronous way to call APIs from an endpoint.

```javascript
async function getData() {
    let response = await fetch("https://jsonplaceholder.typicode.com/todos/1");
    let data = await response.json();
    console.log(data); // Logs the data from the API
}

getData();
```


# npm/pnpm/yarn/bun rundown
Package managers are exactly what they sounds like, they manage javascript packages(library files) for a given project.
They tend to use files and directories like `package.json`, `package-lock.json` , `node_modules`

They exist due to preferences in commands, speed differences, etc.. Their functions are all relatively the same.

main npm commands:
`npm` - install and uninstallation command

`npx` - execute package

# NextJS

Try out a basic project scaffolding to see what it might look like:
`npx create-next-app@latest`

Main features of NextJS (and similar frameworks):
* Routing
* Rendering
* data fetching(api calls etc)
* Styling management and QOL

## App routing
Each route should have a page.js file or similar, each page per route is unique.

Layouts are page elements that stay constant inbetween pages that share common routes.

https://nextjs.org/docs/app/building-your-application/routing/pages-and-layouts

All based on folder structure IN PROJECT:

https://nextjs.org/docs/app/building-your-application/routing

## Fetching
An extension of javascript fetches.

https://nextjs.org/docs/app/building-your-application/data-fetching/fetching-caching-and-revalidating

