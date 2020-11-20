# boardGame
109-1 OOPII Java gui
# How to run?
#### 在終端機上編譯此檔並執行。
```java=
javac StartPanel.java
java StartPanel
```
#### 顯示畫面為
![](https://i.imgur.com/BSCxUTe.png)
#### 點擊規則說明後會跳轉至規則說明視窗
![](https://i.imgur.com/y6Pn6gm.png)
#### 點擊Card會有下拉式選單，可以切換不同卡牌的介紹
![](https://i.imgur.com/BGFmias.png)
#### 點擊Back To Start可以返回原視窗
![](https://i.imgur.com/BSCxUTe.png)
#### 點擊Start開始遊戲
![](https://i.imgur.com/o7xZje4.png)
#### 點擊下方遊戲卡牌，會在左上角顯示
![](https://i.imgur.com/7Lg3hY3.png)
點擊確認即可出牌；若需要對其他玩家使用，同樣要先點選確認再去點選其他玩家，點選玩家後同樣要按確認，才會執行卡牌效果。中途若想改變主意，請點選取消。若沒有要在使用卡牌可以按結束，輪到下一人進行他的回合。此處會去判定是否需要棄牌。
<font color="#FF0000">目前還沒做到結束回合時，去判斷玩家是否需棄牌及實際棄牌動作。而且目前卡牌有效果的僅有Fire!及零工經濟(只有選這兩種卡牌出，才會從手牌中消失)。</font>
