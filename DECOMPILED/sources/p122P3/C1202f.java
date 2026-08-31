package p122P3;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: P3.f */
/* JADX INFO: loaded from: classes2.dex */
public class C1202f {

    /* JADX INFO: renamed from: a */
    private final String f4283a;

    private C1202f(String str) {
        this.f4283a = (String) AbstractC1209m.m5302n(str);
    }

    /* JADX INFO: renamed from: e */
    public static C1202f m5260e(char c7) {
        return new C1202f(String.valueOf(c7));
    }

    /* JADX INFO: renamed from: a */
    public Appendable m5261a(Appendable appendable, Iterator it) throws IOException {
        AbstractC1209m.m5302n(appendable);
        if (it.hasNext()) {
            appendable.append(m5265f(it.next()));
            while (it.hasNext()) {
                appendable.append(this.f4283a);
                appendable.append(m5265f(it.next()));
            }
        }
        return appendable;
    }

    /* JADX INFO: renamed from: b */
    public final StringBuilder m5262b(StringBuilder sb, Iterator it) {
        try {
            m5261a(sb, it);
            return sb;
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m5263c(Iterable iterable) {
        return m5264d(iterable.iterator());
    }

    /* JADX INFO: renamed from: d */
    public final String m5264d(Iterator it) {
        return m5262b(new StringBuilder(), it).toString();
    }

    /* JADX INFO: renamed from: f */
    CharSequence m5265f(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
