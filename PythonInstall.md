
#Pythonの環境構築


  
##1.Python本体のインストール

日本Pythonユーザー会にある [ダウンロードページ](http://www.python.jp/Zope/Zope/download/pythoncore)からダウンロード。
  64bitだとうまくいかない点があったので、32bit版を入手すること


###インストール時の注意点
パスを設定しておくこと。Python3.5では、インストーラ起動時に「Add Python 3.5 to PATH」という項目にチェックを入れると、インストール時にパスを設定してくれる(他のバージョンについては不明)。
これを忘れると自分で入力してパスを設定する必要があるので少し面倒。[手順はこちら](http://www.pythonweb.jp/install/setup/index1.html)



##2.pipによる各種パッケージのインストール方法
まず、Pythonのパッケージを簡単にダウンロードできるツールである**pip**をインストール。
コマンドラインを立ち上げて、

```
$ python -m pip install --upgrade pip
```

を入力すると、pipが使用可能となる。
これ以降は次の1行でパッケージのインストールができる。

```
$ pip install <パッケージ名>
```

例) Numpyをインストールしたい場合は

```
$ pip install Numpy
```

でOK.


##3.pipでインストールできない場合
原因不明だが、pipを使うとエラーが発生してインストールできないことがある。
このときは手動でパッケージをダウンロード・インストールする。
パッケージは[こちら](http://www.lfd.uci.edu/~gohlke/pythonlibs/)のサイトでダウンロード可能。
使っているPythonのバージョン、32/64bitに注意しながらパッケージを探し、ダウンロードする。
ダウンロードしてきたら、

```
$ pip install --use-wheel --no-index --find-links=wheelhouse <Numpyのパッケージ.whl>
```

これでもエラーが出ることもたまにあるが、--use-wheel、--no-index、--find-links=wheelhouseの各種オプションをどれか外すと大抵は成功する。

例) matplotlibのインストール
Pythonの環境は次の通りとする。

- ver 3.5  
- 32bit 

ダウンロードしてくるのは"matplotlib‑1.5.0rc2‑cp35‑none‑win_amd64.whl"というファイル。これを適当なディレクトリに置き、次のコマンドを実行

```
$ pip install --use-wheel --no-index --find-links=wheelhouse matplotlib-1.4.3-cp35-none-win32.whl
```


  
  
##4.使うことになると思われるパッケージ
研究のために以下のパッケージが必要になりそう

- numpy
- scipy
- motplotlib
- networkx


