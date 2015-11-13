<!DOCTYPE html>
<html>

	<#-- 必要な値まとめ -->
  <#assign userId = "Uaaas000000">
  <#assign userPublicScore = "80">
  <#assign userImage = "img/user/Us000000">

  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">

    <title>ユーザー: ${userId!?html}のページ</title>
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/user.css">
    <script src="/js/jquery-2.1.4.js"></script>
  </head>
  <body>
    <div class="app">

      <!-- Navbar content -->
      <nav class="navbar cm-mlr4 cm-br3 cm-head">
        <p class="cm-pt4">Amezon.com</p>
      </nav>

      <!-- breadcrumb -->
      <section class="breadcrumb cm-mlr4 cm-br3 cm-head" style="background-color: rgba(1, 1, 1, .05);">
        <div class="cm-pt4">
          <div class="breadcrumb_item"><a href="#">Home</a></div>
          <div class="breadcrumb_item"><span class="bredcrumb-space">/</span><a href="#">Users</a></div>
          <div class="breadcrumb_item active"><span class="bredcrumb-space">/</span>${userId!?html}</div>
        </div>
      </section>

      <!-- container -->
      <section id="container">

        <!-- User Info -->
        <div class="user-info cm-m12">
          <div class="user-info-content cm-text-center">
            <img src="${userImage}" class="img-circle" width="100" height="100" alt="${userId!?html}のサムネイル画像">
          </div>
          <div class="user-info-content cm-text-left">
            <p>${userId!?html}</p>
            <p>スコア: ${userPublicScore!?html}</p>
          </div>
        </div>

        <div class="friend-btn cm-br3">
          <div class="btn btn-primary-outline btn-lg btn-block">フレンド申請する</div>
        </div>
      </section>

      <!-- Friends -->
      <div class="friends-area cm-m12">

        <h5 class="cm-ml4">フレンド<span class="cm-noti">4</span></h5>

        <!-- userFriendsから値を取る -->
        <ul class="friend-list-box cm-br3">

          <!-- ここがフレンドの数によって繰り返される -->
          <li class="friend-list cm-br3">
            <div class="friend-info">
              <div class="friend-thumnail cm-ml16">
                <img src="img/user/Us000001.png" alt="Us000001のサムネイル画像" class="img-circle" width="24" height="24">
              </div>
              <div class="friend-name cm-ml16">user00001</div>
            </div>
          </li>
          <li class="friend-list">
            <div class="friend-info">
              <div class="friend-thumnail cm-ml16">
                <img src="img/user/Us000001.png" alt="Us000001のサムネイル画像" class="img-circle" width="24" height="24">
              </div>
              <div class="friend-name cm-ml16">user00001</div>
            </div>
          </li>
          <li class="friend-list">
            <div class="friend-info">
              <div class="friend-thumnail cm-ml16">
                <img src="img/user/Us000001.png" alt="Us000001のサムネイル画像" class="img-circle" width="24" height="24">
              </div>
              <div class="friend-name cm-ml16">user00001</div>
            </div>
          </li>

          <!-- フレンドがいなかったら表示しない -->
          <li class="friend-list more-list">
            <p class="more-btn">もっと見る</p>
          </li>

        </ul>

      </div>

      <!-- Reccomended Items -->
      <div class="reccomended-area cm-m12">
        <h5 class="cm-ml4">このユーザーのおすすめ商品</h5>
        <div class="item-list-box">
          <div class="col-xs-3">
            <img src="img/item/It000000.png" alt="商品It000000のサムネイル画像" class="img-rounded" width="48" height="48">
          </div>
          <div class="col-xs-3">
            <img src="img/item/It000001.png" alt="商品It000001のサムネイル画像" class="img-rounded" width="48" height="48">
          </div>
          <div class="col-xs-3">
            <img src="img/item/It000002.png" alt="商品It000002のサムネイル画像" class="img-rounded" width="48" height="48">
          </div>
          <div class="col-xs-3">
            <img src="img/item/It000003.png" alt="商品It000003のサムネイル画像" class="img-rounded" width="48" height="48">
          </div>
          <div class="col-xs-3">
            <img src="img/item/It000004.png" alt="商品It000004のサムネイル画像" class="img-rounded" width="48" height="48">
          </div>
          <div class="col-xs-3">
            <img src="img/item/It000005.png" alt="商品It000005のサムネイル画像" class="img-rounded" width="48" height="48">
          </div>
          <div class="col-xs-3">
            <img src="img/item/It000006.png" alt="商品It000006のサムネイル画像" class="img-rounded" width="48" height="48">
          </div>
        </div>
      </div>

      <!-- Recent Posts -->
      <div class="post-area cm-m12">
        <h5 class="cm-ml4">最近投稿されたレビュー</h5>
        <div class="item-list-box">
          <div class="col-xs-3">
            <img src="img/item/It000000.png" alt="商品It000000のサムネイル画像" class="img-rounded" width="48" height="48">
          </div>
          <div class="col-xs-3">
            <img src="img/item/It000001.png" alt="商品It000001のサムネイル画像" class="img-rounded" width="48" height="48">
          </div>
          <div class="col-xs-3">
            <img src="img/item/It000002.png" alt="商品It000002のサムネイル画像" class="img-rounded" width="48" height="48">
          </div>
          <div class="col-xs-3">
            <img src="img/item/It000003.png" alt="商品It000003のサムネイル画像" class="img-rounded" width="48" height="48">
          </div>
          <div class="col-xs-3">
            <img src="img/item/It000004.png" alt="商品It000004のサムネイル画像" class="img-rounded" width="48" height="48">
          </div>
          <div class="col-xs-3">
            <img src="img/item/It000005.png" alt="商品It000005のサムネイル画像" class="img-rounded" width="48" height="48">
          </div>
          <div class="col-xs-3">
            <img src="img/item/It000006.png" alt="商品It000006のサムネイル画像" class="img-rounded" width="48" height="48">
          </div>
        </div>
      </div>


      <nav class="nav-bottom cm-mlr4 cm-br3">
        &copy; 2015 Amezon.com
      </nav>

    </div>

  </body>
</html>
