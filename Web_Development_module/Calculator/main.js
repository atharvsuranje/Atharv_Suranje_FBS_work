currentString = "";
function update(value) {
    display = document.getElementById("input");
    if (value === 'AC') {
        currentString = "";
    }
    else if (value === '+/-') {
        currentString = (parseFloat(currentString) * -1).toString();
    }
    else if (value === '%') {
        currentString = (parseFloat(currentString) / 100).toString();
    }
    else {
        currentString = currentString + value;
    }
    display.value = currentString;
}

function calculate() {
    display = document.getElementById("input");
    const result = eval(currentString);
    display.value = result;
    currentString = result.toString();

}

