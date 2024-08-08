package com.nimsara.nimsaraportfoliobot;

import dev.langchain4j.chain.ConversationalRetrievalChain;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/chat")
@RequiredArgsConstructor
@Slf4j
public class ChatController {
    private final ConversationalRetrievalChain conversationalRetrievalChain;

    @PostMapping
    public String chatWithPdf(@RequestBody String text) {
        var answer = conversationalRetrievalChain.execute(text);
        log.debug("Answer is - {}", answer);
        return answer;
    }
}
