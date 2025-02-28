document.addEventListener('DOMContentLoaded', function () {
    // Inicializar el carrusel automáticamente
    var carousel = document.querySelector('#carouselExampleIndicators');
    var bootstrapCarousel = new bootstrap.Carousel(carousel, {
        interval: 3000,  // Cambiar de slide cada 3 segundos
        ride: 'carousel'
    });
});

