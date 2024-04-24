package com.example.javaeefundamentals.scopes;

/**
 * @author saozdemir
 * @project javaeeworkspace
 * @date 23 Apr 2024
 * <p>
 * @description: SessionScope gibi ama daha uzun ve manuel session kontrolü için kullanılır.
 */
import javax.enterprise.context.ConversationScoped;
import java.io.Serializable;

@ConversationScoped
public class ConversationScope implements Serializable {
    private static final long serialVersionUID = 215478455465524L;
}
