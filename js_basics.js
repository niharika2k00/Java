const person = { name: "Niharika", address: "Kolkata", age: 21 };

let text = "";
//  x ->  name ,  address , age
for (let x in person) {
  text += person[x];
}

console.log("\n", text);

//   array.filter(function(currentValue, index, arr), thisValue)
const ages = [32, 33, 16, 40];
const result = ages.filter(checkAdult);

function checkAdult(age) {
  return age >= 18;
}
console.log("\n", result, "\n");

const fruits = ["apple", "orange", "cherry"];
for (let i in fruits) {
  console.log(i, fruits[i]);
}

fruits.forEach((ele) => console.log(ele));
