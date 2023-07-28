package com.example.creditcardoptimizer.models;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CreditScoreSuggestionResponse {
    private List<String> suggestions;
}
