//Cria uma var para o botão, chamando a class do HTML
const btnHamburger = document.querySelector('.btn-hamburger');

//Mesma coisa que a linha de cima, mas usa o parâmetro especifíco para id's: 'getElementById'
//Atenção: Id's não utilizam o "." igual na linha anterior pqp
const navLinks = document.getElementById('nav-links');

//Cria uma var especifíca para o icon como vocÊ pode ↓ ver
const icon = document.querySelector('.btn-hamburger i');

btnHamburger.addEventListener('click', () => {
    navLinks.classList.toggle('show');

    //Muda o estilo da classe 'btn-hamburger' se for clicado ou não (a ordem não importa)
    //X
    icon.classList.toggle('fa-times');

    //barras
    icon.classList.toggle('fa-bars');
}
)
