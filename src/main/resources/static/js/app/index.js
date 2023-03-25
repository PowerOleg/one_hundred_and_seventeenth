function MyFunction() {
    alert('The example has worked out'); return false
}

function ChangeColor(Element) {
if (Element.style.color == 'green') Element.style.color = 'red';
	else Element.style.color = 'green';
	return false;
}


function Substitute() {
    // create the new element (input)
    var textBox = document.createElement("input");
    textBox.type = "text";
    // get the button
    var button = document.getElementById("onclick");
    // replace it
    button.replaceWith(textBox);
}
//если делать с большой буквы - почемуто не работает
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

//function apple() {
//    var username = [[${memberList[0]}]];
//    $('#JavaScript').replaceWith('<span id="JavaScript" style="color: #1c7430">' + username + '</span>')
//})