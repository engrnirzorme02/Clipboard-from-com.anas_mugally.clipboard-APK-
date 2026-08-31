package p302m6;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6118n;
import p278j6.AbstractC5905g;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: m6.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6422x extends AbstractC6421w {
    /* JADX INFO: renamed from: T0 */
    public static String m27628T0(String str, int i7) {
        AbstractC6118n.m27187e(str, "<this>");
        if (i7 >= 0) {
            String strSubstring = str.substring(AbstractC5905g.m26656d(i7, str.length()));
            AbstractC6118n.m27186d(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i7 + " is less than zero.").toString());
    }

    /* JADX INFO: renamed from: U0 */
    public static char m27629U0(CharSequence charSequence) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(AbstractC6420v.m27596U(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX INFO: renamed from: V0 */
    public static String m27630V0(String str, int i7) {
        AbstractC6118n.m27187e(str, "<this>");
        if (i7 >= 0) {
            String strSubstring = str.substring(0, AbstractC5905g.m26656d(i7, str.length()));
            AbstractC6118n.m27186d(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i7 + " is less than zero.").toString());
    }
}
