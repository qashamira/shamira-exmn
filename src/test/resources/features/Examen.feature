Feature: Hacer login en Bensg
  @login

  Scenario: Validación del precio de un producto

    Given  estoy en la página de la tienda bensg
    And me logueo con mi usuario "qashamira29@gmail.com" y clave "1234fgr.qw"
    And hago clic en el boton de Iniciar sesion
    When navego a la categoria "Clothes" y subcategoria "Men"
    And agrego 2 unidades del primer producto al carrito
    Then valido en el popup la confirmación del producto agregado
    And valido en el popup que el monto total sea calculado correctamente
    When finalizo la compra
    Then valido el titulo de la pagina del carrito
    And vuelvo a validar el calculo de precios en el carrito





