package p302m6;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: m6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6405g implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final a f24452b = new a(null);

    /* JADX INFO: renamed from: a */
    private final Pattern f24453a;

    /* JADX INFO: renamed from: m6.g$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    public C6405g(Pattern nativePattern) {
        AbstractC6118n.m27187e(nativePattern, "nativePattern");
        this.f24453a = nativePattern;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27529a(CharSequence input) {
        AbstractC6118n.m27187e(input, "input");
        return this.f24453a.matcher(input).matches();
    }

    /* JADX INFO: renamed from: b */
    public final String m27530b(CharSequence input, String replacement) {
        AbstractC6118n.m27187e(input, "input");
        AbstractC6118n.m27187e(replacement, "replacement");
        String strReplaceAll = this.f24453a.matcher(input).replaceAll(replacement);
        AbstractC6118n.m27186d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public String toString() {
        String string = this.f24453a.toString();
        AbstractC6118n.m27186d(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6405g(String pattern) {
        AbstractC6118n.m27187e(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        AbstractC6118n.m27186d(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
