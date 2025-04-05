document.addEventListener("DOMContentLoaded", function () {
    const cards = document.querySelectorAll(".card");

    const observer = new IntersectionObserver((entries, observer) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                entry.target.classList.add("show");
            } else {
                entry.target.classList.remove("show");
            }
        });
    }, { threshold: 0.2 }); // Ativa a animação quando 20% do card está visível

    cards.forEach(card => {
        observer.observe(card);
    });
});

let navBar = document.querySelector('#header')

document.addEventListener("scroll", ()=>{
  let scrollTop = window.scrollY;

  if(scrollTop > 0){
    navBar.classList.add('rolar');
  } else{
    navBar.classList.remove('rolar');
  }
})


let btnMenu = document.getElementById('btn-menu')
let menu = document.getElementById('menu-mobile')
let overlay= document.getElementById('overlay-menu')

btnMenu.addEventListener('click', ()=>{
  menu.classList.add('abrir-menu')
})

menu.addEventListener('click', ()=>{
  menu.classList.remove('abrir-menu')
})

overlay.addEventListener('click', ()=>{
  menu.classList.remove('abrir-menu')
})
