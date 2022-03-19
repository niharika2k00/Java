const person = { fname: "Sakku", lname: "Sharma", age: 20 };

let text = "";
for (let x in person) {
  text += person[x];
}

console.log(text);

//   array.filter(function(currentValue, index, arr), thisValue)
const ages = [32, 33, 16, 40];
const result = ages.filter(checkAdult);

function checkAdult(age) {
  return age >= 18;
}

const fruits = ["apple", "orange", "cherry"];
for (let i in person) {
  console.log(i, person[i]);
}

fruits.forEach((ele) => console.log(ele));
