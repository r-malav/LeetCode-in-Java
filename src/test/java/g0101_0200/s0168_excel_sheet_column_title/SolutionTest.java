package g0101_0200.s0168_excel_sheet_column_title;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void convertToTitle() {
        assertThat(new Solution().convertToTitle(1), equalTo("A"));
    }
}