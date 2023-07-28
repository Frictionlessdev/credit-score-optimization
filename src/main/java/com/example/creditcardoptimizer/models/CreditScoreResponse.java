package com.example.creditcardoptimizer.models;

public class CreditScoreResponse {
    private String ssn;
    private int score;

    public CreditScoreResponse(CreditScoreResponseBuilder creditScoreResponseBuilder) {
        this.ssn = creditScoreResponseBuilder.ssn;
        this.score = creditScoreResponseBuilder.score;
    }

    public static CreditScoreResponseBuilder getBuilder(){
        return new CreditScoreResponseBuilder();
    }

    public static class CreditScoreResponseBuilder{
        private String ssn;
        private int score;

        public CreditScoreResponseBuilder setSsn(String ssn) {
            this.ssn = ssn;
            return this;
        }

        public CreditScoreResponseBuilder setScore(int score) {
            this.score = score;
            return this;
        }

        public CreditScoreResponse build(){
            return new CreditScoreResponse(this);
        }
    }
}
