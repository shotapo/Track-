package jp.jp.co.todo.model;

public class User {

    //どんな機能が必要かな？
    //ユーザーID（社員や担当者を一意に識別するため）
    //名前（表示や検索に使う）
    //メールアドレス（通知や連絡に使う）
    //コンストラクタ（ユーザーを作るときに初期情報を設定する）
    //→コンストラクタは初期設定だよ。家を建てる時の設計図みたいな感じ
    //ゲッター（ユーザーの情報を外から取得する）
    //→ゲッターは情報を聞いたりするものだよ
    //セッター（ユーザーの情報を外から変更する）
    //→セッターは情報を変更するためのものだよ

    //フィールド（メンバ変数）
    private String userID;
    private String name;
    private String email;

    //コンストラクタ（初期化）
    public User(String userID, String name, String email){ 
        this.userID = userID;
        this.name = name;
        this.email = email;
    }

    //ゲッター（外部から値を取得）
    public String getuserID() {
        return userID;
    }
    public String UserId() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    
    //セッター（外部から値を変更）
    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    
}
