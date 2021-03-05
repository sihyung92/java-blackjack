package blackjack.domain.user;

import blackjack.domain.card.Card;
import blackjack.domain.card.painting.Suit;
import blackjack.domain.card.painting.Value;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {
    @DisplayName("유저의 카드 뽑기 테스트")
    @Test
    void testDrawCard() {
        //given
        User user = new User("욘");

        //when
        user.drawCard(new Card(Suit.DIAMOND, Value.ACE));
        user.drawCard(new Card(Suit.CLOVER, Value.FOUR));

        //then
        assertThat(user.getCards()).containsExactly(new Card(Suit.DIAMOND, Value.ACE), new Card(Suit.CLOVER, Value.FOUR));
    }

}