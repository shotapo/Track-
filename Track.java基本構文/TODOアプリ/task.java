package jp.jp.co.todo.model;

//日付を扱うクラスをインポート
import java.time.LocalDate;


/**
 * タスク情報を保持するクラス
 */
public class task {
    
    private int id;                     // タスクID
    private String title;              // タスクのタイトル
    private String description;        // タスクの詳細説明
    private LocalDate dueDate;         // 締切日
    private TaskStatus status;         // タスクの状態（列挙型）
    private User assignedTo;           // 担当者（Userクラス）

    /**
     * コンストラクタ：タスクの初期状態を設定
     */
    
    public task(int id, String title, String description, LocalDate dueDate, TaskStatus status, User assignedTo) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.assignedTo = assignedTo;
    }

    /**
     * タスクが期限切れかどうかを判定する
     * @return 現在日付が締切日を過ぎていれば true
     */
    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate);
    }

    /**
     * タスクを完了状態に変更する
     */
    public void markComplete() {
        this.status = TaskStatus.COMPLETED;
    }

    // ======= ゲッターとセッター =======

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return
     */
    public TaskStatus getStatus() {
        return status;

    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }
}
