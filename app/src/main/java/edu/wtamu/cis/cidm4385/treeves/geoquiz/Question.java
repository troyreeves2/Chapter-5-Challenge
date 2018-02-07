package edu.wtamu.cis.cidm4385.treeves.geoquiz;

/**
 * Created by tr957619 on 2/5/2018.
 */

public class Question {

        private int mTextResId;
        private boolean mAnswerTrue;

        public Question(int textResId, boolean answerTrue) {
            mTextResId = textResId;
            mAnswerTrue = answerTrue;
        }

    public int getTextResId() {
        return mTextResId;
    }
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }
    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }
    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}

