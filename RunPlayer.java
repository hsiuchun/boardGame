import java.util.*;
public class RunPlayer implements Runnable{
    private int blood=4;
    private int lastblood=4;
    private int PLAYERID;
    private int ROLE;//0,2,4 good  1,3,5 bad
    private int CHARACTER;
    private ArrayList<Integer> handCard = new ArrayList<Integer>();
    private Thread playerThread;
    private int Covid=0;
    private int Shield=0;
    public RunPlayer(int playerId ,int role,int character){
        this.ROLE=role;
        this.CHARACTER=character;
        this.PLAYERID=playerId;
        // this.playerThread = new Thread(this);
        // playerThread.start();
        
    }
    public void run(){
        while(true){ //輪到我或是被選擇
            //不斷偵測血量
            if (blood<=0){
                System.out.println("PLAYER "+this.PLAYERID+" WILL BE DEAD");
                //處理過程
                // break;
            }
            
                
            //不斷檢查是否發動技能
            switch(this.CHARACTER) {
                case 0:
                    System.out.println("Glass Ceiling");
                        //把是否已用過Fire!的布林值改成false
                    
                    break;
                case 1:
                    //System.out.println("Quantum Entanglement");已測試
                    if(lastblood-this.blood>0){
                        System.out.println("get"+(lastblood-this.blood)+"cards");
                    }
                    lastblood=this.blood;
                    break;
                case 2:
                    System.out.println("Master Of Card Player");
                    //難難難
                    break;
                case 3:
                    System.out.println("King Peter Of Sea Dragon");
                    //難難難
                    break;
                case 4:
                    System.out.println("Wang John");
                    if(this.blood>1){
                        // if(使用了技能){
                        //     抽兩張牌
                        // }
                    }
                    break;
                case 5:
                    System.out.println("Slacker");
                    // if(我方抽牌階段){
                    //     if(使用了技能){
                    //         boolean hasCard=false;
                    //         while(!hasCard){
                    //             選擇拿牌的對象
                    //             if(他的牌數>0){
                    //                 hasCard=true;
                    //                 抽他牌阿;
                    //             }
                    //         }
                    //         從牌組抽的牌-1;
                    //     }
                    // }
                    break;
                case 6:
                    System.out.println("Rank SS Musketeer");
                    //想不到
                    break;
                case 7:
                    System.out.println("Slash Youth");
                    // if(我方抽牌階段){
                    //     if(使用了技能){
                                // 抽三張牌;
                                // 記下編號;
                                // 選一張丟回去;
                                // 那張標示為在牌組中;
                    //     }
                    // }
                    break;
                case 8:
                    System.out.println("Demon Cat Man");
                    //小難啊
                    break;
                case 9:
                    System.out.println("Romantic Duke");
                    // if(接到要被殺的通知){
                    //     type t=抽牌(1).花色
                    //     if(t==紅心){
                    //         不扣血;
                    //     };
                    // }
                    break;
                // (0, 'Glass Ceiling', '可以使用任意張數的Fire!（等同內建大開殺戒）', 'glassceiling.png'),
                // (1, 'Quantum Entanglement', '每當損失一點生命值，可立即從牌庫頂抽一張牌。', 'quantumentanglement.png'),
                // (2, 'Master Of Card Player', '在抽牌階段時，可以先選擇是否公開第二張牌，再公開拿取第兩張牌，若是紅心或方塊，可再抽一張（不能先抽再公開第二張牌，要先選是否公開，不然會有爭議，其他抽取的牌可不用公開）', 'masterofcardplayer.png'),
                // (3, 'King Peter Of Sea Dragon', '每當他進行抽牌判定時，可以從牌庫頂直接翻開兩張牌，並選一張作為判定結果。', 'kingpeterofseadragon.png'),
                // (4, 'Wang John', '在你的回合時，你可以損失一點生命值並摸兩張牌，此能力可以在回合中重複發動，但不可以發動此能力損失最後一點生命值', 'wangjohn.png'),
                // (5, 'Slacker', '可以從任意玩家的手牌中，隨機抽取一張作為本回合要抽的第一張牌。', 'slacker.png'),
                // (6, 'Rank SS Musketeer', '玩家必須出2張「Miss」才能躲過他的Fire！（盾の勇者就算判定成功也只算一次失手）', 'rankssmusketeer.png'),
                // (7, 'Slash Youth', '在抽牌階段時，可以看牌頂的三張牌，選兩張作為要抽的牌，剩下的一張面朝下放回牌庫頂', 'slashyouth.png'),
                // (8, 'Demon Cat Man', '可以把Fire！當「Miss」用，或把「Miss」當Fire！用（任何時候都具備此能力）', 'demoncatman.png'),
                // (9, 'Romantic Duke', '當他成為「Fire！」的目標，他可以進行抽牌判定，如果是紅心就閃過（只有Fire！的攻擊才有用，大開殺戒不算。等同內建盾の勇者，若場面有裝備盾の勇者，甚至可以判定兩次）', 'romanticduke.png');
                
            }
            break;
        }
    }
    public void doNothing(int milliseconds){    
        try {
            playerThread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        

    }

    public int getPlayerId(){
        return this.PLAYERID;
    }
    public int getRole(){
        return this.ROLE;
    }
    public void setRole(int role){
        this.ROLE=role;
    }
    public int getCharacter(){
        return this.CHARACTER; 
    }
    public void setCharacter(int character){
        this.CHARACTER=character;
    }
    public int getBlood(){
        return this.blood;
    }
    public void setBlood(int b){
        this.blood=b;
    }
    public ArrayList<Integer> getHandCard(){
        return this.handCard;
    }
    public void setHandCard(ArrayList<Integer> handcard){
        this.handCard=handcard;
    }
    public int HandCardNum(){
        return this.handCard.size();
    }
    public int getCovid(){
        return this.Covid;
    }
    public void setCovid(int i){
        this.Covid=i;
    }
    public int getShield(){
        return this.Shield;
    }
    public void setShield(int i){
        this.Shield=i;
    }
    //test
    public static void main(String[] args){
       Primary primary = new Primary();
       Player player1 = primary.getPlayer(1);
       System.out.println(primary.getHandCard(1));
    }
}
