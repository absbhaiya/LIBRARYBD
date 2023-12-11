<?php

include 'config.php';

session_start();

$user_id = $_SESSION['user_id'];

if(!isset($user_id)){
   header('location:login.php');
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>about</title>

   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">

   <link rel="stylesheet" href="css/style.css">

</head>
<body>
   
<?php include 'header.php'; ?>


<section class="reviews">

   <h1 class="title">OUR TEAM</h1>

   <div class="box-container">

      <div class="box">
         <img src="images/Asif.jpg" alt="">
         <p>"Amazing website! Was looking for my favourite books and i found them all right here!"</p>
         <h3>M Asif Bin Saif</h3>
      </div>

      <div class="box">
         <img src="images/Adipta.jpg" alt="">
         <p>"Amazing website! Was looking for my favourite books and i found them all right here!"</p>
         <h3>Adipta Dey</h3>
      </div>

      <div class="box">
         <img src="images/Suhani.jpg" alt="">
         <p>"Amazing website! Was looking for my favourite books and i found them all right here!" </p>
         <h3>Suparna Sarker Sapna</h3>
      </div>

      <div class="box">
         <img src="images/Niaz.jpg" alt="">
         <p>"Amazing website! Was looking for my favourite books and i found them all right here!"</p>
         <h3>Niaz Murshed Uz Zaman</h3>
      </div>

   </div>

</section>

</section>

<?php include 'footer.php'; ?>

<script src="js/script.js"></script>

</body>
</html>