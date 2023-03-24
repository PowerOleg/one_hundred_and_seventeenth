function MyFunction() {
    alert('The example has worked out'); return false
}

function ChangeColor(Element) {
if (Element.style.color == 'green') Element.style.color = 'red';
	else Element.style.color = 'green';
	return false;
}


function Substitute() {
//var name = document.getElementById("onclick").value;          !!!


    // create the new element (input)
    var textBox = document.createElement("input");
    textBox.type = "text";
    // get the button
    var button = document.getElementById("onclick");
    // replace it
    button.replaceWith(textBox);
}

function replaceWithText(text) {
    // get the button
    var button = document.getElementById("4");
    // replace it
    button.replaceWith(text);
}

function add(a, b) {
      var sum = parseInt(a, 10) + parseInt(b, 10);
      alert(sum);
}
