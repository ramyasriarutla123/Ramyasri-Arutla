function reverseWords(sentence) {
  return sentence.split(' ').map(word => {
      return word.split('').reverse().join('');
  }).join(' ');
}

let inputSentence = "This is a sunny day";
let reversedSentence = reverseWords(inputSentence);

console.log(reversedSentence);