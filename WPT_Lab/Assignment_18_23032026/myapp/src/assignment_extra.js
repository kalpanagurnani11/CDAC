// 1) load page with default background-color -  cyan 

//  take some buttons on page 
// Red
// Yellow
// Green
// Blue
// Orange

// when you click on that button change the background color of page 
export default function Color() {

  function change(color) {
    document.body.style.backgroundColor = color;
  }

  return (
    <>
      <h2></h2>

      <button onClick={() => change("red")}>Red</button>
      <button onClick={() => change("yellow")}>Yellow</button>
      <button onClick={() => change("green")}>Green</button>
      <button onClick={() => change("blue")}>Blue</button>
      <button onClick={() => change("orange")}>Orange</button>
    </>
  );
}

