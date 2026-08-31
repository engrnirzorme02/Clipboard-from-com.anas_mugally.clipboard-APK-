package p105N0;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: N0.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0924l {

    /* JADX INFO: renamed from: c */
    private static final Set f3562c = new HashSet();

    /* JADX INFO: renamed from: a */
    private final String f3563a;

    /* JADX INFO: renamed from: b */
    private final String f3564b;

    /* JADX INFO: renamed from: N0.l$a */
    public static class a extends AbstractC0924l {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: renamed from: N0.l$b */
    public static class b extends AbstractC0924l {
        b(String str, String str2) {
            super(str, str2);
        }
    }

    AbstractC0924l(String str, String str2) {
        this.f3563a = str;
        this.f3564b = str2;
        f3562c.add(this);
    }
}
