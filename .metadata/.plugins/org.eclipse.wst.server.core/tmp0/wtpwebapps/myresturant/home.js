
const text = document.querySelector(".sec-text");

const textLoad = () => {

  setTimeout(() => {

    text.textContent = "Resturant";

  }, 0);

  setTimeout(() => {

    text.textContent = "Free fooding";

  }, 4000);

  setTimeout(() => {

    text.textContent = "Free drink";

  }, 8000);

}



textLoad();

setInterval(textLoad, 12000);