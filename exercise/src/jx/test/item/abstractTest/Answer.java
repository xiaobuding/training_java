package jx.test.item.abstractTest;

/**
 * Created by Administrator on 13-8-11.
 */
class Answer {
    String content;
    boolean correct;

    Answer(String content) {
        this.content = content;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
