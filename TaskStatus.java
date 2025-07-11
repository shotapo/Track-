package jp.jp.co.todo.model;

/**
 * タスクの状態を定義する列挙型
 */
public enum TaskStatus {
    NOT_STARTED,    // まだ始まっていない
    IN_PROGRESS,    // 作業中
    COMPLETED;      // 完了した

    /**
     * 状態を日本語で返すメソッド
     * 例：NOT_STARTED → "未着手"
     */
    public String toJapanese() {
        switch (this) {
            case NOT_STARTED:
                return "未着手";
            case IN_PROGRESS:
                return "進行中";
            case COMPLETED:
                return "完了";
            default:
                return "不明";
        }
    }

    /**
     * 状態が完了かどうかを判定するメソッド
     * COMPLETED の場合に true を返す
     */
    public boolean isCompleted() {
        return this == COMPLETED;
    }

    /**
     * 次の状態に進めるメソッド（簡易的な例）
     * NOT_STARTED → IN_PROGRESS → COMPLETED
     */
    public TaskStatus nextStatus() {
        switch (this) {
            case NOT_STARTED:
                return IN_PROGRESS;
            case IN_PROGRESS:
                return COMPLETED;
            case COMPLETED:
                return COMPLETED; // 完了後は変化なし
            default:
                return NOT_STARTED;
        }
    }
}
