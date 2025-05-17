<?php
    include("libreria/persona.php");
    include("libreria/apprentice.php");

    $apprentice= new Apprentice();
    $apprentice->setNames(names: "Natalia");
    $apprentice->setTelephoneContact(telephoneContact:3137701094);
?>
<!DOCTYPE html>
<html lang="en">
<head> 
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width; initial-scale=1.0">
      <title>Document</title>
</head>
<body>
    <!php
        echo "Names: ".$apprentice->getNames();
        echo "br/"
        echo "Telephone: ".$apprentice->getTelephoneContact();
    ?>    
</body>
</html>