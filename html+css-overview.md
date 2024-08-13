# HTML Overview
HTML is a markup language first and foremost. It is not "code" in the traditional sense because there are no 

References for HTML and CSS:
* For official docs: [https://developer.mozilla.org/en-US/docs/Web/HTML](https://developer.mozilla.org/en-US/docs/Web/HTML)
* For quick, less dense, straight to example: [https://www.w3schools.com/html/default.asp](https://www.w3schools.com/html/default.asp)

HTML is made up of tags, CSS styles the tags. Each element/tag has its own properties and attributes that make up how the internal data of an element is determined.

I'll mix up properties and attributes sometimes even though theyre technically not the same but just know what I'm talking about:
[https://stackoverflow.com/questions/6003819/what-is-the-difference-between-properties-and-attributes-in-html](https://stackoverflow.com/questions/6003819/what-is-the-difference-between-properties-and-attributes-in-html) (Check 2nd Answer)


Bare HTML leads to sites like:
* [https://www.berkshirehathaway.com/](https://www.berkshirehathaway.com/)
* [https://danluu.com/](https://danluu.com/)
* [https://nocss.club/](https://nocss.club/)

# HTML Tags Rundown

## Paragraph Tag
The `<p>` tag defines a paragraph.

```html
<p>This is a paragraph.</p>
```
<p>This is a paragraph.</p>

## Heading Tag

Heading tags are used to define headings. There are six levels, from `<h1>` (most important) to `<h6>` (least important).
```html
<h1>This is a Heading 1</h1>
<h2>This is a Heading 2</h2>
<h3>This is a Heading 3</h3>
<h4>This is a Heading 4</h4>
<h5>This is a Heading 5</h5>
<h6>This is a Heading 6</h6>
```
<h1>This is a Heading 1</h1>
<h2>This is a Heading 2</h2>
<h3>This is a Heading 3</h3>
<h4>This is a Heading 4</h4>
<h5>This is a Heading 5</h5>
<h6>This is a Heading 6</h6>

## Anchor Tag

The `<a>` tag defines a hyperlink, which is used to link from one page to another.
```html
<a href="https://www.example.com">Visit Example.com</a>
```
<a href="https://www.example.com">Visit Example.com</a>

## Image Tag
Note that you can edit the height and width properties of the image tag, and the src property determines the image.

```html
<img src="https://images.ctfassets.net/hrltx12pl8hq/28ECAQiPJZ78hxatLTa7Ts/2f695d869736ae3b0de3e56ceaca3958/free-nature-images.jpg" alt="Placeholder Image">
```
<img height="600px" width="600px" src="https://images.ctfassets.net/hrltx12pl8hq/28ECAQiPJZ78hxatLTa7Ts/2f695d869736ae3b0de3e56ceaca3958/free-nature-images.jpg" alt="Placeholder Image">

## Bold Tag
```html
<b>This text is bold.</b>
```
<b>This text is bold.</b>


## Italic Tag
```html
<i>This text is italicized.</i>

```
<i>This text is italicized.</i>

## Line Break Tag
```html
<p>This is the first line.<br>This is the second line.</p>

```
<p>This is the first line.<br>This is the second line.</p>

## Horizontal Rule
```html
<hr>
```
<hr>


## Division Tag
The MOST commonly used html tag. Used as a container type tag to carry other elements and block them.
```html
<div>
  <h2>This is inside a div</h2>
  <p>This is also inside the div.</p>
</div>

```
<div>
  <h2>This is inside a div</h2>
  <p>This is also inside the div.</p>
</div>


## Span Tag
Inline element groups
```html
<p>This is a <span style="color: red;">red</span> word.</p>

```
<p>This is a <span style="color: red;">red</span> word.</p>


## Table Tag
```html
<table border="1">
  <tr>
    <th>Header 1</th>
    <th>Header 2</th>
  </tr>
  <tr>
    <td>Row 1, Cell 1</td>
    <td>Row 1, Cell 2</td>
  </tr>
  <tr>
    <td>Row 2, Cell 1</td>
    <td>Row 2, Cell 2</td>
  </tr>
</table>

```
<table border="1">
  <tr>
    <th>Header 1</th>
    <th>Header 2</th>
  </tr>
  <tr>
    <td>Row 1, Cell 1</td>
    <td>Row 1, Cell 2</td>
  </tr>
  <tr>
    <td>Row 2, Cell 1</td>
    <td>Row 2, Cell 2</td>
  </tr>
</table>


## Lists
### unordered
```html
<ul>
  <li>First item</li>
  <li>Second item</li>
  <li>Third item</li>
</ul>
```
<ul>
  <li>First item</li>
  <li>Second item</li>
  <li>Third item</li>
</ul>

### ordered 
```html
<ol>
  <li>First item</li>
  <li>Second item</li>
  <li>Third item</li>
</ol>
```
<ol>
  <li>First item</li>
  <li>Second item</li>
  <li>Third item</li>
</ol>


# CSS Overview

CSS stands for cascading stye sheets, it is a way to modify the visual behavior of any given html element.
Each html tag/element has its own default style, but you can modify it with CSS.

## CSS selectors
For reference:
[https://www.w3schools.com/cssref/css_selectors.php](https://www.w3schools.com/cssref/css_selectors.php)

In general you use the tag name like `a` for all tags,  `.` prefix for classnames, `#` for ids, and `[attribute name]` for attributes.
`*` is a wildcard for ALL (common in programming languages), and note these selectors can be chained.

### Example CSS:
```css
p {
  color: yellow;
}


```
 
# Readable HTML
[https://frontendmasters.com/](https://frontendmasters.com/)
# Now just one more thing to make it perfect...
Sites with only HTML and CSS can exist, however the modern web makes javascript nearly unavoidable.

Javascript allows for much stronger control over all parts of the DOM of a webpage

* What is possible with frameworks:
Just a few examples of React websites are

Facebook, Instagram, Netflix, Airbnb, Discord, Reddit, Github, Tiktok(nextjs), spotify(nextjs), chatgpt(nextjs), Notion

You dont need to use heavy frameworks like react, vue, angular, etc lightweight frameworks work just fine.
In fact you dont need to know how to code to make a servicable somewhat customizable website. 
You can use templates with frameworks like astro to create a blog in as little as one minute if you know which deployment tools to use!

Ex: A clean blog template I tested out to see how easy it would be 
* [https://astro-paper-blog-drab.vercel.app/](https://astro-paper-blog-drab.vercel.app/)
