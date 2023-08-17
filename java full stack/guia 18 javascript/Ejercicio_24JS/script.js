document.getElementById("circleForm").addEventListener("submit", function (event) {
    event.preventDefault();

    const diameter = parseFloat(document.getElementById("diameter").value);
    const radius = diameter / 2;

    document.getElementById("result").textContent = radius.toString();
});