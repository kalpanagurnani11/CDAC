function App() {

  function ispalin() {
    let n = document.getElementById("num").value;
    let s = n.toString();

    for (let i = 0; i < s.length / 2; i++) {
      if (s[i] != s[s.length - i - 1]) {
        alert("not palindrome");
        return;
      }
    }

    alert("palindrome");
  }

  return (
    <div>
      <input type="number" id="num" placeholder="enter a num" />
      <button onClick={ispalin}>click</button>
    </div>
  );
}

export default App;